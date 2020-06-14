import java.util.Scanner;

public class Index {
    public float calculate(float weight, float height) {
        float BodyMI;
        BodyMI = weight / (height * height) * 10000;
        return BodyMI;
    }
}
