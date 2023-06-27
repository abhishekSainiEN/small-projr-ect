import java.util.Scanner;
import java.util.Random;
// Compiler version JDK 11.0.2

class Dcoder
{
   public static void main(String args[])
   {
    System.out.println("Hello, Dcoder!");
    Scanner sc=new Scanner(System.in);
      String website=sc.next();
       
        if(website.endsWith(".org")){
             System.out.println("this is an organisation website");
             }
             else if(website.endsWith(".com")){
               System.out.println("this is a commercial website");
               }
               else if(website.endsWith(".in")){
                   System.out.println("this is an  indian website");
                   }
                   Random r=new Random();
                   int a=r.nextInt();
                   System.out.println(a);
                  
   }
}
