package blog_management.post_save_delete;

import blog_management.BlogManager;
import blog_management.BlogPost;

public class SaveCommand implements Command {
    final BlogManager blogManager;
    final BlogPost post;

    public SaveCommand(BlogManager blogManager, BlogPost post) {
        this.blogManager = blogManager;
        this.post = post;
    }

    // execute 메서드 오버라이드
    // '게시물 저장 작업' 실행에 대해 캡슐화
    @Override
    public void execute() {
        blogManager.addPost(post);
        System.out.println("저장된 게시물: " + post.getTitle() + "(저장된 게시물을 확인할 수 있게 한번 더 출력합니다.)");
    }
}
