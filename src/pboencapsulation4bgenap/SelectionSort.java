/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Soal perhitungan SelectionSort :
Tulis program uji yang mengukur waktu eksekusi pengurutan 100.000 angka menggunakan selection sort.
 */

package pboencapsulation4bgenap;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");

        int n = scanner.nextInt();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000); // isi array dengan angka acak
        }

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        
        selectionSort(arr);
        stopwatch.stop();
        System.out.println("Waktu eksekusi pengurutan " + n + " angka : " + 
                stopwatch.getElapsedTime() + " milidetik");
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
