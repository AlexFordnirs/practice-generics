package org.itstep.step04;

import org.itstep.step02.Pair;

/**
 * Обобщения. Вопросы о компиляции
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class CompileDriver {

    public static void main(String[] args) {

        // TODO: перед удалением комментариев отметьте каждую строчку, где есть присвоение - сокмпилируется ли код или нет
        Pair<String, Integer> p1;
        Pair<String, Number> p2;
        Pair<Object, Object> p3;
        Pair<?, ?> p4;
        Pair<?, ? extends Number> p5;

        p1 = new Pair<String, Integer>("A", 7); // соответсвие типов
        int a = p1.getSecond();//да

      //  p1 = new Pair<Integer, Double>(23, 12.0);//Неверный формат вводимых данных

       // p2 = new Pair<String, Integer>("B", 8);//Неверный формат вводимых данных

      //  p3 = new Pair<String, Integer>("C", 9);//Неверный формат вводимых данных

        p4 = new Pair<String, String>("House", "Car");//ДА соответсвие типов
        p4 = new Pair<String, Integer>("D", 10);//ДА соответсвие типов

      //  Integer b = p4.getSecond();// при попытке захвата  даеться ошибка по причине того, что не все Object можно запихнувть в Integer b
        Integer c = (Integer) p4.getSecond();//А сдесь по сути альтернатива Convet.ToInt поэтому программа и не ругаеться

      //  p5 = new Pair<String, String>("E", "G");//ошибка из-за попутки записать не число в число
        p5 = new Pair<String, Double>("E", 11.0);//ДА соответсвие типов
        p5 = new Pair<String, Integer>("E", 11);//ДА соответсвие типов

      //  Integer d = p5.getSecond();//ошабка из-за попытка захвата в Integer d , Number что может означатьа, что сумеп Number неудаеться конверитрывать в Integer "that are convertible to the primitive types byte, double, float, int, long, and short."
        Integer e = (Integer) p5.getSecond();//да//А сдесь по сути альтернатива Convet.ToInt поэтому программа и не ругаеться
    }

}
