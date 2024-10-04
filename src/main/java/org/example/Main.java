package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isPalindrome(-1221);
        isPerfectNumber(1221);
        numberToWords(234);
    }

    public static boolean isPalindrome(int num) {
        int numb = Math.abs(num);
        String number = String.valueOf(numb);
        String[] numberString = number.split("");

        String[] numberStr = new String[numberString.length];

        for (int i = 0; i < number.length(); i++) {
            numberStr[i] = numberString[number.length() - 1 - i];
        }

        String result = String.join("", numberStr);
        System.out.println(result);


        if (number.equals(result)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    //---------------------------------------------------------------------------------

    public static boolean isPerfectNumber(int num) {
        if(num<0){
            return false;
        }
        int toplam = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == num) {
            System.out.println("perfect");
            return true;
        } else {
            return false;
        }
    }

    public static String numberToWords(int num) {
        String number = String.valueOf(num);
        String[] numberStr = number.split("");
        for(int i = 0 ; i<number.length() ; i++){
            System.out.println(numberStr[i]);
        }
        String[] numberString = new String[numberStr.length];

        if (num<0){
            return "Invalid Value";
        }
        for (int i = 0 ; i<numberStr.length ; i++){
            if(numberStr[i].equals("0")){
                numberString[i]="Zero";
            }else if (numberStr[i].equals("1")) {
                numberString[i]="One";
            }else if (numberStr[i].equals("2")) {
                numberString[i]="Two";
            }else if (numberStr[i].equals("3")) {
                numberString[i]="Three";
            }else if (numberStr[i].equals("4")) {
                numberString[i]="Four";
            }else if (numberStr[i].equals("5")) {
                numberString[i]="Five";
            }else if (numberStr[i].equals("6")) {
                numberString[i]="Six";
            }else if (numberStr[i].equals("7")) {
                numberString[i]="Seven";
            }else if (numberStr[i].equals("8")) {
                numberString[i]="Eight";
            }else if (numberStr[i].equals("9")) {
                numberString[i]="Nine";
            }

        }

        String result = String.join(" ",numberString);
        System.out.println(result);
        return result;
    }
}
