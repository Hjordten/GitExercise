import java.util.Scanner;
public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
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



}
