package util.convert.brl.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class utilsBrl {

    static  NumberFormat formattingvalues = new DecimalFormat("R$ #.##0.00");

    public static String doubleToString(Double value) {
        return formattingvalues.format(value);
    }


}
