package br.com.fiap.springpgadvocacia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_PROCESSO")
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROCESSO")
    @SequenceGenerator(
            name = "SQ_PROCESSO",
            sequenceName = "SQ_PROCESSO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_PROCESSO")
    private Long id;

    @Column(name = "NM_PROCESSO")
    private String nome;

}
