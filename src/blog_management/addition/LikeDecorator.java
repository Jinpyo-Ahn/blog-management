package blog_management.addition;


import blog_management.BlogPost;

/**
 * LikeDecorator 데코레이터 클래스
 * BlogPost 객체를 감싸 '좋아요' 기능을 추가
 */
public class LikeDecorator extends BlogPost {
    private int likes;

    /**
     * 생성자에서 게시물의 기존 정보(제목, 내용)와 좋아요 정보(수)를 받아 인스턴스를 초기화
     */
    public LikeDecorator(BlogPost post, int likes) {
        super(post.getTitle(), post.getContent());
        this.likes = likes;
    }


    /**
     * display() 메서드를 오버라이드하여 기존 게시물의 정보를 출력한 뒤,
     * 좋아요 정보를 출력
     */
    @Override
    public void display() {
        super.display();
        System.out.println("좋아요: " + likes);
    }
}
