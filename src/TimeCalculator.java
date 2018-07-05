public class TimeCalculator {
    int daysToHours(int day)
    {
        int godziny = day * 24;
        return godziny;
    }

    /*int calculatin(int day, int hour, int minute, int second)
    {
        int dayToSecond = day * 24 * 60 * 60;
        return dayToSecond;

        int hourToSecond = hour * 60 * 60;
        return hourToSecond;

        int minuteToSecond = minute * 60;
        return minuteToSecond;
    }
    */

   /* int calculatin(int day)
    {
        int dayToSecond = day * 24 * 60 * 60;
        return dayToSecond;

        int hourToSecond = day * 60 * 60;
        return hourToSecond;

        int minuteToSecond = day * 60;
        return minuteToSecond;
    }
    */
    double calculatin2(double second)
    {
        double secondToMinute = second / 60;
        return secondToMinute;

    }
}
