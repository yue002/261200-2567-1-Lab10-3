public class Main {
    public static void main(String[] args) {
        File file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");

        textHandler.setHandler(imageHandler); // chain starts here!
        file = new File("OOP.txt", "text", "C:\\OOP");
        textHandler.process(file);
        file = new File("HelloWorld.jpg", "image", "C:");
        textHandler.process(file);

        System.out.println("=====================================");

        textHandler.setHandler(docHandler);
        docHandler.setHandler(imageHandler);
        file = new File("OOP.txt", "text", "C:\\OOP");
        textHandler.process(file);
        file = new File("bore_pen_young.doc", "document", "D:");
        textHandler.process(file);
        file = new File("HelloWorld.jpg", "image", "C:");
        textHandler.process(file);
    }
}
