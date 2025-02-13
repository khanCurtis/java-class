/*
incrementing -- pre and post incrementing
Khanon Curtis
2/6/25
*/

public class Main {
public static void main(String[] args) {
//problem #1
int a = 2;
int b = 5;

int c = a++;
//int c = a;
//a++;

System.out.println("c: " + c); //POST INCREMENTING
System.out.println("a: " + a);

int d = ++b; //PRE INCREMENTING
//b++;
//int d = b;

System.out.println("d: " + d);
System.out.println("b: " + b);

//PROBLEM 2
a = 5;
b = 7;

c = ++a + b;
System.out.println("\nc: " + c);
System.out.println("a: " + a);

//PORBLEM 3
int m = 1;
int n = 2;

int o = m++ + n + ++m;
System.out.println("\no: " + o);
System.out.println("m: " + m);

//PROBLEM 4
m = 1;
n = 2;

System.out.println(m++); //1
System.out.println(m); //2
System.out.println(++n); //3
}
}
