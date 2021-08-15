package patterns.behavioral.chainofresponsibility.kwonkyu;

public abstract class AbstractChainHandlers implements Handler {
    protected Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public AbstractChainHandlers(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void doHandle(Request request) {
        nextHandler.doHandle(request);
    }
}
