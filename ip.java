package small project;

import java.util.*;
import java.net.*;

// Compiler version JDK 11.0.2

class Dcoder
{
   public static void main(String args[])
   {
    System.out.println("Hello, Dcoder!");
    try{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the hostName(www.xyz.com)");
       String a=sc.nextLine();
       InetAddress ip=InetAddress.getByName(a);
       System.out.println(ip.getHostAddress());
       System.out.println(ip.hashCode());
       System.out.println(ip.toString());
       }
       catch(Exception e){
          System.out.println("sorry |invalid hostname()");
    }
   }
}
