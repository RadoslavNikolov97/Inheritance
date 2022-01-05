package zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gorilla gorilla = new Gorilla(sc.nextLine());
        Bear bear = new Bear(sc.nextLine());
        Lizard lizard = new Lizard(sc.nextLine());
        Snake snake = new Snake(sc.nextLine());

        System.out.println(gorilla.getName());
        System.out.println(bear.getName());
        System.out.println(lizard.getName());
        System.out.println(snake.getName());
    }
}
