package blog_management;
import blog_management.post_save_delete.Command;

import java.util.ArrayList;
import java.util.List;

public class BlogManager {

    // 게시물들을 배열로 관리하기 위해 리스트 객체 할당
    final List<BlogPost> posts = new ArrayList<>();

    // 게시물 저장을 위한 메서드
    public void addPost(final BlogPost post) {
        posts.add(post);
    }

    // 게시물 제거를 위한 메서드
    public void removePost(final BlogPost post) {
        posts.remove(post);
    }

    // posts 배열에 저장된 게시물들의 내용을 출력
    public void displayAllPosts() {
        for (BlogPost post : posts) {
            post.display();
            System.out.println("-------------------------");
        }
    }

    // 커맨드 객체를 받아 실행을 요청하는 메서드
    public void executeCommand(final Command command) {
        command.execute();
    }
}
