package blog_management;

import blog_management.addition.CommentDecorator;
import blog_management.addition.LikeDecorator;
import blog_management.addition.TagDecorator;

// BlogPostFactory 클래스 -> 게시물 객체를 생성하는 역할
public class BlogPostFactory {

    /**
     *      creatPost() 메서드
     *      개선된 switch 문으로 변경
     *      게시물의 종류(postType)와 제목, 내용을 입력받아
     *      해당 종류에 맞는 게시물 객체를 생성 후 반환
     *      만약 '사진 게시물' 타입의 게시물이면, TagDecorator로 감싸져 객체가 생성
     */
    public BlogPost createPost(final String postType, final String title, final String content) {
        return switch (postType) {
            case "text" -> new BlogPost(title, content);
            case "text_with_likes" -> new LikeDecorator(new BlogPost(title, content), 11);
            case "image" -> new TagDecorator(new BlogPost(title, content), new String[]{"토토로"});
            case "video" -> new CommentDecorator(new BlogPost(title, content), "영상 화질이 좋습니다!!");
            default -> throw new IllegalArgumentException("Invalid post type");
        };
    }
}
