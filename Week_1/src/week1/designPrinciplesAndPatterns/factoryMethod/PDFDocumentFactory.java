package week1.designPrinciplesAndPatterns.factoryMethod;

public class PDFDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
