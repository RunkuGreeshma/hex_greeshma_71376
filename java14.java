class A
{
static int a = 1000;
static void abc()
{
System.out.println("hi,abc method");
}
}
class Demo7
{
public static void main(String args[])
{
A.abc();
System.out.println(A.a);
}
} 