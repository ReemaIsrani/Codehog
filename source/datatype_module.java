import java.io.*;
import java.util.*;
class datatype_module{
    public static String arr[][] = new String[50][2];
    public static int i=-1;
    public static String s;
    public void push(String word, String dt){
        i++;
        arr[i][0] = word;
        arr[i][1] = dt;
    }
    public String datatype_assign(String s1){
        s1=s1.toLowerCase();
        switch(s1){
            case "integer":
            case "integers":
            case "int": return "int";
            case "double":
            case "doubles": return "double";
            case "float":
            case "floats": return "float";
            case "character":
            case "characters":
            case "char":
            case "chars": return "char";
            case "string":
            case "strings": return "String";
            case "byte": 
            case "bytes": return "byte";
            case "short":
            case "shorts": return "short";
            case "long":
            case "longs": return "long";
            case "boolean":
            case "booleans": return "boolean"; 
        }
        return "";
    }
    public String find_datatype(String a){
        s= "";
        int j=0;
        for(j=0;j<arr.length;j++){
            if(a.equals(arr[j][0])){
                s= arr[j][1];
                break;
            }
        }
        s= arr[j][1];
        return s; 
    }
}