

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class MyTimerTask
{
   
   public static void MyTimer()
   {
      load l=new load();
      l.setVisible(true);
       int delay = 2000; //milliseconds
  ActionListener taskPerformer;
       taskPerformer = new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               l.dispose();

           }
       };
  Timer timer=new Timer(10000,taskPerformer);
  timer.setRepeats(false);
  timer.start();
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
   }
}   