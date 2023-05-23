package com.epam.utils;

import static org.apache.commons.lang3.StringUtils.*;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        str = remove(str,'.');
        return isNumeric(str) && str.matches("[1-9]\\d+") && Double.parseDouble(str) > 0;
    }
}
