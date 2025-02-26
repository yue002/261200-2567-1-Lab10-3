public class TextFileHandler implements Handler {
    private Handler handler; // whom to pass on request
    private String handlerName;

    public TextFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("text"))  System.out.println("Process text file by " + handlerName);
        else if (handler!=null) { // next handler exists
            System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
            handler.process(file);
        }
        else System.out.println("File not supported");
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
