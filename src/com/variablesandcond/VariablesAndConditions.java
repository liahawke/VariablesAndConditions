package com.variablesandcond;

public class VariablesAndConditions {
    //    2. Создать три переменные с типом данных int, double, String соответственно. Присвоить значение только
    //    переменной с типом int. Запарсить её значение как строку и присвоить переменной с типом String.
    //    Запарсить значение стринговой переменной как double и присвоить её в переменную с типом double.
    //    Double присвоить обратно в int, Вывести в консоль значение каждой переменной.
    //    4. Создаем массив с типом данных int размером 4. С помощью if / else if берем каждую
    //    ячейку и если элемент четный выводим в консоль слово True. Если нечетный False.
    //    Цикл не используйте. До них еще доберемся.

    public void actionsOnVariables (int intVar){
        double doubleVar;
        String stringVar;
        stringVar =  Integer.toString(intVar);
        doubleVar = Double.valueOf(stringVar);
        intVar = (int) doubleVar;
        System.out.println("Integer - " + intVar);
        System.out.println("Double - " + doubleVar);
        System.out.println("String - " + stringVar);
        System.out.println("------End of 2 task--------");
    }

    public void parityAndOddnessConditions (int [] inputArray) {
        if (inputArray[0]%2==0) {
            System.out.println("Element [" + inputArray[0] + "] is true");
        } else{
            System.out.println("Element [" + inputArray[0] + "] is false");
        }
        if (inputArray[1]%2==0) {
            System.out.println("Element [" + inputArray[1] + "] is true");
        } else{
            System.out.println("Element [" + inputArray[1] + "] is false");
        }
        if (inputArray[2]%2==0) {
            System.out.println("Element [" + inputArray[2] + "] is true");
        } else{
            System.out.println("Element [" + inputArray[2] + "] is false");
        }
        if (inputArray[3]%2==0) {
            System.out.println("Element [" + inputArray[3] + "] is true");
        } else{
            System.out.println("Element [" + inputArray[3] + "] is false");
        }
        System.out.println("----Conditions without loop----");
    }

    public static void main(String[] args) {
        VariablesAndConditions el = new VariablesAndConditions();
        int[] arrayToCheck = {10, 21, 30, 41};
        int inputVar = 666;
        el.actionsOnVariables(inputVar);
        el.parityAndOddnessConditions(arrayToCheck);
    }
}
