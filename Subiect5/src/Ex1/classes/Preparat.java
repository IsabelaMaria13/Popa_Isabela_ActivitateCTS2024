package Ex1.classes;

public class Preparat {
    private String nume;
    private int timp;
    private int grade;

    public Preparat(String nume, int timp, int grade) {
        this.nume = nume;
        this.timp = timp;
        this.grade = grade;
    }

    public String getNume() {
        return nume;
    }

    public int getTimp() {
        return timp;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "nume='" + nume + '\'' +
                ", timp=" + timp +
                ", grade=" + grade +
                '}';
    }
}
