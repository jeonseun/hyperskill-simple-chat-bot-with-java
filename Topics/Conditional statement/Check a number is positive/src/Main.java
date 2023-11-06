import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();

        boolean isPositive = num > 0;

        if (isPositive) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}