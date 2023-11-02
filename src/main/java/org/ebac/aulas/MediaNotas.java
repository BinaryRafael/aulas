package org.ebac.aulas;

import java.util.List;

public class MediaNotas {

    private final List<Integer> notasAluno;

    public MediaNotas(List<Integer> notasAluno){
        this.notasAluno = notasAluno;
    }

    public Integer calcularMedia(){
        
        int totalSomaNotas = 0;

        for (int nota : notasAluno){
            totalSomaNotas += nota;
        }

        return totalSomaNotas / notasAluno.size();
    }

}
