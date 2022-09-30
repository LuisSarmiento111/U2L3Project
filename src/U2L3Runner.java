import java.util.Scanner;

public class U2L3Runner {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        ChatBot George = new ChatBot();
        George.greeting();
        System.out.println("What would you like to do?");
        System.out.println("You can:");
        System.out.println("Press w for weather");
        String letterTyped = myObj.nextLine();
        if (letterTyped.equals ("w") ){
            George.weather();
        }
        George.help();
    }
}
