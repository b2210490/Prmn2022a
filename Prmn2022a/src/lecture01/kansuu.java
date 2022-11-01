package lecture01;

public class kansuu {
    // 最大値求める
    int max(int[] score) {
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }

    // 最小値求める
    int min(int[] score) {
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        return min;
    }

    // 平均値求める
    double average(int[] score) {
        double sum = score[0];
        for (int i = 1; i < score.length; i++) {
            sum += score[i];
        }
        double average = sum / score.length;
        return average;
    }


}
