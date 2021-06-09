package builders;

import java.util.Date;
import org.jbehave.core.steps.ParameterConverters.DateConverter;

public class DateCreator {
    // Método para la conversion de un String a Date con ayuda de DateConverter
    public static Date date(String dateString) {
        DateConverter dateConverter = new DateConverter();
        Date date = (Date) dateConverter.convertValue(dateString, Date.class);
        return date;
    }
}
