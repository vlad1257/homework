package home_work_6;

import home_work_6.WordCounter;
import home_work_6.EasyResearch;

import java.io.File;
import java.util.HashSet;



public class WordCounterMain {
    public static void main(String[] args) {

        WordCounter wordCounter = new WordCounter();
        wordCounter.printUniqueWordCount();
        wordCounter.readTextFromFile("/Users/v/Desktop/My Projects/JD1/homework/src/War and Peace.txt");
        wordCounter.printTopNWords(100);
        System.out.println(wordCounter.printUniqueWordCount());


        ISearchEngine searchEngine = new EasyResearch();
        String text = String.valueOf(new File("/Users/v/Desktop/My Projects/JD1/homework/src/War and Peace.txt"));
        String [] wordsForSearch = {"война", "и", "мир"};
        for(String word : wordsForSearch) {
            long count = searchEngine.search(text,word);
            System.out.println("Слова \"" + word + "\" встречается " + count + "раз.");
        }

        }

    }


