package blog_management;

import java.util.Scanner;

public class BlogManagementTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlogManager blogManager = new BlogManager();

        boolean exit = false;

        while (!exit) {
            System.out.println("원하는 작업을 선택하세요:");
            System.out.println("1. 게시물 추가");
            System.out.println("2. 게시물 삭제");
            System.out.println("3. 모든 게시물 조회");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1 -> blogManager.addPostFromUserInput();
                case 2 -> blogManager.deletePostByTitle();
                case 3 -> blogManager.displayAllPosts();
                case 4 -> {
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                }
                default -> System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }

        scanner.close();
    }
}


