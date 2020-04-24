import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    public void validate(String name){
        final String CLASSNAME_REGEX = "^[A-Z]+[0-9_]{4}+[A-Za-z]+$";
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher.matches());
    }
}
