package egar.domain.document;

public class TransactionDocument extends Document {
    private String transactionStatus;
    private String startDate;

    public TransactionDocument() {
        this.departmentName = "Financial";
        this.codeTypeDocument = "Default";
        this.documentName = "Default";
        this.pageCount = 0;
        this.transactionStatus = "Default";
        this.startDate = "Default";
    }

    public TransactionDocument(String codeTypeDocument, String documentName, int pageCount, String transactionStatus, String startDate) {
        this.departmentName = "Financial";
        this.codeTypeDocument = codeTypeDocument;
        this.documentName = documentName;
        this.pageCount = pageCount;
        this.transactionStatus = transactionStatus;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "TransDocument: " +
                "transactionStatus='" + transactionStatus + '\'' +
                ", startDate='" + startDate + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", codeTypeDocument='" + codeTypeDocument + '\'' +
                ", documentName='" + documentName + '\'' +
                ", pageCount=" + pageCount;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String getMarker() {
        return "TransactionDocument";
    }
}
