// Program to display reverse of a given number
class reverse {
    public static void main(String args[]) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = s.nextInt();
        int b, rev = 0;

        while (a > 0) {
            b = a % 10;
            rev = rev * 10 + b;
            a = a / 10;
        }
        System.out.println(rev);
    }
}