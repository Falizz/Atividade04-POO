import java.util.ArrayList;

public class CadastroPessoas {

    private int qtdAtual = 0;
    private ArrayList<Pessoa> pessoas;

    public CadastroPessoas() {
        pessoas = new ArrayList<>();
    }

    public int getQtdAtual(){
        return qtdAtual;
    }

    public void cadastraPessoa(Pessoa pessoa){
        TestaCadastro teste = new TestaCadastro();
        teste.lerPessoa(pessoas);
        qtdAtual++;
    }

    public void imprimeCadastro(){
        int i = 1;
        for (Pessoa pessoa : pessoas){
            System.out.println(i + " - " + pessoa.getNome());
            i++;
        }
    }

}
