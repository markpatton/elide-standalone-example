package example.models;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.yahoo.elide.annotation.Include;

@Include
@Entity
public class Widget {
    @Id
    private String name;

    @Convert(converter = WidgetTypeToStringConverter.class)
    private WidgetType type;

    @Converter
    private static class WidgetTypeToStringConverter implements AttributeConverter<WidgetType, String> {
        @Override
        public String convertToDatabaseColumn(WidgetType attribute) {
            return attribute == null ? null : attribute.toString();
        }

        @Override
        public WidgetType convertToEntityAttribute(String dbData) {
            System.err.println("HERE WE ARE.");
            return dbData == null ? null : WidgetType.of(dbData);
        }
    }
}
