public class Medico {
    private String nome;
    private String especialidade;
    private int crm;

    public Medico(){

    }

    public Medico(String nome, String especialidade, int crm){
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEspecialidade(String especialidade){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public int getCrm(){
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    //Não tem set do crm pq ele nunca pode ser alterado

    public String toString(){
        return "Nome: " +
                nome +
                "Especialidade: " +
                especialidade +
                "Crm: " +
                crm;

    }
}