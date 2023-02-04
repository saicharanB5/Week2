package dxc;

public class Regular_exp2 {
    public static boolean checkWebAddressValidity(String webAddress) {
        String pattern = "^(https?)://(www\\.)?[a-zA-Z0-9]+\\.[a-zA-Z]+((\\.[a-zA-Z]{2,3})|(\\.[a-zA-Z]{2}\\.[a-zA-Z]{2}))$";
        return webAddress.matches(pattern);
    }

    public static void main(String[] args) {
        String webAddress = "http://www.company.com";
        System.out.println("The web address is " + (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
    }
}
