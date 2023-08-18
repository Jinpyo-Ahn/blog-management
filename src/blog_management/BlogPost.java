package blog_management;

public class BlogPost {
    final String title;
    final String content;

    // 생성자를 통해 게시물의 제목과 내용을 받아 저장
    public BlogPost(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // display() 메서드를 호출해 게시물의 제목과 내용을 출력
    public void display() {
        System.out.println("제목: " + this.title);
        System.out.println("내용: " + this.content);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
