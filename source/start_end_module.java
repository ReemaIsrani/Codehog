import java.io.*;

import java.util.*;

import javax.swing.JOptionPane;


public class start_end_module extends javax.swing.JFrame
{

public static String s;

public String start_code(){

String name=(String)JOptionPane.showInputDialog("ENTER DESIRED CLASS NAME");

s = "import java.util.*;\n";

s+= "class "+name+"{\n";

s+= "public static void main(String args[]){\n";

s+= "Scanner sc = new Scanner(System.in);";

return s;

}

public String end_code()
{

return "\n";

}


public String start_codeC(){

//String name=(String)JOptionPane.showInputDialog("ENTER DESIRED CLASS NAME");

s = "#include<stdio.h>\n";
s+= "#include<stdlib.h>\n";
s+= "#include<conio.h>\n";
s+= "#include<ctype.h>\n";
s+= "#include<string.h>\n";
s+= "#include<math.h>\n";
s+= "void main(){";

return s;

}

}
