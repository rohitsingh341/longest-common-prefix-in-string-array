package com.rohit.dsa;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] strArr = {"aaa", "aa", "aaa"};
        String[] strArr = {"flower", "flow", "flight"};
        String commonPrefix = getCommonPrefix(strArr);
        System.out.println("Common Prefix -> " + commonPrefix);
    }

    public static String getCommonPrefix(String[] strs) {
        String baseStr = strs[0]; // base string
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];

            for (int j =0; j < s.length() && j < baseStr.length(); j++) {
                if (s.charAt(j) == baseStr.charAt(j))
                    res.append(baseStr.charAt(j));
                else
                    break;
            }
            baseStr = res.toString();
            res.replace(0, res.toString().length(), "");
        }
        return baseStr;
    }

}
