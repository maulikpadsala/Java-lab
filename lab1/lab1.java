import java.util.Scanner;

public class lab1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name;
        System.out.println("enter your name: " +name );
        
        
        System.out.println("enter your grade:" );
        
        Double a = sc.nextDouble();
        if (a < 50 ){
            
            System.out.println("your letter grade is F");
        }
        else if (a < 60){
        
            System.out.println("your letter grade is D");
        }
        else if (a < 70){
        
            System.out.println("your letter grade is C");
        }
        else if (a < 80){
        
            System.out.println("your letter grade is B");
        }
        else if (a < 100){
        
            System.out.println("your letter grade is A");
        }
    }
}
