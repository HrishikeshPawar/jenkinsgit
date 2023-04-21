package Assignment2;
public class Q7Pattern6 {
	public static void main(String[] args) {
		int z=71, space=-1;
		char x='F';
		for (int i=1;i<=5;i++) 
		{z--;
		for(char a='A';a<z;a++)
		{
			System.out.print(a);
		}space++;
		for (int v=2;v<=space+1;v++)
		{
			System.out.print(" ");
		}
		for(int v=2;v<=space+1;v++)
		{
			System.out.print(" ");
		}x--;
		for (char b=x;b>='A';b--)
		{
			System.out.print(b);
		}
		System.out.println();
				}

	}

}
