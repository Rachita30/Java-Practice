package Pattern;

public class Pattern8 {

	public static void main(String[] args) {
//		int n=5;
//		char ch;
//		for(int i=1; i<=n; i++)
//		{
//			ch='A';
//			for(int j=n; j>=1; j--)
//			{
//				if(j<=i){
//			
//					System.out.print(ch+"");
//					ch++;
//				}
//				else
//					System.out.print(" ");
//	
//
//				}
//			System.out.println();
//		}
		int n=5;
		int x;
		for(int i=1; i<=n; i++)
		{
			x=1;
			for(int j=n; j>=1; j--)
			{
				if(j<=i){
			
					System.out.print((char)(x+96)+"");
					x++;
				}
				else
					System.out.print(" ");
	

				}
			System.out.println();
		}
	}

}
