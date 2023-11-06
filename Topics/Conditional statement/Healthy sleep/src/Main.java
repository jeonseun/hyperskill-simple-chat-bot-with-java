import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int minSleepTime = scanner.nextInt();
        int maxSleepTime = scanner.nextInt();
        int currentSleepTime = scanner.nextInt();

        if (currentSleepTime < minSleepTime) {
            System.out.println("Deficiency");
        } else if (currentSleepTime > maxSleepTime) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}