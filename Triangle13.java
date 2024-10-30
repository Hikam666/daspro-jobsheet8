import java.util.Scanner;
public class Triangle13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai N: ");
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}