package Operators;

import java.util.Scanner;

public class Logicoperation
{
public static void main(String args[])
{
System.out.println("\t Logical Operation");
System.out.println("\t-------------------");
System.out.println();
System.out.println("&&");
System.out.println("enter the boolean number");
Scanner S=new Scanner(System.in);
boolean b1=S.nextBoolean();
boolean b2=S.nextBoolean();
System.out.println("b1&&b2=>"+(b1&&b2));
System.out.println();
System.out.println("||");
System.out.println("enter boolean:");
Scanner S1=new Scanner(System.in);
boolean a1=S.nextBoolean();
boolean a2=S.nextBoolean();
System.out.println("a1||a2:"+(a1||a2));
System.out.println();
System.out.println("!");
System.out.println("Enter the boolean:");
Scanner S2=new Scanner(System.in);
boolean c=S.nextBoolean();
System.out.println("!c:"+(!c));




}
}
