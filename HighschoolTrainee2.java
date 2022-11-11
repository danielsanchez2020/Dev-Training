import java.util.Scanner;
public class HighschoolTrainee2 {
    public static void main(String[] args) {
        int StudentAge = 35;
        double Prom = 9.5;
        String StudentName = "Daniel Sanchez";
        String LastName = "Sanchez";
        char FirstInitial = StudentName.charAt(0);
        char LastInitial = LastName.charAt(0);
        boolean Attendace = true;

        String FirstName = "Daniel";


        System.out.println("The student age is: "+ StudentAge);
        System.out.println("The prom is: "+ Prom);
        System.out.println("THe first initial is: "+ FirstInitial);
        System.out.println("The last initial is: "+ LastInitial);
        System.out.println("The attendance is: "+ Attendace);
        System.out.println("The student name is: "+ StudentName);
        System.out.println("The student first name is: "+ FirstName);
        System.out.println("The student last name is: "+ LastName);

        System.out.println("The student : "+ StudentName+" "+ LastName + " And their initials are: "+ FirstInitial+LastInitial);

        System.out.println("The student prom is: "+ Prom+"\nPlease modify this prom: ");
        Scanner input = new Scanner(System.in);
        Prom = input.nextDouble();
        System.out.println("The new prom is: "+ Prom);

        System.out.println("The student last name is: "+ LastName+"\nPlease modify his last name: ");
        LastName = input.next();
        System.out.println("The new last name is: "+ LastName);
    }
}
