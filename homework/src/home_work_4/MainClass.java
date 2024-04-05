package home_work_4;

import home_work_4.comporators.StringAlphabeticComparator;
import home_work_4.comporators.StringLengthComparator;


public class MainClass {
    public static void main(String[] args) {

        DataContainerString container = new DataContainerString(new String[10]); //Тут есть подвох в конструкторе, он возможно будет выглядеть не так как тут написано, возможно туда придётся что-то передать, думайте пока сами
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.get(index1)); //Как дела
        container.sort(new StringLengthComparator()); //Сортируется по длинне
        System.out.println(container); // ["Работаю", "Как дела", "Давай потом"]
        container.sort(new StringAlphabeticComparator()); //Сортируется по алфавиту
        System.out.println(container); // ["Давай потом", "Как дела", "Работаю"]



    }
}
