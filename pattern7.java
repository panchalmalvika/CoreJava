package Test.first;

public class pattern7 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<10;i++)
		{
			for(j=0;j<9-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
