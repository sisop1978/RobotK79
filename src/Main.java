import java.util.ArrayList;
import java.util.Scanner;

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 чтобы использовать свою команду для робота или введите любой другой символ, воспользоваться командой, заданной по умолчанию? ");
        String robotWay;
        int temp;
        int x0=0;//задаем начальные координаты робота
        int y0=0;//задаем начальные координаты робота
        //Coord oldPosition;
        temp = sc.nextInt();//временная переменная
        //проверяем условие ввода
        if (temp == 1) {
            System.out.println("Введите команду для робота, допускаются символы: S-вперед | L - налево | R - направо. Остальные символы будут проигнорированы:  ");
            robotWay = sc.next();
            //делаем обработку и выводим окончательную команду после if
            robotWay = robotWay.replaceAll("[^SRL]", "");
        } else //при вводе значения, отличного от единицы берем заданное в программе
        {
            robotWay = ("SLSLSLSRSRSRSRS");
            //не забыть добавить в список координат ориентацию робота
       }

        System.out.println("Будет использована команда " + robotWay);
        int moveCount=0;
        int i=0;
        ArrayList<Coord> robotPosition = new ArrayList<Coord>();
        for (char c : robotWay.toCharArray()){

            robotPosition.addLast(x0, y0, c);

            if (c=='S') {moveCount++;}
i++;
        }

    }

}