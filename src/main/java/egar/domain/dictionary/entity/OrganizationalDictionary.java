package egar.domain.dictionary.entity;

import java.util.HashMap;
import java.util.Map;

public class OrganizationalDictionary extends Dictionary {
    public OrganizationalDictionary() {
        Map<String, String> dictMap = new HashMap<>();
        dictMap.put("1","Распоряжение");
        dictMap.put("2","Инструкции");
        dictMap.put("3","Правила");
        dictMap.put("4","Приказ");
        dictMap.put("5","Решение");
        dictMap.put("6","Устав");
        this.dictMap = dictMap;
    }
}
