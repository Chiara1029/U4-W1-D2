import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 4");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int startNum = scanner.nextInt();
        countdown(startNum);
        scanner.close();
    }
    public static void countdown(int startNum){
        for(int i = 0; i <= startNum; i++) {
            System.out.println(startNum - i);
        }
    }
}