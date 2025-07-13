package com.patterns.behavioral.service.observer.jdk;

import com.patterns.behavioral.domain.observer.Fruit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Observable;
import java.util.Observer;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService, Observer {
    @Override
    public void sendMessage(Fruit fruit) {
        log.info("Sending message about placing the {} fruit into storage.", fruit);
    }

    @Override
    public void update(Observable o, Object arg) {
        sendMessage((Fruit) arg);
    }
}
