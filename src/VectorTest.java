// VectorTest.java
// Used to test the functionality of Vector.java

public class VectorTest {
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 1);
        Vector v2 = new Vector(1, 3, -1);

        System.out.printf("||v1|| = ||%s|| = %f\n", v1.vectorToString(), v1.norm());

        System.out.printf("v1*v2 = %f", v1.dotProduct(v2));
    }
}
