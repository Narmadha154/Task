import java.util.Scanner;
class Fibonacci{
public static void main(String [] args){
int c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the n for series");
int n=sc.nextInt();
System.out.println("enter the first number");
int a=sc.nextInt();
System.out.println("enter the second number: ");
int b=sc.nextInt();
System.out.println(a);
System.out.println(b);
for(int i=0;i<n;i++){
c=a+b;
a=b;
b=c;
System.out.println(c);
}
}
}



