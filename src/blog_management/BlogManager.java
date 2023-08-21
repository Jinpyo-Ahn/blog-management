package blog_management;
import blog_management.post_delete.AddPostCommand;
import blog_management.post_delete.Command;
import blog_management.post_delete.DeletePostCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlogManager {

    // 게시물들을 배열로 관리하기 위해 리스트 객체 할당
    final List<BlogPost> posts = new ArrayList<>();
    final Scanner scanner = new Scanner(System.in);

    public void addPostFromUserInput() {
        try {
            System.out.println("게시물 종류를 입력하세요 (text, text_with_likes, image, video):");
            String postType = scanner.nextLine();

            switch (postType) {
                case "text", "text_with_likes", "image", "video" -> {
                    System.out.println("게시물 제목을 입력하세요:");
                    String title = scanner.nextLine();

                    System.out.println("게시물 내용을 입력하세요:");
                    String content = scanner.nextLine();

                    BlogPostFactory postFactory = new BlogPostFactory();
                    BlogPost post = postFactory.createPost(postType, title, content);

                    System.out.println("게시물이 추가되었습니다.");

                    Command addCommand = new AddPostCommand(this, post);
                    executeCommand(addCommand);
                }
                default -> System.out.println("올바르지 않은 게시물 종류입니다.");
            }
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다. 다시 입력해주세요.");
        }
    }

    public void deletePostByTitle() {
        System.out.println("삭제할 게시물 제목을 입력하세요:");
        String titleToDelete = scanner.nextLine();

        BlogPost postToDelete = posts.stream()
                .filter(post -> post.getTitle().equals(titleToDelete))
                .findFirst()
                .orElse(null);

        if (postToDelete != null) {
            Command deleteCommand = new DeletePostCommand(this, postToDelete);
            executeCommand(deleteCommand);
        } else {
            System.out.println("해당 제목의 게시물을 찾을 수 없습니다.");
        }
    }

    // 게시물 제거를 위한 메서드
    public void removePost(final BlogPost post) {
        posts.remove(post);
    }

    public void addPost(BlogPost post) {
        posts.add(post);
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
