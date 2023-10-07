//               NAME
/*import java.util.*;
public class string {
    public static void main(String args[]){
        char arr[]={'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz"); 
        //Strings are IMMUTABLE
        //immutable means string kbhi change nhi hoti ek string manani padegi 

        //Input
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name); 
    }
}*/
//          Number of words
/*import java.util.*;
public class string {
    public static void main(String args[]){
    // NORMAL 
    String fullName= "Aman Bansal";
    System.out.println(fullName.length()); 
    //concatination means adding two thing 
    String firstName= "Aman";
    String lastName="Bansal";
    String fullName=firstName+" "+lastName;
    System.out.println(fullName);
    }
}*/
/*import java.util.*;
public class string {
    public static void main(String args[]){
        String firstName= "Aman";
        String lastName="Bansal";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName.charAt(3));
    }
}*/
//              name print krne ka but run nhi ho rha
/*public class string{
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        String firstName= "Aman";
        String lastName="Bansal";
        String fullName=firstName+" "+lastName;
    }
}*/
//          Talk to sir
//              PALINDROME
/*import java.util.*;
public class string{
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            //yha error dikha rha h
            if(str.charAt(i)!=str.charAt(n-i-1)){
                 //not palindrome wali condn h
                return false; 
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="racecar";
        System.out.println(isPalindrome(str)); 
    }
}*/
//              direction shortest path
//              error dikha rha h
/*import java.util.*;
public class string{
    public static  float shortestPath(String path){
        int x=0,y=0;
        //         Dot pe error dikha rha h
        for(int i=0;i < path.length();i++){
            char dir=path.charAt(i);
            if(dir=='S'){
                y--;
            }else if(dir=='N'){
                y++;
            }else if(dir=='E'){
                x++;
            }else{
                x-- ;
            }
        }
        int X2=x*x;
        int Y2=y*y; 
        return (float)Math.sqrt(X2+Y2); 
    }
    public static void main(String args[]){
        String path="WNEENSENNN";
        System.out.println(shortestPath(path)); 
    }
}*/
// Those string which we make with 'new' key word then new string created
/*import java.util.*;
public class string{
    public static void main(String args[]){
        String s1="tony";
        String s2="tony";
        String s3=new String("tony");
//          BUT HERE S3 IS NOT EQUAL
        //if(s1==s3){
        if(s1.equals(s3)){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
    }
}*/
//              SUBSTRING
/*import java.util.*;
public class string{
    public static String subString(String str,int si,int ei){
        String substr="";
        for(int i=si;i<=ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
//                   SUBSTRING
    String str="Hello world";
    System.out.println(subString(str,0,6));
    }
}*/
//           LARGEST STRING
//      DOING WITH LEXICOGRAPHIC METHOD
/*import java.util.*;
public class string{
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"}; 
        int largest=fruits[0];
        for(int i=1; i<fruit.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruit[i]; 
            }
        }
        System.out.println(largest);
    }
}*/
/* import java.util.*;
public class string{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
        sb.append(ch);
        }//append means abcdefgh...z 
    System.out.println(sb); 
    //if u want to know length then u can write sb.length
    }
}*/
//              DOUBT

//      if i write "hi,i am aman" and i want first letter in uppercase
//  to upper case letter ko bda kr deta h
/*public class string{
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length;i++){
            if(str.charAt(i)==0 && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                //Character.toUpperCase yha letter bda kr rha h
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="hi,i am aman bansal"; 
        System.out.println(toUpperCase(str));
    }
}*/
//      STRING COMPRESSION
//  aaabbccccc then we write a3b2c4
import java.util.*;
public class chistring{
    public static String compress(String str){
        StringBuilder sb=new StringBuilder(" ");
        char ch=Character.toCompression(str.charAt(ch));
    }
    public static void main(String args[]){
        String str="aaabbcccdd";
    }
}