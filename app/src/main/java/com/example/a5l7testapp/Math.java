package com.example.a5l7testapp;

public class Math {
    public String add(String a, String b) {
        String result;
        if (a == null || b == null) {
            result = "Error";
        } else if (a.contains(".") || b.contains(".")) {
            result = "Only whole numbers";
        } else if (a.contains(" ") || b.contains(" ")) {
            result = "Couldn't do with space";
        } else if (isNumeric(a) && isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            if (num1 < 0 || num2 < 0) {
                result = "Shouldn't be negative";
            } else {
                result = String.valueOf(num1 + num2);
            }
        } else {
            result = "You couldn't add the letters";
        }
        return result;
    }


    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public int divide(int a,int b){
        if (b == 0){
            throw new IllegalArgumentException("Couldn't divide to 0");
        }
        return a/b;
    }
}
