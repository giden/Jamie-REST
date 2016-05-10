package com.palbecki.app;

import java.util.ArrayList;
import java.util.List;

public class CommentsService {

    List<Comment> comments = new ArrayList<>();
    CommentsService(){
        comments.add(new Comment("treść", "autor", "test"));
    }
}
