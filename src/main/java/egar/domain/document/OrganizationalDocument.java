package egar.domain.document;

public class OrganizationalDocument extends Document {
    private String issuedBy;
    private String issueDate;

    public OrganizationalDocument() {
        this.departmentName = "Executive";
        this.codeTypeDocument = "Default";
        this.documentName = "Default";
        this.pageCount = 0;
        this.issuedBy = "Default";
        this.issueDate = "Default";
    }

    public OrganizationalDocument(String codeTypeDocument, String documentName, int pageCount, String issuedBy, String issueDate) {
        this.departmentName = "Executive";
        this.codeTypeDocument = codeTypeDocument;
        this.documentName = documentName;
        this.pageCount = pageCount;
        this.issuedBy = issuedBy;
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "OrgDocument: " +
                "issuedBy='" + issuedBy + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", codeTypeDocument='" + codeTypeDocument + '\'' +
                ", documentName='" + documentName + '\'' +
                ", pageCount=" + pageCount;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String getMarker() {
        return "OrganizationalDocument";
    }
}
