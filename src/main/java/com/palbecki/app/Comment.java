package com.palbecki.app;

public class Comment {

    private String body;
    private String author;
    private String module;

    public Comment(String body, String author, String module){
        this.author = author;
        this.body = body;
        this.module = module;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
