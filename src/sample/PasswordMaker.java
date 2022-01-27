package sample;

import java.util.ArrayList;

public class PasswordMaker {
    //строки из которых будут формироваться пароли
    private static final String numbers = "0123456789"; //числа
    private static final String upperLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Латиница с большими буквами
    private static final String lowerLetter = "abcdefghijklmnopqrstuvwxyz"; // Латиница с маленькими буквами
    private static final String specialSymbols = " ~`!@#$%^&*()_+}]{[:;\"\'\\/|?<>,."; // специальные символы

    private int passwordSize = 0; // размер пароля
    private final boolean areThereNumbers;// есть ли числа в пароле
    private final boolean areThereUpperLetter;// есть ли прописные латинские буквы в пароле
    private final boolean areThereLowerLetter;// есть ли строчные латинские буквы в пароле
    private final boolean areThereSpecialSymbols;// есть ли специальные символы в пароле

    private int numberOfParts; // количество частей

    private  ArrayList<Character> listOfCharactersPassword = new ArrayList<>(); // лист для сгенерированных символов

    public PasswordMaker(int passwordSize, boolean areThereNumbers, boolean areThereUpperLetter, boolean areThereLowerLetter, boolean areThereSpecialSymbols)throws IllegalArgumentException{
        this.passwordSize = passwordSize;
        this.areThereNumbers = areThereNumbers;
        this.areThereUpperLetter = areThereUpperLetter;
        this.areThereLowerLetter = areThereLowerLetter;
        this.areThereSpecialSymbols = areThereSpecialSymbols;
        if(areThereNumbers) numberOfParts++;
        if(areThereUpperLetter) numberOfParts++;
        if(areThereLowerLetter) numberOfParts++;
        if(areThereSpecialSymbols) numberOfParts++;
        if(numberOfParts == 0) throw new IllegalArgumentException("You choose nothing. Please try again. Thanks");// проверка на количество частей
        //если частей = 0, пробрасывается исключение
    }

    private int numberOfNumbers = (passwordSize / numberOfParts)+ (passwordSize % numberOfParts);
    private int numberOfUpperSymbols;
    private int numberOfLowerSymbols;
    private int numberOfSpecialSymbols;


    private formParts(int passwordSize, boolean areThereNumbers, boolean areThereUpperLetter, boolean areThereLowerLetter, boolean areThereSpecialSymbols){
        if(areThereNumbers)
            numberOfNumbers = passwordSize /

    }

    private String formPassword(){return "";}




}
