package com.payroll.payroll.entity;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Table(name = "turma")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_turma")
    private Long idTurma;

    private Timestamp horario;

    private Integer duracao;

    @ManyToOne
    @JoinColumn(name = "instrutor_id", referencedColumnName = "id_instrutor")
    private Instrutor instrutor;
}