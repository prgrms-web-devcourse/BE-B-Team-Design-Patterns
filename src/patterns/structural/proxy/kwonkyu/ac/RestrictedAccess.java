package patterns.structural.proxy.kwonkyu.ac;

public class RestrictedAccess implements AccessControl {
    private AccessControl openAccess;

    public RestrictedAccess(AccessControl openAccess) {
        this.openAccess = openAccess;
    }

    @Override
    public boolean checkId(String userId) {
        if (!"admin".equals(userId)) {
            return false;
        } else {
            return openAccess.checkId(userId);
        }
    }
}
