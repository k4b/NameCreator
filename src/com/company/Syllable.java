package com.company;

public class Syllable {

    int length;
    String value;
    Type type;

    public enum Type {
        V,
        VC,
        VCC,
        VCCC,
        VCCCC,
        VCCCCC,
        CV, CCV, CCCV,
        CVC, CCVC, CCCVC,
        CVCC, CCVCC, CCCVCC,
        CVCCC, CCVCCC, CCCVCCC,
        CVCCCC, CCVCCCC, CCCVCCCC,
        CVCCCCC, CCVCCCCC, CCCVCCCCC,
    }

    public Syllable (String value) {
        this.value  = value;
        this.length = value.length();
    }

    public Syllable (String value, Type type) {
        this.value  = value;
        this.length = value.length();
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public String getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }
}
