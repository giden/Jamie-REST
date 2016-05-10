package com.palbecki.app;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("comments")
public class CommentsResource {
    @Inject
    CommentsService commentsService;

    @GET
    @Path("{module}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Comment> getHelloWorldXML(@PathParam("module") String module) {
        return commentsService.comments.stream()
                .filter(c -> c.getModule().equals(module))
                .collect(Collectors.toList());
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Comment newComment(Comment comment)
    {
        return comment;
    }

}
