package week1.designPrinciplesAndPatterns.factoryMethod;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
