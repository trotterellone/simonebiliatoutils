package simone.biliato.simonebiliatoutils;

import android.util.Log;

public class blsLog {
    static String tag;

    public static String getTag() {
        return tag;
    }

    public static void setTag(String tag) {
        blsLog.tag = tag;
    }

    public static void e(String msg) {
        Log.e(getTag(), msg);
    }

    public static void i(String msg) {
        Log.i(getTag(), msg);
    }
}
