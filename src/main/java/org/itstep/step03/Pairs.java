package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Итерируемая коллекция объектов Pair.
 * @author Michael S. Kirkpatrick and Nathan Sprague
 * @version V1, 8/2017
 */
    public class Pairs<K, V> implements Iterable<Pair<K, V>> {
    private Pair<K, V>[] pairs;
    private int size;
    private static final int maximumSize= 10;
    public Pairs() {
        pairs = new Pair[maximumSize];
        size = 0;
    }

    /**
     * TODO: Создайте новую пару и добавьте ее в коллекцию, если есть место.
     *
     * @param first  Первый объект
     * @param second Второй объект
     * @return true - если пара была добавлена, false - в противном случае
     */
    public boolean addPair(K first, V second) {
        if (size < maximumSize){
            pairs[size++] = new Pair<>(first, second);
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public Iterator<Pair<K, V>> iterator() {
        return new PairIterator();
    }


    private class PairIterator implements Iterator<Pair<K, V>> {
        private int namber;
        private boolean chek = true;

        @Override
        public boolean hasNext() {
            if (namber < size){
                return true;
            }
            else {
                return false;
            }
        }


        @Override
        public Pair<K, V> next() {
            if (namber < size){
                chek = false;
                return pairs[namber++];
            }
            throw new NoSuchElementException();
        }


        @Override
        public void remove() {
            if (chek){
                throw new IllegalStateException();
            }
            for (int i = namber; i < size; i++) {
                pairs[i - 1] = pairs[i];
            }
            pairs[--size] = null;
            chek = true;
        }
    }
}
