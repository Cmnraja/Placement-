import java.io.*;
import java.nio.file.*;
import java.util.*;
public class hello
{
  public static void main(String[] args) throws Exception{
  Scanner sc =new Scanner(System.in);
  int a=sc.nextInt();
String a1[] =new String[a];
String z="";
for(int i=0;i<a;i++ ){
a1[i]=sc.next();
z=z+a1[i];
    
}
//System.out.print(z);
File file =new File("output.txt");
FileWriter writer =new FileWriter(file);
writer.write(z);
writer.close();
String content =new String(Files.readAllBytes(Paths.get("output.txt")));
System.out.println(content);
  }
  }
