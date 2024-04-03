/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Soal Classnya :
Rancang Class bernama StopWatch. Class berisi:
1) Atribut private startTime dan endTime dengan get method (Konsep Encapsulation).
2) Konstruktor tanpa argumen (kosong) yang menginisialisasi startTime dengan waktu saat ini.
3) Sebuah metode bernama start() yang me-reset startTime ke waktu saat ini.
4) Metode bernama stop() yang menyetel endTime ke waktu saat ini.
5) Metode bernama getElapsedTime() yang mengembalikan waktu yang telah berlalu untuk stopwatch dalam milidetik
 */

package pboencapsulation4bgenap;

import java.util.Arrays;

public class Stopwatch {
    //get method
    private long startTime;
    private long endTime;

    //konstruktor tanpa argumen (kosong)
    public Stopwatch() {
        startTime = System.currentTimeMillis(); //menginisialisasi dengan waktu saat ini
    }

    public void start() { //me-reset waktu ke saat ini
        startTime = System.currentTimeMillis(); 
    }

    public void stop() { // menyetel ke waktu saat ini.
        endTime = System.currentTimeMillis();
    }

    //untuk mengembalikan waktu yang telah berlalu dalam milisecond
    public long getElapsedTime() {
        return endTime - startTime;
    }

}

