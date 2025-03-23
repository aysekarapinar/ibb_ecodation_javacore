package com.aysekarapinar._1_week;

import java.security.PublicKey;

public class _08_2_System {

    //Eğer System.exit(0) kullanılırsa;
    // 1- JVM durur
    // 2- Çalışan tüm threadler sonlanır.
    // 3- Programın işletim sistemindeki processlerde kapanır

    public static void processCloseJVMStop(){
        System.out.println("Program başladı, system exit(0)");
        System.exit(0);
        System.out.println("Bu satır çalışmayacak");
    }

    public static void processContinueJVMContinue() {
        for (int i = 0; i < 10; i++) {
            if (i==5) {
                System.out.println("Program başladı, break");
                System.out.println("Sadece döngüden çıkılıyor");
                break;
            }
            System.out.println(i+". sıra");
        }
        System.out.println("Bu satır çalışacak");
    }

    public static void main(String[] args) {
        //processCloseJVMStop();
        processContinueJVMContinue();
    }
}
