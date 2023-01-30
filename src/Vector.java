// Vector.java
// Used to define an n-vector of doubles

import static java.lang.Math.sqrt;

public class Vector {
    private double[] vector;

    public Vector(double... values) {
        this.vector = values;
    }

    // get double array representation of vector
    public double[] getVector() {
        return vector;
    }

    // set double array representation of vector
    public void setVector(double[] vector) {
        this.vector = vector;
    }

    // return String representation of vector (x, y, z)
    public String vectorToString() {
        String vecString = "(";
        for (int i = 0; i < vector.length - 1; i++) {
            vecString += vector[i] + ", ";
        }
        vecString += vector[vector.length - 1] + ")";

        return vecString;
    }

    // take the norm of vector v, ||v||
    public double norm() {
        double sumOfSquares = 0;
        for (double val : vector) {
            sumOfSquares += val * val;
        }

        return sqrt(sumOfSquares);
    }

    // take the dot product of vector and another vector.
    public double dotProduct(Vector v2) {
        double dotProduct = 0;

        double[] vector1 = vector;
        double[] vector2 = v2.getVector();

        for (int i = 0; i < vector.length; i++) {
            dotProduct += vector1[i] * vector2[i];
        }

        return dotProduct;
    }
}
