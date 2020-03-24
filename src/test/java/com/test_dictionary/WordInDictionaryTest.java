package com.test_dictionary;

import com.main_dictionary.WordInDictionary;
import org.junit.Test;


public class WordInDictionaryTest {

    private final String dictArr[] = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man","go"};
    private final String dictStageArr[] = {"i", "like", "sam", "sung", "mobile", "icecream", "man","go", "mango"};
    private final String str1 = "ilikesamsungmobile";
    private final String str2 = "ilikeicecreammango";

    @Test
    public void print(){
        WordInDictionary wordInDictionary = new WordInDictionary();

        System.out.println("===explame====");
        wordInDictionary.wordInDict(dictArr,null,"str1-dictArr",str1,str1.length(),"");
        wordInDictionary.wordInDict(dictArr,null,"str2-dictArr",str2,str2.length(),"");

        System.out.println("===Stage 2====");
        wordInDictionary.wordInDict(null,dictStageArr,"str1-dictStageArr",str1,str1.length(),"");
        wordInDictionary.wordInDict(null,dictStageArr,"str2-dictStageArr",str2,str2.length(),"");

        System.out.println("===Stage 3====");
        wordInDictionary.wordInDict(dictArr,dictStageArr,"str1-dictArr-dictStageArr",str1,str1.length(),"");
        wordInDictionary.wordInDict(dictArr,dictStageArr,"str2-dictArr-dictStageArr",str2,str2.length(),"");


    }

}
