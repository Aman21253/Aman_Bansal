//                      TIME COMPLEXITY 
//complexity=amount of space or time taken up the algorithm as funct of input size
// theoritical hi pucha jata h interview
// experintal data has no value in interview 
//              BIG O 
//big O ne jo time bataya h usse jyada usse nhi lg skta
//big O means upper bound i.e worst case
/*an^2+bn+c iska time coplexity nikalni h 
first step is ignore cons  then equn is n^2+n+1
sec step largest term konsi h n^2 i.e  time complexity=O(n^2)*/ 
/*an^3+blogn+c so firstly ignore cons i.e n^3+logn+1
largest term is n^3*/ 
//                       OMEGA
//omega=  lower bound  i.e usse km time complexity nhi lgegi i.e best case
//                      SPACE COMPLEXITY
//Input space+Auxillary space=space complexity
//Auxillary space apn ne koi n size ka temperary input le liya
/*merge sort ki space complexity =O(n) becz it use temp array but 
time complxity is nlogn which is beter than quick sort*/
/*quick sort ki space complexity =O(1) becz usme koi auxillary space use nhi hota
but time complexity is n^2 which is very bad*/
//          SOME QUES TIME COMPLEXITY
//nested loop ka time complexity is O(n^2)
//time complexity of pattern ques is generally O(n^2)
//how we calculate = wa just sum all the operations and ignore cons.
/*one case for(i=1;i<=n;i+=k){
    for(j=i+1;j<=k;j++){
        and here time complexity is O(n) reason operation is n/k*k*p
        p jo work h k value
    }
}*///binary search time complexity is O(logn) just we do half of array each time
//i.e n/2,n/4,n/8...n/2^k
//n/2^k=1 toking log and solve


//                      RECUSIVE
//1)Linear search           2)Divide and Conqur
/*factorial code
public static int fact(int n){
    if(n==1){
        return 1;
    }
    return n*fact(n-1);
}
total wd=no. of calls*work in each call
and here no of calls is n so tc is O(n)*/
/*sum
public static int sum(int n){
    if(n==0){
        return 0;
    }
    return n+sum(n-1);
}wd =n*k so tc O(n) and sc=depth*memory in each level
/*fibonacci
public static int fib(int n){
    if(n==0||n==1){
        return n;
    }return fib(n-1)+fib(n-2);
}tc =isme divide and conqur use hoga so first step 2^0
then 2^1 and then2^2 and...2^n so tc 2^n ;sc=O(n)*/
/*merge sort time complexity is nlogn first mirge ki tc vo O(n) aayegi and
then we calculate mergesort tc which is nlogn and sc is O(n)*/
//power funct ka tc 2^log2n i.e tc=O(n) but in optimised way tc logn 