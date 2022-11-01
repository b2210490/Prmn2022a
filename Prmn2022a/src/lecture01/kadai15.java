package lecture01;

public class kadai15 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};

        hantei seiseki = new hantei();
        for (int i = 0; i < score.length; i++) {
            String a = seiseki.seiseki(score[i]);
            System.out.println(i +"番 " + score[i] + "点 " + a);
        }

        kansuu comp = new kansuu();
        int x = comp.max(score);
        int y = comp.min(score);
        double z = comp.average(score);

        System.out.println("最高点:" + x + "点");
        System.out.println("最低点:" + y + "点");
        System.out.println("平均点:" + z + "点");
    }
}
