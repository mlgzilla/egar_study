package egar.domain.document;

public class DocumentFactory {
    public Document creteDocument(Integer codeDoc){
        switch (codeDoc){
            case 1:
                return new InfoDocument();
            case 2:
                return new OrganizationalDocument();
            case 3:
                return new TransactionDocument();
            default:
                throw new RuntimeException("нет данных для обработки");
        }
    }
}
