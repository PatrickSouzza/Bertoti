package Strategy;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private CalculadoraSalario calculadoraSalario;

    public Funcionario(String nome, double salarioBase, CalculadoraSalario calculadoraSalario) {
        this.setNome(nome);
        this.salarioBase = salarioBase;
        this.calculadoraSalario = calculadoraSalario;
    }

    public double calcularSalarioLiquido() {
        return calculadoraSalario.calcularSalario(salarioBase);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

