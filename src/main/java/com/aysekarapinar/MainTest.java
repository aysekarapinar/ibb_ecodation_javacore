package com.aysekarapinar;

import com.aysekarapinar.controller.StudentController;
import com.aysekarapinar.controller.TeacherController;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTest {
    // Scanner
    public static final Scanner scanner= new Scanner(System.in);
    
    private static void chooise(){
           while (true) {
               try {
                   System.out.println("\n==== ÖĞRETMEN YÖNETİM SİSTEMİ ====");
                   System.out.println("1. Öğretmen Ekle");
                   System.out.println("2. Öğrenci Ekle");
                   System.out.println("3. Çıkış");
                   System.out.println("\nSeçiminizi Yapınız: ");

                   int choice = scanner.nextInt();
                   scanner.nextLine(); // Boşluğu temizleme

                   switch (choice) {
                       case 1 -> teacher();
                       case 2 -> student();
                       case 3 -> {
                           System.out.println("Çıkış yapılıyor...");
                           return;
                       }
                       default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                   }

               }catch (Exception e) {
                   System.out.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
                   scanner.nextLine(); // Scanner'ı temizle
               }
           }
    }

    private static void student() {
        try{
            StudentController studentController=new StudentController();
            studentController.chooise();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void teacher() {
        try{
            TeacherController teacherController=new TeacherController();
            teacherController.chooise();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    // PSVM
    public static void main(String[] args) {
        chooise();
    }
} // Main