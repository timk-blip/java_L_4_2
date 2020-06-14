import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       Index service = new Index();
        float weight = 0;
        float height = 0;
        Scanner in = new Scanner(System.in);
        System.out.print ("Введите Вес \n");
        weight = in.nextFloat();
        System.out.print ("Введите Рост \n");
        height = in.nextFloat();
        float BMI = 0;
        System.out.print ("Индекс массы тела составляет: \n" + service.calculate (BMI, weight, height));
    }
}
// в следующий раз буду согласно требованиям делать. очень много времени убил) нужно больше опыта)
