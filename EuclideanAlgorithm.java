public class  EuclideanAlgorithm {
    public static void main(String[] args) {
        int num1 = 213;
        int num2 = 157;
        int steps = 0;
        int dividend = num1;
        int divisor = num2;
        int gcd;
        int quotient;
        int remainder;
        
        System.out.printf("Finding the greatest common divisor of %d and %d.\n", num1, num2);

        if(divisor > dividend) {
            System.out.println("The inputs would have caused an unnecessary step.");
            divisor = num1;
            dividend = num2;
        } else
            System.out.println("An extra step was avoided.");
        do {
            ++steps;
            quotient = dividend/divisor;
            remainder = dividend%divisor;
            System.out.printf("Step %d: %d = %d * %d + %d\n", steps, dividend, divisor, quotient, remainder);
            gcd = divisor;
            dividend = divisor;
            divisor = remainder;
        } while (remainder != 0);
        
        System.out.println("The GCD is "+ gcd);

        switch (steps) {
            case 1:
                System.out.println("Only one step was needed!");
                break;
            case 2:
                System.out.println("Two steps were taken!");
                break;
            case 3:
                System.out.println("This process took three steps.");
                break;
            case 4:
                System.out.println("Wow! Four steps.");
                break;
            default:
                System.out.printf("%d steps is a lot of steps!\n", steps);
                break;
        }
        int prime;

        prime = (gcd == 1) ? 1 : 0;
        
        if (prime == 1) {
            System.out.printf("%d and %d are relatively prime.", num1, num2);
        } else
            System.out.printf("%d and %d are not relatively prime.", num1, num2);


        }
    }
