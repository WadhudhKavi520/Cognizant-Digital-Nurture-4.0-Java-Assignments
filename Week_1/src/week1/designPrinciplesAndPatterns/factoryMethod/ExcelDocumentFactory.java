package week1.designPrinciplesAndPatterns.factoryMethod;

public class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
