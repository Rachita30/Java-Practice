package Pattern;

public class Pattern14 {
	public static void main(String[] args) {
		int n=7 ;
		int star=1;
		int space=n/2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++){
				if(j%2==0){
					System.out.print("b");
				}
				else if(i==n/2+1&&j==n/2){
					System.out.print("cd");
				}
				else
					System.out.print("a");
			}
			
			System.out.println();
			if(i<n/2+1)
			{
				space--;
				 star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
		}
	}

}
