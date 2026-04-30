import Controller.FacebookController;
import Model.Post;
import View.PostView;

public class App {
    public static void main(String[] args) throws Exception {

        Post model = retrivePostFromDatabase();
        PostView view = new PostView();
        FacebookController controller = new FacebookController(model, view);

        controller.updateView();

        controller.addComment("Omar", "widsom :D");

        controller.updateView();
    }

    private static Post retrivePostFromDatabase() {
        return new Post("Hassan", "YOLO!");
    }
}
