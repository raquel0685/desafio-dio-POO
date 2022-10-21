package br.com.dio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{

    private LocalDate data = LocalDate.now();
    private final String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

     public String getDataFormatada() {
        return dataFormatada;
    }
    public String setDataFormatada() {
        return dataFormatada;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataFormatada='" + dataFormatada + '\'' +
                '}';
    }
}
