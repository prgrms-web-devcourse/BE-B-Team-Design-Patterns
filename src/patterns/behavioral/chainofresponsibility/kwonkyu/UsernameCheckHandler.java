package patterns.behavioral.chainofresponsibility.kwonkyu;

public class UsernameCheckHandler extends AbstractChainHandlers {

    public UsernameCheckHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void doHandle(Request request) {
        String userId = request.getUserId().trim();
        if(userId.length() < 1) throw new IllegalArgumentException("User Id cannot be empty.");
        if(userId.length() > 20) throw new IllegalArgumentException("User Id cannot exceed 20 characters.");
        request.setUserId(userId.toLowerCase());

        if(nextHandler != null) nextHandler.doHandle(request);
    }
}
