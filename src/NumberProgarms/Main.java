package NumberProgarms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Number Programs Menu ===");
        System.out.println("1. Prime Number");
        System.out.println("2. Palindrome Number");
        System.out.println("3. Factorial");
        System.out.println("4. ArmStrong Number");
        System.out.println("5. Perfect Number");
        System.out.println("6. Fibonacci Series");
        System.out.println("7. Reverse a Given Number");
        System.out.println("8. Sum of the Digits");
        System.out.println("9. Niven Number");
        System.out.println("10. Calculate Power Of Number");
        System.out.println("11. Strong Number");
        System.out.println("12. Calculate GCD of Two Numbers");
        System.out.println("13. Calculate LCM of Two Numbers");
        System.out.println("14. Neon Number");
        System.out.println("15. AutoMorphic Number");
        System.out.println("16. Count Digits in Number");
        System.out.println("17. Spy Number");
        System.out.println("18. Magic Number");
        System.out.println("19. Prime Numbers in between 1 to N");
        System.out.println("20. Arm Strong Numbers in between 1 to N");
        System.out.println("21. Count Evens And Odds in Number");
        System.out.println("22. Kaprekar Number");
        System.out.println("23. Happy Number");
        System.out.println("24. Duck Number");
        System.out.println("25. Decimal To Binary");
        System.out.println("26. Binary Tp Decimal");
        System.out.println("27. Sum of First N Natural Numbers");
        System.out.println("n. Exit !");

        System.out.println("Enter Your Choice.");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter a number to check prime or not");
                int num = scanner.nextInt();
                if (PrimeNumber.isPrime(num)){
                    System.out.println(num + " is a primeNumber");
                }
                else {
                    System.out.println(num + " is not a primeNumber");
                }
                break;

            case 2:
                System.out.println("Enter a number to check Palindrome");
                int palindrome = scanner.nextInt();
                if (Palindrome.isPalindrome(palindrome)){
                    System.out.println(palindrome + " is a Palindrome");
                }
                else {
                    System.out.println(palindrome + " is not a Palindrome");
                }
                break;
            case 3:
                System.out.println("Enter a number to print Factorial");
                int fact = scanner.nextInt();
                Factorial.fact(fact);
                break;
            case 4:
                System.out.println("Enter a number to check ArmStrong number");
                int armStrong = scanner.nextInt();
                if (ArmStrongNumber.isArmStrong(armStrong)){
                    System.out.println(armStrong +" is a Arm Strong Number");
                }
                else {
                    System.out.println(armStrong + " is not a Arm Strong Number");
                }
                break;
            case 5:
                System.out.println("Enter a number to check perfect number");
                int perfect = scanner.nextInt();
                if (PerfectNumber.isPerfect(perfect)){
                    System.out.println(perfect +" is a Perfect Number");
                }
                else {
                    System.out.println(perfect +" is not a Perfect Number");
                }
                break;
            case 6:
                System.out.println("Enter a number to print Fibonacci Upto N terms");
                int fibonacci = scanner.nextInt();
                FibonacciSeries.fibonacci(fibonacci);
                break;
            case 7:
                System.out.println("Enter a number to Reverse");
                int reverse = scanner.nextInt();
                ReverseNumber.reverseNumber(reverse);
                break;
            case 8:
                System.out.println("Enter a number to do sum of them");
                int digit = scanner.nextInt();
                SumOfTheDigits.sumOfDigits(digit);
                break;
            case 9:
                System.out.println("Enter a number to check Niven Number");
                int niven = scanner.nextInt();
                NivenNumber.checkNiven(niven);
                break;
            case 10:
                System.out.println("Enter a base number to Calculate Power of Number");
                int base = scanner.nextInt();
                System.out.println("Enter a exponent number to Calculate Power of Number");
                int exponent =scanner.nextInt();
                PowerOfNumber.powerOfNumber(base,exponent);
                break;
            case 11:
                System.out.println("Enter a number to check Strong Number");
                int strong=scanner.nextInt();
                StrongNumber.isStrong(strong);
                break;
            case 12:
                System.out.println("Enter firstNumber to calculate GCD");
                int firstNumber =scanner.nextInt();
                System.out.println("Enter secondNumber to calculate GCD");
                int secondNumber=scanner.nextInt();
                GCD.calculateGcd(firstNumber,secondNumber);
                break;
            case 13:
                System.out.println("Enter firstNumber to calculate LCM");
                int firstNum =scanner.nextInt();
                System.out.println("Enter secondNumber to calculate LCM");
                int secondNum=scanner.nextInt();
                LCM.calculateLcm(firstNum,secondNum);
                break;
            case 14:
                System.out.println("Enter a number to check Neon Number");
                int neon = scanner.nextInt();
                NeonNumber.checkNeon(neon);
                break;
            case 15:
                System.out.println("Enter a number to check Automorphic Number");
                int number=scanner.nextInt();
                AutomorphicNumber.checkAutomorphic(number);
                break;
            case 16:
                System.out.println("Enter a number to count the digits");
                int digits = scanner.nextInt();
                CountDigits.digitCounter(digits);
                break;
            case 17:
                System.out.println("Enter a number to check a Spy Number");
                int spy = scanner.nextInt();
                SpyNumber.spy(spy);
                break;
            case 18:
                System.out.println("Enter a number to check a Magic Number");
                int magic = scanner.nextInt();
                MagicNumber.magicNumber(magic);
                break;
            case 19:
                System.out.println("Enter a range number to Prime Numbers");
                int numbers = scanner.nextInt();
                PrimeNumbersInRange.primeNumbers(numbers);
                break;
            case 20:
                System.out.println("Enter a number to print range of ArmStrong numbers ");
                int armStrongNum = scanner.nextInt();
                ArmStrongNumberInRange.armStrong(armStrongNum);
                break;
            case 21:
                System.out.println("Enter a number to Count Even and Odd Numbers");
                int number1=scanner.nextInt();
                CountEvenAndOddNumbers.countNumbers(number1);
                break;
            case 22:
                System.out.println("Enter a number to check Kaprekar number");
                int kaprekar=scanner.nextInt();
                KaprekarNumber.kaprekar(kaprekar);
                break;
            case 23:
                System.out.println("Enter a number to check Happy Number");
                int happy = scanner.nextInt();
                if (HappyNumber.isHappyNumber(happy)){
                    System.out.println(happy + " is a Happy number");
                }else {
                    System.out.println(happy + " is not a Happy Number");
                }
                break;
            case 24:
                System.out.println("Enter a number to check Duck Number");
                int duck= scanner.nextInt();
                if (DuckNumber.isDuck(duck)){
                    System.out.println(duck+" is a Duck Number");
                }else {
                    System.out.println(duck+ " is not a duck Number");
                }
                break;
            case 25:
                System.out.println("Enter a number to covert Decimal to Binary");
                int decToBin=scanner.nextInt();
                DecimalToBinary.convertToBinary(decToBin);
                break;
            case 26:
                System.out.println("Enter a binary number to convert as Decimal");
                int binToDec=scanner.nextInt();
                BinaryToDecimal.binToDec(binToDec);
                break;
            case 27:
                System.out.println("Enter a number to print sum first first N natural numbers");
                int naturalNumber = scanner.nextInt();
                SumOfNaturalNumbers.sumOfNumbers(naturalNumber);
                break;
            default:
                System.out.println("Invalid choice...!");
        }
    }
}

//TODO- 20, 24,25, 27