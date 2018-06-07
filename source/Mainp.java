import java.awt.Color;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Mainp extends javax.swing.JFrame {
String fin="";
public static String funcstr="";
public String funcdec="";

    public Mainp() {
        initComponents();
setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        instruction.setText(Multiline(readfile("instructions.txt")));
this.getContentPane().setBackground(new java.awt.Color(246,239,213));
TextLineNumber tn=new TextLineNumber(algot);
       jScrollPane1.setRowHeaderView( tn );
      }

    public String readfile(String name)
    {
        try
        {
            String s=new Scanner(new File(name)).useDelimiter("\\Z").next();
            return s;
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        return "";
    }
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        convertb = new javax.swing.JButton();
        clearb = new javax.swing.JButton();
        exitb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        algot = new javax.swing.JTextArea();
        firstw = new javax.swing.JLabel();
        rests = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        instruction = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        convertb1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        addfunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CODEHOG");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 51, 51));
        setIconImage(new javax.swing.ImageIcon("icon.png").getImage());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("ENTER ALGORITHM HERE");

        convertb.setBackground(new java.awt.Color(209, 179, 140));
        convertb.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        convertb.setText("JAVA");
        convertb.setMaximumSize(new java.awt.Dimension(50, 25));
        convertb.setMinimumSize(new java.awt.Dimension(50, 25));
        convertb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbActionPerformed(evt);
            }
        });

        clearb.setBackground(new java.awt.Color(209, 179, 140));
        clearb.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        clearb.setText("CLEAR");
        clearb.setMaximumSize(new java.awt.Dimension(50, 25));
        clearb.setMinimumSize(new java.awt.Dimension(50, 25));
        clearb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbActionPerformed(evt);
            }
        });

        exitb.setBackground(new java.awt.Color(209, 179, 140));
        exitb.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        exitb.setText("EXIT");
        exitb.setMaximumSize(new java.awt.Dimension(50, 25));
        exitb.setMinimumSize(new java.awt.Dimension(50, 25));
        exitb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbActionPerformed(evt);
            }
        });

        algot.setBackground(new java.awt.Color(246, 239, 213));
        algot.setColumns(20);
        algot.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        algot.setRows(5);
        algot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        algot.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(algot);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("CODE");

        instruction.setBackground(new java.awt.Color(246, 239, 213));
        instruction.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        instruction.setOpaque(true);

        output.setBackground(new java.awt.Color(246, 239, 213));
        output.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        output.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        output.setOpaque(true);
        jScrollPane2.setViewportView(output);

        jLabel3.setBackground(new java.awt.Color(246, 239, 213));
        jLabel3.setIcon(new javax.swing.ImageIcon("icontransparent.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        convertb1.setBackground(new java.awt.Color(209, 179, 140));
        convertb1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        convertb1.setText("C");
        convertb1.setMaximumSize(new java.awt.Dimension(50, 25));
        convertb1.setMinimumSize(new java.awt.Dimension(50, 25));
        convertb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertb1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(209, 179, 140));
        jButton1.setIcon(new javax.swing.ImageIcon("downloadbutton.png")); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(50, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        addfunc.setBackground(new java.awt.Color(209, 179, 140));
        addfunc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addfunc.setText("ADD FUNCTION");
        addfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(convertb1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(convertb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(exitb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addfunc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(clearb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1320, 1320, 1320)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstw, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rests, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(clearb, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(convertb1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(convertb, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(addfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(exitb, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(firstw)
                .addGap(50, 50, 50)
                .addComponent(rests)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        try {
            // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    }
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }
    }// </editor-fold>
    public static String Multiline(String orig)
    {
        return "<html>"+orig.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>").replaceAll(" ", "&nbsp;")+"</html>";
    }

    private void clearbActionPerformed(java.awt.event.ActionEvent evt) {
        algot.setText("");
        output.setText("");
    }

    private void exitbActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    int count(String s)
    {
        if(s==null||s.isEmpty())
        { return 0;}
        int l=1;
        int pos=0;
        while((pos=s.indexOf("\n",pos)+1)!=0)
        {l++;}
        return l;
    }

    public  String choosefunc(String key,String res,int i)
    {
        String s="";int count=0;
        switch(key)
        {
            case "print":
            for(int j=0;j<res.length();j++)
            {
             char c=res.charAt(j);
             if(c=='"'||c=='\'')
             {
              count++;
             }
            }

            if(count%2!=0)
            {
JOptionPane.showMessageDialog(null,"Quotes missing on line "+(i+1));


            }
            s= new print_module().print_statement(res);
            break;
            case "scan":
            s= new scan_module().scan_statement(res);
            break;
            case "declare":
            s= new declare_module().declare_statement(res);
            break;
            case "set":
            s= new set_module().set_statement(res);
            break;
            case "if":
            s= new conditional_module().if_statement(res);
            break;
            case "elseif":
            s= new conditional_module().elseif_statement(res);
            break;
            case "else":
            s= new conditional_module().else_statement(res);
            break;
            case "endif":
            s= new start_end_module().end_code();
            break;
			case "while":
			s= new loop_module().while_statement(res);
			break;
			case "endloop":
			s= new loop_module().endloop();
			break;
case "return":
            s=return_statement(res);
            break;
case "call":
            s=call_statement(res);
            break;
            case "startcode":
            case "endcode":
        }
        return s;
    }

        public  String choosefuncC(String key,String res)
    {
        String s="";
        switch(key)
        {
            case "print":
            s= new print_module().print_c(res);
            break;
            case "scan":
            s= new scan_module().scan_c(res);
            break;
            case "declare":
            s= new declare_module().declare_statement(res);
            break;
            case "set":
            s= new set_module().set_statement(res);
            break;
            case "if":
            s= new conditional_module().if_statement(res);
            break;
            case "elseif":
            s= new conditional_module().elseif_statement(res);
            break;
            case "else":
            s= new conditional_module().else_statement(res);
            break;
            case "endif":
            s= new start_end_module().end_code();
            break;
			case "while":
			s= new loop_module().while_statement(res);
			break;
			case "endloop":
			s= new loop_module().endloop();
			break;
            case "return":
            s=return_statement(res);
            break;
            case "call":
            s=call_statement(res);
            break;
	    case "add":
	    case "subtract":
	    case "multiply":
	    case "divide":
	    case "mod": //s = arithmetic.math(res);
            case "startcode":
            case "endcode":
        }
        return s;
    }
   String return_statement(String s)
{
 String t="return ";
s=s.trim();
t=t+s+";";
return t;
}
 String call_statement(String s)
{
 String t="";
s=s.trim();
t=t+s+";";
return t;
}
public void setfunc(String w)
{
 funcstr=w;
}


    private void convertbActionPerformed(java.awt.event.ActionEvent evt) {
 String p;
fin="";
 
  p= new start_end_module().start_code();
        fin=fin+p;      
String s=algot.getText();
        fin=fin+java(s);
  p= new start_end_module().end_code()+new start_end_module().end_code()+"\n}";
        fin=fin+p;
       if(!"".equals(funcdec))
        {
         fin=fin+"\n"+funcdec+"\n"+"{"+"\n";
         String f=java(funcstr);
         fin=fin+f+"\n"+"}";}
        fin=fin+"\n"+"}";
        output.setVisible(true);
        output.setText(Multiline(fin));


    }

    private void convertb1ActionPerformed(java.awt.event.ActionEvent evt) {
String p;fin="";
p= new start_end_module().start_codeC();
String s=algot.getText();

fin=fin+c(s);
 p= new start_end_module().end_code()+new start_end_module().end_code()+"\n}";
fin=fin+p;
if(!"".equals(funcdec))
        {

         fin=fin+"\n"+funcdec+"\n"+"{"+"\n";
         String f=c(funcstr);
         fin=fin+f+"\n"+"}";}
        fin=fin+"\n"+"}";
        output.setVisible(true);
        output.setText(Multiline(fin));


    }

    public String java(String s){
        //declarations	
String p,w,st,wh,key,temp,temp1,s2,jv="";
int i,j,j1=0,k,flag,len,v=0,a=0,b=0,c=0,f=0,d=0,n;
int[] num=new int[10];
num[0]=-1;
String[] lines=s.split("\\r?\\n");
String[] line1=s.split("\\r?\\n");
len=count(s);
s2="";

//loop
for(i=0;i<len;i++)
{
	if(line1[i].contains("repeat") || line1[i].contains("Repeat") || line1[i].contains("REPEAT"))	
	{
		k=0;
		num[0]=0;
		n=0;
		
		//calculatingW
		if(line1[i].contains("while"))
			v=line1[i].indexOf("while");
		else if(line1[i].contains("While"))
			v=line1[i].indexOf("While");
		else if(line1[i].contains("WHILE"))
			v=line1[i].indexOf("WHILE");
		//calculationOfA
		if(line1[i].contains("above"))
			a=line1[i].indexOf("above");
		else if(line1[i].contains("ABOVE"))
			a=line1[i].indexOf("ABOVE");
		else if(line1[i].contains("Above"))
			a=line1[i].indexOf("Above");
					
		
		//storingInNumArray
		for(j=0;j<v;j++)
		{
			if(Character.isDigit(line1[i].charAt(j)))	
			{
		
				if(j-j1==1)
				{
					num[k-1]=num[k-1]*10+(int)(line1[i].charAt(j))-48+n;
					k-=1;
				}
				else 
				num[k]=(int)(line1[i].charAt(j))-48+n;
				k++;
				j1=j;
				
			}
		}
		
		if(k!=0)
		k-=1;
		flag=0;
		//CheckingWhileConditions
		if((line1[i].contains("above") || line1[i].contains("Above") || line1[i].contains("ABOVE") || line1[i].contains("previous") || line1[i].contains("Previous") || line1[i].contains("PREVIOUS")||  num[k]<i+1))
		flag=0;
		if((line1[i].contains("next") || line1[i].contains("Next") || line1[i].contains("NEXT") || line1[i].contains("following") || line1[i].contains("Following") || line1[i].contains("FOLLOWING")||  num[k]>i+1))
		flag=1;
		if((k==0 && num[k]!=0 && !(line1[i].contains("next") || line1[i].contains("Next") || line1[i].contains("NEXT") || line1[i].contains("following") || line1[i].contains("Following") || line1[i].contains("FOLLOWING")) && !(line1[i].contains("above") || line1[i].contains("Above") || line1[i].contains("ABOVE") || line1[i].contains("previous") || line1[i].contains("Previous") || line1[i].contains("PREVIOUS"))))
		flag=2;
		if(num[k]==i+1)
		flag=3;
		System.out.println(flag);
		//while0
		if(flag==0)
		{
			
			if(k>0)
				b=num[k]-num[0]+1;
			else if(k==0 && (line1[i].contains("above") || line1[i].contains("Above") || line1[i].contains("ABOVE")))
				b=num[k];
			else b=1;
			if (b==0)
				b=1;
			
			temp=line1[i];
			
			//shifting1
			for(c=i;c>i-b;c--)
				{
					line1[c]=line1[c-1];
				}
			line1[c]=temp;	
			
			temp1="";
			if(i==len-1)
			{
				temp1="end loop";
			}
			else
			{
				temp1=line1[len-1];
				for(i=len-2;i>c+b;i--)
				{
					line1[i+1]=line1[i];
				}
				line1[c+b+1]="end loop";
			}
			s2="";
			for(a=0;a<len;a++)
			{
				s2=s2+line1[a]+"\n";
			}
			s2=s2+temp1+"\n";
			
			line1=s2.split("\n");
			len+=1;
			n+=1;
		}
		
		//while1
		else if(flag==1)
		{
			
			if(k>0)
				b=num[k]-num[0]+1;
			else if(k==0)
				b=num[k];
			else 
				b=1;
			if (b==0)
				b=1;
			
			temp=line1[len-1];
			
			if(i+b<len-1)
			{
				for(a=len-1;a>i+b+1;a--)
				{
					line1[a]=line1[a-1];
				}
				line1[i+b+1]="end loop";
				s2="";
				for(a=0;a<len;a++)
				{
					s2=s2+line1[a]+"\n";
				}
				s2=s2+temp+"\n";
			}
			if(i+b==len-1)
			{
				s2="";
				for(a=0;a<len;a++)
				{
					s2=s2+line1[a]+"\n";
				}
				s2=s2+"end loop"+"\n";
			}				
			line1=s2.split("\n");
			len+=1;
			n+=1;
		
		}		
		else if(flag==2)
		{
			b=num[k]-1;
			temp=line1[len-1];
			temp1=line1[len-2];
			if(i!=len-1)
			{
				for(a=len-1;a>i+2;a--)
				line1[a]=line1[a-1];
			line1[i+1]=line1[b];
			line1[i+2]="end loop";
			s2="";
			for(a=0;a<len;a++)
				{
					s2=s2+line1[a]+"\n";
				}
			s2=s2+temp1+"\n"+temp+"\n";
			}
			else 
			{
				s2="";
				for(a=0;a<len;a++)
				{
					s2=s2+line1[a]+"\n";
				}
				s2=s2+line1[b]+"\n"+"end loop"+"\n";
			}
			line1=s2.split("\n");
			len+=2;
			n+=2;
		}
		
	
	}
}
if(s2=="")
		{s2=s;}
		lines=s2.split("\n");
		len+=1;
		
      
        for(i=0;i<len-1;i++)
		{	
			
            lines[i]=lines[i].trim();
            w=new word_manipulator().word_extract(lines[i]);
            st=new word_manipulator().word_delete(lines[i]);
            if(!st.equals("")){
                if(("else".equals(w))||("end".equals(w)))
                {
                    String w2=new word_manipulator().word_extract(st); 
                    if("if".equals(w2))
                    {
                        st=new word_manipulator().word_delete(st);
                        w = w+"if";
                    }
                    else if("while".equals(w2)||"loop".equals(w2)){
                        st=new word_manipulator().word_delete(st);
                        w = w+"loop";                        
                    }
                }
            }
			
			if("repeat".equalsIgnoreCase(w))
			{
			 flag=0;
				while(!st.equals("") && flag==0)
				{
					String w2= new word_manipulator().word_extract(st);
					if(w2.equalsIgnoreCase("while"))
					{
					w="while"; flag=1;}
					if(w2.equalsIgnoreCase("for"))
					{	w="for";
					flag=1;
					}
					
					st= new word_manipulator().word_delete(st);
				}
            }
			
			key=new key_word_extract().dictionary(w);
			
            p=choosefunc(key,st,i);
			
            jv=jv+p;
    
        }

       
        return jv;
}

    public String c(String s){
        //declarations	
String p,w,st,wh,key,temp,temp1,s2,cc="";
int i,j,j1=0,k,flag,len,v=0,a=0,b=0,c=0,f=0,d=0,n;
int[] num=new int[10];
num[0]=-1;
String[] lines=s.split("\\r?\\n");
String[] line1=s.split("\\r?\\n");
len=count(s);
s2="";

//loop
for(i=0;i<len;i++)
{
	if(line1[i].contains("repeat") || line1[i].contains("Repeat") || line1[i].contains("REPEAT"))	
	{
		k=0;
		num[0]=0;
		n=0;
		
		//calculatingW
		if(line1[i].contains("while"))
			v=line1[i].indexOf("while");
		else if(line1[i].contains("While"))
			v=line1[i].indexOf("While");
		else if(line1[i].contains("WHILE"))
			v=line1[i].indexOf("WHILE");
		//calculationOfA
		if(line1[i].contains("above"))
			a=line1[i].indexOf("above");
		else if(line1[i].contains("ABOVE"))
			a=line1[i].indexOf("ABOVE");
		else if(line1[i].contains("Above"))
			a=line1[i].indexOf("Above");
					
		
		//storingInNumArray
		for(j=0;j<v;j++)
		{
			if(Character.isDigit(line1[i].charAt(j)))	
			{
		
				if(j-j1==1)
				{
					num[k-1]=num[k-1]*10+(int)(line1[i].charAt(j))-48+n;
					k-=1;
				}
				else 
				num[k]=(int)(line1[i].charAt(j))-48+n;
				k++;
				j1=j;
				
			}
		}
		
		if(k!=0)
		k-=1;
		flag=0;
		//CheckingWhileConditions
		if((line1[i].contains("above") || line1[i].contains("Above") || line1[i].contains("ABOVE") || line1[i].contains("previous") || line1[i].contains("Previous") || line1[i].contains("PREVIOUS")||  num[k]<i+1))
		flag=0;
		if((line1[i].contains("next") || line1[i].contains("Next") || line1[i].contains("NEXT") || line1[i].contains("following") || line1[i].contains("Following") || line1[i].contains("FOLLOWING")||  num[k]>i+1))
		flag=1;
		if((k==0 && num[k]!=0 && !(line1[i].contains("next") || line1[i].contains("Next") || line1[i].contains("NEXT") || line1[i].contains("following") || line1[i].contains("Following") || line1[i].contains("FOLLOWING")) && !(line1[i].contains("above") || line1[i].contains("Above") || line1[i].contains("ABOVE") || line1[i].contains("previous") || line1[i].contains("Previous") || line1[i].contains("PREVIOUS"))))
		flag=2;
		if(num[k]==i+1)
		flag=3;
		System.out.println(flag);
		//while0
		if(flag==0)
		{
			
			if(k>0)
				b=num[k]-num[0]+1;
			else if(k==0 && (line1[i].contains("above") || line1[i].contains("Above") || line1[i].contains("ABOVE")))
				b=num[k];
			else b=1;
			if (b==0)
				b=1;
			
			temp=line1[i];
			
			//shifting1
			for(c=i;c>i-b;c--)
				{
					line1[c]=line1[c-1];
				}
			line1[c]=temp;	
			
			temp1="";
			if(i==len-1)
			{
				temp1="end loop";
			}
			else
			{
				temp1=line1[len-1];
				for(i=len-2;i>c+b;i--)
				{
					line1[i+1]=line1[i];
				}
				line1[c+b+1]="end loop";
			}
			s2="";
			for(a=0;a<len;a++)
			{
				s2=s2+line1[a]+"\n";
			}
			s2=s2+temp1+"\n";
			
			line1=s2.split("\n");
			len+=1;
			n+=1;
		}
		
		//while1
		else if(flag==1)
		{
			
			if(k>0)
				b=num[k]-num[0]+1;
			else if(k==0)
				b=num[k];
			else 
				b=1;
			if (b==0)
				b=1;
			
			temp=line1[len-1];
			
			if(i+b<len-1)
			{
				for(a=len-1;a>i+b+1;a--)
				{
					line1[a]=line1[a-1];
				}
				line1[i+b+1]="end loop";
				s2="";
				for(a=0;a<len;a++)
				{
					s2=s2+line1[a]+"\n";
				}
				s2=s2+temp+"\n";
			}
			if(i+b==len-1)
			{
				s2="";
				for(a=0;a<len;a++)
				{
					s2=s2+line1[a]+"\n";
				}
				s2=s2+"end loop"+"\n";
			}				
			line1=s2.split("\n");
			len+=1;
			n+=1;
		
		}		
		else if(flag==2)
		{
			b=num[k]-1;
			temp=line1[len-1];
			temp1=line1[len-2];
			if(i!=len-1)
			{
				for(a=len-1;a>i+2;a--)
				line1[a]=line1[a-1];
			line1[i+1]=line1[b];
			line1[i+2]="end loop";
			s2="";
			for(a=0;a<len;a++)
				{
					s2=s2+line1[a]+"\n";
				}
			s2=s2+temp1+"\n"+temp+"\n";
			}
			else 
			{
				s2="";
				for(a=0;a<len;a++)
				{
					s2=s2+line1[a]+"\n";
				}
				s2=s2+line1[b]+"\n"+"end loop"+"\n";
			}
			line1=s2.split("\n");
			len+=2;
			n+=2;
		}
		
	
	}
}
if(s2=="")
		{s2=s;}
		lines=s2.split("\n");
		len+=1;
	
        for(i=0;i<len-1;i++)
		{	
			
            lines[i]=lines[i].trim();
            w=new word_manipulator().word_extract(lines[i]);
            st=new word_manipulator().word_delete(lines[i]);
            if(!st.equals("")){
                if(("else".equals(w))||("end".equals(w)))
                {
                    String w2=new word_manipulator().word_extract(st); 
                    if("if".equals(w2))
                    {
                        st=new word_manipulator().word_delete(st);
                        w = w+"if";
                    }
                    else if("while".equals(w2)||"loop".equals(w2)){
                        st=new word_manipulator().word_delete(st);
                        w = w+"loop";                        
                    }
                }
            }
			
			if("repeat".equalsIgnoreCase(w))
			{
				flag=0;
				while(!st.equals("") && flag==0)
				{
					String w2= new word_manipulator().word_extract(st);
					if(w2.equalsIgnoreCase("while"))
					{
					w="while"; flag=1;}
					if(w2.equalsIgnoreCase("for"))
					{	w="for";
					flag=1;
					}
					
					st= new word_manipulator().word_delete(st);
				}
            }
			
			key=new key_word_extract().dictionary(w);
			
            p=choosefuncC(key,st);
			
            cc=cc+p;
        
    
        }

        return cc;
		
}


     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser f = new JFileChooser();
        f.setDialogTitle("SAVE GENERATED CODE");
        f.setBackground(Color.red);

        FileNameExtensionFilter fi=new FileNameExtensionFilter("Text Documents(*.txt)",".txt");
        f.addChoosableFileFilter(fi);
        f.setAcceptAllFileFilterUsed(true);
        int r=f.showSaveDialog(this);
        if(r==JFileChooser.APPROVE_OPTION)
        {
            String code=fin;


            String save=f.getSelectedFile()+".txt";
            try
            {
                FileWriter fw=new FileWriter(save,true);
                code=code.replaceAll("\n","\r\n");
                fw.write(code);
                fw.close();

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }

private void addfuncActionPerformed(java.awt.event.ActionEvent evt) {
funcd f=new funcd(1);
f.pack();
f.setLocationRelativeTo(null);
f.setVisible(true);
funcdec=f.rfuncdec();
//funcstr=funcd.rfuncstr();      
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Mainp().setVisible(true);
                }
            });
    }

   // Variables declaration - do not modify
    private javax.swing.JTextArea algot;
    private javax.swing.JButton clearb;
    private javax.swing.JButton convertb;
    private javax.swing.JButton convertb1;
    private javax.swing.JButton exitb;
    private javax.swing.JButton addfunc;
    private javax.swing.JLabel firstw;
    private javax.swing.JLabel instruction;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel output;
    private javax.swing.JLabel rests;
    // End of variables declaration
}
