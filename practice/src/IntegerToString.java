import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n value between -100 to 100");
        int n = scanner.nextInt();
        
        String str = Integer.toString(n);
        
        for(n=-100; n<=100; n++){
        if (str.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        }
        
        scanner.close();
    }
}
