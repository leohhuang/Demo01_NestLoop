public class Demo01_01_nine {
    public static void main(String[] args) {
//        tryVersion1(5); //階梯
//        tryVersion2(5); //矩形
//        tryVersion3(5); //偶數列的偶數格空白
        tryVersion4(5); //反向階梯

    }

    private static void tryVersion4(int row) {
        for (int i = 1; i<=row;i++){
            for(int j =1;j<=row-i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }

    private static void tryVersion3(int row) {
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
        System.out.println("=====分隔線=====");
    }

    private static void tryVersion2(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=====分隔線=====");
    }

    private static void tryVersion1(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=====分隔線=====");
    }
}
//ctrl+alt+l 自動排版