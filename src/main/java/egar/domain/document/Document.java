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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }
}
