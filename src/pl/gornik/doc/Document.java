package pl.gornik.doc;

public class Document {
    private String name;
    private String content;
    private DocumentType type;

    public Document(String name, String content, DocumentType type) {
        this.name = name;
        this.content = content;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}
