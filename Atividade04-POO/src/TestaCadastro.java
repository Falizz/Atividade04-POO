import java.util.ArrayList;
import java.util.Scanner;

public class TestaCadastro {

    Scanner scanner = new Scanner(System.in);

    public void lerPessoa(ArrayList<Pessoa> pessoas){
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.next();
        System.out.print("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mes do nascimento: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano do nascimento: ");
        int ano = scanner.nextInt();
        Data nascimento = new Data();
        nascimento.setData(dia, mes, ano);

        criarPessoa(pessoas, nome, nascimento);
    }

    public void criarPessoa(ArrayList<Pessoa> pessoas, String nome, Data nascimento){
        System.out.println("Tipo de cadatro:\n1 - Cliente\n2- Funcionario\n3- Gerente");
        int escolha = scanner.nextInt();
        Pessoa irreconhecivel = null;
        if (escolha == 1){
            Cliente pessoa = new Cliente();
            pessoa.setPessoa(nome, nascimento);
            pessoa.Cliente(nome, nascimento);
            pessoa.imprimeDados();
            pessoas.add(pessoa);
        } else if (escolha == 2){
            Funcionario pessoa = new Funcionario();
            pessoa.setPessoa(nome, nascimento);
            pessoa.Funcionario(nome, nascimento);
            pessoa.calculaImposto();
            pessoa.imprimeDados();
            pessoas.add(pessoa);
        } else if (escolha == 3){
            Gerente pessoa = new Gerente();
            pessoa.setPessoa(nome, nascimento);
            pessoa.Funcionario(nome, nascimento);
            pessoa.calculaImposto();
            pessoa.imprimeDados();
            pessoas.add(pessoa);
        } else {
            System.out.println("Opção inválida");
            criarPessoa(pessoas, nome, nascimento);
        }
    }
}
