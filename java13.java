class A
{
public A()
{
System.out.println("Hi constructor");

}
String A()
{
return "hi";
}
}
class Demo3
{
public static void main(String args[])
{
A a = new A();
a.A();
a.A();
a.A();
}
}