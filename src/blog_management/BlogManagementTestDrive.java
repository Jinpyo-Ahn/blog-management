package blog_management;

public class BlogManagementTestDrive {
    public static void main(String[] args) {
        // 팩토리 객체 생성
        BlogPostFactory postFactory = new BlogPostFactory();

        // 게시물 객체 생성
        BlogPost textPost = postFactory.createPost("기본 게시물", "바람의 계곡 나우시카", "영화 바람 계곡 나우시카의 줄거리입니다.");
        BlogPost imagePost = postFactory.createPost("사진 게시물", "토토로의 귀여운 사진", "영화 토토로에 나온 토토로의 귀여운 사진 모음입니다.");
        BlogPost videoPost = postFactory.createPost("영상 게시물", "지브리 영화 추천", "지브리 영화들 중 제가 추천하는 영화 영상입니다.");

        // 게시물 출력
        System.out.println("기본 게시물");
        textPost.display();

        System.out.println("-------------------------");

        System.out.println("사진 게시물");
        imagePost.display();

        System.out.println("-------------------------");

        System.out.println("영상 게시물");
        videoPost.display();
    }
}
