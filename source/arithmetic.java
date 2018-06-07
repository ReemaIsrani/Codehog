class Arithmetic{
public static String s;
public String math(String key)
{
String s1 = new word_manipulator().word_extract(key);
String a = new word_manipulator().word_extract(key);
String s = new word_manipulator().word_delete(key);
if (key=="sum")
        a += " + " + new word_manipulator().word_extract(s);
if (key=="subtract")
        a += " - " + new word_manipulator().word_extract(s);
if (key=="multiply")
        a += " * " + new word_manipulator().word_extract(s);
if (key=="divide")
        a += " / " + new word_manipulator().word_extract(s);
if (key=="sum")
        a += " % " + new word_manipulator().word_extract(s);
return a;
}
}
  