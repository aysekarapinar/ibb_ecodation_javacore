package com.aysekarapinar.exceptions;

public class TeacherNotFoundExceptions {
    // Parametresiz Constructor
    public TeacherNotFoundExceptions() {
        super("Kayıt bulunamadı");
    }

    // Parametreli Constructor
    public TeacherNotFoundExceptions(String message) {
        super(message);
    }
}
