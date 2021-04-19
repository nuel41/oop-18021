import  java.awt.*;
import  java.awt.event.*; import  javax.swing.*;
import  static  javax.swing.GroupLayout.Alignment.*;
public  class  CopyFrame  extends  JFrame  {
    private  static  final  long  serialVersionUID  =  1L; JPanel  panel;
    CopyFrame()  {
        prepareGUI();
    }
    private  void  prepareGUI()  {
        JLabel  srcText  =  new  JLabel("Source");
        JLabel  dstText  =  new  JLabel("Destination");
        JTextField  srcURL  =  new  JTextField(30);
        JTextField  dstURL  =  new  JTextField(30);
        JButton  srcButton  =  new  JButton("  ...  ");
        JButton  dstButton  =  new  JButton("  ...  ");
        JButton  goButton  =  new  JButton("  Go  ");
        JButton  cancelButton  =  new  JButton("Cancel");
        panel  =  new  JPanel();
        GroupLayout  layout  =  new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(srcText)
                .addComponent(dstText))
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(srcURL)
                .addComponent(dstURL)
            .addGroup(layout.createSequentialGroup()
                .addComponent(goButton)
                .addComponent(cancelButton)))
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(srcButton)
                .addComponent(dstButton))
            );
            
            layout.linkSize(SwingConstants.HORIZONTAL,  srcButton,  dstButton,  goButton,  cancelButton);
            layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(srcText)
            .addComponent(srcURL)
            .addComponent(srcButton))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(dstText)
            .addComponent(dstURL)
            .addComponent(dstButton))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(cancelButton)
            .addComponent(goButton)));

            setPreferredSize(new  Dimension(500,150)); setTitle("Copy");
            pack();
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

private  class  ButtonClickListener  implements  ActionListener  {
    @Override
    public  void  actionPerformed(ActionEvent  e)  {

    }
}
    public  static  void  main(String  args[])  {
        java.awt.EventQueue.invokeLater(new  Runnable()  {
            public  void  run()  { try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");;;
            }  
            catch  (Exception  ex)  {
                ex.printStackTrace();
            }
            new  CopyFrame().setVisible(true);
        }
    });
}
}
