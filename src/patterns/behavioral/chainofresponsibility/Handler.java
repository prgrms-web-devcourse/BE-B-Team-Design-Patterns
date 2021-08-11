package patterns.behavioral.chainofresponsibility;

public interface Handler {

    void doHandle(Request request);
}
