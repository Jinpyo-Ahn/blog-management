package blog_management.post_add_delete;

import blog_management.BlogManager;
import blog_management.BlogPost;

public class AddPostCommand implements Command{
    final BlogManager blogManager;
    final BlogPost postToAdd;

    public AddPostCommand(BlogManager blogManager, BlogPost postToAdd) {
        this.blogManager = blogManager;
        this.postToAdd = postToAdd;
    }

    /**
     *      execute 메서드 오버라이드
     *      '게시물 추가 작업' 실행에 대해 캡슐화
     */
    @Override
    public void execute() {
        blogManager.addPost(postToAdd);
    }
}
