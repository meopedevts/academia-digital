package me.dio.academia.digital.entity.form;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O Id do aluno deve ser positivo")
  private Long alunoId;

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "'${validatedValue}' deve ser positivo")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "'${validatedValue}' deve ser positivo")
  @DecimalMin(value = "150", message = "'${validatedValue}' precisa ter no mínimo {value}")
  private double altura;
}
