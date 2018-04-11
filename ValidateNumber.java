import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
    private static final String NUMBER_REGEX = "^[(][0-9]{2}[)]-[(][0][0-9]{9}[)]";

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static ValidateNumber validateNumber;

    public static final String[] Number = new String [] {"(84)-(0978489648)","(a8)-(22222222)"};

    public static void main(String[] args) {
        validateNumber = new ValidateNumber();
        for (String number : Number ){
            boolean isvalid = validateNumber.validate(number);
            System.out.println("ClassName is " + number +"is valid: "+ isvalid);
        }
    }
}
