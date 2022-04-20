public class No1 {
    public static void main(String[] args) {
        int a = 1200;
        int b = 95;
        int c = 115;
        int sum = a+b+c;

        double CalA = percentCal(a, sum);
        System.out.println("a = " + CalA +" %");
        double CalB = percentCal(b, sum);
        System.out.println("b = " + CalB +" %");
        double CalC = percentCal(c, sum);
        System.out.println("c = " + CalC +" %");
    }
    public static double percentCal(double amountSale, double sumAmountSale) {
        return (amountSale/sumAmountSale)*100;
    }
}
