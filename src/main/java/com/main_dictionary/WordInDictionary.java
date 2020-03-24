package com.main_dictionary;

import java.util.*;


public class WordInDictionary {


    public Boolean checkDict(String dictArr[],String str){
        List<String> listObject = Arrays.asList(dictArr);
        // 检查输入的字符串在数据中是否存在
        Boolean flag = listObject.stream().anyMatch(s -> Objects.equals(s, str));
        //boolean flag = listObject.contains(str);
        return flag;
    }

    public void wordInDict(String dictArr[] ,String dictStageArr[] ,String type,String str, int n,String result){
        Set<String> stringSet = new HashSet<>();
        if(dictArr != null && dictArr.length != 0){
            wordInDictByArr(dictArr,type,str,n,result,stringSet);
        }
        if(dictStageArr != null && dictStageArr.length != 0){
            wordInDictByArr(dictStageArr,type,str,n,result,stringSet);
        }
        for (String s : stringSet) {
            System.out.println(s);
        }



    }

    public void wordInDictByArr(String arr[] ,String type,String str, int n,String result,Set<String> stringSet){
        for(int i = 1;i<=n;i++){
            String s = str.substring(0,i);
            if(checkDict(arr,s)){
                if(i == n){
                    result += s;
                    String last_result = type+"--"+result;
                    stringSet.add(last_result);
                    return;
                }
                wordInDictByArr(arr,type,str.substring(i, n), n-i,result + s+" ",stringSet);
            }
        }
    }

    public static void main(String[] args) {
        try {


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
