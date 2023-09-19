import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome------------------------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("isPalindromeSecond------------------");
        System.out.println("isPerfectNumber---------------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("numberToWords-----------------------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
        System.out.println("sumOfEvenDigits---------------------");



    }

    public static boolean isPalindrome(int num1) {
        num1 = Math.abs(num1);

        char[] digits = String.valueOf(num1).toCharArray();
        String reversed = "";

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i];
        }

        return Integer.parseInt(reversed) == num1;
    }
    static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; // Parametre 0'dan küçükse false döner
        }

        int sum = 0;  // toplamı tutmak için bir değişken oluşturduk
        for (int i = 1; i < number; i++) {     //1'den başlayarak giriş sayısının bir eksiğine kadar (dahil değil) devam eder.
            if (number % i == 0) {         //i sayısının number sayısına bölünüp bölünmediğini kontrol eder. Eğer bölünüyorsa, i sayısını toplama ekler.
                sum += i;
            }
        }

        return sum == number;


    }
    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }
        String text = "";
        char[] numArray = String.valueOf(num).toCharArray();
        for (char digit: numArray) {
            switch (digit) {
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;
                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;
                case '4':
                    text += "Four ";
                    break;
                case '5':
                    text += "Five ";
                    break;
                case '6':
                    text += "Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
            }
        }
        return text.trim();
    }
}