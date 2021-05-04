package domain;

public class Name {
    private static final String NAME_LENGTH_MESSAGE = "자동차 이름은 1 ~ 5글자 입니다.";
    private static final int NAME_MAX_LENGTH = 5;

    private final String name;

    public Name(String name) {
        validNameLength(name);
        this.name = name;
    }

    public String value() {
        return name;
    }

    private void validNameLength(String name) {
        if (name.isEmpty()
                || name.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(NAME_LENGTH_MESSAGE);
        }
    }
}
