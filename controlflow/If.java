package controlflow;

public class If {
	public static void main(String args[])
	{
		//simple if
		int a=3;
		int b=5;
		if (a==b) {
		System.out.println("false");
		}
		
		//if else
		int num1=4;
		int num2=9;
		
		if (num1>num2) {
		System.out.println("false");
		}
		else {
		System.out.println("true");
		}
		
		//if else if
		int x=8;
		int y=5;
		if(x<y) {
		System.out.println("No");
		}
		else if(x==y) {
		System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		
		//nested if
		int c=6;
		int d=1;
		if(c>d)
		{
			System.out.println("false");
		if(c==6)
			
			System.out.println("true");
		}
		
		
		
		}
	}



