package com.strategy.design.pattern;

import org.springframework.stereotype.Service;

@Service
public class SHA2Encrypter implements Encrypter{
    @Override
    public void encrypt() {
        System.out.println("Encrypting using SHA2");
    }

    @Override
    public EncryptionEnum getEncryptionType() {
        return EncryptionEnum.SHA2;
    }

}
