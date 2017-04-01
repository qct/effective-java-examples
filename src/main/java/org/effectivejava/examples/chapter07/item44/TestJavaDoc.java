package org.effectivejava.examples.chapter07.item44;

import java.util.Collection;
import java.util.Collections;

/**
 * <p>Created by damon.q on 2017/3/25.
 * @param <E> the type of keys to values.
 *
 */
public interface TestJavaDoc<E> {

    /**
     * <p>This method is <i>not</i> guaranteed to run in constant
     * time. In some implementations it may run in time proportional
     * to the element position.
     *
     * {@literal x>y }
     *
     * {@inheritDoc }
     *
     * @param index index index of element to return; must be
     *              non-negative and less than the size of this list
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                  ({@code index < 0 || index >= this.size()})
     */
    E get(int index);

    default void test() {
        Collection<E> aaa = Collections.EMPTY_LIST;
        for(E e : aaa) {
            aaa.remove(e);
        }
    }
}
