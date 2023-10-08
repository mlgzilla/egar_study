package egar.domain.registry.entity;

import egar.domain.dictionary.entity.InfoDictionary;
import egar.domain.dictionary.entity.OrganizationalDictionary;
import egar.domain.dictionary.entity.TransactionDictionary;
import egar.domain.document.Document;

import java.util.List;

public class Registry {
    public static List<Document> createRegistry(List<Document> documents){
        InfoDictionary infoDictionary = new InfoDictionary();
        OrganizationalDictionary orgDict = new OrganizationalDictionary();
        TransactionDictionary transactionDict = new TransactionDictionary();
        for (int i = 0; i < documents.size(); i++) {
            Document document = documents.get(i);
            switch (document.getMarker()){
                case "InfoDocument": {
                    documents.set(i, infoDictionary.processDocument(document));
                    break;
                }
                case "OrganizationalDocument":{
                    documents.set(i, orgDict.processDocument(document));
                    break;
                }
                case "TransactionDocument":{
                    documents.set(i, transactionDict.processDocument(document));
                    break;
                }
            }
        }
        return documents;
    }
}
