package home_work_6;

import home_work_6.ISearchEngine;
public class EasyResearch implements ISearchEngine{

    @Override
    public long search(String text, String word) {
        int index = text.indexOf(word);
        long count = 0;
        while (index != -1) {
            count++;
            index = text.indexOf(word,index + 1);
        }
        return count;
    }
}
