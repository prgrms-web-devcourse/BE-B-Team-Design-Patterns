package patterns.behavioral.chainofresponsibility.kwonkyu;

public class Request {

    String userId;
    String password;
    boolean encoded;

    String message;

    public Request(String userId, String password, boolean encoded, String message) {
        this.userId = userId;
        this.password = password;
        this.encoded = encoded;
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEncoded() {
        return encoded;
    }

    public void setEncoded(boolean encoded) {
        this.encoded = encoded;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
