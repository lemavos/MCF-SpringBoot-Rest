package com.lemavos.mcf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lemavos.mcf.services.mathUtils.Bhaskara;
import com.lemavos.mcf.services.mathUtils.Factorial;
import com.lemavos.mcf.services.mathUtils.pythagorasTheorem.Hypotenuse;
import com.lemavos.mcf.services.mathUtils.pythagorasTheorem.Leg;

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
    public ResponseEntity<?> calculateFactorial(@RequestParam double number) {
        return ResponseEntity.ok(Factorial.calculateFactorial(number));
    }

    // Pythagoras Theorem

    @GetMapping("pythagoras/hypotenuse")
    public ResponseEntity<?> calculateHypotenuse(@RequestParam double leg1,
                                                @RequestParam double leg2) {
        return ResponseEntity.ok(Hypotenuse.calculateHypotenuse(leg1, leg2));
    }

    @GetMapping("pythagoras/leg")
    public ResponseEntity<?> calculateLeg(@RequestParam double hypotenuse,
                                        @RequestParam double leg1) {
        return ResponseEntity.ok(Leg.calculateLeg(hypotenuse, leg1));
    }
}