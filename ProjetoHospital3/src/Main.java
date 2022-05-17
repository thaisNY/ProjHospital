import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bem vindo ao sistema do hospial");
        Scanner sc = new Scanner(System.in);
        Medico medico = new Medico();
        System.out.println("Digite o nome do medico");
        String nome = sc.nextLine();
        medico.setNome(nome);
        System.out.println("Digite a especialidade do medico");
        String especialidade = sc.nextLine();
        medico.setEspecialidade(especialidade);
        System.out.println("Digite o crm do medico");
        int crm = sc.nextInt();
        medico.setCrm(crm);
        sc.nextLine();

        Paciente paciente = new Paciente();
        System.out.println("Digite o nome do paciente");
        String nomePaciente = sc.nextLine();
        paciente.setNome(nomePaciente);

        System.out.println("Digite a idade do paciente");
        int idade = sc.nextInt();
        paciente.setIdade(idade);
        System.out.println("Digite o cpf do paciente");
        String cpf = sc.next();
        paciente.setCpf(cpf);
        paciente.setMedico(medico);

        System.out.println(paciente.toString());
    }
}