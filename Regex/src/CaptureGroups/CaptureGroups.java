package CaptureGroups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {

    public static void main(String[] args) {

        String phoneNumber = "+91 7247-522473";

        //([+][91]{2}){3}[\\s]\\d{4}[-]\\d{6}

        String numberRegex = "(([[+]91]{3})[\\s]?)((\\d{4})[-\\s]?)(\\d{6})";
        /**
         * Pattern class constructor is either private or protected that's why we can't
         * create instance of this class, and it is not accessible to us.Instead of this
         * we call pattern and there's a static method on pattern class called compile.
         * Compile method used for compiling/translating regex into more efficient form i.e
         * used by the computer, but it is considered to be an expensive operation.
         */
        Pattern phoneNumberRegex = Pattern.compile(numberRegex);
        /**
         * Matcher is an actual engine that done the matching with regex.
         * To create a matcher from the pattern hence pattern give birth to a matcher
         */
        Matcher matcher =phoneNumberRegex.matcher(phoneNumber);

        if (matcher.matches()){
            System.out.printf("India code : %s \n",matcher.group(2));
            System.out.printf("Operator code : %s \n",matcher.group(4));
            System.out.printf("Subscriber code : %s \n",matcher.group(5));
        }



    }
}
