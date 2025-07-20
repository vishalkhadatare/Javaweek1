// Program to display sum of the digits of a given number
class sumofdigits {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = s.nextInt();
        int b, sum = 0;

        while (a > 0) {
            b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
        System.out.println(sum);
    }
}