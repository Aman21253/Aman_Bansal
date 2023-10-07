// class is nothing but blue print
// and jo uss class se aayega usse hm object khte h

//Class and object
/*public class chjoops{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("Black");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}
class Pen{
    String color;
    int tip;

    //this.something is used for above use integer,string etc.. 
    //if make anything private then we use getsomething.. 
    //something represnt anyy word
    String getcolor(){
        return this.color;
    }
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    int name;
    int age;
    float percentage;

    void calPercentage(int math,int phy,int che){
        percentage = (phy+math+che)/3;
    }
    void setName(int newName){
        name=newName;
    }
}*/
/*public class chjoops{
    public static void main(String args[]){
        BankAccount myyAccount=new BankAccount();
        myyAccount.username="Aman";
        myyAccount.setPassword("aman@2003") ;
    }
}
    //access modifier
    //public jo sb ko dikhega
    //protected jo dikhta h
    //default mein sirf package tk hogi info. 
    //private jo sirf class pe hogi example password 

    // let assume map ke pass kuch data h toh vo 
    //sirf map ke pass rhe vo payment pakage pe na jaye

    class BankAccount{
        public String username;
        private String password;
        public void setPassword(String pwd){
            password=pwd;
        }
}*/
/*Encapsulation=When we make a combined combination of data and method
                under single unit. it is also used for data hiding  */
/*Constructor= It has same name as class or structure.
               It don't have return type(not even void).
               it called only one time at object creation.*/
/*Inheritance= ek generation se dusri generation mein aana
            i.e. we denote a base/parent class to derived/child*/
/*Abstaction= isme unnessary points chup jate h just like data hiding 
              but it also show imp. information */
/*Polymorphism=multiple form mein same kaam krne ki kosis
two type 1]compile time poly morphism(STATIC)-METHOD OVERLOADING
         2] run time polymorphism(DYNAMIC)- METHOD OVERRIDING */

//this is not the code.It convey that how many ways are present
//to represent the code.
/*public class chjoops{
    //iski class niche manate h
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="AmanS";
        s1.roll=31;
        s1.password="aman";
        s1.marks[0]=100;
        s1.marks[1]=98;
        s1.marks[2]=90;
        
        Student s2=new Student(s1);
        s2.password="xyz";
        for(int i=0;i<=2;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
 //                    PARAMETERISED CONSTRUCTOR
 // if we want to print name in constuctor then we simply
 // remove String name and this.name and put syso;
    Student() {
       System.out.println("Aman"); 
    }
}

    //             Non parametrised constructor
    class Student(){
        System.out.println("Aman");
    } 
}*/
/*Types of constructor -[1] non parameterised
                        [2] parameterised
                        [3] copy constructor*/
/*Shallow copy where refrece copied and change reflect
  deep copy where new array is formed and change don't reflect*/
//                shallow copy constructor
/*Student(Student s1){
    marks=new int[3];
    this.name=s1.name;
    this.roll=s1.roll;
    this.marks=s1.marks;
}*/
//                  deep copy constructor
/*Student(Student s1){
    marks=new int[3];
    this.name=s1.name;
    this.roll=s1.roll;
    for(int i=0;i<3;i++){
    this.marks=s1.marks[i];
    }
}*/
//we can't write destructor in java becz java automatically done this
//work in c++ destructor is used in java we know as garbage collector
/*public class chjoops{
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();
    }
}
    //base class
    class Animal{
        String color;
        void eat() {
            System.out.println("eats");
        }
        void breathe() {
            System.out.println("breathe");
        }
    }
    //Derived class
    class Fish extends Animal{
        int fins;
        void swim(){
            System.out.println("swims in water");
        }
    }*/
/*multi level Inheritance isme parent class usse derived class 
 and usse ek or derived class i.e Animal usme phir mammal and 
 usse phir dog*/
/*Hierchial Inheritance ke base class se do derived class h 
i.e Animal mein eat and breathe uske do branch h bird 
mein fly and fish mein swim*/
/*isme sb aa gya mtlb parant class usme derived class jitni bhi and uski
bhi derived class phir kitni bhi bna skte h */

//Function overloading
/**sum(int a,int b)
   sum(float a,float)
   sum(int a,int b,int c) */


//ex of funct overloading


/*public class oops{
    public static void main(String args[]){
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,3));
        System.out.println(calc.sum((float)1.3,(float)3.4));
        }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}*/


//Method overriding 
//Animal void eat-"eat anything" and deer void eat-"eat grass"

/*public class oops{
    public static void main(String args[]){
        Deer a=new Deer();
        a.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}
class Deer extends Animal {
    void eat(){
        System.out.println("Eat grass");
    }
}*/
// jo bhi class hm abstract se banayenge usme object nhi use kr payenge
/*public class oops{
    public static void main(String args[]){
        Horse h=new Horse();
        h.eats();
        h.walk();
        //isme black isliye nhi hua kyuki parant class phle print hogi
        System.out.println(h.color);
 //we cant make class of animal becz we cant make an object for 
 //abstract type
 // we can make constructor for abstract
    }
}
abstract class Animal{
    String color;
    //we make constructor here
    Animal(){
        color="Brown";
    }
    //it is non astact becz it has implimentation syso
    void eats(){
        System.out.println("Animal eats");
    }
    //it is abstract
    abstract void walk();
}
class Horse extends Animal{
    void changeColor(){
        color="Black";
    }
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}*/

//Interface=[1]multiple inheritance    [2]total abstraction
//isme 100% abstraction hoti
//interface mein abstract honge or public hoga

/*public class oops{
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves() {
     System.out.println("Up,Down,Diagonal(in all direction),Left,Right");
    }
}
class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("Up,Down,Left,Right");
    }
}
class King implements ChessPlayer{
    public void moves() {
        System.out.println("Up,Down,Diagonal,Left,Right(1 step only)");
    }
}*/
/*Static keyword
    it is used to share some variable or method of a given class  */
//      DOUBT
/*import java.util.*;
public class chjoops{
    public static void student{
        String name;
        int roll;
        static String schoolName;
        void setname(String name){
            this.name=name; 
        }
        String getName(){
            return this.name;
        }
    }
    public static void main(String args[]){
        Student s1=new Student;
        s1.schoolName="AIET";
    }
}*/
/*public class chjoops{
    public static void main(String args[]){
        //iss line mein doubt h
        Donkey d = new Donkey();
    }
    class Animal{
        Animal(){
            System.out.println("Animal constructor is used");
        }
    }
    class Donkey extends Animal{ 
        Donkey(){
            super();
            System.out.println("Horse constructor is used");
        }
    }
}*/