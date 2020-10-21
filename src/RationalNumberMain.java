public class RationalNumberMain {
    public static void main(String[] args)
    {
        RationalNumber r1 = new RationalNumber(10,7);
        RationalNumber r2 = new RationalNumber(7,10);
        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
    }
}
