package Pattern;

public class diff {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i<=n;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(70-j));
			}
			System.out.println();
		}
	}

}
