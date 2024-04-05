package home_work_4;

import java.util.Comparator;
import java.util.Objects;

public class DataContainerString {
    private String[] data;

    public DataContainerString(String[] data){
        this.data = data;
    }


    public int add(String item){
        if(item == null){
            return -1;
        }

        int indexForInsert = searchEmptyIndex(data);

        if(indexForInsert == -1){
            indexForInsert = data.length;
            data = copyOf(data, data.length + 1);
        }

        data[indexForInsert] = item;

        return indexForInsert;
    }


    public String get(int index){
        if(!existIndex(index)){
            return null;
        }

        return data[index];
    }

    public String[] getItems(){
        return data;
    }

    public boolean delete(int index){
        if(!existIndex(index)){
            return false;
        }

        for (int i = index + 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }

        data = copyOf(data, data.length - 1);

        return true;
    }

    public boolean delete(String item){
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

    public void sort(Comparator<String> cmp){
        for (int i = 0; i < data.length; i++) {
            for (int j = i +1;j < data.length; j++){
                String left = data[i];
                String right = data[j];
                if (cmp.compare(left, right) > 0){
                    swap(i, j, data);
                }
            }
        }
    }

    private void swap(int a, int b, String[] arr){
        String tmp = arr[b];
        arr[b] = arr[a];
        arr[a] = tmp;
    }


    private boolean existIndex(int index){
        return index >= 0 && index < data.length;
    }


    private static int searchEmptyIndex(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                return i;
            }
        }

        return -1;
    }

    private static String[] copyOf(String[] arr, int newLength){
        String[] tmp = new String[newLength];
        int iterationCount = Math.min(arr.length, newLength);
        for (int a = 0; a < iterationCount; a++) {
            tmp[a] = arr[a];
        }
        return tmp;
    }

    @Override
    public String toString(){
        StringBuilder b = new StringBuilder();
        b.append('[');
        boolean needComma = false;
        for (String value : data) {
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
