import java.util.Scanner;

public class Index {
    public float calculate (float BodyMI)
    {
        float weight = 0;
        float height = 0;
        Scanner in = new Scanner(System.in);
        System.out.print ("Введите Вес \n");
        weight = in.nextFloat();
        System.out.print ("Введите Рост \n");
        height = in.nextFloat();
        BodyMI = weight / (height * height) * 10000;
        return BodyMI;
    }
}
