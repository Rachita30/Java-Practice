package Pattern;

public class Pattern22 {

	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=n-2;
		for(int i=1; i<=n; i++)
		{
			for (int j=1; j<=star; j++)
			{
				if(i==n/2+1&&i>n/2+1){
				System.out.print("*");
				}
				else
					System.out.print("");
			}
			
		for(int k=1; k<=space; k++){
			System.out.print(" ");
		}
		for(int l=star; l>=1; l--){
			if(l<n/2+1)
			{
			System.out.print("*");
			}
		}
		System.out.println();
		
		if(i<n/2+1){
			
			star++;
			space=space-2;
		}
		else
		{
			star--;
			space=space+2;
		}
		
		}
	

}

	}


