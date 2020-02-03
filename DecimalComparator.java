import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator
{
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2)
    {
        BigDecimal bd1 = new BigDecimal(d1 * 1000);
        BigDecimal bd2 = new BigDecimal(d2 * 1000);

        bd1 = bd1.setScale(0, RoundingMode.DOWN);
        bd2 = bd2.setScale(0, RoundingMode.DOWN);

        return bd1.compareTo(bd2) == 0 ? true : false;
    }
}