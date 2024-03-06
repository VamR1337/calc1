import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Main.calc(new Scanner(System.in).nextLine()));
    }
    public static String calc(String input) throws Exception {
        String[] romanNumerals = {
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        int firstDigit;
        int secondDigit;
        boolean arabic;
        int answer = 0;
        ArrayList<String> primer = Arrays.stream(input.split(" ")).collect(Collectors.toCollection(ArrayList::new));
        if(primer.size()!=3){throw new Exception();}
        switch (primer.getFirst()){
            case "1":firstDigit=1;arabic=true;break;
            case "2":firstDigit=2;arabic=true;break;
            case "3":firstDigit=3;arabic=true;break;
            case "4":firstDigit=4;arabic=true;break;
            case "5":firstDigit=5;arabic=true;break;
            case "6":firstDigit=6;arabic=true;break;
            case "7":firstDigit=7;arabic=true;break;
            case "8":firstDigit=8;arabic=true;break;
            case "9":firstDigit=9;arabic=true;break;
            case "10":firstDigit=10;arabic=true;break;
            case "I":firstDigit=1;arabic=false;break;
            case "II":firstDigit=2;arabic=false;break;
            case "III":firstDigit=3;arabic=false;break;
            case "IV":firstDigit=4;arabic=false;break;
            case "V":firstDigit=5;arabic=false;break;
            case "VI":firstDigit=6;arabic=false;break;
            case "VII":firstDigit=7;arabic=false;break;
            case "VIII":firstDigit=8;arabic=false;break;
            case "IX":firstDigit=9;arabic=false;break;
            case "X":firstDigit=10;arabic=false;break;
            default: throw new Exception();
        }
        if(arabic){
            switch (primer.getLast()){
                case "1":secondDigit=1;break;
                case "2":secondDigit=2;break;
                case "3":secondDigit=3;break;
                case "4":secondDigit=4;break;
                case "5":secondDigit=5;break;
                case "6":secondDigit=6;break;
                case "7":secondDigit=7;break;
                case "8":secondDigit=8;break;
                case "9":secondDigit=9;break;
                case "10":secondDigit=10;break;
                default: throw new Exception();
            }
        }else {
            switch (primer.getLast()){
                case "I":secondDigit=1;break;
                case "II":secondDigit=2;break;
                case "III":secondDigit=3;break;
                case "IV":secondDigit=4;break;
                case "V":secondDigit=5;break;
                case "VI":secondDigit=6;break;
                case "VII":secondDigit=7;break;
                case "VIII":secondDigit=8;break;
                case "IX":secondDigit=9;break;
                case "X":secondDigit=10;break;
                default: throw new Exception();
            }
        }
        switch (primer.get(1)){
            case "+":answer=firstDigit+secondDigit;break;
            case "-":answer=firstDigit-secondDigit;break;
            case "*":answer=firstDigit*secondDigit;break;
            case "/":answer=firstDigit/secondDigit;break;
            default: throw new Exception();
        }
        if(arabic) return String.valueOf(answer);
        else if(answer>0) return romanNumerals[answer-1];
        else throw new Exception();
    }
}