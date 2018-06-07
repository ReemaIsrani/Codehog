


import java.util.Timer;
import java.util.TimerTask;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

 
public class start extends javax.swing.JFrame {

    
    public start() {
        initComponents();
        code();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        code = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CODEHOG");

        code.setBackground(new java.awt.Color(246, 239, 213));
        code.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        code.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 1364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 1131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    public static String Multiline(String orig)
    {
        return "<html>"+orig.replaceAll("\n", "<br>");
    }
    public  void code()
    {
        try {
            
                
                Clip clip=AudioSystem.getClip();
                AudioInputStream ips=AudioSystem.getAudioInputStream(new File("newtype.wav"));
                clip.open(ips);
               
                
             
            
        
        Timer timer=new Timer();
        code.setVisible(true);
        code.setText("");
        String a="\n\n void function routine(){\n do\n  {\n   eat();\n   code();\n   sleep();\n  }\n while(isAlive());\n}\n";
        char c[]=a.toCharArray();
 TimerTask task=new TimerTask() {
int sec=0;
            @Override
            public void run() {
                sec++;
                if(sec==c.length)
                {
                    
                    clip.stop();
                    timer.cancel();
                    timer.purge();
                    Logopage l=new Logopage();
                    l.setVisible(true);
                    dispose();
                    
                }
                if(sec<c.length)
                {
                    clip.start();
                    String s=Multiline(code.getText()+c[sec]);
                    code.setText(s);
                    clip.stop();
                    
                }
                
            }
        };
        timer.schedule(task,100,100);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);} catch (IOException ex) {
            
        }catch (LineUnavailableException ex) {
               System.out.println(ex);
            } catch (UnsupportedAudioFileException ex) {
               System.out.println(ex);
    }
    }
 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
         
            }
        });
    } 
                 
    private static javax.swing.JLabel code;
                 
}

