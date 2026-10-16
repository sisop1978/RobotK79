import java.util.List;
import java.util.ArrayList;

public class Coord {
    int x;
    int y;
    char d;
    public Coord(int x0, int y0, char c) {
    }

    public char changeDirection ( char d, char move){
               /* указатели направления:
               N (север, вверх  y+1)
               S (юг, вниз   y-1)
               W (запад, влево  x-1)
               E (восток, вправо x+1)
                */
            //алгоритм не претендует на оптимальность, разработан для тренировки работоспособности программного кода и правильности синтаксиса. Можно обойтись одной функцией.
            char d1;
            d1 = d; //инициализация, компилятор ругается, что может быть не проинициализировано
            if (move == ('S')) {
                d1 = d;
            } //если идем вперед, то направление не меняется
            //идем на запад
            if (((d == 'N') && (move == 'L')) || ((d == 'S') && (move == 'R'))) {
                d1 = 'W';
            } // поворот налево после движения на север или поворот направо после движения на юг
            //идем на восток
            if (((d == 'N') && (move == 'R')) || ((d == 'S') && (move == 'L'))) {
                d1 = 'E';
            } // поворот направо после движения на север или поворот налево после движения на юг
            //идем на юг
            if (((d == 'W') && (move == 'L')) || ((d == 'E') && (move == 'L'))) {
                d1 = 'S';
            } // поворот налево после движения на запад или поворот направо после движения на восток
            //идем на север
            if (((d == 'W') && (move == 'L')) || ((d == 'E') && (move == 'L'))) {
                d1 = 'N';
            } // поворот направо после движения на запад или поворот налево после движения на восток
            return d1;
        }

        public Coord newPosition (Coord oldPosition, char move){
        Coord coordxy; //внутренняя переменная
        int x1 = 0, y1 = 0; //координаты
            if (changeDirection(move, oldPosition.d) == 'W') {
                x1 = oldPosition.x - 1;
            }
            if (changeDirection(move, oldPosition.d) == 'E') {
                x1 = oldPosition.x + 1;
            }
            if (changeDirection(move, oldPosition.d) == 'N') {
                y1 = oldPosition.y + 1;
            }
            if (changeDirection(move, oldPosition.d) == 'S') {
                y1 = oldPosition.y - 1;
            }
            coordxy = new Coord(x, y, move);
            return coordxy;

        }



}