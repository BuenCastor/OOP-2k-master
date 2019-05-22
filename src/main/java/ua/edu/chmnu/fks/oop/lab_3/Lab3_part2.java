//Для масиву S[m][n] визначте рядок з найбільшою кількістю
//        від’ємних елементів. Переставте стовпці за збільшенням суми додатних
//        елементів стовпців.
package ua.edu.chmnu.fks.oop.lab_3;

/**
 * @author ARTEM
 */
public class Lab3_part2 {
    public static void main(String[] args) {
        int sz = 3;
        int arr[][] = new int[][]{{-1, -2, -3},
                                  {-4, 5, -6},
                                  {7, 8, 9}
        };
        int[] neg = new int[sz];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    neg[i]++;
                }

                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println("-> Negatives: " + neg[i]);

        }
    }
}

