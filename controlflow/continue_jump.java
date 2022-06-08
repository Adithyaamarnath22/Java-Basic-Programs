package controlflow;

public class continue_jump {
	public static void main(String args[])
	{
		int a;
		for(a=0;a<10;a++) {
			if(a==7)
				continue;
			System.out.println(a);
		}
	}

}
