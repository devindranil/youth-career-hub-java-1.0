import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender? Type F for Female and m for male");
        char gen = sc.next().charAt(0);
        sc.nextLine();
        if(gen == 'F'){
            System.out.println("What is your first name?");
            String femaleFirstName = sc.nextLine();
            System.out.println("What is your last name?");
            String femaleLastName = sc.nextLine();
            System.out.println("What is your age");
            int femaleAge = sc.nextInt();
            if(femaleAge>=20){
                System.out.println("Are you married?type y for yes and n for no");
                char married = sc.next().charAt(0);
                if(married=='y'){
                    System.out.println("Then I will call you Mrs. " + femaleLastName);
                }
                else if (married=='n'){
                    System.out.println("Then I will call you Ms. " + femaleLastName);
                }
            }
            else if(femaleAge<20){
                System.out.println("Then I will call you "+femaleFirstName + ""+femaleLastName);
            }
            

        }
        else if(gen == 'M'){
            System.out.println("What is your first name?");
            String maleFirstName = sc.nextLine();
            System.out.println("What is your last name?");
            String maleLastName = sc.nextLine();

            
        }


    }
    
}
