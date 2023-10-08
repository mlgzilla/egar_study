package egar.domain.dictionary.entity;

import java.util.HashMap;
import java.util.Map;

public class InfoDictionary extends Dictionary {
    public InfoDictionary() {
        Map<String, String> dictMap = new HashMap<>();
        dictMap.put("1","Паспорт");
        dictMap.put("2","Свидетельство о рождении");
        dictMap.put("3","СНИЛС");
        dictMap.put("4","Заявка");
        dictMap.put("5","Заявление");
        dictMap.put("6","Служебная записка");
        this.dictMap = dictMap;
    }
}
