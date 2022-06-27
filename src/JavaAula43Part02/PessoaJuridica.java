package JavaAula43Part02;

public class PessoaJuridica extends Contribuinte{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;

    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", =" + super.toString() +
                ", Imposto a ser pago: " + calcularImposto() +
                '}';
    }
}
