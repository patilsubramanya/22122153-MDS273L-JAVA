import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class lab_06 {
    public static void main(String[] args) {
        String fname = "text.txt";
        int [] vowel = new int[5];
        int [] digit = new int[10];
        String[] words = new String[10000];
        int[] counts = new int[10000];
        int uniquewords = 0;
        try{
            String filecontent = readFile(fname);
            vowelcount(filecontent, vowel);
            digitcount(filecontent, digit);
        }
        catch(FileNotFoundException e){
            System.err.println("File Not Found. "+fname);
        }
        try{
            String fileName = "text.txt";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.toLowerCase().split("[\\s\\p{Punct}]+");
                for (String word : lineWords) {
                    int index = findWordIndex(words, uniquewords, word);
                    if (index == -1) {
                        words[uniquewords] = word;
                        counts[uniquewords] = 1;
                        uniquewords++;
                    }
                    else {
                        counts[index]++;
                    }
                }
            }
            reader.close();
            System.out.println("Top five most repeated words are: ");
            for (int i = 0; i < 5 && i < uniquewords; i++) {
                int maxIndex = findMaxIndex(counts, uniquewords);
                System.out.println(words[maxIndex] + ": " + counts[maxIndex]);
                counts[maxIndex] = -1;
            }
            System.out.println("Top five least repeated words are: ");
            for (int i = 0; i < 5 && i < uniquewords; i++) {
                int minIndex = findMinIndex(counts, uniquewords);
                if(counts[minIndex]==-1){
                    break;
                }
                System.out.println(words[minIndex] + ": " + counts[minIndex]);
                counts[minIndex] = -1;
            }
        }
        catch(IOException e){
            System.err.println("IOException");
        }
        String text = ReadFile("text.txt");
        int[] Count = countCharacters(text);
        System.out.println("Top five repeated characters:");
        for (int i = 0; i < 5; i++) {
            int maxIndex = findMaxIndex(Count, Count.length);
            char ch = (char) maxIndex;
            System.out.println(ch + ": " + Count[maxIndex]);
            Count[maxIndex] = -1; // mark as visited
        }

        System.out.println("\nLeast five repeated characters:");
        for (int i = 0; i < 5; i++) {
            int minIndex = findMinIndex(Count, Count.length);
            if (Count[minIndex] == Integer.MAX_VALUE) {
                break; // all remaining characters have been visited
            }
            char ch = (char) minIndex;
            System.out.println(ch + ": " + Count[minIndex]);
            Count[minIndex] = Integer.MAX_VALUE; // mark as visited
        }
        
    }
    public static String readFile(String fname) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(fname));
        StringBuilder fcontent = new StringBuilder();
        while(scan.hasNextLine()){
            fcontent.append(scan.nextLine());
        }
        scan.close();
        return fcontent.toString().toLowerCase();
    }
    public static void vowelcount(String content, int[] vowel){
        for(int i=0; i<content.length(); i++){
            char c = content.charAt(i);
            switch(c){
                case 'a':
                    vowel[0]++;
                    break;
                case 'e':
                    vowel[1]++;
                    break;
                case 'i':
                    vowel[2]++;
                    break;
                case 'o':
                    vowel[3]++;
                    break;
                case 'u':
                    vowel[4]++;
                    break;
            }
        }
        System.out.println("The number of a is: "+vowel[0]);
        System.out.println("The number of e is: "+vowel[1]);
        System.out.println("The number of i is: "+vowel[2]);
        System.out.println("The number of o is: "+vowel[3]);
        System.out.println("The number of u is: "+vowel[4]);
    }
    public static void digitcount(String content, int[] digit){
        for(int i=0; i<content.length(); i++){
            char c = content.charAt(i);
            switch(c){
                case '0':
                    digit[0]++;
                    break;
                case '1':
                    digit[1]++;
                    break;
                case '2':
                    digit[2]++;
                    break;
                case '3':
                    digit[3]++;
                    break;
                case '4':
                    digit[4]++;
                    break;
                case '5':
                    digit[5]++;
                    break;
                case '6':
                    digit[6]++;
                    break;
                case '7':
                    digit[7]++;
                    break;
                case '8':
                    digit[8]++;
                    break;
                case '9':
                    digit[9]++;
                    break;
            }
        }
        System.out.println("The count of 0 is: "+digit[0]);
        System.out.println("The count of 1 is: "+digit[1]);
        System.out.println("The count of 2 is: "+digit[2]);
        System.out.println("The count of 3 is: "+digit[3]);
        System.out.println("The count of 4 is: "+digit[4]);
        System.out.println("The count of 5 is: "+digit[5]);
        System.out.println("The count of 6 is: "+digit[6]);
        System.out.println("The count of 7 is: "+digit[7]);
        System.out.println("The count of 8 is: "+digit[8]);
        System.out.println("The count of 9 is: "+digit[9]);
    }
    public static int findWordIndex(String[] words, int numWords, String word) {
        for (int i = 0; i < numWords; i++) {
            if (words[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    public static int findMaxIndex(int[] counts, int numCounts) {
        int maxIndex = -1;
        int maxCount = -1;
        for (int i = 0; i < numCounts; i++) {
            if (counts[i] > maxCount) {
                maxIndex = i;
                maxCount = counts[i];
            }
        }
        return maxIndex;
    }
    public static int findMinIndex(int[] counts, int numCounts){
        int minIndex=-1;
        int minCount =Integer.MAX_VALUE;
        for(int i=0;i<numCounts;i++){
            if(counts[i]!=-1 && counts[i]<minCount){
                minIndex=i;
                minCount= counts[i];
            }
        }
        return minIndex;
    }
    public static String ReadFile(String filename) {
        String result = "";
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                result += scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int[] countCharacters(String text) {
        int[] Count = new int[256]; 
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch != ' ') { 
                    Count[ch]++;
                }
            }
        return Count;
    }

    public static int MaxIndex(int[] Count, int numCounts) {
        int maxIndex = -1;
        int maxCount = -1;
        for (int i = 0; i < numCounts; i++) {
            if (Count[i] > maxCount) {
                maxIndex = i;
                maxCount = Count[i];
            }
        }
        return maxIndex;
    }

    public static int MinIndex(int[] Count, int numCounts) {
        int minIndex = -1;
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < numCounts; i++) {
            if (Count[i] < minCount) {
                minIndex = i;
                minCount = Count[i];
            }
        }
        return minIndex;
    }
}