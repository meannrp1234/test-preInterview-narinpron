import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("input n : ");
        int n = input.nextInt();
        System.out.print("input m : ");
        int m = input.nextInt();

        int sum = 0;
        for(int i=n; i<=m; i++){
            sum+=i;
        }
        System.out.print("sum = " + sum);
    }
}
