package example.serdes;

import com.yahoo.elide.core.utils.coerce.converters.ElideTypeConverter;
import com.yahoo.elide.core.utils.coerce.converters.Serde;

import example.models.WidgetType;

@ElideTypeConverter(type = WidgetType.class, name = "WidgetType")
public class WidgetTypeSerde implements Serde<String, WidgetType> {
    @Override
    public WidgetType deserialize(String val) {
        return WidgetType.of(val);
    }

    @Override
    public String serialize(WidgetType val) {
        return val.toString();
    }
}
