package View;

import Model.Comment;
import Model.Post;

public class PostView {
    public void printPostDetails(Post post) {
        System.out.println(post.getUsername() + " posted : " + post.getContent());

        var comments = post.getComments();
        System.out.println("number of comments : " + comments.size());
        for (Comment comment : comments) {
            System.out.println(comment.getUsername() + " commented : " + comment.getContent());
        }
    }
}