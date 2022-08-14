package org.example.one;

public class CommonPrefix {
    public CommonPrefix() {
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder findCommon = new StringBuilder(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < 1) {
                findCommon.replace(0, findCommon.length(), "");
            }
            for (int j = 0; j < strs[i].length(); j++) {
                if ((j == strs[i].length() - 1) && strs[i].length() < findCommon.length()) {
                    findCommon.replace(strs[i].length(), findCommon.length(), "");
                }
                if (findCommon.length() > j) {
                    if (strs[i].charAt(j) != findCommon.charAt(j)) {
                        findCommon.replace(j, findCommon.length(), "");
                    }
                }
            }
        }
        return findCommon.toString();
    }

    // faster solution
    public String fasterlongestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            char tmpChar = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != tmpChar) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
