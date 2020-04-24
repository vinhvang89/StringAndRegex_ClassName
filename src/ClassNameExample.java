import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    public void validate(String name){
        final String CLASSNAME_REGEX = "^[A-Z]+[A-Za-z0-9_]+$";
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher.matches());
    }
}
