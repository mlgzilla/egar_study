package egar.domain.document;

public class InfoDocument extends Document {
    private int employeeId;
    private String uploadDate;

    public InfoDocument() {
        this.departmentName = "Archive";
        this.codeTypeDocument = "Default";
        this.documentName = "Default";
        this.pageCount = 0;
        this.employeeId = 0;
        this.uploadDate = "Default";
    }

    public InfoDocument(String codeTypeDocument, String documentName, int pageCount, int employeeId, String uploadDate) {
        this.departmentName = "Archive";
        this.codeTypeDocument = codeTypeDocument;
        this.documentName = documentName;
        this.pageCount = pageCount;
        this.employeeId = employeeId;
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        return "InfoDocument: " +
                "employeeId=" + employeeId +
                ", uploadDate='" + uploadDate + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", codeTypeDocument='" + codeTypeDocument + '\'' +
                ", documentName='" + documentName + '\'' +
                ", pageCount=" + pageCount;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String getMarker() {
        return "InfoDocument";
    }
}
