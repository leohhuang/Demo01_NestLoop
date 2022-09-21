import java.util.Scanner;

public class Demo01_01_nine {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("請輸入列數:");
        int rowNum = Integer.parseInt(userInput.nextLine());

        tryVersion1(rowNum); //階梯
        tryVersion2(rowNum); //矩形
        tryVersion3(rowNum); //偶數列的偶數格空白
        tryVersion4(rowNum); //反向階梯
    }

    private static void tryVersion4(int row) {
        System.out.println("=====Version4:偶數列的偶數格空白=====");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = row - i; k < row; k++) {
                System.out.print("*");
            }
            if (i < row) {  //避免印出多餘的空白行
                System.out.println();
            }
        }
    }

    private static void tryVersion3(int row) {
        System.out.println("=====Version3:偶數列的偶數格空白=====");
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void tryVersion2(int row) {
        System.out.println("=====Version2:矩形=====");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void tryVersion1(int row) {
        System.out.println("=====Version1：階梯=====");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Windows Intellij 的自動排版快捷鍵：ctrl+alt+l