import  javax.swing.*;
import  java.util.List;
public  class  SwingWorkerDemo1  {
    private  void  createWorker()  {
        Worker  work  =  new  Worker();
        work.run();
        while  (!work.isDone())  {
            try {
                int  iProgress  =  work.getProgress(); System.out.println("Progress  %"  +  iProgress); Thread.sleep(500);
            }
            catch  (Exception  ex)  { System.err.println(ex);
            }
        }
    }
    public  static  void  main(String[]  args)  {
        SwingWorkerDemo1  demoWork1  =  new  SwingWorkerDemo1(); demoWork1.createWorker();
    }
}

class  Worker  extends  SwingWorker<Boolean,  Integer>  {
    @Override
    protected  Boolean  doInBackground()  throws  Exception  {
        setProgress(0);
        waitFor(500);
        for  (int  iCount  =  1;  iCount  <=  20;  iCount++)  {
            if  (iCount  %  2  ==  0)  {
                publish(iCount);
            }
            setProgress((iCount  *  100)  /  20);
            waitFor(250);
        }
        return  true;
    }
    @Override
    protected  void  process(List<Integer>  chunks)  {
        for  (int  number  :  chunks)  {
            System.out.println("Found  even  number:  "  +  number);
        }
    }
    @Override
    protected  void  done()  { boolean  bStatus  =  false; try {
        bStatus  =  get();}
    catch  (Exception  ex)  { ex.printStackTrace();}
    System.out.println("Selesai  dengan  status  "  +  bStatus);
    }
    private  void  waitFor(int  iMillis){
        try {
            Thread.sleep(iMillis);
        }
        catch  (Exception  ex)  { System.err.println(ex);
        }
    }

}
