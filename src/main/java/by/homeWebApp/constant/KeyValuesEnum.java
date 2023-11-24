package by.homeWebApp.constant;

public enum KeyValuesEnum {
    USER_NAME("username"),
    USER_PASSWORD("password"),
    TIME_ZONE("zone");





    private final String paramName;
    KeyValuesEnum(String paramName) {
        this.paramName = paramName;
    }
    public String getParamName() {
        return paramName;
    }

//    public String get

}
