package com.payroll.payroll.Turma;

import com.payroll.payroll.entity.Turma;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
class TurmaService {
    private TurmaRepository turmaRepository;


    public Optional<Turma> findById(Integer id) {
        return turmaRepository.findById((id));
    }

    public Turma save(Turma turma) {
        return turmaRepository.save(turma);
    }
}
