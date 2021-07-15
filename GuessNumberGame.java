import java.util.Scanner;

public class GuessNumberGame {
    private GuessNumberGame() {

    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        //产生一个随机数
        int number = (int) (Math.random() * 100) + 1;
        //System.out.println(number);
        while (true) {
            //键盘录入数据
            System.out.println("请输入你要猜的数据（1-100）：");
            int guessNumber = sc.nextInt();
            //判断
            if (guessNumber > number) {
                System.out.println("你猜的数据" + guessNumber + "大了");
            } else
            if (guessNumber < number)
            {
                System.out.println("你猜的数据" + guessNumber + "小了");
            } else {
                System.out.println("恭喜您，猜对了");
                break;
            }
        }

    }
}



