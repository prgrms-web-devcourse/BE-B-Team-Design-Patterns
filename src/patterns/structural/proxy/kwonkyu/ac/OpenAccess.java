package patterns.structural.proxy.kwonkyu.ac;

public class OpenAccess implements AccessControl {
    @Override
    public boolean checkId(String userId) {
        return true;
    }
}
