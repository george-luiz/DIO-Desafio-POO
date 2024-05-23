package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //LinkedHashSet: Não deixa ter palavras repetidas dentro do Array
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();//LinkedHashSet: Não deixa ter palavras repetidas dentro do Array

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverParaOBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        if(!conteudosInscritos.isEmpty()) {
            Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
            if (conteudo.isPresent()) {
                this.conteudosConcluidos.add(conteudo.get());
                this.conteudosInscritos.remove(conteudo.get());
            } else {
                throw new RuntimeException("Ao progredir a lista está vazia!");
            }
        } else {
            throw new RuntimeException("Ao progredir a lista conteudos inscritos está vazia!");
        }
    }

    public double calcularTotalXP() {
        return this.conteudosConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }

    public void exibirConteudosInscritos() {
        System.out.println("Conteúdos inscritos " + getNome() + ": " + getConteudosInscritos());
    }

    public void exibirConteudosConcluidos() {
        System.out.println("Conteúdos concluidos " + getNome() + ": " + getConteudosConcluidos());
    }

    public void exibirTotalXP() {
        System.out.println("Total Calculo XP " + getNome() + ": " + this.calcularTotalXP());
    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) && Objects.equals(getConteudosConcluidos(), dev.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosConcluidos());
    }
}
