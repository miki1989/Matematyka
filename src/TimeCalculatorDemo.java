public class TimeCalculatorDemo {
    public static void main(String[] args) {
        TimeCalculator timeCalculator1 = new TimeCalculator();
        System.out.println(timeCalculator1.daysToHours(5));
        System.out.println();

    //    TimeCalculator timeCalculator2 = new TimeCalculator();
    //    int dayToSecond = timeCalculator2.calculatin(5, 7, 9, 10);
    //    System.out.println(dayToSecond);

        System.out.println();
        TimeCalculator timeCalculator3 = new TimeCalculator();
        System.out.println(timeCalculator3.calculatin2(36000.00));
    }
}
