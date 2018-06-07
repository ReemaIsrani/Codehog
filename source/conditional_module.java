import java.util.*;
public class conditional_module{
    public static int stk[]=new int[100];
    public static int top;
    public static String o,m,n,s1,s2,s3,temp;
    public void push(int i)
    {
        top=top+1;
        stk[top]=i;
    }

    public void pop()
    {
        top--;
    }

    public String if_statement(String in)
    {
		//ifthenmodule
		String cndn="";
		String p="";
		String key="";
		int flag1=0;
		String cndn1=in;
		int d=cndn1.length();
		int i=0,l;
		
		String w=new word_manipulator().word_extract(cndn1);
		String st=new word_manipulator().word_delete(cndn1);
		
		while(st!="" && flag1!=1)
		{
		st=st.trim();
		if("then".equalsIgnoreCase(w))
		{
		flag1=1;
		w=new word_manipulator().word_extract(st);
		st=new word_manipulator().word_delete(st);
		key=new key_word_extract().dictionary(w);
        p=new Mainp().choosefunc(key,st,0);
		}
		if (flag1==0)
		{
		w=new word_manipulator().word_extract(st);
		st=new word_manipulator().word_delete(st);
		}
		}
		if(flag1==1)
		{
		l=cndn1.indexOf("then");
		cndn=cndn1.substring(0,l-1);}
		else 
		cndn=in;
		//ifthenmoduleends
		
		cndn=cndn.trim();
        s1="\nif";
        top=-1;
        int b=cndn.length();
        int a=0;
        int flag=1;
        if(cndn.charAt(0)=='(')
        {
            push(0);
            a+=1;
            while(a<b-1)
            {
                if(cndn.charAt(a)=='(')
                    push(a);
                else if(cndn.charAt(a)==')')
                    pop();
                a+=1;
            }
            a=b-1;
            if(cndn.charAt(a)==')' && stk[top]==0)
                flag=0;
            else flag=1;
        }
        if(flag!=0)
            s1=s1+'(';
		
        cndn=cndn.replace("==","=");
		cndn=cndn.replace("==","=");
        b=cndn.length();
		a=0;
        while(a<b-1)
        {
            if(cndn.charAt(a+1)== '=')
            {
                if(cndn.charAt(a)!='!' &&   cndn.charAt(a)!='>' && cndn.charAt(a)!='<')
				{
				cndn=cndn.substring(0,a+1)+"="+cndn.substring(a+1,b);
					a+=1;
					b=cndn.length();
				}
            }

            a++;
        }
        cndn=new word_manipulator().replace_cndn(cndn);
        if(flag != 0)
            s1=s1+cndn+"){"+p;
        else s1=s1+cndn+"{"+p;
        return s1;
    }

    public String elseif_statement(String in)
    {
        //ifthenmodule
		String cndn="";
		String p="";
		String key="";
		int flag1=0;
		String cndn1=in;
		int d=cndn1.length();
		int i=0,l;
		
		String w=new word_manipulator().word_extract(cndn1);
		String st=new word_manipulator().word_delete(cndn1);
		
		while(st!="" && flag1!=1)
		{
		st=st.trim();
		if("then".equalsIgnoreCase(w))
		{
		flag1=1;
		w=new word_manipulator().word_extract(st);
		st=new word_manipulator().word_delete(st);
		key=new key_word_extract().dictionary(w);
        p=new Mainp().choosefunc(key,st,0);
		}
		if (flag1==0)
		{
		w=new word_manipulator().word_extract(st);
		st=new word_manipulator().word_delete(st);
		}
		}
		if(flag1==1)
		{
		l=cndn1.indexOf("then");
		cndn=cndn1.substring(0,l-1);}
		else 
		cndn=in;
		//ifthenmoduleends
		
		
		s2="\n}else if";
        
        top=-1;
        int b=cndn.length();
        int a=0;
        int flag=1;
        if(cndn.charAt(0)=='(')
        {
            push(0);
            a+=1;
            while(a<b-1)
            {
                if(cndn.charAt(a)=='(')
                    push(a);
                else if(cndn.charAt(a)==')')
                    pop();
                a+=1;
            }
            a=b-1;
            if(cndn.charAt(a)==')' && stk[top]==0)
                flag=0;
            else flag=1;
        }
        if(flag!=0)
            s2=s2+'(';
        cndn=cndn.replace("==","=");
		cndn=cndn.replace("==","=");
        b=cndn.length();
		a=0;
        while(a<b-1)
        {
            if(cndn.charAt(a+1)== '=')
            {
                if(cndn.charAt(a)!='!' &&   cndn.charAt(a)!='>' && cndn.charAt(a)!='<')
				{
				cndn=cndn.substring(0,a+1)+"="+cndn.substring(a+1,b);
					a+=1;
				}
            }

            a++;
        }
        cndn=new word_manipulator().replace_cndn(cndn);
        if(flag != 0)
            s2=s2+cndn+"){"+p;
        else s2=s2+cndn+"{"+p;
        return s2;
    }	

    public String else_statement(String in)
    {
        String p="";
		s3="\n}";
        if(!"".equalsIgnoreCase(in))
		{
		String w=new word_manipulator().word_extract(in);
		String key=new key_word_extract().dictionary(w);
		String st= new word_manipulator().word_delete(in);
        p=new Mainp().choosefunc(key,st,0);
		}
        s3=s3+"else";
        s3=s3+"{"+p;
        return s3;
    }
}
