package home_work_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class WordCounter {
    private Set<String> words;
    private Map<String, Integer> wordCountMap;

    public WordCounter() {
        words = new HashSet<>();
        wordCountMap = new HashMap<>();
    }

    public void readTextFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^а-яА-Я]", "").toLowerCase();
                if (!word.isEmpty()) {
                    words.add(word);
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String printUniqueWordCount() {
        return "Количество использованных слов: " + words.size();
    }

    public void printTopNWords(int topN) {
        List<Map.Entry<String, Integer>> sortedWordList = new ArrayList<>(wordCountMap.entrySet());
        sortedWordList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Топ " + topN + " слов:");
        for (int i = 0; i < Math.min(topN, sortedWordList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedWordList.get(i);
            System.out.println(entry.getKey() + " - " + entry.getValue() + " раз");
        }
    }
}




