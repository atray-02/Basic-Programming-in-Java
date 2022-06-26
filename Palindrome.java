package BasicProgram;

import java.util.Scanner;

public class Palindrome {
    static void isPalindrome(int n){
        int rev=0,rem=0,temp=0;
        temp = n;
        while(n>0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(temp == rev){
            System.out.print("The number is palindrome");
        }
        else {
            System.out.print("Not a Palindrome number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to check : ");
        int n = sc.nextInt();
        isPalindrome(n);
    }
}
