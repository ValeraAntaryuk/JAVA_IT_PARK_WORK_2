package ru.itpark;

public class Main {
    /**
     * Переменная глобальная для addToEndOfArray
     * и для main
     */
    public static int count = 0;
    /**
     * Процедура добавления элемента в массив
     * @param a - массив, куда надо добавить элемент
     * @param value - значение, которое нужно добавить
     */
    public static void addToEndOfArray(int a[], int value) {
        // кладем value в первый пустой элемент
        a[count] = value;
        count++;
    }

    /**
     * Кладет значение в начало массива
     * @param a
     * @param value
     */
    public static void addToBeginOfArray(int a[], int value) {
        for (int i = count; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = value;
        count++;
    }
    public static void indexOf(int[] a, int value){
        int x = -1;
        for (int i = 0 ; i < count ; i++) {
            if (a[i] == value){
                x = i;
            }
        }
        System.out.println("number " + x);
    }
    public static void removeByVailue (int a[],int value){
       int index = indexOf(a, value);
    }

    public static void addToIndexOfAr
    ray(int a[], int value,int index) {
        for (int i = count ; i > index ; i--) {
            a[i] = a[i - 1];
        }
        a[index] = value;
        count++;
    }
    public static void removeIndexOfArray(int a[],int index) {
        for (int i = index ; i < count ; i++) {
            a[i] = a[i + 1];
        }
         count--;
    }
    public static void main(String[] args) {
        int animalsWeight[] = new int[10];
        /*
        animalsWeight[0] = 13;
        animalsWeight[1] = 15;
        animalsWeight[2] = 11;
        animalsWeight[3] = 8;
        animalsWeight[4] = 9;
        */
        addToEndOfArray(animalsWeight, 13);
        addToEndOfArray(animalsWeight, 15);
        addToEndOfArray(animalsWeight, 11);
        addToEndOfArray(animalsWeight, 8);
        addToEndOfArray(animalsWeight, 9);
        //addToBeginOfArray(animalsWeight, 100);
        //addToEndOfArray(animalsWeight, 777);
        //addToIndexOfArray(animalsWeight, 999, 4);
        //removeIndexOfArray(animalsWeight,3);
        indexOf(animalsWeight, 9);
        for (int i = 0; i < count; i++) {
            System.out.println(animalsWeight[i]);
        }

    }
}
