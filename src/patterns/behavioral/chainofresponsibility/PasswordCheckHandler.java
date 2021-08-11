package patterns.behavioral.chainofresponsibility;

public class PasswordCheckHandler extends AbstractChainHandlers {

    public PasswordCheckHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void doHandle(Request request) {
        if(request.isEncoded() && nextHandler != null) nextHandler.doHandle(request);

        String password = request.getPassword().trim();
        if(password.length() < 1) throw new IllegalArgumentException("Password cannot be empty.");
        if(password.length() > 30) throw new IllegalArgumentException("Password cannot exceed 30 characters.");
        String encodedPassword = "ENCODED".concat(password);
        request.setPassword(encodedPassword);
        request.setEncoded(true);

        if(nextHandler != null) nextHandler.doHandle(request);
    }

}
