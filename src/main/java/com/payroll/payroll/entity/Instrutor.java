package com.payroll.payroll.entity;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "instrutor")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Instrutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_instrutor")
    private Long idInstrutor;

    private Integer rg;

    @Column(length = 55)
    private String nome;

    private Date nascimento;

    private Integer titulacao;

    @OneToMany(mappedBy = "instrutor")
    private Set<Turma> turmas;
}