package com.lemavos.mcf.services.mathUtils.shapes;

public class Square {
    public static String squareArea(double side){
        if (side <= 0){
            return "Side length must be a positive number.";
        }
        double area = side * side;
        return "The area of the square is: " + area;
    }

    public static String squarePerimeter(double side){
        if (side <= 0 ){
            return "Side length must be a positive number.";
        }
        double perimeter = 4 * side;
        return "The perimeter of the square is: " + perimeter;
    }
}
