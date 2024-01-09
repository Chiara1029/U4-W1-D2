//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 1");

        System.out.println(stringaPariDispari("nutella"));
        System.out.println(annoBisestile(2024));
    }
    public static boolean stringaPariDispari(String exampleStr){
        return exampleStr.length() % 2 == 0;
    }

    public static boolean annoBisestile(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}