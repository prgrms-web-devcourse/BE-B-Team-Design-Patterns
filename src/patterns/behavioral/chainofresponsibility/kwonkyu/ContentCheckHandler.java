package patterns.behavioral.chainofresponsibility.kwonkyu;

public class ContentCheckHandler extends AbstractChainHandlers {

    public ContentCheckHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void doHandle(Request request) {
        String message = request.getMessage().trim();
        if(message.length() < 1) throw new IllegalArgumentException("Message cannot be empty.");
        if(message.length() > 140) throw new IllegalArgumentException("Message cannot exceed 140 characters.");
        request.setMessage(message);

        if(nextHandler != null) nextHandler.doHandle(request);
    }

}
