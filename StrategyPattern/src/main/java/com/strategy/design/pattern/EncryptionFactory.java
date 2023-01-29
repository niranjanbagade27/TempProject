package com.strategy.design.pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class EncryptionFactory {
    Map<EncryptionEnum, Encrypter> map;
    @Autowired
    EncryptionFactory(Set<Encrypter> algorithms){
        map = new HashMap<>();
        algorithms.stream().forEach(algo -> map.put(algo.getEncryptionType(), algo));
    }
    public Encrypter getEncryptionType(EncryptionEnum type){
        return map.get(type);
    }
}
