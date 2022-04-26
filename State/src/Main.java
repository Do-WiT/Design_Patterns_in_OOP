import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.println("The phone is currently " + phone.currentState);
            System.out.println("Select a trigger:");
            for (int i = 0; i < phone.rules.get(phone.currentState).size(); i++)
            {

                System.out.println(i + ". " + phone.rules.get(phone.currentState).get(i).value1);

            }
            System.out.print("Please enter your choice: ");
            int choice = in.nextInt();

            phone.currentState = phone.rules.get(phone.currentState).get(choice).value2;

            if (phone.currentState == phone.exitState) break;
        }
        System.out.println("DONE");


    }
}
