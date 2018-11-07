package com.zju.cst.simplefitserver.event.listener;

import com.zju.cst.simplefitserver.event.MsgEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MsgLisenter implements ApplicationListener<MsgEvent> {
    @Override
    public void onApplicationEvent(MsgEvent msgEvent) {

        String eventType = (String)msgEvent.getSource();
        System.out.println(eventType);

    }
}
