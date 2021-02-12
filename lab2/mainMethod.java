/* Write a toolkit that includes some common functions a user might want or need

An encryption/ decryption method. Both methods should take in a String (the String that needs to be changed), and an encryption value. The methods need to change the String by the value
This is actually a Caesar cipher, not a real encryption algorithm like DES or AES
You'll want to make use of the string.charAt(i) and typecast it to a char (char)( [new encrypted character] )
Enter a string to encrypt. apples
What value do you want to encrypt with? 5
apples encrypted is fuuqjx
Using fuuqjx to test the decryption with 5...
The decrypted string is apples */

import java.util.Scanner;

public class mainMethod{

//main method for lab2
	public static void main(String[] args) {
		System.out.println("\n Enter 1 for encription. \n Enter 2 for decription. \n Enter 3 to calculate sum of array. \n Enter 4 to search a number in array ");
		Scanner sc = new Scanner(System.in);
		int value= sc.nextInt();
		switch (value){
			case 1:
				encr();
				break;
			case 2:
				decr();
				break;
			case 3:
				Sum_Array();
				break;
			case 4:
				Search_Array();
				break;
			default:
				System.out.println("enter correct number.");
				break;
		}
 	}

 	private static void encr(){
 		Scanner sc = new Scanner(System.in);
        System.out.println("Enter String for encription");
        String text = sc.nextLine();
        
        System.out.println("enter number to encrypt with.");
        int enc_by = sc.nextInt();
        String enc_value = new String();
        
        System.out.println(text.length());
        for (int i=0;i<text.length();i++){
            char character = text.charAt(i);
            int ascii = (int) character;
            char enc_char =  (char) (ascii + enc_by);
            enc_value += enc_char;
        }

        System.out.println("encripted string");
        System.out.println(enc_value);
        
 	}

 	private static void decr(){
 		System.out.println("Enter String for decription");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        
        System.out.println("enter number to decrypt with.");
        int dec_by = sc.nextInt();
        String dec_value = new String();
        for (int i=0;i<text.length();i++){
            char character = text.charAt(i);
            int ascii = (int) character;
            char dec_char =  (char) (ascii - dec_by);
            dec_value += dec_char;
            }
        System.out.println("decripted string");
        System.out.println(dec_value);
 	}

 	private static void Sum_Array(){
        System.out.println("Enter  array");
 		Scanner sc = new Scanner(System.in);
        
        int[] sum_ele = new int[10];
        int sum = 0;
        for (int i=0;i<10;i++){
            int val = sc.nextInt();
            sum_ele[i]=val;
            sum+=val;
        }
        System.out.println("Sum of array is "+ (sum)); 
        String value = sc.nextLine();
 	}
 	private static void Search_Array(){
 		System.out.println("Enter  array");
 		Scanner sc = new Scanner(System.in);
        
        int[] sum_ele = new int[10];
        int sum = 0;
        int flag=0;
        for (int i=0;i<10;i++){
            int val = sc.nextInt();
            sum_ele[i]=val;
            sum+=val;
        }
        System.out.println("Sum of array is "+ (sum)); 
        String value = sc.nextLine();

		System.out.println("\nEnter number to find in array\n");
 		int val = sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(sum==val){
                flag=1;
                break;
            }
            else{            
                flag=0;
            }
        }
        if(flag == 1){
            System.out.println( "the array contains "+val);
        }
        else{
            System.out.println("the array does not contain "+val);
        }

       /* if(value = true){
        	System.out.println("number is found");
        }
        else{
        	System.out.println("number is not found");
        }
*/
        


        //String value = sc.nextLine();
 	}

}
