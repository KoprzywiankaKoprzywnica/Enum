package pl.gornik.doc;

public enum DocumentType {
    INVOICE("faktura", 0), CONTRACT("kontrakt"), NOTARIAL_ACT("akt notarialny"), CERTIFICATE("certyfikat", 1);

    private String name;
    private int id;

    DocumentType(String name) {
        this.name = name;
    }

    DocumentType(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
