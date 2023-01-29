package com.strategy.design.pattern;

import org.springframework.stereotype.Service;

@Service
public class SHA1Encrypter implements Encrypter{
    @Override
    public void encrypt() {
        System.out.println("Encrypting using SHA1");
    }

    @Override
    public EncryptionEnum getEncryptionType() {
        return EncryptionEnum.SHA1;
    }
}
