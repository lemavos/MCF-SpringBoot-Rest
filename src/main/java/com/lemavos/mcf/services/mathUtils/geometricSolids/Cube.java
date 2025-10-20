package com.lemavos.mcf.services.mathUtils.geometricSolids;

public class Cube {
    public static double calculateVolumeCube(double side) {
        return Math.pow(side, 3);
    }

    public static double calculateSurfaceAreaCube(double side) {
        return 6 * Math.pow(side, 2);
    }
}
