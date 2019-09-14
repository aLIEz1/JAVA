import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Application {
    public float getAverage(float[] a) {
        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public float[] getMaxMin(float[] a) {
        float max = a[0];
        float min = a[0];
        float m[] = new float[2];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }

        }
        m[0] = min;
        m[1] = max;
        return m;
    }

    public int[] selectScore(float[] a) {
        int r[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 60) {
                r[0] += 1;
            } else if (a[i] < 70) {
                r[1] += 1;
            } else if (a[i] < 80) {
                r[2] += 1;
            } else if (a[i] < 90) {
                r[3] += 1;
            } else {
                r[4] += 1;
            }
        }
        return r;
    }

    public void show(float s, float[] a, int[] r) {
        System.out.println("平均分：" + s);
        float min = a[0];
        float max = a[1];
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("最低分：" + df.format(min));
        System.out.println("最高分：" + df.format(max));
        NumberFormat nt = NumberFormat.getPercentInstance();
        nt.setMinimumFractionDigits(1);
        System.out.println("不及格人数：" + r[0] + "  " + nt.format(((float) r[0] / 10)));
        System.out.println("60-70人数：" + r[1] + "  " + nt.format(((float) r[1] / 10)));
        System.out.println("70-80人数：" + r[2] + "  " + nt.format(((float) r[2] / 10)));
        System.out.println("80-90人数：" + r[3] + "  " + nt.format(((float) r[3] / 10)));
        System.out.println("90-100人数：" + r[4] + "  " + nt.format(((float) r[4] / 10)));
    }
}
