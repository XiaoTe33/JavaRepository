package homework04.lv0.test01;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class test {
    public static void main(String[] args) {
        ListIterator<Integer> integerListIterator = new ListIterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Integer previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Integer integer) {

            }

            @Override
            public void add(Integer integer) {

            }
        };
// 正序遍历
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next());
        }
// 反序遍历
        while (integerListIterator.hasPrevious()) {
            System.out.println(integerListIterator.previous());
        }
    }

}
