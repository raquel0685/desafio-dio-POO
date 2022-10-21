package br.com.dio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio = LocalDate.now();
    private final String dataInicioFormatada = dataInicio.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

    private final LocalDate dataFinal = dataInicio.plusDays(45);
    private final String dataFinalFormatada = dataFinal.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudosBootcamp = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicioFormatada() {
        return dataInicioFormatada;
    }

    public String getDataFinalFormatada() {
        return dataFinalFormatada;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudosBootcamp() {
        return conteudosBootcamp;
    }

    public void setConteudosBootcamp(Set<Conteudo> conteudosBootcamp) {
        this.conteudosBootcamp = conteudosBootcamp;
    }
    public String setDataInicioFormatada() {
        return dataInicioFormatada;
    }
    public String setDataFinalFormatada() {
        return dataFinalFormatada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicioFormatada, bootcamp.dataInicioFormatada) && Objects.equals(dataFinalFormatada, bootcamp.dataFinalFormatada) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudosBootcamp, bootcamp.conteudosBootcamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicioFormatada, dataFinalFormatada, devsInscritos, conteudosBootcamp);
    }
}
