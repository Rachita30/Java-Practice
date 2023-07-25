package Pattern;

public class Pattern23 {

	public static void main(String[] args) {
        int n=7;
        int star=1;
        int space=n-2;
        int x=1;
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=star;j++)
        	{
        		System.out.print(j%2+"");
        		x++;
        	}
        	for(int k=1;k<=space;k++)
        	{
        		System.out.print(" ");
        	}
        	for(int l=star;l>=1;l--)
        	{
        		if(l<n/2+1)
        		{
        			System.out.print(l%2+""); 
        			x++;
        		}
        	}
        	System.out.println();
        	
        	if(i<n/2+1)
        	{
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
