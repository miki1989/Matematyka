public class Calculator {
    void sumAndShow (int a, int b)
    {
        int sum = a + b;
        System.out.println(sum);
    }

    int sumAndReturn(int c, int d)
    {
        int dodawanie = c + d;
        return dodawanie;
    }

    double multiply(double x, double y)
    {
        double mnozenie = x * y;
        return mnozenie;
    }

    void subtractAndShow(int a, int b)
    {
        int odejmowanie = a - b;
        System.out.println(odejmowanie);
    }
}
