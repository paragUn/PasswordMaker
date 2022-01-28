package sample;

import java.util.Random;

public class PasswordMaker {
    private static final String symbols =   "0123456789" +                                  // Числа
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +                  // Латиница с большими буквами
            "abcdefghijklmnopqrstuvwxyz" +                  // Латиница с маленькими буквами
            " ~`!@#$%^&*()_+}]{[:;\"'\\/|?<>,.";            // Специальные символы

    private static final char[] arraySymbols = symbols.toCharArray();

    int passwordSize = 0;               // размер пароля
    boolean areThereNumbers;            // есть ли числа в пароле
    boolean areThereUpperLetter;        // есть ли прописные латинские буквы в пароле
    boolean areThereLowerLetter;        // есть ли строчные латинские буквы в пароле
    boolean areThereSpecialSymbols;     // есть ли специальные символы в пароле

    public PasswordMaker(int passwordSize,
                  boolean areThereNumbers,
                  boolean areThereUpperLetter,
                  boolean areThereLowerLetter,
                  boolean areThereSpecialSymbols
    ) {
        this.passwordSize = passwordSize;
        this.areThereNumbers = areThereNumbers;
        this.areThereUpperLetter = areThereUpperLetter;
        this.areThereLowerLetter = areThereLowerLetter;
        this.areThereSpecialSymbols = areThereSpecialSymbols;

        if (!areThereNumbers && !areThereUpperLetter &&
                !areThereLowerLetter && !areThereSpecialSymbols) {              // проверка на количество частей
            throw new IllegalArgumentException("You choose nothing. Please try again. Thanks"); //если  ничего не выбрано, пробрасывается исключение
        }
    }

    public char[] formPassword() { //формирование символов для пароля
        char[] forPsswrdSymbols = new char[passwordSize];
        for (int i = 0; i < passwordSize;) {
            if (this.areThereNumbers) {
                forPsswrdSymbols[i] = arraySymbols[(int) (Math.random() * 10)];
                if(i >= passwordSize-1) break;
                i++;
            }
            if (areThereUpperLetter){
                forPsswrdSymbols[i] = arraySymbols[(int) (Math.random() * (36 - 10)) +10];
                if(i >= passwordSize-1) break;
                i++;
            }
            if (areThereLowerLetter){
                forPsswrdSymbols[i] = arraySymbols[(int) (Math.random() * (62 - 36)) +36];
                if(i >= passwordSize-1) break;
                i++;
            }
            if (areThereSpecialSymbols){
                forPsswrdSymbols[i] = arraySymbols[(int) (Math.random() * (93 - 62)) + 62];
                if(i >= passwordSize-1) break;
                i++;
            }
        }
        return forPsswrdSymbols;
    }

    public String shuffleSymbols(char[] arr) { //перемешать символы
        Random rnd = new Random();
        for(int i = 0; i < arr.length; i++) {
            int index = rnd.nextInt(i + 1);
            char a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
        return String.valueOf(arr);
    }
}