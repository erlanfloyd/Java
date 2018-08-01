/*
    Рассчитать расстояние до места вспышки молнии, звук от которого доходит
    до наблюдателя за 7,2 секунды.
    Затем узнать расстояние до объекта.
 */
public class Sound {
    public static void main(String[] args) {
        double dist; double time;

        dist = 1100 * 7.2;

        time = 1100 * 7.2/2;


        System.out.println("Расстояние до места вспышки молнии " + "составляет " + dist + " футов");
        System.out.println("Расстояние до объекта " + time + " футов");
    }
}
