package Model;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String username;
    private String content;
    private List<Comment> comments;

    public Post(String username, String content) {
        this.username = username;
        this.content = content;
        this.comments = new ArrayList<Comment>();
    }

    public boolean addComment(Comment comment) {
        return this.comments.add(comment);
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }

    public List<Comment> getComments() {
        return comments;
    }
}