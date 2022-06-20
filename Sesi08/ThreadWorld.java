import java.beans.Transient;
import java.lang.System.Logger;
import java.util.logging.Level;

 class ThreadWorld extends Thread{
        
    @Override
    public void run()
    {
        System.out.println(getName() + ": World");
        try {
            Thread.sleep(250);
        }catch(InterruptedException ex){
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    @Test
    public void testRun(){
        for(int i=0;i<5;i++){
            ThreadWorld instance = new ThreadWorld();
            instance.setName("name" + i);
            instance.start();
        }
    }
    }