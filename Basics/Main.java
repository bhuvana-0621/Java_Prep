import java.util.Scanner;

class Main
{
    static int square(int n)
    {
        return n * n;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int ans = square(num);

        System.out.print(ans);

        scanner.close();
}
}