package model;

public class Tarefa {
    private String descricao;
    private String prazo;
    private String status;
    private String usuario;

    public Tarefa(String descricao, String prazo, String status, String usuario) {
        this.descricao = descricao;
        this.prazo = prazo;
        this.status = status;
        this.usuario = usuario;
    }

    public String getDescricao() { return descricao; }
    public String getPrazo() { return prazo; }
    public String getStatus() { return status; }
    public String getUsuario() { return usuario; }
}