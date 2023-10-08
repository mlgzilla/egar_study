package egar.domain.document;

public abstract class Document {
    String departmentName;
    String codeTypeDocument;
    String documentName;
    Integer pageCount;

    public abstract String getMarker();

    public void setCodeTypeDocument(String codeTypeDocument) {
        this.codeTypeDocument = codeTypeDocument;
    }

    public String getCodeTypeDocument() {
        return codeTypeDocument;
    }
}
