package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Container<T> {
    private T[] data;

    public Container(){
        this.data = data;
    }

    public int add(T item){
        if(item == null){
            return -1;
        }

        int indexForInsert = searchEmptyIndex(data);

        if(indexForInsert == -1){
            indexForInsert = data.length;
            data = Arrays.copyOf(data, data.length + 1);
        }

        data[indexForInsert] = item;

        return indexForInsert;
    }


    public T get(int index){
        if(!existIndex(index)){
            return null;
        }

        return data[index];
    }

    public T[] getItems(){
        return data;
    }

    public boolean delete(int index){
        if(!existIndex(index)){
            return false;
        }

        for (int i = index + 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }

        data = Arrays.copyOf(data, data.length - 1);

        return true;
    }

    public boolean delete(T item){
        if(item == null){
            return false;
        }

        for (int i = 0; i < data.length; i++) {
            if(Objects.equals(item, data[i])){
                return delete(i);
            }
        }

        return false;
    }

    public void sort(Comparator<T> cmp){
        for (int i = 0; i < data.length; i++) {
            for (int j = i +1;j < data.length; j++){
                T left = data[i];
                T right = data[j];
                if (cmp.compare(left, right) > 0){
                    swap(i, j, data);
                }
            }
        }
    }

    private void swap(int a, int b, T[] arr){
        T tmp = arr[b];
        arr[b] = arr[a];
        arr[a] = tmp;
    }


    private boolean existIndex(int index){
        return index >= 0 && index < data.length;
    }


    private int searchEmptyIndex(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString(){
        StringBuilder b = new StringBuilder();
        b.append('[');
        boolean needComma = false;
        for (T value : data) {
            if (value != null) {
                if (needComma) {
                    b.append(", ");
                } else {
                    needComma = true;
                }
                b.append(value);
            }
        }
        return b.append(']').toString();
    }
}


