package lesson_08;

public class Main {
    public static void main(String[] args) {
        String str = "Эта строка test test";
        String arrOfStr[] = str.split(" ");
        int counter = 0;

        for (String s : arrOfStr) {
            if (s.equals("test")) {
                counter++;
            }
        }

        System.out.println("Слово тест входит: " + counter);
        System.out.println("Первый: " + str.substring(0, 1) + " последний: " + str.substring(str.length() - 1, str.length()));

        counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(str.substring(str.length() - 1, str.length()))) {
                counter++;
            }
        }

        System.out.println("Последний символ: " + (str.substring(str.length() - 1, str.length())) + " входит " + counter + " раз");

        str = "555333332244444448888";

        counter = 0;
        String curentNumber = "";
        String tmpNumber = "";
        int counterMax = 0;

        for (int i = 0; i < str.length(); i++) {
            tmpNumber = str.substring(i, i + 1);
            if (curentNumber.equals(tmpNumber)) {
                counter++;
            } else {
                if (counterMax < counter) {
                    counterMax = counter;
                    counter = 0;
                }
                curentNumber = tmpNumber;
            }
        }

        System.out.println("Самая длинная последовательность: " + counterMax);

        str = "а роза упала на лапу азора";
        String withOutSpace = str.replaceAll(" ", "");
        int pass = 1;
        String tmpFistChar = "";
        String tmpSecondChar = "";

        for (int i = 0; i < (withOutSpace.length() / 2); i++) {
            tmpFistChar = withOutSpace.substring(i, i + 1);
            tmpSecondChar = withOutSpace.substring(withOutSpace.length() - i - 1, withOutSpace.length() - i);
            if (tmpFistChar.equals(tmpSecondChar)) {
            } else {
                pass = 0;
            }
        }

        if (pass == 1) {
            System.out.println("Является");
        }else {
            System.out.println("Не является");
        }

        str = "Эта строка test test";
        String arrOfStr2[] = str.split(" ");
        String strMaxLength = "";
        String strMinLength = "";
        int strMaxLengthIndex = 0;
        int strMinLengthIndex = 0;

        for (int i = 0; i < arrOfStr2.length; i++) {
            if(strMaxLength.equals("")){
                strMaxLength = arrOfStr2[i];
                strMinLength = arrOfStr2[i];
            }

            if(arrOfStr2[i].length() <= strMinLength.length()) {
                strMinLength = arrOfStr2[i];
                strMinLengthIndex = i;
            }

            if(arrOfStr2[i].length() > strMaxLength.length()) {
                strMaxLength = arrOfStr2[i];
                strMaxLengthIndex = i;
            }

        }

        arrOfStr2[strMinLengthIndex] = strMaxLength;
        arrOfStr2[strMaxLengthIndex] = strMinLength;

        String result = "";
        for (int i = 0; i < arrOfStr2.length; i++) {
            result = result +" " + arrOfStr2[i];
        }



        System.out.println(result);


    }
}
