package Pattern;

public class Pattern11 {

	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=n/2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++){
//				System.out.print(j%2+"");
				System.out.print(i%2+"");

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
