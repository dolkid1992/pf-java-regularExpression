import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASSNAME_REGEX = "^[CAP]{1}+[0-9]{4}+[GHIKLM]{1}$";

    public ValidateClassName(){}

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static ValidateClassName validateClassName;

    public static final String[] ClassName = new String [] {"A9384M","P0093S","A@342P","C00000G","P0021M","As221H"};

    public static void main(String[] args) {
        validateClassName = new ValidateClassName();
        for (String classname : ClassName ){
            boolean isvalid = validateClassName.validate(classname);
            System.out.println("ClassName is " + classname +"is valid: "+ isvalid);
        }
    }
}
