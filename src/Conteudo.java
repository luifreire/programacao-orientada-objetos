public class Conteudo {
    protected static final double XP_PADRAO = 10d
    
    private String Titulo;
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    private String Descricao;

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public abstract double calcularXp ()

    
}
