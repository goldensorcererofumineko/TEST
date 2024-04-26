import java.util.Scanner;

public class Question3 {
//    １．ユーザーから文字列を入力してもらいます。
//            ２．入力された文字列を逆順に出力します。
//            （String reverse = new StringBuilder(sentence).reverse().toString();　を利用したら逆順が出来ます）
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字を入力してね：");
        String s = sc.nextLine();
        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println("鏡の世界へようこそ！");
        System.out.println();
        System.out.println(reverse);
    }
}
