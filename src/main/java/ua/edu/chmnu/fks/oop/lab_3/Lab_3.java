package ua.edu.chmnu.fks.oop.lab_3;
//Даний цілочисельний масив М[15]. Визначте кількість пар
//елементів різного знаку.

public class Lab_3 {

    public static void main(String[] args) {

        int arr[] = {2, -5, 9, -1, 16, -12, 1, 79, -9, 2, -1, -2, -3, -4, -5};
        int negative_num = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                negative_num += 1;
            }
        }
        int positiv_num = arr.length - negative_num;

        if (positiv_num < negative_num) {
            System.out.println(positiv_num + " item pairs");
        } else {
            System.out.println(negative_num + " item pairs");
        }
    }
}
