import java.io.*;
import java.util.*;
class print_module{
    public static int MAX = 50;
    public static String queue[] = new String[MAX];
    public static int rear=-1,front=-1;
    public static String a;

    public void push(String word){
        if((rear==front-1)||(front==0&&rear==MAX-1)){}
        else if(rear==-1)
            rear=front=0;
        else if(rear == MAX-1 && front >0)
            rear = 0;
        else
            rear++;
        queue[rear]=word;
    }
    public String pop(){
        String temp = queue[front];
        if(front==-1){}
        else if(rear==front)
            rear=front=-1;
        else if(front == MAX-1)
            front = 0;
        else
            front++;
        return temp;
    }

    public String print_statement(String s)//java
    {
        a = "\nSystem.out.println(";
        a += new word_manipulator().word_extract(s);
        s = new word_manipulator().word_delete(s);
        while(s.length()!=0)
        {
            a += " + " + new word_manipulator().word_extract(s);
            s = new word_manipulator().word_delete(s);
            s = s.trim();
        }
        a +=");";
        return a;
    }

    public String print_c(String s){
        a = "\nprintf(\"";
        String sub = new word_manipulator().word_extract(s);
        s = new word_manipulator().word_delete(s);
        int c=0;
        if(sub.charAt(0)=='\"'){
            a += sub.substring(1,sub.length()-1);
        }
        else{
            String dt = new datatype_module().find_datatype(sub);
            switch(dt)
            {
                case "int":  a += " %d ";break;

                case "float": a += " %f ";break;

                case "double": a += " %f ";break;

                case "String": a += " %s ";break;

                case "char": a += " %c ";break;
            }
            c++;
            push(sub);
        }
        while(s.length()!=0){
            sub = new word_manipulator().word_extract(s);
            s = new word_manipulator().word_delete(s);
            if(sub.charAt(0)=='\"'){
                a += sub.substring(1,sub.length()-1);
            }
            else{
                String dt = new datatype_module().find_datatype(sub);
                switch(dt)
                {

                    case "int":  a += " %d ";break;

                    case "float": a += " %f ";break;

                    case "double": a += " %f ";break;

                    case "String": a += " %s ";break;

                    case "char": a += " %c ";break;
                }
            c++;
            push(sub);
            }
        }
        a += "\"";

        while(c>0){
            a += ","+pop();
            c--;
        }
        a += ");";
        return a;
    }
}