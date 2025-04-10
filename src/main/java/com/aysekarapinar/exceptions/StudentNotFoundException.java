package com.aysekarapinar.exceptions;

// Öğrenci bulunamazsa fırlatılacak özel exception
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
