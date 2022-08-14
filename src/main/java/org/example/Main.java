package org.example;

import org.example.one.CommonPrefix;
import org.example.one.RamsonNote;

public class Main {
    public static void main(String[] args) {
        RamsonNote test = new RamsonNote();
        System.out.println(test.canConstruct("aa", "aab"));
    }
}