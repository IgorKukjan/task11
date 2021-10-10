package by.task.kukjan.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {
    public static final String REGEX_NUMERIC_String = "^-?(\\d)+((\\s)+-?(\\d)+)*$";
    public boolean isValidate(String str){
        Pattern pattern = Pattern.compile(REGEX_NUMERIC_String);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
