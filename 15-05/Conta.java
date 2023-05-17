public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public void saca(double valor) {
        saldo -= valor;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public double calculaRendimento() {
        return saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + titular + "\n"
                + "Número: " + numero + "\n"
                + "Agência: " + agencia + "\n"
                + "Saldo: " + saldo + "\n"
                + "Data de Abertura: " + dataAbertura;

        return dados;
    }

    

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}


