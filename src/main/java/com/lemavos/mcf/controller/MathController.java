package com.lemavos.mcf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lemavos.mcf.services.mathUtils.Bhaskara;
import com.lemavos.mcf.services.mathUtils.Factorial;
import com.lemavos.mcf.services.mathUtils.pythagorasTheorem.*;

@RestController
@RequestMapping("/math")
public class MathController {

    // Detached
    @GetMapping("/bhaskara")
    public ResponseEntity<?> calculateBhaskara(@RequestParam double a,
                                             @RequestParam double b,
                                             @RequestParam double c) {
        return ResponseEntity.ok(Bhaskara.calculateBhaskara(a, b, c));
    }

    @GetMapping("/factorial")
    public ResponseEntity<?> calculateBhaskara(@RequestParam double number) {
        return ResponseEntity.ok(Factorial.calculateFactorial(number));
    }
}