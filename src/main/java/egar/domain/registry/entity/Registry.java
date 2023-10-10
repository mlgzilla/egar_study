package egar.domain.registry.entity;

import egar.domain.dictionary.entity.InfoDictionary;
import egar.domain.dictionary.entity.OrganizationalDictionary;
import egar.domain.dictionary.entity.TransactionDictionary;
import egar.domain.document.Document;
import egar.domain.document.InfoDocument;
import egar.domain.document.OrganizationalDocument;
import egar.domain.document.TransactionDocument;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    String departmentName;
    String codeTypeDocument;
    String documentName;
    Integer pageCount;

    int employeeId_Info;
    String uploadDate_Info;

    String issuedBy_Org;
    String issueDate_Org;

    String transactionStatus_Trans;
    String startDate_Trans;

    public void setCodeTypeDocument(String codeTypeDocument) {
        this.codeTypeDocument = codeTypeDocument;
    }

    @Override
    public String toString() {
        String output = "Registry{" +
                "departmentName='" + departmentName + '\'' +
                ", codeTypeDocument='" + codeTypeDocument + '\'' +
                ", documentName='" + documentName + '\'' +
                ", pageCount=" + pageCount;
        switch (departmentName){
            case "Archive" -> {
                return output +
                        ", employeeId_Info=" + employeeId_Info +
                        ", uploadDate_Info='" + uploadDate_Info + '\'' +
                        '}';
            }
            case "Executive" -> {
                return output +
                        ", issuedBy_Org='" + issuedBy_Org + '\'' +
                        ", issueDate_Org='" + issueDate_Org + '\'' +
                        '}';
            }
            case "Financial" -> {
                return output +
                        ", transactionStatus_Trans='" + transactionStatus_Trans + '\'' +
                        ", startDate_Trans='" + startDate_Trans + '\'' +
                        '}';
            }
            default -> {
                return output;
            }
        }
    }

    public Registry(Document document){
        departmentName = document.getDepartmentName();
        documentName = document.getDocumentName();
        pageCount = document.getPageCount();
        codeTypeDocument = document.getCodeTypeDocument();

        switch (document.getMarker()){
            case "InfoDocument": {
                InfoDocument infoDoc = (InfoDocument) document;
                employeeId_Info = infoDoc.getEmployeeId();
                uploadDate_Info = infoDoc.getUploadDate();
                break;
            }
            case "OrganizationalDocument":{
                OrganizationalDocument orgDoc = (OrganizationalDocument) document;
                issuedBy_Org = orgDoc.getIssuedBy();
                issueDate_Org = orgDoc.getIssueDate();
                break;
            }
            case "TransactionDocument":{
                TransactionDocument transDoc = (TransactionDocument) document;
                transactionStatus_Trans = transDoc.getTransactionStatus();
                startDate_Trans = transDoc.getStartDate();
                break;
            }
        }
    }

    public static List<Registry> createRegistry(List<Document> documents){
        InfoDictionary infoDictionary = new InfoDictionary();
        OrganizationalDictionary orgDict = new OrganizationalDictionary();
        TransactionDictionary transactionDict = new TransactionDictionary();

        List<Registry> registryList = new ArrayList<>(documents.size());
        for (Document document : documents) {
            Registry registry = new Registry(document);
            switch (document.getMarker()) {
                case "InfoDocument" -> registry.setCodeTypeDocument(infoDictionary.processCodeType(document.getCodeTypeDocument()));
                case "OrganizationalDocument" -> registry.setCodeTypeDocument(orgDict.processCodeType(document.getCodeTypeDocument()));
                case "TransactionDocument" -> registry.setCodeTypeDocument(transactionDict.processCodeType(document.getCodeTypeDocument()));
            }
            registryList.add(registry);
        }
        return registryList;
    }
}
