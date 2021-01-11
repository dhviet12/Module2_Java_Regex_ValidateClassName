import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASSNAME_REGEX="^[CAP][0-9]{4}[GHIKLM]$";

    public ClassName() {
    }
    public boolean validate(String regex){
        pattern = Pattern.compile(CLASSNAME_REGEX);
        matcher = pattern.matcher(regex);
        return  matcher.matches();
    }
}
