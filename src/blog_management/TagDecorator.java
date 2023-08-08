package blog_management;

// TagDecorator 데코레이터 클래스 -> BlogPost 객체를 감싸 태그 기능을 추가
public class TagDecorator extends BlogPost {
    private String[] tags;

    // 생성자에서 기존 게시물과 태그 배열을 받아 저장
    public TagDecorator(BlogPost post, String[] tags) {
        super(post.getTitle(), post.getContent());
        this.tags = tags;
    }

    // display() 메서드에를 오버라이드 해 기존 게시물의 내용을 출력한 뒤, 태그를 출력
    @Override
    public void display() {
        super.display();
        System.out.print("태그(#): ");
        for (String tag : tags) {
            System.out.print(tag + " ");
        }
        System.out.println();
    }
}
