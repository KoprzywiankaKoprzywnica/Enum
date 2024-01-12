package pl.gornik.doc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.add(new Document("faktura", "...", DocumentType.INVOICE));
        documents.add(new Document("kontrakt", "...", DocumentType.CONTRACT));
        documents.add(new Document("certyfikat", "...", DocumentType.CERTIFICATE));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę dokumentu: ");
        String name = scanner.nextLine();
        System.out.print("Podaj zawartość dokumentu: ");
        String content = scanner.nextLine();
        System.out.print("Podaj typ dokumentu: ");
        DocumentType type = getDocumentType(scanner.nextLine());

        if (type != null) {
            documents.add(new Document(name, content, type));
        } else {
            System.out.println("Niepoprawny typ dokumentu.");
        }

        for (Document d : documents) {
            System.out.println(d);
        }
    }

    public static DocumentType getDocumentType(String type) {
        switch (type) {
            case "faktura", "0" -> {
                return DocumentType.INVOICE;
            }
            case "kontrakt" -> {
                return DocumentType.CONTRACT;
            }
            case "akt notarialny" -> {
                return DocumentType.NOTARIAL_ACT;
            }
            case "certyfikat", "1" -> {
                return DocumentType.CERTIFICATE;
            }
            default -> {
                return null;
            }
        }
    }
}
