package com.patterns.behavioral.service.observer.custom;

import com.patterns.behavioral.domain.observer.Fruit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyMessageServiceImpl implements MyMessageService, Observer<Fruit> {
    @Override
    public void sendMessage(Fruit fruit) {
        log.info("Sending message about placing the {} fruit into storage.", fruit);
    }

    @Override
    public void update(Fruit object) {
        sendMessage(object);
    }
}
