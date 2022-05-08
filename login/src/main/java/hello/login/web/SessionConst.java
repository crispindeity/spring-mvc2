package hello.login.web;

public enum SessionConst {
    LOGIN_MEMBER("loginMember");

    private final String constValue;

    SessionConst(String constValue) {
        this.constValue = constValue;
    }

    public String getConstValue() {
        return constValue;
    }
}
