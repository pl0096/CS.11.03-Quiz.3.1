public class Main {

    // Question 1 - calculateGrade

    public static char calculateGrade(int score){
        if(score >= 90){
            return 'A';
        }
        else if(score >= 80){
            return 'B';
        }
        else if(score >= 70){
            return 'C';
        }
        else if(score >= 60){
            return 'D';
        }
        else if(score >= 50){
            return 'E';
        }
        else{
            return 'F';
        }
    }

    // Question 2 - fizzBuzz

    public static String fizzBuzz(int n) {
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;

        if (fizz && buzz) {
            return "fizzbuzz";
        } else if (fizz) {
            return "fizz";
        } else if (buzz) {
            return "buzz";
        } else {
            return "unlucky";
        }
    }

    // Question 3 - frontBack

    public static String frontBack(String str){
        if (str.length()<= 1){
            return str;
        }

        String add = str.substring(0, 2);
        return add + str + add;

    }
    // Question 4 - twoAsOne

    public static boolean twoAsOne(int a, int b, int c){
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        return ab == c || ac == b || bc == a;
    }

    // Question 5 - endUp

    public static String endUp(String str){
        if(str.length() <= 3){
            return str.toUpperCase();
        }

        int idx = str.length() - 3;
        int length = str.length();
        String upper = str.substring(idx, length);
        upper = upper.toUpperCase();
        String lower = str.substring(0, idx);

        return lower + upper;


    }



}
