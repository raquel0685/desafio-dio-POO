package br.com.dio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data = LocalDate.now();
    private final String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataFormatada='" + dataFormatada + '\'' +
                '}';
    }
}
