public class Condicionais {
    public static void main(String[] args) throws Exception {
        // calculando nota do semestre
        int av1 = 10;
        int av2 = 5;
        int avd = 5;
        double media = (av1 + av2 + avd) / 3;

        if (av1 >= 4 && av2 >= 4 && avd >= 4) {
            System.out.printf("Sua média foi: %.2f %n", (media));
        } else {
            System.out.println("Não aprovado! Você precisa tirar uma nota acima de 4 pontos.");
        }

        // ##############################

        int mediaAluno = 70;

        if (mediaAluno >= 70) {
            System.out.println("Parabéns você está aprovado!");
        } else if (mediaAluno >= 40 && mediaAluno <= 69) {
            System.out.println("Aluno em recuperação: " + mediaAluno + ".");
        } else {
            System.out.println("Aluno reprovado: " + mediaAluno + ".");
        }

        // ##############################

    }
}
