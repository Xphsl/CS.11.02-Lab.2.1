public class Main {

    public static void main(String[] args) {
        int add = add(1, 2);
        System.out.println(add);
        int add4 = add(1, 2, 3, 4);
        System.out.println(add4);
        String he = morningGreeting("Toby Fox");
        System.out.println(he);
        String her = afternoonGreeting("Mac Miller");
        System.out.println(her);
        String phrase = triple("hello world");
        System.out.println(phrase);
        double halved = half(10);
        System.out.println(halved);
        double roundtopositive = roundPositiveValueToNearestInteger(8.4);
        System.out.println(roundtopositive);
        double roundtonegative = roundNegativeValueToNearestInteger(-8.4);
        System.out.println(roundtonegative);
    }

    // 1. add

    public static int add(int a, int b) {
        //System.out.println(add(a,b));
        return a+b;
    }

    // 2. add
    public static int add(int a, int b,int c, int d) {
        //System.out.println(add(a,b,c,d));
        return add(a, add(b, add(c, d)));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        //System.out.println(morningGreeting("Toby Fox"));
        return "早上好, "+ name +"!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        //System.out.println(afternoonGreeting("Mac Miller"));
        return "下午好, "+ name +"!";
    }

    // 5. triple
    public static String triple(String phrase) {
        //System.out.println(triple("oohbaby"));
        return phrase + phrase + phrase;
    }

    // 6. half
    public static double half(int a) {
        //System.out.println(half(8));
        return (double)a/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double number) {
        //System.out.println(roundPositiveValueToNearestInteger(8.5));
        return Math.round(number);
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double number) {
        //System.out.println(roundNegativeValueToNearestInteger(-8.5));
        return -Math.round(-number);
    }


}
