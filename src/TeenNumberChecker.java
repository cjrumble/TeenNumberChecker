public class TeenNumberChecker {

    public static boolean hasTeen (int one, int two, int three) {
        return (TeenNumberChecker.isTeen(one) || TeenNumberChecker.isTeen(two) || TeenNumberChecker.isTeen(three));
    }

    public static boolean isTeen (int age) {
        boolean isTeen = false;
        if (age >= 13 && age <= 19) {
            isTeen = true;
        }
        return isTeen;
    }

}
