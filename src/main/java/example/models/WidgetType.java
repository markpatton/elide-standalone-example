package example.models;

import java.util.Arrays;

public enum WidgetType {
    GOOD("good_one"), BAD("bad_one");

    private String value;

    WidgetType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WidgetType of(String s) {
        if (s.equals(GOOD.value)) {
            return GOOD;
        }

        if (s.equals(BAD.value)) {
            return BAD;
        }

        throw new IllegalArgumentException("Unknown WidgetType value: " + s);
    }
}
