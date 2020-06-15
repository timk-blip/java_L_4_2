import java.util.Scanner;

public class Index {
    public float calculate(float weight, float height) {
        float bodyMI;
        bodyMI = weight / (height * height) * 10000;
        return bodyMI;
    }
}
