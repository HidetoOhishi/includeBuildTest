/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

public class App {
    public String getGreeting() {
        return "app.App";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new share.App().getGreeting());
        System.out.println(new dao.App().getGreeting());
        System.out.println(new base.App().getGreeting());
    }
}
