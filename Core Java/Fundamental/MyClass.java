/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;*/

//import java.util.Scanner;
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        // System.out.println("Youth career Hub");
        /*
         * 
         * Chapter-2 var and data types in java
         */

        // var declaration
        // System.out.println(a);
        // concatination concept
        // out-the value of a is: 10
        // System.out.println("The value of a is: " + a);
        // later study - local, instance, refrence, static, classLevel
        // System.out.println("The value of a is: " - a);

        // chapter-3 identifier in java (var)

        // valid var, classname(1st Lett Capital), method name
        /*
         * int myVariable;
         * int MYVARIABLES;
         * int myvariables;
         * int _myvariables;
         * int ₹myvariable;
         * int sum_of_array;
         * int youth123;
         */
        // non-valid
        /*
         * int sum of array; //no space
         * int 123Youth; // no number in starting
         * int a+c // no operator in between var name
         * int variable-123; // no hypen(-)
         * int sum_&_diff // no ampersond
         */

        /*
         * datatype
         * type casting
         * class & object
         * input/output
         * if else
         */

        // datatype in java
        /*
         * char a = 'Y';
         * int i = 86;
         * byte b = 5;
         * short s = 56;
         * double d = 4.355453532;
         * float f = 4.73333f;
         * long l = 12121;
         * String name = "Indranil";
         * 
         * System.out.println("a: " + a);
         * System.out.println("i: " + i);
         * System.out.println("b: " + b);
         * System.out.println("s: " + s);
         * System.out.println("d: " + d);
         * System.out.println("f: " + f);
         * System.out.println("l: " + l);
         * System.out.println("name: " + name);
         */

        // Type casting in java
        // cast operator - (type)

        // int a = 3; //4
        // implicit casting - widening casting
        // double db = a; //8 ---- 4
        // System.out.println(db);
        // explicit casting ------- narrow casting
        // int db1 = (int)db; // 4--------8
        // System.out.println(db1);

        // type conversion
        /*
         * long a = 3;
         * byte b = 2;
         * double c = 2.0;
         * double add = (a+b+c);
         * System.out.println(add);
         */

        // class and object in java - small part
        // ----Instance variable and local variable

        // input-output in java
        // (1) BufferedReader Class (File-I/0)
        // (2) Scanner class (99% time)

        // BufferedReader class
        /*
         * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         * System.out.println("Enter your name: ");
         * String name = br.readLine(); //string
         * System.out.println("Enter your age: ");
         * //while taking user input convert the string into other type
         * int age = Integer.parseInt(br.readLine()); //24 - "24"
         * System.out.println("Enter your salary: ");
         * double salary = Double.parseDouble(br.readLine());
         * 
         * System.out.println("Name: " + name);
         * System.out.println("Age: " + age);
         * System.out.println("Salary: " + salary);
         */

        // Scanner class (newly)
        // Scanner sc = new Scanner(System.in);

        // string
        /*
         * System.out.println("Enter the name: ");
         * String name = sc.nextLine();
         * System.out.println("Enter the integer value: ");
         * int age = sc.nextInt();
         * System.out.println("Enter the gender: ");
         * char gender = sc.next().charAt(0);
         * System.out.println("Enter the mobile no: ");
         * long mobileNo = sc.nextLong();
         * System.out.println("Enter your cgpa");
         * double cgpa = sc.nextDouble();
         * 
         * 
         * System.out.println("Name: " + name);
         * System.out.println("Age: " + age);
         * System.out.println("Gender: " + gender);
         * System.out.println("Mobile No: " + mobileNo);
         * System.out.println("CGPA: " + cgpa);
         */

        // Control statement
        // 1 - decision making statement
        // if, if-else, if-else-ladder, nested if else and switch
        // 2 - looping statement
        // entry controled - while, for loop
        // exit controled - do-while
        // for each loop (array)
        // 3 - jumping statement
        // Break and Continue

        /*
         * System.out.println("Enter the value of a: ");
         * int a = sc.nextInt();
         * System.out.println("Enter the value of b: ");
         * int b = sc.nextInt();
         * System.out.println("Enter the value of c: ");
         * int c = sc.nextInt();
         */

        // if-else ladder
        /*
         * if(a>b && a>c){
         * System.out.println("a is bigger");
         * }else if(b>a && b>c){
         * System.out.println("b is greater");
         * }else{
         * System.out.println("C is greater");
         * }
         */

        // nested if else

        /*
         * if(a>b){
         * if(a>c){
         * System.out.println("a is greater");
         * }else{
         * System.out.println("c is greater");
         * }
         * }
         * else if(b>c){
         * System.out.println("b is greater");
         * }
         * else{
         * System.out.println("C is greater");
         * }
         */

        // loop

        // while
        /*
         * int i = 0;
         * while(i<=10){
         * System.out.println(i);
         * i++;
         * }
         */

        // do-while
        /*
         * int i=0;
         * do{
         * System.out.println(i);
         * i++;
         * }while(i<=10);
         */

        // for loop
        /*
         * for(int i=0; i<=10; i++){
         * System.out.println(i);
         * }
         */

        // infinite loop
        // for
        /*
         * for(;;){
         * System.out.println("0#1234565$");
         * }
         */

        /*
         * while(true){
         * System.out.println("$bhjsdj45dsk");
         * }
         */

        // nested

        /*
         * for(int i=1; i<=5; i++){
         * for(int j=1;j<=i; j++){
         * System.out.print("* ");
         * }
         * System.out.print("\n");
         * }
         */

        // break
        // used to out of the middle of loop and terminated the loop
        /*
         * for(int i=1;i<=10;i++){
         * System.out.println("i: "+i);
         * if(i==5){
         * System.out.println("Bye");
         * //break;
         * continue;
         * }
         * }
         */

        // switch
        /*int ch = 6;
        switch (ch) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Funday");
                break;
            default:
                System.out.println("Bye Bye");
        }*/
        //infinite
        /*do{
            System.out.println("jbdjdjnj");
        }while(true);*/

        //in - InputStream(System class)
        //out - PrintStream (System class)
        //println, print(Printstream - println)
        
    }
}
