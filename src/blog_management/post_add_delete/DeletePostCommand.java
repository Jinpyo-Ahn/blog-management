package blog_management.post_add_delete;

import blog_management.BlogManager;
import blog_management.BlogPost;

public class DeletePostCommand implements Command {
    final BlogManager blogManager;
    final BlogPost postToDelete;

    public DeletePostCommand(BlogManager blogManager, BlogPost postToDelete) {
        this.blogManager = blogManager;
        this.postToDelete = postToDelete;
    }

    /**
     *      execute 메서드 오버라이드
     *      '게시물 삭제 작업' 실행에 대해 캡슐화
     */
    @Override
    public void execute() {
        blogManager.removePost(postToDelete);
        System.out.println("삭제된 게시물: " + postToDelete.getTitle());
    }
}
