package id.ac.stmi.siio.oop.lab6;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

import javax.swing.filechooser.FileSystemView;
import static javax.swing.GroupLayout.Alignment.*;

public class CopyFrame18021 extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JProgressBar bar = new JProgressBar(0, 100);
    File srcFile;
    File dstFile;
    String dstFilename;
    JTextField srcURL = new JTextField(30);
    JTextField dstURL = new JTextField(30);
    JPanel panel = new JPanel();
    JButton srcButton = new JButton("...");
    JButton dstButton = new JButton("...");
    JButton goButton = new JButton(" Go ");
    JButton cancelButton = new JButton(" Cancel ");

    CopyThread18021 copythread = new CopyThread18021();

    CopyFrame18021() {
        prepareGUI();
    }

    private void prepareGUI() {

        JLabel srcText = new JLabel("Source");
        srcText.setPreferredSize(new Dimension(70, 20));

        JLabel dstText = new JLabel("Destination");
        dstText.setPreferredSize(new Dimension(70, 20));

        MenuItemListener menuItemListener = new MenuItemListener();
        final JMenuBar menubar = new JMenuBar();

        bar.setStringPainted(true);
        add(bar, BorderLayout.PAGE_END);

        JMenu fileMenu = new JMenu("File");
        final JMenu helpMenu = new JMenu("Help");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setActionCommand("Exit");
        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.setActionCommand("About");

        fileMenu.add(exitMenuItem);
        helpMenu.add(aboutMenuItem);

        menubar.add(fileMenu);
        menubar.add(helpMenu);
        exitMenuItem.addActionListener(menuItemListener);
        exitMenuItem.setActionCommand("X");

        aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nama ; NIM\nAssigment OOP Lab 9\nPoliteknik STMI Jakarta @2020",
                        "About Us", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        aboutMenuItem.setActionCommand("A");

        srcButton.addActionListener(menuItemListener);
        srcButton.setActionCommand("S");

        dstButton.addActionListener(menuItemListener);
        dstButton.setActionCommand("D");

        goButton.addActionListener(menuItemListener);
        goButton.setActionCommand("G");

        cancelButton.addActionListener(menuItemListener);
        cancelButton.setActionCommand("C");

        this.setJMenuBar(menubar);

        goButton.setSize(new Dimension(70, 30));
        cancelButton.setSize(new Dimension(70, 30));

        panel.setBackground(Color.ORANGE);

        final GroupLayout layout = new GroupLayout(panel);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(panel.add(srcText)).addComponent(panel.add(dstText))
                .addGroup(layout.createParallelGroup(LEADING).addComponent(panel.add(srcURL))
                .addComponent(panel.add(dstURL))
                .addGroup(layout.createSequentialGroup().addComponent(panel.add(goButton))
                .addComponent(panel.add(cancelButton)).addGroup(layout.createParallelGroup(LEADING)
                .addComponent(panel.add(srcButton)).addComponent(panel.add(dstButton)))))));
        layout.linkSize(SwingConstants.HORIZONTAL, srcButton, dstButton, goButton, cancelButton);
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panel.add(srcText))
                        .addComponent(panel.add(srcURL)).addComponent(panel.add(srcButton)))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panel.add(dstText))
                        .addComponent(panel.add(dstURL)).addComponent(panel.add(dstButton)))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel.add(cancelButton)).addComponent(panel.add(goButton))));

        this.setPreferredSize(new Dimension(500, 185));

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        this.add(panel);
        this.setResizable(false);

        this.setTitle("Copy");
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    class MenuItemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            if (e.getActionCommand() == "G" || e.getActionCommand() == "C") {
                copythread.setSourceFile(srcURL.getText());
                copythread.setDestinationFile(dstURL.getText() + "/" + dstFilename);
                copythread.setjProgressBar1(bar);

                if (e.getActionCommand() == "G") {
                    System.out.println((" G Click"));
                    // Starting the thread
                    copythread.start();
                }

                else if (e.getActionCommand() == "C") {
                    // thread.isInterrupted
                    copythread.stop();
                }
            } else if (e.getActionCommand() == "X") {
                System.out.println(" X Click ");
                copythread.run();

            } else if (e.getActionCommand() == "S" || e.getActionCommand() == "D") {
                final JFileChooser fileChooser = new JFileChooser(
                        FileSystemView.getFileSystemView().getHomeDirectory());

                if (e.getActionCommand() == "S") {
                    System.out.println((" S Click "));

                    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    int returnVal1 = fileChooser.showOpenDialog((Component) e.getSource());

                    if (returnVal1 == JFileChooser.APPROVE_OPTION) {
                        srcURL.setText(fileChooser.getSelectedFile().toString());
                        srcFile = fileChooser.getSelectedFile();
                        dstFilename = fileChooser.getName(srcFile);
                    } else {
                        srcURL.setText("");
                    }
                } else if (e.getActionCommand() == "D") {
                    System.out.println((" D Click "));

                    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    int returnVal2 = fileChooser.showOpenDialog((Component) e.getSource());
                    System.out.println("Check Folder " + fileChooser.getCurrentDirectory().toString());

                    if (returnVal2 == JFileChooser.APPROVE_OPTION) {
                        dstURL.setText(fileChooser.getSelectedFile().toString());
                        dstFile = fileChooser.getSelectedFile();
                    } else {
                        dstURL.setText("");
                    }
                }
            }
        }
    }

    void exitProgram() {
        dispose();
        System.exit(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("javax.swing.plat.metal.metalLookAndFeel");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                new CopyFrame18021().setVisible(true);
            }
        });
    }
}