import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class key_word_extract extends javax.swing.JFrame{
    public static String key;
    
    public static Reader openFile(String fileName)throws IOException
    {
        return new FileReader(new File(fileName));
    }
    
    String add(String str)
    {
        String choose[]= new String[4];
        choose[0]="print";choose[1]="scan";choose[2]="declare";choose[3]="initialize";
        String s=(String)JOptionPane.showInputDialog(null,"COULD NOT FIND THE KEY "+str+" IN DICTIONARY.\nPLEASE CHOOSE WHAT IT MEANS","CHOOSE",JOptionPane.QUESTION_MESSAGE,null,choose,choose[0]);
        String filename="TempDictionary.txt";
        try
        {
            FileWriter fw=new FileWriter(filename,true);
            fw.write("\r\n"+str);
            fw.write(" "+s);
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println(e); 
        }
        return s;
    }

    public  String dictionary(String str){
        String fileName,line;int i;
        key="";
        String[] arr={"PrintDictionary.txt","ScanDictionary.txt","DeclareDictionary.txt","InitializeDictionary.txt","Swap dictionary.txt","Minimum dictionary.txt","Sum Dictionary.txt","maximum dictionary.txt","SubtractsDictionary.txt","MultiplyDictionary.txt","DivideDictionary.txt","ModDictionary.txt","Returndictionary.txt","StartDictionary.txt","EndDictionary.txt"};
        for(i=0;i<arr.length;i++)
{
            fileName= arr[i];
            List<String> array=new ArrayList<String>();
            BufferedReader br=null;
            try{
                br=new BufferedReader(openFile(fileName));
                while ((line=br.readLine())!=null){
                    array.add(line);
                }
            }
            catch(IOException e){
                System.out.println(e);
            }
            for(String name : array){
                if(name.equalsIgnoreCase(str)){
                    switch(i){
                        case 0: key ="print";break;

                        case 1: key="scan";break;

                        case 2: key="declare";break;

                        case 3: key="set";break;
			
			case 4: key="swap";break;

			case 5: key="min";break;

			case 6: key="sum";break;

			case 7: key="max";break;

			case 8: key="subtract";break;

			case 9: key="multiply";break;

			case 10: key="divide";break;

			case 11: key="mod";break;
                        
            case 12: key="call";break;

            case 13: key="startcode";break;

            case 14: key="endcode";break;

                    }
				}
				
            }
        }
		
		if("while".equalsIgnoreCase(str))
			key="while";
        if("if".equals(str))
            key="if";
        if("return".equalsIgnoreCase(str))
            key="return";
        if("elseif".equals(str))
            key="elseif";
        if("endif".equals(str)||"(end if)".equals(str)||"(endif)".equals(str))
            key="endif";
		if("endloop".equals(str)||"(end loop)".equals(str)||"(endloop)".equals(str))
            key="endloop";
        if("else".equals(str))
            key="else";
        if("".equals(key))
            key=add(str);
        return key;
    }
}
