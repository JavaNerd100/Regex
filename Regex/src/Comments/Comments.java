package Comments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comments {
    public static void main(String[] args) {
        String phoneNumber = "+91 7247-522473";

        //([+][91]{2}){3}[\\s]\\d{4}[-]\\d{6}

        String numberRegex = """
                             #This is my regex to parse the parts of a phone number
                             (?:(?<indiaCode>[[+]91]{3})[\\s]?) # Get's India code
                             (?:(?<operatorCode>\\d{4})[-\\s]?) # Get's Operator code
                             (?<subscriberCode>\\d{6}) # Get's subscriber code
                             """    ;
        //Using comments mode of regex engine putting a space it would ignore the spaces.
        Pattern phoneNumberRegex = Pattern.compile(numberRegex,Pattern.COMMENTS);
        Matcher matcher =phoneNumberRegex.matcher(phoneNumber);

        if (matcher.matches()){
            System.out.format("India code : %s \n",matcher.group("indiaCode"));
            System.out.format("Operator code : %s \n",matcher.group("operatorCode"));
            System.out.format("Subscriber code : %s \n",matcher.group("subscriberCode"));
        }
    }
}
