package org.example;

/**
 * Introduced in java 9, interfaces can have private methods. <br>
 * These private methods can be both static and non-static. <br>
 * As they are private, they are accessible within the interface only. <br>
 * As with classes, you cannot access a non-static interface method from a static method. <br>
 * They have two advantages: <br>
 * - reduce code duplication <br>
 * - improve code encapsulation
 */
interface Tennis {
    private static void hit(String stroke) {
        System.out.println("Hitting a " + stroke);
    }

    private void smash() {
        hit("smash");
    }

    default void forehand() {
        hit("forehand");
    }

    static void backhand() {
        smash();// static to instance not allowed!
        hit("backhand");
    }
}

public class SportTest implements Tennis {
    public static void main(String[] args) {
        new SportTest().forehand(); // Hitting a forehand
        Tennis.backhand();          // Hitting a backhand
        new SportTest().hit();
        new SportTest().smash();
    }
}