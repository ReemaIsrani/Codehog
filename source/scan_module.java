import java.io.*;
import java.util.*;
class scan_module{
    public int MAX = 50;
    public String queue[] = new String[MAX];
    public int rear=-1,front=-1;
    public String a;

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

    public String scan_statement(String s){
        a ="";
        String sub;
        while(s.length()!=0){
            sub = new word_manipulator().word_extract(s);
            s = new word_manipulator().word_delete(s);
            String dt = new datatype_module().find_datatype(sub);
            a +="\n";
            switch(dt)
            {
                case "int": a += sub+" = sc.nextInt();";break;

                case "float": a += sub+" = sc.nextFloat();";break;

                case "double": a += sub+" = sc.nextDouble();";break;

                case "String": a += sub+" = sc.nextLine();";break;

                case "char": a += sub+"sc.next().charAt(0)";break;

                case "long": a += sub+"sc.nextLong()";break;

                case "short": a += sub+"sc.nextShort()";break;

                case "byte": a += sub+"sc.nextByte()";break;
            }
        }
        return a;
    }

    public String scan_c(String s){
        a = "\nscanf(\"";
        String sub = new word_manipulator().word_extract(s);
        s = new word_manipulator().word_delete(s);
        int c=0;
        if(sub.charAt(0)=='\"'){}
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
            if(sub.charAt(0)=='\"'){}
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
            a += ",&"+pop();
            c--;
        }
        a += ");";
        return a;
    }
}