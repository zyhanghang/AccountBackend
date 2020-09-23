package com.zyhang.utils;

import java.util.regex.Pattern;

/**
 * @author zyhang
 * @create 2020-09-22 9:58 PM
 */
public class RegisterUtils {

    public static final String PASSWORD_REGEX = "(?=.*([a-zA-Z].*))(?=.*[0-9].*)[a-zA-Z0-9-*/+.~!@#$%^&*()]{6,20}$";
    public static final String EMAIL_REGEX = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    public static final String DATE_REGEX = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";

    public static boolean isValidUsername(String username) {
        if (username == null || username.length() < 5 || username.length() > 12) {
            return false;
        }
        // first char must be letter
        if (!Character.isLetter(username.charAt(0))) {
            return false;
        }
        for (int i = 1; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidPassword(String password) {
        if (Pattern.matches(PASSWORD_REGEX, password)) {
            return true;
        }
        return false;
    }

    public static boolean isValidEmail(String email) {
        if (Pattern.matches(EMAIL_REGEX, email)) {
            return true;
        }
        return false;
    }

    public static boolean isValidBirthday(String birthday) {
        // check if the format is yyyy-MM-dd and the date right (except for leap year)
        if (!Pattern.matches(DATE_REGEX, birthday)) {
            return false;
        }
        return true;
//        String[] strs = birthday.split("-");
//        String yearStr = strs[0];
//        String monthStr = strs[1];
//        String dayStr = strs[2];
//        Integer year = null;
//        Integer month = null;
//        Integer day = null;
//        if (yearStr != null && monthStr != null && dayStr != null) {
//            year = Integer.valueOf(yearStr);
//            month = Integer.valueOf(monthStr);
//            day = Integer.valueOf(dayStr);
//        }
//        System.out.println("month is: " + month);
//        if (year != null && month != null && day != null) {
//            if (year % 400 == 0 || (year % 4 == 0 && year % 100 == 0)) {  //leap year
//                if (month == 2) {
//                    return day == 29;
//                }
//            }
//        }
//        return true;
    }

    public static boolean isValidGender(String gender) {
        if (gender != null) {
            return gender.equals("Male") || gender.equals("Female");
        }
        return false;
    }
}
