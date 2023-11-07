package org.ebac.aulas;

import java.util.List;

public class MediaNotas {

    private final List<Integer> notasAluno;

    public MediaNotas(List<Integer> notasAluno) {
        this.notasAluno = notasAluno;
    }

    public Integer calcularMedia() {

        int totalSomaNotas = 0;

        for (int nota : notasAluno) {
            totalSomaNotas += nota;
        }

        return totalSomaNotas / notasAluno.size();
    }

    public String alunoFoiAprovado() {

        int mediaNota = this.calcularMedia();

        if (mediaNota >= 7) {
            return "Aluno aprovado;";

        } else if (mediaNota >= 5) {
            return "Aluno em recuperação;";
        } else {
            return "Aluno Reprovado;";
        }
    }

}
