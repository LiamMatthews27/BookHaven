package ac.za.mycput.until;

public class Helper {

    public static boolean isNullOrEmpty(String str) {
        if (str.isEmpty() || str == null)
            return true;
        return false;
    }

    public static boolean isNullOrInvalid(int num) {
        if (num <= 0)
            return true;
        return false;
    }

    public static boolean isNullOrInvalid(double num) {
        if (num <= 0)
            return true;
        return false;
    }
}
