package org.itstep.step01;

/**
 * Класс для тестирования кортежа ObjectPair
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */


/*БОНУСНЫЙ ВОПРОС: Почему компилируется эта строка кода?
   stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
   по причине спользования Autoboxing , что привело к упаковки int в Integer при начале работы прогграммы
   по сути эта функция, преобразования примитивных типов в эквивалентные объекты...
*/









public class ObjectPairDriver {

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
    public static void main(String[] args) {

        ObjectPair[] stadiums = new ObjectPair[3];
        stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
        stadiums[1] = new ObjectPair("Michigan Stadium", 109901);
        stadiums[2] = new ObjectPair("Lane Stadium", "66,233");

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Возвращает название стадиона с наибольшей вместимостью.
     *
     * @param stadiums Массив ObjectPairs, где каждая пара содержит название стадиона, за которым следует целое число
     * @return Название стадиона с наибольшей вместимостью
     */
    public static String largestStadium(ObjectPair[] stadiums) {
            int firstStadium  = (Integer)stadiums[0].getSecond();
            int namber = 0;
            for (int i = 1; i < stadiums.length; i++)
            {
                int nextStadium = (int)stadiums[i].getSecond();
                if (nextStadium>firstStadium)
                { firstStadium = nextStadium;namber = i;}
            }
            return stadiums[namber].getFirst().toString();


    }

}
