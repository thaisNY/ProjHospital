public class Paciente {
    //Atributos
    private String nomePaciente;
    private int idade;
    private String cpf;
    private Medico medicoAtendimento;

    //construtor da classe
    public Paciente(String nomePaciente, int idade , String cpf){
        this.nomePaciente = nomePaciente;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Paciente(){
    }

    public String getNomePaciente(){
        return nomePaciente;
    }
    public void setNome(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    //Não tem set do cpf pq o set de uma pessoa nunca pode ser modificado

    public Medico getMedicoAtendimento(){
        return medicoAtendimento;
    }
    public void setMedico(Medico medicoAtendimento){
        this.medicoAtendimento = medicoAtendimento;
    }

    public String toString(){
        return "O paciente " +
                nomePaciente +
                " de " +
                idade +
                " anos " +
                "e cpf: " +
                cpf +
                " foi atendido pelo medico " +
                medicoAtendimento;
    }

}