import java.util.Scanner;

public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
        sg.askAboutAge();
    }

    public void start() {
        System.out.println("Det virker!");
    }

    public void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast dit navn");

        String navn = sc.next();

        System.out.println("Hej " + navn + " Godt at møde dig <3.");


    }

    public void askAboutAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast din alder");

        int age = sc.nextInt();

        System.out.println(age + " Hold kæft du er gammel");


    }

}
