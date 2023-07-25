package Pattern;

public class Pattern16 {

	public static void main(String[] args) {
		int n=3;
		int star=1;
		int space=n/2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for (int k=1;k<=star;k++){
				if(k==1){
					System.out.print("R");
				}
				else if(k==2){
					System.out.print("A");
				}
//				else if(k==3){
//					System.out.print("M");
//				}
//				else if(k==4){
//					System.out.print("H");
//				}
//				else if(k==5){
//					System.out.print("I");
//				}
//				else if(k==6){
//					System.out.print("T");
//				}
				else
					System.out.print("M");
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
