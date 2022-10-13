package com.up42.coding.challenge.utils;

import java.util.Base64;

public class FeaturesUtil {
    public static byte[] convertBase64ToByteArray(String base64) {
        return Base64.getDecoder().decode(base64);
    }
}
