package com.strategy.design.pattern;

import org.springframework.stereotype.Service;

@Service
public class MD5Encrypter implements Encrypter{


    @Override
    public void encrypt() {
        System.out.println("Encryption using MD5");
    }

    @Override
    public EncryptionEnum getEncryptionType() {
        return EncryptionEnum.MD5;
    }
}
