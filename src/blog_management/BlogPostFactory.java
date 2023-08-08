package blog_management;

// BlogPostFactory 클래스 -> 게시물 객체를 생성하는 역할
public class BlogPostFactory {
    // creatPost() 메서드
    // 게시물의 종류(postType)와 제목, 내용을 입력받아
    // 해당 종류에 맞는 게시물 객체를 생성
    // 만약 image 타입의 게시물이면, TagDecorator로 감싸져 객체가 생성
    public BlogPost createPost(String postType, String title, String content) {
        if ("기본 게시물".equals(postType)) {
            return new BlogPost(title, content);
        } else if ("사진 게시물".equals(postType)) {
            return new TagDecorator(new BlogPost(title, content), new String[]{"토토로"});
        } else if ("영상 게시물".equals(postType)) {
            return new CommentDecorator(new BlogPost(title, content), "영상이 저에게 많은 도움이 되었습니다.");
        } else {
            throw new IllegalArgumentException("올바르지 않은 타입입니다.");
        }
    }
}
