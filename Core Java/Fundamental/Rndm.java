import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Rndm {
    public static void main(String[] args) throws IOException {
        /*
         * 
         * Chap 2- variable & data types in java
         */
        // int a=10;
        // System.out.println("The value is: "+ a); // concatination
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name : ");
        String name = br.readLine();// string
        System.out.println("enter your age : ");
        // while taking user input convert string into other type
        int age = Integer.parseInt(br.readLine());// 24-"24"
        System.out.println("enter your salary : ");
        double salary = Double.parseDouble(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        /*
         * System.out.println("Enter your name : ");
         * double salary = Double.parseDouble(br.readLine());
         * System.out.println("Enter your name : ");
         * System.out.println("Enter your name : ");
         * System.out.println("Enter your name : ");
         * //Scanner class new
         * /* Scanner sc =new Scanner(System.in);
         * //string
         * System.out.println("Enter your name : ");
         * String name =sc.nextLine();
         * System.out.println("Enter your age : ");
         * int age = sc.nextInt();
         * System.out.println("Enter your gender : ");
         * char gender =
         */
        /*
         * System.out.println("Enter the value of a : ");
         * int a =sc.nextInt();
         * System.out.println("Enter the value of b : ");
         * int b =sc.nextInt();
         * System.out.println("Enter the value of c : ");
         * int c =sc.nextInt();
         * if(a>b){if}
         */
        /*
         * int i=0;
         * while(i<=10){
         * System.out.println(i);
         *    i++;
         */
    }
}
