package blog_management.post_delete;

import blog_management.BlogManager;
import blog_management.BlogPost;

public class AddPostCommand implements Command{
    final BlogManager blogManager;
    final BlogPost postToAdd;

    public AddPostCommand(BlogManager blogManager, BlogPost postToAdd) {
        this.blogManager = blogManager;
        this.postToAdd = postToAdd;
    }

    @Override
    public void execute() {
        blogManager.addPost(postToAdd);
    }
}
