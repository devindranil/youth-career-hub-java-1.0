package Methods;

import java.util.Scanner;

public class StaticMethodExample {
    //upper
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //calling a function
        //addTwoNum(); //called function
        //addTwoNum();

        //addTwoNum(10,20);
        //addTwoNum(25, 50);
        int a,b;
        int sum;
        /*sum=addTwoNum(); // return a interger value of 30
        System.out.println("The addition of two no is: " + sum);*/

        /*System.out.println("The addition of two no is: " + addTwoNum());*/
        System.out.println("Enter the value of a: ");
        a= sc.nextInt();
        System.out.println("Enter the value of b: ");
        b=sc.nextInt();
        sum = addTwoNum(a,b);
        System.out.println("The addition of two no is: " + sum);



    }
    //lower
    //without return type and no parameter
    /*static void addTwoNum()
    {
        int x = 10;
        int y = 20;
        int z = x+y;
        System.out.println("The addition of two no is: " + z);
    }*/

    //without return type but parameter
    /*static void addTwoNum(int x, int y)
    {
        int z = x+y;
        System.out.println("The addition of two no is: " + z);
    }*/
    //with return type but no parameter
    /*static int addTwoNum()
    {
        int x,y,z;
        x=10;
        y=20;
        z=x+y;
        return z;
    }*/
    //with return type and parameter
    static int addTwoNum(int x, int y)
    { 
        return (x+y);
    }

}

//parameter types
//Actual - called - only var name or direct value pass
//Formal - define - with data type var and no direct value
