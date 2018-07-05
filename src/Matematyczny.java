public class Matematyczny {
    public static void main(String[] args) {
        Calculator kalka = new Calculator();
        kalka.sumAndShow(5,10);

        System.out.println();
        Calculator kalka1 = new Calculator();
        System.out.println(kalka1.sumAndReturn(4,5));
        System.out.println();

        int suma = kalka1.sumAndReturn(11,5);
        System.out.println(suma);

        System.out.println();
        System.out.println();

        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.multiply(8.0, 4.5));

        System.out.println();
        Calculator calculator2 = new Calculator();
        calculator2.subtractAndShow(8,9);
    }
}
