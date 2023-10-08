package egar.domain.dictionary.entity;

import egar.domain.document.Document;

import java.util.HashMap;
import java.util.Map;

public abstract class Dictionary {
    public Map<String, String> dictMap;

    public Document processDocument(Document document) {
        document.setCodeTypeDocument(dictMap.get(document.getCodeTypeDocument()));
        return document;
    }
}
