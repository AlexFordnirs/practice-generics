package org.itstep.step02;

/*БОНУСНЫЙ ВОПРОС: Что произойдет, если вы повторно воспроизведете проблему, которую вы исправили на шаге 1 из предыдущего блока?
Будет ли компилироваться полученный код? Как вы думаете, почему обобщенные классы коллекций иногда называют «типобезопасными» коллекциями?*/

/*программа несможет закомпелирываться нормально по причине невозможность переобразования String в Integer
типообразносьтю могут называть по причине безопасности, так как есть Статическая и динамическая, Явная и неявная. В джава строгая статическая.*/

public class PairDriver {
    public static void main(String[] args) {

        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<String, Integer>("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair<String, Integer>("Michigan Stadium", 109901);
        stadiums[2] = new Pair<String, Integer>("Lane Stadium", 66233);


        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }
    public static String largestStadium(Pair<String, Integer>[] stadiums) {
        int firstStadium  = (Integer)stadiums[0].getSecond();
        int namber = 0;
        for (int i = 1; i < stadiums.length; i++)
        {
            int nextStadium = (int)stadiums[i].getSecond();
            if (nextStadium>firstStadium)
            { firstStadium = nextStadium;namber = i;}
        }
        return stadiums[namber].getFirst();


    }
}