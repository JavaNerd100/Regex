package NamedCaptureGroups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamedCaptureGroups {
    public static void main(String[] args) {
        String phoneNumber = "+91 7247-522473";

        //([+][91]{2}){3}[\\s]\\d{4}[-]\\d{6}

        String numberRegex = "(?:(?<indiaCode>[[+]91]{3})[\\s]?)(?:(?<operatorCode>\\d{4})[-\\s]?)(?<subscriberCode>\\d{6})";

        Pattern phoneNumberRegex = Pattern.compile(numberRegex);
        Matcher matcher =phoneNumberRegex.matcher(phoneNumber);

        if (matcher.matches()){
            System.out.format("India code : %s \n",matcher.group("indiaCode"));
            System.out.format("Operator code : %s \n",matcher.group("operatorCode"));
            System.out.format("Subscriber code : %s \n",matcher.group("subscriberCode"));
        }


    }
}
