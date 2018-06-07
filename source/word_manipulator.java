import java.io.*;
import java.util.*;
public class word_manipulator{
    public static String st,w,rep;
    public String word_extract(String s){
        String ns="",nw="";int i=0;
        w = "";
        s=s.trim();
        char a[]=s.toCharArray();
        if(a[i]=='"')
        {
            i++;
            w=w+'"';
            while(a[i]!='"')
            {
                w=w+a[i];
                i++;
            }w=w+'"';
        }
        else if(a[i]=='(')
        {
            i++;
            while(a[i]!=')')
            {
                w=w+a[i];
                i++;
            }
        }
        else if(a[i]=='\'')
        {
            i++;
            w=w+'"';
            while(a[i]!='\'')
            {
                w=w+a[i];
                i++;
            }w=w+'"';   
        }
        else if(a[i]==',')
        {
            i++;
            while(i<a.length&&a[i]!=',')
            {   
                w=w+a[i];
                i++;
            }
        }
        else
        { 
            for(i=0;i<a.length&&a[i]!='"'&&a[i]!='('&&a[i]!='\''&&a[i]!=' '&&a[i]!=',';i++)
            {
                w=w+a[i];
            }
        }
        return w;
    }

    public String word_delete(String s){

        st="";
        int i=0,flag=0;
        s=s.trim();
        char a[]=s.toCharArray();
        if(a[i]=='"')
        {
            i++;
            while(a[i]!='"')
            {
                i++;
            }
        }
        else if(a[i]=='(')
        {
            i++;
            while(a[i]!=')')
            {
                i++;
            }
        }
        else if(a[i]=='\'')
        {
            i++;
            while(a[i]!='\'')
            {
                i++;
            }
        }
        else if(a[i]==',')
        {
            i++;
            while(i<a.length&&a[i]!=',')
            {
                i++;
            }
        }
        else
        { 
            for(i=0;i<a.length&&a[i]!='"'&&a[i]!='('&&a[i]!='\''&&a[i]!=' '&&a[i]!=',';i++)
            {
                flag=1;  
            }
        }
        if(flag==0)
            i++;
        while(i<a.length)
        {
            st=st+a[i];
            i++;
        }
        st = st.trim();
        return st;
    }

    public String replace_cndn(String cndn)
    {
        cndn=cndn.replace("Is Equal To Or Less Than","=<");
        cndn=cndn.replace("Is Equal To Or Greater Than","=>");
        cndn=cndn.replace("IS EQUAL TO OR LESS THAN","=<");
        cndn=cndn.replace("IS EQUAL TO OR GREATER THAN","=>");
        cndn=cndn.replace("is equal to or less than","=<");
        cndn=cndn.replace("is equal to or greater than","=>");
        cndn=cndn.replace("is equal to","==");
        cndn=cndn.replace("is greater than equal to",">=");
        cndn=cndn.replace("is less than equal to","<=");
        cndn=cndn.replace("is greater than or equal to",">=");
        cndn=cndn.replace("is less than or equal to","<=");
        cndn=cndn.replace("is greater than",">");
	cndn=cndn.replace("is less than","<");
        cndn=cndn.replace("equals","==");
        cndn=cndn.replace("is not equal to","!=");
        cndn=cndn.replace("IS EQUAL TO","==");
        cndn=cndn.replace("IS GREATER THAN EQUAL TO",">=");
        cndn=cndn.replace("IS LESS THAN EQUAL TO","<=");
        cndn=cndn.replace("IS GREATER THAN OR EQUAL TO",">=");
        cndn=cndn.replace("IS LESS THAN OR EQUAL TO","<=");
        cndn=cndn.replace("IS GREATER THAN",">");
        cndn=cndn.replace("IS LESS THAN","<");
        cndn=cndn.replace("EQUALS","==");
        cndn=cndn.replace("IS NOT EQUAL TO","!=");
        cndn=cndn.replace("Is Equal To","==");
        cndn=cndn.replace("Is Greater Than Equal To",">=");
        cndn=cndn.replace("Is Less Than Equal To","<=");
        cndn=cndn.replace("Is Greater Than Or Equal To",">=");
        cndn=cndn.replace("Is Less Than Or Equal To","<=");
        cndn=cndn.replace("Is Greater Than",">");
        cndn=cndn.replace("Is Less Than","<");
        cndn=cndn.replace("Equals","==");
        cndn=cndn.replace("Is Not Equal To","!=");
        cndn=cndn.replace("&&","&");
        cndn=cndn.replace("||","|");
        cndn=cndn.replace("&","&&");
        cndn=cndn.replace("|","||");
        cndn=cndn.replace("OR","||");
        cndn=cndn.replace("or","||");
        cndn=cndn.replace("and","&&");
        cndn=cndn.replace("Or","||");
        cndn=cndn.replace("And","&&");
        cndn=cndn.replace("AND","&&");
        cndn=cndn.replace("NOT","!");
        cndn=cndn.replace("Not","!");
        cndn=cndn.replace("not","!");
        rep = cndn;
        return rep;
    }
}