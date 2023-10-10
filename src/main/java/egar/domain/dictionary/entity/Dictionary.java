package egar.domain.dictionary.entity;

import java.util.Map;

public abstract class Dictionary {
    public Map<String, String> dictMap;

    public String processCodeType(String codeTypeDocument) {
        return dictMap.get(codeTypeDocument);
    }
}
