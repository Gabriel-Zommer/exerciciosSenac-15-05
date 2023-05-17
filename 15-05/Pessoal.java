public class Pessoal {
    private String nome;
    private int idade;
    private String cpf;

    
    public Pessoal(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
    public boolean validarCpf(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Pessoal pessoa = new Pessoal("João", 30, "12345678901");

        
        boolean cpfValido = pessoa.validarCpf(pessoa.getCpf());
        System.out.println("CPF válido: " + cpfValido);
    }
}

