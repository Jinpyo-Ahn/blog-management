package blog_management;

// CommentDecorator 데코레이터 클래스 -> BlogPost 객체를 감싸 '댓글' 기능을 추가
public class CommentDecorator extends BlogPost {
    private String comment;

    // 생성자에서 기존 게시물과 댓글을 받아 저장
    public CommentDecorator(BlogPost post, String comment) {
        super(post.getTitle(), post.getContent());
        this.comment = comment;
    }

    // display() 메서드를 오버라이드 해 기존 게시물의 내용을 출력한 뒤, 댓글을 출력
    @Override
    public void display() {
        super.display();
        System.out.println("댓글: " + this.comment);
    }
}
