package com.lemavos.mcf.services.mathUtils.shapes;

public class Rectangle {
    public static String calculateRectangleArea(double length, double width){
        if (length <= 0 || width <= 0){
            return "Length and width must be positive numbers.";
        }
        double area = length * width;
        return "The area of the rectangle is: " + area;
    }

    public static String calculateRectanglePerimeter(double length, double width){
        if (length <= 0 || width <= 0){
            return "Length and width must be positive numbers.";
        }
        double perimeter = 2 * (length + width);
        return "The perimeter of the rectangle is: " + perimeter;
    }
}
