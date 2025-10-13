package com.lemavos.mcf.services.mathUtils.geometricSolids;

public class Cube {
    public static double volumeCube(double side) {
        return Math.pow(side, 3);
    }

    public static double surfaceAreaCube(double side) {
        return 6 * Math.pow(side, 2);
    }
}
