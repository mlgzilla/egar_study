package egar;

import egar.domain.document.Document;
import egar.domain.document.DocumentFactory;
import egar.domain.registry.entity.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int countMessage = 6;
        // список для хранения сообщений из внешних систем
        List<Document> documentList = new ArrayList<>();
        // заполняем список генерируемыми данными
        for (int i=0; i<countMessage; i++) {
            documentList.add(new DocumentFactory().creteDocument(getCodeDoc()));
        }
        Registry reg = new Registry(documentList.get(0));

        // выводим в консоль элементы списка
        for (int i=0; i<documentList.size(); i++) {
            Document document = documentList.get(i);
            document.setCodeTypeDocument(String.valueOf(new Random().nextInt(6) + 1));
            documentList.set(i, document);
            System.out.println(document);
        }
        System.out.println("\n\n");
        List<Registry> registry = Registry.createRegistry(documentList);
        for (Registry entry : registry) {
            System.out.println(entry);
        }
    }

    static Integer getCodeDoc() {
        int max = 3, min = 1;
        return new Random().nextInt(max - min + 1) + min;
    }
}