package com.pablovass.online_store;

public class Greeting {
private Long id;
private  String messages;

    public Greeting(Long id, String messages) {
        this.id = id;
        this.messages = messages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
