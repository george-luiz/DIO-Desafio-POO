package br.com.dio.desafio.dominio;

public abstract class Conteudo implements IConteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    @Override
    public double calcularXp(){
      return this.XP_PADRAO + 20d;
    };

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

}
