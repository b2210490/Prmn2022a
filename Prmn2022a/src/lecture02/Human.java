package lecture02;

public class Human {
    String name;
    int age;

        Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
    void print() {
            String x;
            if (age <= 18) {
                x = "生徒:";
            } else if (age <= 22) {
                x = "学生:";
            } else {
                x = "";
            }
        System.out.println(x + name + " " + age + "歳です。");
    }
}
