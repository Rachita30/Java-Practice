package Pattern;

public class Pattern18 {

	public static void main(String[] args) {
		int n=4;
		int star=1;
		int space=n-1;
		for(int i=0; i<n*2-1; i++)
		{
			for (int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			
		for(int k=1; k<=star; k++){
			System.out.print(k);
		}
		System.out.println();
		
		if(i<n/2+1){
			space--;
			star=star+1;
		}
		else
		{
			space++;
			star=star-1;
		}
		
		}		


	}

}
