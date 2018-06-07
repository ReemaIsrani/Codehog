

import java.awt.Color;
import javax.swing.JOptionPane;



public class Logopage extends javax.swing.JFrame implements Runnable{

    
   
    public Logopage() {
        
        initComponents();
setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(new java.awt.Color(246,239,213));
        add(startb);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        startb = new javax.swing.JButton();
        helpb = new javax.swing.JButton();
        exitb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CODEHOG");
        setBackground(new java.awt.Color(255, 234, 234));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon("icon.png").getImage());

        jLabel2.setIcon(new javax.swing.ImageIcon("logoi.png")); // NOI18N

        startb.setBackground(new java.awt.Color(209, 179, 140));
        startb.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        startb.setText("LET'S CODE");
        startb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        startb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbActionPerformed(evt);
            }
        });

        helpb.setBackground(new java.awt.Color(209, 179, 140));
        helpb.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        helpb.setText("HELP");
        helpb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        helpb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpbActionPerformed(evt);
            }
        });

        exitb.setBackground(new java.awt.Color(209, 179, 140));
        exitb.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        exitb.setText("EXIT");
        exitb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        exitb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(helpb, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(startb, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(exitb, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startb, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitb, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpb, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void startbActionPerformed(java.awt.event.ActionEvent evt) {                                       

        Mainp m=new Mainp();
        m.setVisible(true);
        dispose();
    }                                      

    private void helpbActionPerformed(java.awt.event.ActionEvent evt) {                                      
       JOptionPane.showMessageDialog(null,"Instructions:\n" +
"1.	Press \"enter\" for new line.\n" +
"2.	Enter Double quotes for string.\n" +
"3.	Declare the datatype of each variable separately before using.\n" +
"4.	Each line should start with a keyword. Eg. Print, Scan, Declare, etc.\n" +
"5.	Each operation or each command should compulsorily start from a new line.\n" +
"Eg. Print \"a\" Print \"b\" is not acceptable. \n" +
"Instead write,\n" +
"Print \"a\"\n" +
"Print \"b\"\n" +
"6.	Do not put spaces between an operator and an operand (arithmetic).","INSTRUCTIONS",JOptionPane.INFORMATION_MESSAGE);
    }                                     

    private void exitbActionPerformed(java.awt.event.ActionEvent evt) {                                      
        System.exit(0);
    }                                     

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logopage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton exitb;
    private javax.swing.JButton helpb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton startb;
    // End of variables declaration                   

   
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
