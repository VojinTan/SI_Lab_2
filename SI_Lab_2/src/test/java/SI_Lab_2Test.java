import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

class SI_Lab_2Test {


    @Test
    void everyBranch() {
        final SI_Lab_2 SiLab = new SI_Lab_2();

        final List<Time> lista = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time vreme = new Time(10,10,10);
        lista.add(vreme);


        final List<Time> lista1 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time vreme1 = new Time(-1,61,61);
        lista.add(vreme1);


        final List<Time> lista2 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time vreme2 = new Time(25,61,61);
        lista.add(vreme2);


        final List<Time> lista3 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time vreme3 = new Time(10,-1,0);
        lista.add(vreme3);


        final List<Time> lista4 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time vreme4 = new Time(10,61,61);
        lista.add(vreme4);


        final List<Time> lista5 = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time vreme5 = new Time(24,1,1);
        lista.add(vreme5);

        final List<Time> expected = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };


      assertEquals(expected,SiLab.function(lista)); //10,10,10
      assertEquals("The hours are smaller than the minimum",SiLab.function(lista1)); //-1,61,61
      assertEquals("The hours are grater than the maximum",SiLab.function(lista2)); //25,61,61
      assertEquals("The minutes are not valid!",SiLab.function(lista3)); //10,-1,0
      assertEquals("The seconds are not valid",SiLab.function(lista4)); //10,61,61
      assertEquals("The time is greater than the maximum",SiLab.function(lista5)); //24,1,1
    }

    @Test
    void multipleCondition() {
        final SI_Lab_2 SiLab = new SI_Lab_2();

        final List<Time> lista = new List<Time>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Time> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Time time) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Time> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Time get(int index) {
                return null;
            }

            @Override
            public Time set(int index, Time element) {
                return null;
            }

            @Override
            public void add(int index, Time element) {

            }

            @Override
            public Time remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Time> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Time> listIterator(int index) {
                return null;
            }

            @Override
            public List<Time> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Time vreme = new Time(-1,-1,-1);
        Time vreme1 = new Time(36,70,63);
        Time vreme2 = new Time(23,40,3);
        Time vreme3 = new Time(24,0,0);
        Time vreme4 = new Time(24,0,1);
        Time vreme5 = new Time(24,1,1);
        Time vreme6 = new Time(23,1,1);
        lista.add(vreme);
        lista.add(vreme1);
        lista.add(vreme2);
        lista.add(vreme3);
        lista.add(vreme4);
        lista.add(vreme5);
        lista.add(vreme6);

        assertNotEquals(1,SiLab.function(lista));
    }
}