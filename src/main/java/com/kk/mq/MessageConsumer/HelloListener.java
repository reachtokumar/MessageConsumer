package com.kk.mq.MessageConsumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloBinding.class)
public class HelloListener {
    @StreamListener(target = HelloBinding.GREETING)
    public void processHelloSignal(String msg){
        System.out.println(msg);
    }
}
