import java.util.Scanner;

public class run {

    public static void main(String args[]) {
        Application A = new Application();
        Scanner reader = new Scanner(System.in);
        Paper[] papers = new Paper[10];
        for (int i = 0; i < 10; i++) {
            papers[i] = new Paper();
        }
        float[] score = new float[10];
        for (int i = 0; i < 10; i++) {
            papers[i].setName(i + "stu");
        }
        for (int i = 0; i < 10; i++) {
            float s = reader.nextFloat();
            if (s >= 0 && s <= 100) {
                papers[i].setSocre(s);
                score[i] = s;
            } else {
                i -= 1;
                System.out.println("请输入正确的成绩！");
                continue;
            }
        }
        A.show(A.getAverage(score), A.getMaxMin(score), A.selectScore(score));
    }
}
