package egar.domain.dictionary.entity;

import java.util.HashMap;
import java.util.Map;

public class TransactionDictionary extends Dictionary {
    public TransactionDictionary() {
        Map<String, String> dictMap = new HashMap<>();
        dictMap.put("1","Накладная");
        dictMap.put("2","Реализация");
        dictMap.put("3","Авансовый отчет");
        dictMap.put("4","Контракт");
        dictMap.put("5","Договор");
        dictMap.put("6","Счет");
        this.dictMap = dictMap;
    }
}
