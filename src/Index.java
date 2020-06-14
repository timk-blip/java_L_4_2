import java.util.Scanner;

public class Index {
    public float calculate (float BodyMI, float weight, float height)
    {
        BodyMI = weight / (height * height) * 10000;
        return BodyMI;
    }
}
