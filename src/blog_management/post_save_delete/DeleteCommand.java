package blog_management.post_save_delete;

import blog_management.BlogManager;
import blog_management.BlogPost;

public class DeleteCommand implements Command {
    final BlogManager blogManager;
    final BlogPost post;

    public DeleteCommand(BlogManager blogManager, BlogPost post) {
        this.blogManager = blogManager;
        this.post = post;
    }

    /**
     *      execute 메서드 오버라이드
     *      '게시물 삭제 작업' 실행에 대해 캡슐화
     */
    @Override
    public void execute() {
        blogManager.removePost(post);
        System.out.println("삭제된 게시물: " + post.getTitle());
    }
}
