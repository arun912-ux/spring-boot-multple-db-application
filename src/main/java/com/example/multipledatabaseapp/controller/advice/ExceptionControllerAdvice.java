package com.example.multipledatabaseapp.controller.advice;

import com.example.multipledatabaseapp.exception.CustomException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleException(RuntimeException ex) {
        return ResponseEntity.status(500).body(ex.getMessage());
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> handleException(CustomException ex) {
        return ResponseEntity.status(500).body(ex.getMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<?> handleException(NullPointerException ex) {
        List.of("");
        List<String> list = Arrays.asList("");
        Iterator<String> iterator = list.iterator();
        iterator.remove();
        ArrayList<String> arrayList = new ArrayList<>(list);
        arrayList.iterator().remove();

        return ResponseEntity.status(500).body(ex.getMessage());
    }
}
