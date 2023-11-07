package org.ebac;

import org.ebac.aulas.ExercicioModulo6;
import org.ebac.aulas.MediaNotas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Cria a instância das notas e adicione as notas nela. */
        List<Integer> notas = new ArrayList<>();
        notas.add(10);
        notas.add(8);
        notas.add(7);
        notas.add(5);
        notas.add(1);

        /* Cria a instância da classe 'MediaNotas' e imprime o retorno do 'calcularMedia' */
        MediaNotas notasAluno = new MediaNotas(notas);
        System.out.println(notasAluno.calcularMedia());
        System.out.println(notasAluno.alunoFoiAprovado());

    }
}