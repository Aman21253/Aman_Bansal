/*public class javabasic{
    public static void main(String args[]){
        // ln denote next line and \n is also used for next line
        System.out.println("hello world");
        System.out.println("My name is Aman");
        System.out.println("My fav persons in my life is Sahil,Papa,Mummy,Divya");
        System.out.println("my best frnd is Sahil,Aman sood");
    }
}*/
/*public class javabasic{
    public static void main(String args[]) {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*"); 
    }
}*/
/*public class javabasic{
    public static void main(String args[]){
        a=10;
        b=5;
        System.out.println(a);
        String name=Aman;
        System.out.print(name);  
    }
}*/
/*public class javabasic{
    public static void main(String args[]){
        byte b=8;
        System.out.print(b);
        char ch='a';
        System.out.print(ch);
        boolean var=true;
        float price=113.32;
        int sum =31;
        // long or short bhi use hota hai int ki jgh
        //double ka use kr skte float ki jgh agr bdi value ho
        // byte, short, double, long jyada use nhi hoga 
    }
}*/
/*public class javabasic{
    public static void main(String args[]){
        // code to calculate sum in java 
        int a=12;
        int b=34;
        int sum=a+b;
        System.out.print(sum);
    }
}*/
//              important part
/*import java.util.*;
public class javabasic{
    public static void main(String args[]){
        //sc denote scanner here we take scn or s or whatever u want
        scanner sc= new Scanner(System.in); 
        String input=sc.next();
        System.out.println(input);
        //if we want to print full line or something then use nextLine
    }
}*/
/*import java.utl.*;
public class javabasic{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String input = sc.nextFloat();
        System.out.println(input a+b);
        System.out.println("My name is aman");
        System.out.print("Java Development kit");
    }
}*/
/*import java.util.*;
public class javabasic{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        //int sum=a+b;
        int product=a*b;
        System.out.println(sum);
    }
}*/
/*import java.util.*;
public class javabasic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float r= sc.nextFloat();
        float area=3.14*r*r;
        System.out.println(area);
    }
}*/
/*import java.util.*;
public class javabasic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if(tax<500000){
            tax=0;
        }
        else if(tax>=500000 && tax<1000000){
            tax= (int) (income*0.2);
        }
        else{
            tax=(int) (income*0.3);
        }
    }
}*/
/*import java.util.*;
public class javabasic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        System.out.println("enter operator: ");
        char operator = sc.next().CharAt(0);
        //CharAt(0) string ch mein pdhenge
        switch(operator){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a% b);
            break;
            default: System.out.println("my calculator is not that advanced");
            break; 
        }
    }
}*/
/*import java.util.*;

public class javabasic{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        int average=(A+B+C)/3
        System.out.println("Average is: ",+average);
    }
}*/
/*import java.util.*;
public class javabasic{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int side=sc.nextInt();
        int area=side*side;
        System.out.println("area of squre: ",+ area);
    }
}*/
/*import java.util.*;
public class javabasic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Bill is: "+total);

        float newTotal=total+(0.18f * total);

        System.out.println("Bill with 18% tax: "+newTotal);
    }
}*/
/*
import java.util.*;
public class javabasic{
    public static void main(Strings args[]){
        int counter=0;
        while(counter<100){
            System.out.println("Hello");
            counter++;
        }
        System.out.println("printed HW 100x");
    }
}*/
/*import java.util.*;
public class chajavabasic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name;
        String phone;
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your phone");
        name=sc.next();
    }
}*/
public class chajavabasic{
    public static void main(String args[]){
        int x=5;
        boolean y=true;
        x=(y=false)?x++:--x;
        x=(y=true)? x--:++x;
        System.out.println(x);
        /*System.out.print(100+100+" Left ");
        System.out.print(" Right "+100+100);*/
    }
}
