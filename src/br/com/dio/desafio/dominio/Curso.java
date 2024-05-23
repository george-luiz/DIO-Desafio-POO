package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int CargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        CargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        if(getCargaHoraria() != 0) {
            return super.XP_PADRAO * getCargaHoraria();
        } else {
            throw new RuntimeException("No " + getTitulo() + " ao calcular o xp a carga horaria não pode ser zero!");
        }
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }

}
