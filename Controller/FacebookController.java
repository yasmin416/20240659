package Controller;

import Model.Comment;
import Model.Post;
import View.PostView;

public class FacebookController {
    private Post model;
    private PostView view;

    public FacebookController(Post model, PostView view) {
        this.model = model;
        this.view = view;
    }

    public void addComment(String username, String content) {
        model.addComment(new Comment(username, content));
    }

    public void updateView() {
        view.printPostDetails(model);
    }
}



