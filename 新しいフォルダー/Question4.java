import java.util.Random;
import java.util.Scanner;

public class Question4 {
    //    １．コンピューターが1から10までのランダムな数字を生成します。
//            ２．ユーザーは数字を入力し、コンピューターが考えた数字を3回の内に当てるゲームです。（for文を使って下さい、
//    ユーザーが1から１０までだけ入力出来るようにして下さい）
//            ３．入力した数字がコンピューターの数字より大きいか小さいかを知らせ、試行が何回が残ってるかを出力します。
//            ４．結果を出力します。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cpu = getCpu();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number 1~10 :");
            int num = 0;
            while (true) {
                num = sc.nextInt();
                if (num>0 && num<11) {
                    break;
                }else{
                    System.out.print("番号は1~10で入力してください");
                }
            }
            if(cpu==num) {
                System.out.println("正解！");
                System.exit(0);
            } else if (cpu<num) {
                System.out.println("残念！もっと小さいです！");
            } else {
                System.out.println("残念！もっと大きいです！");
            }
            System.out.print("あと" + (2-i) + "回です");
        }
        System.out.println("残念！最初は真ん中の数字を入力して範囲を狭めたほうがいいよ！");
    }

    public static int getCpu(){
        Random r = new Random();
        return r.nextInt(10)+1;
    }

}
