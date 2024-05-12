package com.payroll.payroll.Turma;

import com.payroll.payroll.entity.Turma;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(name = "/turma")
@RequiredArgsConstructor
@AllArgsConstructor
public class TurmaController {
    private TurmaService turmaService;

    @GetMapping("/{id}")
    public ResponseEntity<Turma> findById(@PathVariable Integer id) {
        return turmaService.findById(id)
                .map(turma -> ResponseEntity.ok().body(turma))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Turma save(@RequestBody Turma turma) {
        return turmaService.save(turma);
    }
}
