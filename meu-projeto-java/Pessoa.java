public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    // Construtor
    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    // Método para classificar o resultado do IMC
    public String classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade Grau I";
        } else if (imc < 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III (Mórbida)";
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}