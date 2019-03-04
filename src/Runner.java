import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Question q = new Question();

        for (int i = 0; i < q.question.length; i++) {

            System.out.println(q.question[i]);


            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                if (x >= 1 && x <= 5) {
                    q.answers[i] = x;
                } else {
                    System.out.println("Error! Please enter a number from 1-5 :(");
                    break;
                }
            } else {
                System.out.println("Error! You must enter a number from 1-5 :(");
                break;
            }
            if (i==9){
                int a = q.evaluate();
                System.out.println("You will live to be " + a);
            }
        }


    }
}
