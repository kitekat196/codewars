public class HolidayDutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) Math.abs(hol/((discount * normPrice) / 100f));

    }
}
//hol*100/(normPrice*discount);