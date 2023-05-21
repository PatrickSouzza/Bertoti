package Strategy;

public class SalarioApp {
    public static void main(String[] args) {
        // Criando os objetos
        CalculadoraSalarioCLT calculadoraCLT = new CalculadoraSalarioCLT();
        CalculadoraSalarioPJ calculadoraPJ = new CalculadoraSalarioPJ();

        // Criando funcionários
        Funcionario funcionarioCLT = new Funcionario("Patrick", 5000.0, calculadoraCLT);
        Funcionario funcionarioPJ = new Funcionario("Julie", 3000.0, calculadoraPJ);

        // Calculando salário líquido
        double salarioLiquidoCLT = funcionarioCLT.calcularSalarioLiquido();
        double salarioLiquidoPJ = funcionarioPJ.calcularSalarioLiquido();

        // Exibindo resultados
        System.out.println("Salário líquido de " + funcionarioCLT.getNome() + ": R$" + salarioLiquidoCLT);
        System.out.println("Salário líquido de " + funcionarioPJ.getNome() + ": R$" + salarioLiquidoPJ);
    }
}
