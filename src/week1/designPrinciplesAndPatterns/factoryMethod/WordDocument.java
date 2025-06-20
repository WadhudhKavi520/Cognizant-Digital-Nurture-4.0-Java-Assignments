package week1.designPrinciplesAndPatterns.factoryMethod;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }
}
