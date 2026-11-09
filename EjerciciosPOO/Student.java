public class Student {
    private byte score;

    public Student(byte score) {
        this.score = score;
    }

    public void showResult() {
        if (this.score >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }
}