package com.lemavos.mcf.services.mathUtils.geometricSolids;

public class Sphere {
    public static double volumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double surfaceAreaSphere(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
