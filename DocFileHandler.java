public class DocFileHandler implements Handler {
    private Handler handler;
    private final String handlerName;

    public DocFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    public void process(File file) {
        if (file.getFileType().equals("document")) {
            System.out.println("Process and saving document file by " + handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("File not supported");
        }
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public String getHandlerName() {
        return handlerName;
    }
}
