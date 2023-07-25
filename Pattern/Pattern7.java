package Pattern;

public class Pattern7 {
	public static void main(String[] args) {
		int n=5;
		int x;
		for(int i=1; i<=n; i++)
		{
			x=1;
			for(int j=n; j>=1; j--)
			{
				if(j<=i){
			
					System.out.print(x+"");
					x++;
				}
				else
					System.out.print(" ");
	

				}
			System.out.println();
		}
	}

}
