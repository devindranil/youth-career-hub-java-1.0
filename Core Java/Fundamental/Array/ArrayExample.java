package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax of array in java
        // datatype[] rollNo = new datatype[size]
        // Q - store roll number of 5 students
        // int[] rollNo = new int[5];//declaration+allocation of memory
        /*
         * int[] rollNo;//declaration of array
         * rollNo =new int[5];//memory allocation
         */
        // initialize the value in array
        /*
         * rollNo[0] = 10;
         * rollNo[1] = 20;
         * rollNo[2] = 30;
         * rollNo[3] = 40;
         * rollNo[4] = 50;
         */

        // Array Literal
        // int[] rollNo = new int[]{10,20,30,40,50,60,70,80};//old version java

        // input and output in java

        //int[] arr = new int[5];
        // input
        /*for (int i = 0; i < (arr.length); i++) {
            arr[i] = in.nextInt();
        }*/
        // output - type 1
        /*for (int i = 0; i < (arr.length); i++) {
            System.out.println(arr[i] + " ");
        }*/

        //output - type 2
        //For Each Loop
        /*
         * 
         * Syntax
         * for(datatype forEachVariable : name_of_array)
         * {
         *      //code goes here
         *      sout(forEachVariable)
         * }
         */

        /*for(int num : arr){
            System.out.println(num);
         }*/

         // output - typr 3 (my favourite)
         //toString method use
         //unbder the Arrays class

         //System.out.println(Arrays.toString(arr));


         //passing the array as a function

         /*int[] nums = {10,20,30,40,50};
         System.out.println(Arrays.toString(nums));
         change(nums);
         System.out.println(Arrays.toString(nums));*/

         //2d array
        //datatype[][] name = new datatype[row][col]
          
        //2D Array
        //syntax of 2d array in java
        /*
         * 
         * Math - Matrix
         * row * col
         * 3*3
         *  1 2 3
         *  4 5 6
         *  7 8 9
         */

         //datatype[][] arr = new datatype[size of row][size of col];
         //imp point - in 2d array mentioning the size of col is not mandatory
         //but always mention the row size(if the declaration is look like above line of code)

         //int[][] arr = new int[3][3]; //declaration and memory allocation of 2d array
         //value initialize in 2d array
         //arr[2][2]= 10;
         //this is array liteerals
         /*int[][] arr = {
            {1,2,3,4},//0th object
            {5,6,7,8,9},//1th
            {10,11,12,13},//2nd
            {14,15,16},//3rd
            {0,5,-1,6,7,8,11,15}//4th
         };*/

         //output
         /*for(int i=0;i<(arr.length); i++)
         {
            for(int j=0; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }*/

         /*for(int[] a: arr)
         {
            System.out.println(Arrays.toString(a));
         }*/

         //array List
         //syntax
         ArrayList <Integer> list = new ArrayList<>();

        //System.out.println(list.add(10));
        /*list.add(200);
        System.out.println(list);*/
        list.add(20);
        list.add(45);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < 5; i++) {
           System.out.println(list.get(i));
        }
    }

    /*static void change(int[] arr)
    {
        arr[0] = 99;
    }*/
}
