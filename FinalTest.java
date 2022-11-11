import java.util.Scanner;
public class FinalTest {
    public static void main(String[] args) {
        int Inputname;

        System.out.println("Pick a number between 1 to 100 ");
        Scanner Num = new Scanner(System.in);
        Inputname = Num.nextInt();
        if (Inputname > 70){
            System.out.println("The student is approved");
        }
        else {
            System.out.println("Try again and you will approved");
        }

    }
}
