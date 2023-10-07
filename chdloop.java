/*import java.util.*;
public class chdloop{
    public static void main(String args[]){
        for(int i=1;i<=5;i+=3);
        System.out.println("Hello");
        System.out.println("I love myself");
        System.out.println("i want be part of coperate world in 1 yr of my college");
        System.out.println("doing java and dsa");
    }
}*/
//          DOUBT
/*
import java.util.*;
public class chdloop{
    public static void main(String args[]){
        int evensum=0;int oddsum=0;
        do{
            System.out.println("Enter the number");
            int number = sc.nextInt();
            if(number%2==0){
                evensum=evensum+number;
            }else{
                oddsum=oddsum+number;
            }
            System.out.println("do u want result then press 1");
            int choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Even number sum: "+evensum);
        System.out.println("Odd number sum : "+oddsum);
    }
}*/
//              ASK TO SIR DOUBT
/*
import java.util.*;
public class chdloop{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int number;int fact=1;
    System.out.println("Enter number:");
    num=sc.nextInt();
    for(int 1=1;i<=num;i++){
    fact=fact*i;
    }
    System.out.println("Factorial is: "+fact);
    }
}*/
//  check
/*
public class chdloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}*/
//                  CONDITIONAL QUESTION
/*                  
import java.util.*;
public class chdloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("the number is positive");
        }else{
            System.out.println("The number is negative");
        }
    }
}*/
/*import java.util.*;
public class chdloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temp.");
        double x=sc.nextInt();
        if(x>100){
            System.out.println("fever");
        }
        else{
            System.out.println("normal");
        }
    }
}*/
/*import java.util.*;
public class chdloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter week day(1-7)");
        int week=sc.nextInt();
        switch(week) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thrusday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Satarday");
            break;
        }
    }
}*/
import java.util.*;
public class chdloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("ENter your number: ");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}