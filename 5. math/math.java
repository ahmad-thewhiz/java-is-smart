import java.lang.Math; // for Math class

public class math {
    public static double asinh(double x) {
        return Math.log(x + Math.sqrt(x * x + 1));
    }

    public static double acosh(double x) {
        return Math.log(x + Math.sqrt(x * x - 1));
    }

    public static double atanh(double x) {
        return 0.5 * Math.log((1 + x) / (1 - x));
    }

    public static void main(String[] args) {
        // Math class in Java
        // Math class in Java is a part of the java.lang package. It provides several methods to perform mathematical operations like exponential, logarithm, roots, trigonometric functions, etc.
        // The Math class contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.
        // The methods in the Math class are all static, so you call them directly on the class itself, rather than on an instance of the class.
        // The Math class is final, which means you cannot subclass it.


        System.out.println(Math.abs(-10)); // 10
        System.out.println(Math.min(10, 20)); // 10
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.sqrt(16)); // 4.0
        System.out.println(Math.cbrt(27)); // 3.0
        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.round(10.5)); // 11
        System.out.println(Math.round(10.4)); // 10
        System.out.println(Math.floor(10.9)); // 10.0
        System.out.println(Math.ceil(10.1)); // 11.0
        System.out.println(Math.random()); // random number between 0.0 and 1.0
        System.out.println(Math.rint(34.2)); // 34.0
        // Math.rint(): Returns a double value closest to the input, rounding towards the nearest even number in case of ties (e.g., 2.5 → 2.0, 3.5 → 4.0).
        // Math.round(): Returns an int (for float input) or long (for double input) by rounding to the nearest integer, rounding away from zero in case of ties (e.g., 2.5 → 3, -2.5 → -3).
        System.out.println(Math.signum(23.2)); // 1.0
        System.out.println(Math.signum(-23.2)); // -1.0
        System.out.println(Math.copySign(-580.23, 23.6)); // 580.23 because the sign of the first argument is copied to the second argument
        System.out.println(Math.copySign(580.23, -23.6)); // -580.23 because the sign of the first argument is copied to the second argument

        // Trigonometric functions
        System.out.println(Math.sin(30)); // 0.49999999999999994
        System.out.println(Math.cos(30)); // 0.8660254037844387
        System.out.println(Math.tan(30)); // -6.405331196646276
        // System.out.println(Math.asin(0.5)); // 0.5235987755982989
        // System.out.println(Math.acos(0.5)); // 1.0471975511965979
        // System.out.println(Math.atan(0.5)); // 0.4636476090008061
        // System.out.println(Math.atan2(1, 1)); // 0.7853981633974483
        // Math.atan2(y, x): Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).

        // Hyperbolic functions
        // System.out.println(asinh(30)); // 4.09462222433053
        // System.out.println(acosh(30)); // 4.094066668632076
        // System.out.println(atanh(0.5)); // 0.5493061443340549

        // Exponential and logarithmic functions
        System.out.println(Math.exp(2)); // 7.38905609893065
        System.out.println(Math.log(2)); // 0.6931471805599453
        System.out.println(Math.log10(2)); // 0.3010299956639812

        // Angular conversion
        System.out.println(Math.toDegrees(1.57)); // 89.95437383553924
        System.out.println(Math.toRadians(90)); // 1.5707963267948966

    }
}
