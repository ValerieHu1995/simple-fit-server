package com.zju.cst.simplefitserver.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

public class MsgEvent extends ApplicationEvent {

    private  static  final  long serialVersionUID = 1L;

    private   String text;
    private   String uid;
    private   String msgId;
    private   int    isRead;


    /*
        MsgEvent("read",msgId)
     */
    public MsgEvent(Object source, String msgId){
        super(source);
        if(!("read").equals((String)source))
            return;

        this.uid = uid;
    }
    /*

        MsgEvent("put",uid,text)

     */
    public MsgEvent(Object source, String msgId, String text){

        super(source);
        if(!("put").equals((String)source))
            return;
        this.text = text;
        this.msgId=msgId;

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public int getIsRead() {
        return isRead;
    }

    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }
}
