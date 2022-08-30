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
        return Arrays.stream(WidgetType.values()).filter(t -> t.value.equals(s)).findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
