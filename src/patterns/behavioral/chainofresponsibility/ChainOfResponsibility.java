package patterns.behavioral.chainofresponsibility;

public class ChainOfResponsibility {
    public void test() {
        Handler contentCheckHandler = new ContentCheckHandler(null);
        Handler passwordCheckHandler = new PasswordCheckHandler(contentCheckHandler);
        Handler usernameCheckHandler = new UsernameCheckHandler(passwordCheckHandler);

        Handler handlerChainEntry = usernameCheckHandler;
        try {
            Request request = new Request(" ", "password", false, "message");
            System.out.printf("%nRequest challenge...%nUser ID: %s%nPassword: %s%nMessage: %s%n%n", request.getUserId(), request.getPassword(), request.getMessage());
            handlerChainEntry.doHandle(request);
        } catch (IllegalArgumentException ex) {
            System.out.println("Request Handled Unsuccessfully: " + ex.getLocalizedMessage());
        }

        try {
            Request request = new Request("userid", " ", false, "message");
            System.out.printf("%nRequest challenge...%nUser ID: %s%nPassword: %s%nMessage: %s%n%n", request.getUserId(), request.getPassword(), request.getMessage());
            handlerChainEntry.doHandle(request);
        } catch (IllegalArgumentException ex) {
            System.out.println("Request Handled Unsuccessfully: " + ex.getLocalizedMessage());
        }

        try {
            Request request = new Request("userid", "password", false, " ");
            System.out.printf("%nRequest challenge...%nUser ID: %s%nPassword: %s%nMessage: %s%n%n", request.getUserId(), request.getPassword(), request.getMessage());
            handlerChainEntry.doHandle(request);
        } catch (IllegalArgumentException ex) {
            System.out.println("Request Handled Unsuccessfully: " + ex.getLocalizedMessage());
        }

        Request request = new Request("USERID", "password", false, "message");
        System.out.printf("%nRequest challenge...%nUser ID: %s%nPassword: %s%nMessage: %s%n%n", request.getUserId(), request.getPassword(), request.getMessage());
        handlerChainEntry.doHandle(request);
        System.out.printf("Request result...%nUser ID: %s%nPassword: %s%nMessage: %s%n", request.getUserId(), request.getPassword(), request.getMessage());

    }
}
