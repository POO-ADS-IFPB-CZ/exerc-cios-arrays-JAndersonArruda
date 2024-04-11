import model.Aluno;

public class Main {
    public static void calculateApproved(Aluno alunos[]) {
        int approved = 0;
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() >= 70) approved ++;
            System.out.println("Aluno "+aluno.getRegister()+": "+aluno.calcularMedia());
        }

        System.out.println("\nAprovados por Média: "+approved);
        System.out.println("Inferiores a 70: "+(10 - approved));
    }

    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[10];
        alunos[0] = new Aluno(11111111, 100, 90, 87, 92);
        alunos[1] = new Aluno(22222222, 90, 78, 82, 90);
        alunos[2] = new Aluno(33333333, 84, 80, 50, 100);
        alunos[3] = new Aluno(44444444, 93, 79, 41, 67);
        alunos[4] = new Aluno(55555555, 29, 50, 70, 66);
        alunos[5] = new Aluno(66666666, 64, 70, 66, 50);
        alunos[6] = new Aluno(77777777, 84, 72, 39, 60);
        alunos[7] = new Aluno(88888888, 69, 57, 80, 66);
        alunos[8] = new Aluno(99999999, 90, 100, 79, 85);
        alunos[9] = new Aluno(21111111, 100, 100, 100, 100);

        calculateApproved(alunos);
    }
}