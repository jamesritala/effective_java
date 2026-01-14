package za.co.learning.effectivejava.practice.objectcreation;

import java.util.regex.Pattern;

public class AvoidCreatingUnneccesaryObjects {
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    private static long sum() {
        Long sum = 0L; // This is bad practice because of below
        for(long i = 0; i<=Integer.MAX_VALUE;i++) {
            sum += i; // everytime sum is computed i is auto-boxed to a Long object and therefor creates a new object each time.o
        }
        return sum;
    }
}
