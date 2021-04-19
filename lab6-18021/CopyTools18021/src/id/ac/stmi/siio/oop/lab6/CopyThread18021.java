package id.ac.stmi.siio.oop.lab6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JProgressBar;

public class CopyThread18021 implements Runnable {
    private String sourceFile;
    private String destinationFile;
    private javax.swing.JProgressBar jProgressBar1;
    long wid;
    long milis = 10000;

    private final AtomicBoolean running = new AtomicBoolean(false);

    private Thread worker;

    public void start() {
        worker = new Thread(this);
        worker.start();
        System.out.println("Start Button Pressed");
    }

    public void stop() {
        running.set(false);
        worker.interrupt();
    }

    public JProgressBar getjProgressBar1() {
        return jProgressBar1;
    }

    public void setjProgressBar1(JProgressBar jProgressBar1) {
        this.jProgressBar1 = jProgressBar1;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public String getDestinationFile() {
        return destinationFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void setDestinationFile(String destinationFile) {
        this.destinationFile = destinationFile;
    }

    // sebagai metode pelaksana kerja
    // sekaligus update progressbar
    @Override
    public void run() {

        // buat stream input
        InputStream inputStream = null;
        // buat stream output
        OutputStream outputStream = null;

        running.set(true);

        try {
            // buat instance source file
            File sourcefile = new File(sourceFile);
            // buat instamce destination file
            File destinationfile = new File(destinationFile);

            // baca dan loading kr inputstream
            inputStream = new FileInputStream(sourcefile);
            // loading ke destination file
            outputStream = new FileOutputStream(destinationfile);

            byte[] buffer = new byte[1024];
            // tentukan presentasi berdasarkan besar file terhadap buffer
            long size = sourcefile.length();
            long count = 0;

            int length;
            // Baca per byte untuk di berikan file terhadap ke outputstream
            while ((length = inputStream.read(buffer)) > 0) {
                while (worker.isInterrupted()) {
                    Thread.sleep(milis);
                    Thread.currentThread().interrupt();
                }
                outputStream.write(buffer, 0, length);
                count += length;
                // updateing the progress bar in precentage
                jProgressBar1.setValue((int) (count * 100 / size));
                jProgressBar1.setString((int) (count * 100 / size) + "%");
            }
            // Nselesai, maka set nilai dan info
            jProgressBar1.setValue(100);
            jProgressBar1.setString("copied succesfully");

            // Closing input as well as outputstream
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(" Copy Failed ");
        } catch (InterruptedException e) {
            // TO DO Auto-generated catch blok
            Thread.currentThread().interrupt();
            // e.printStackTrace();
            System.out.println(" Copy Cancelled ");
        } finally {
            running.set(false);
            System.out.println(" Done ");
        }

    }
}
