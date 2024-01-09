import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 3");
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Write a word (or :q to exit)");
            String newWord = scanner.nextLine();
            if(newWord.equals(":q")){
                System.out.println("Exit.");
                scanner.close();
                break;
            } else {
                includeCommas(newWord);
            }
        }
    }
    public static void includeCommas(String newWord){
        int i = 0;
        while(i < newWord.length()){
            System.out.print(newWord.charAt(i));
            if(i<newWord.length()-1){
                System.out.print(",");
            } else {
                System.out.println(" ");
            }
            i++;
        }
    }
}