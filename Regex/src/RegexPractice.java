public class RegexPractice {
    public static void main(String[] args) {
        String phoneNumber = "+91 7247-522473";

        //([+][91]{2}){3}[\\s]\\d{4}[-]\\d{6}

        System.out.println(phoneNumber.matches("(([[+]91]{3})[\\s]?)((\\d{4})[-\\s]?)(\\d{6})"));
    }
}