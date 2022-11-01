package lecture01;

public class hantei {
    String seiseki(int score) {
        if (score >= 90 && score <= 100) {
            return "秀";
        } else if (score >= 80) {
            return "優";
        } else if (score >= 70) {
            return "良";
        } else if (score >= 60) {
            return "可";
        } else {
            return "不可";
        }
    }
}


