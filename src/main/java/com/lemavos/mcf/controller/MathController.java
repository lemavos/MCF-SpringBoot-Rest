package com.lemavos.mcf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lemavos.mcf.services.mathUtils.Bhaskara;
import com.lemavos.mcf.services.mathUtils.Factorial;
import com.lemavos.mcf.services.mathUtils.geometricSolids.Cube;
import com.lemavos.mcf.services.mathUtils.geometricSolids.Parallelepiped;
import com.lemavos.mcf.services.mathUtils.pythagorasTheorem.Hypotenuse;
import com.lemavos.mcf.services.mathUtils.pythagorasTheorem.Leg;
import com.lemavos.mcf.services.mathUtils.shapes.Circle;
import com.lemavos.mcf.services.mathUtils.shapes.Diamond;
import com.lemavos.mcf.services.mathUtils.shapes.Rectangle;
import com.lemavos.mcf.services.mathUtils.shapes.Square;

@RestController
@RequestMapping("/math")
public class MathController {

    // Detached
    @GetMapping("/bhaskara")
    public ResponseEntity<?> Bhaskara(@RequestParam double a,
                                             @RequestParam double b,
                                             @RequestParam double c) {
        return ResponseEntity.ok(Bhaskara.calculateBhaskara(a, b, c));
    }

    @GetMapping("/factorial")
    public ResponseEntity<?> Factorial(@RequestParam double number) {
        return ResponseEntity.ok(Factorial.calculateFactorial(number));
    }

    // Pythagoras Theorem

    @GetMapping("pythagoras/hypotenuse")
    public ResponseEntity<?> Hypotenuse(@RequestParam double leg1,
                                                @RequestParam double leg2) {
        return ResponseEntity.ok(Hypotenuse.calculateHypotenuse(leg1, leg2));
    }

    @GetMapping("pythagoras/leg")
    public ResponseEntity<?> Leg(@RequestParam double hypotenuse,
                                        @RequestParam double leg1) {
        return ResponseEntity.ok(Leg.calculateLeg(hypotenuse, leg1));
    }

    // Shapes
        // circle area
    @GetMapping("shapes/cirlce")
    public ResponseEntity<?> CircleArea(@RequestParam double radius) {
        return ResponseEntity.ok(Circle.calculateCircleArea(radius));
    }
        // circle circunference
    @GetMapping("shapes/circunference")
    public ResponseEntity<?> Circunference(@RequestParam double radius) {
        return ResponseEntity.ok(Circle.calculateCircunference(radius));
    }

        // Diamond area
    @GetMapping("area/diamond")
    public ResponseEntity<?> DiamondArea(@RequestParam double diagonal1,
                                                @RequestParam double diagonal2) {
        return ResponseEntity.ok(Diamond.calculateDiamondArea(diagonal1, diagonal2));
    }

        // Diamond perimeter
    @GetMapping("perimeter/diamond")
    public ResponseEntity<?> DiamondPerimeter(@RequestParam double side) {
        return ResponseEntity.ok(Diamond.calculateDiamondPerimeter(side));
    }

        // Rectangle Area
    @GetMapping("area/rectangle")
    public ResponseEntity<?> RectangleArea(@RequestParam double length,
                                                    @RequestParam double width) {
        return ResponseEntity.ok(Rectangle.calculateRectangleArea(length, width));
    }

        // Rectangle Perimeter
    @GetMapping("perimeter/rectangle")
    public ResponseEntity<?> RectanglePerimeter(@RequestParam double length,
                                                    @RequestParam double width) {
        return ResponseEntity.ok(Rectangle.calculateRectanglePerimeter(length, width));
    }

        // Square Area
    @GetMapping("area/square")
    public ResponseEntity<?> squareArea(@RequestParam double side) {
        return ResponseEntity.ok(Square.calculateSquareArea(side));
    }

        // Square perimeter
    @GetMapping("perimeter/square")
    public ResponseEntity<?> squarePerimeter(@RequestParam double side) {
        return ResponseEntity.ok(Square.calculateSquarePerimeter(side));
    }

    // Geometric Solids
        // cube volume
    @GetMapping("volume/cube")
    public ResponseEntity<?> cubeVolume(@RequestParam double side) {
        return ResponseEntity.ok(Cube.calculateVolumeCube(side));
    }

        // cube surface
    @GetMapping("surface/cube")
    public ResponseEntity<?> cubeSurface(@RequestParam double side) {
        return ResponseEntity.ok(Cube.calculateSurfaceAreaCube(side));
    }

        // parallelepiped volume
    @GetMapping("volume/parallelepiped")
    public ResponseEntity<?> cubeVolume(@RequestParam double length,
                                        @RequestParam double width, 
                                        @RequestParam double height) {
        return ResponseEntity.ok(Parallelepiped.calculateVolumeParallelepiped(length, width, height));
    }

        // parallelepiped surface
    @GetMapping("surface/parallelepiped")
    public ResponseEntity<?> cubeSurface(@RequestParam double length,
                                        @RequestParam double width, 
                                        @RequestParam double height) {
        return ResponseEntity.ok(Parallelepiped.calculateSurfaceAreaParallelepiped(length, width, height));
    }

}