import javax.swing.JOptionPane;

class swap_module
{
public String swap(String s)
{
	String t = JOptionPane.showInputDialog("Enter temporary variable:");
        String a = "\n"+t;
	String b="";
        a += new word_manipulator().word_extract(s);
        String s1 = new word_manipulator().word_delete(s);
        while(s1.length()!=0)
        {
	    b = new word_manipulator().word_extract(s1);
            a += " = " + b+";\n";
            s1 = new word_manipulator().word_delete(s);
            s1 = s1.trim();
        }
        a +=";\n";
	a += b + " = "+ s+";\n";
	a += s + " = "+t+";\n";
        return a;
}
}