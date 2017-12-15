package com.company;

public class Main {

    public static void main(String[] args) {
	    SyllableGenerator sg = new SyllableGenerator();
	    NameGenerator ng = new NameGenerator(sg.getSyllables());
    }
}
