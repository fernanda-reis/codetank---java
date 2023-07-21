package org.example;

public class CodeTank {

    private  static String[][] dadosPessoas = new String[][]{
            {"Ana", "Paulo", "Márcia", "Pedro",  "Beatriz"},
            {"1.70", "1.72", "1.62", "1.90", "1.53" },
            {"80", "90", "61", "84", "49"}
    };

    public static void main(String[] args) {

        String[] nomes = dadosPessoas[0];
        String[] alturas = dadosPessoas[1];
        String[] pesos = dadosPessoas[2];


        calculaMediaAritmeticaAltura(alturas);
        System.out.println();

        calculaMediaAritmeticaPeso(pesos);
        System.out.println();

        calculaIMCTodos(nomes, alturas, pesos);
        System.out.println();

        float maiorAltura = getPessoaMaisAlta(nomes, alturas);
        System.out.println();

        getPessoaMaisBaixa(nomes, alturas, maiorAltura);
        System.out.println();

        float maiorPeso = getPessoaMaisPesada(nomes, pesos);
        System.out.println();

        getPessoaMaisLeve(nomes, pesos, maiorPeso);
        System.out.println();

        float maiorIMC = getMaiorIMC(nomes, alturas, pesos);
        System.out.println();

        getMenorIMC(nomes, alturas, pesos, maiorIMC);
        System.out.println();

    }

    private static void calculaMediaAritmeticaAltura(String[] alturas) {
        float media, soma = 0;

        for(int i = 0; i < alturas.length; i++) {
            soma += Float.valueOf(alturas[i]);
        }

        media = soma / alturas.length;

        System.out.println("A média aritmética de altura é " + media);
    }

    private static void calculaMediaAritmeticaPeso(String[] pesos) {
        float media, soma = 0;

        for(int i = 0; i < pesos.length; i++) {
            soma += Float.valueOf(pesos[i]);
        }

        media = soma / pesos.length;

        System.out.println("A média aritmética de peso é " + media);
    }

    private static void calculaIMCTodos(String[] nomes, String[] alturas, String[] pesos){
        for (int i = 0 ; i < nomes.length; i++){
            float imc = calcularIMC(alturas[i], pesos[i]);
            System.out.println("O IMC de " + nomes[i] + " é " + imc);
        }
    }

    private static float getPessoaMaisAlta(String[] nomes, String[] alturas){
        float maiorAltura = 0;

        String nomeDaPessoa = "";
        String alturaDaPessoa = "";

        for (int i = 0; i < nomes.length; i++) {
            float altura = Float.valueOf(alturas[i]);

            if (altura > maiorAltura) {
                maiorAltura = altura;

                nomeDaPessoa = nomes[i];
                alturaDaPessoa = alturas[i];
            }
        }

        System.out.println("A pessoa mais alta é " + nomeDaPessoa + " com " + alturaDaPessoa + " de altura.");
        return maiorAltura;
    }

    private static void getPessoaMaisBaixa(String[] nomes, String[] alturas, float maiorAltura) {
        float menorAltura = maiorAltura;

        String nomeDaPessoa = "";
        String alturaDaPessoa = "";

        for (int i = 0; i < nomes.length; i++) {
            float altura = Float.valueOf(alturas[i]);

            if (altura < menorAltura) {
                menorAltura = altura;

                nomeDaPessoa = nomes[i];
                alturaDaPessoa = alturas[i];
            }
        }

        System.out.println("A pessoa mais baixa é " + nomeDaPessoa + " com " + alturaDaPessoa + " de altura.");
    }

    private static float getPessoaMaisPesada(String[] nomes, String[] pesos) {
        float maiorPeso = 0;

        String nomeDaPessoa = "";
        String pesoDaPessoa = "";

        for (int i = 0; i < nomes.length; i++) {
            float peso = Float.valueOf(pesos[i]);

            if (peso > maiorPeso) {
                maiorPeso = peso;

                nomeDaPessoa = nomes[i];
                pesoDaPessoa = pesos[i];
            }
        }

        System.out.println("A pessoa mais pesada é " + nomeDaPessoa + " com " + pesoDaPessoa + " de peso.");
        return maiorPeso;
    }

    private static void getPessoaMaisLeve(String[] nomes, String[] pesos, float maiorPeso){
        float menorPeso = maiorPeso;

        String nomeDaPessoa = "";
        String pesoDaPessoa = "";

        for (int i = 0; i < nomes.length; i++) {
            float peso = Float.valueOf(pesos[i]);

            if (peso < menorPeso) {
                menorPeso = peso;

                nomeDaPessoa = nomes[i];
                pesoDaPessoa = pesos[i];
            }
        }

        System.out.println("A pessoa mais leve é " + nomeDaPessoa + " com " + pesoDaPessoa + " de peso.");

    }

    private static float getMaiorIMC(String[] nomes, String[] alturas, String[] pesos) {
        float maiorIMC = 0;
        String nomeDaPessoa = "";

        for(int i = 0; i < nomes.length; i++){
            float imc = calcularIMC(alturas[i], pesos[i]);

            if(imc > maiorIMC) {
                maiorIMC = imc;
                nomeDaPessoa = nomes[i];
            }
        }

        System.out.println("A pessoa com maior IMC é " + nomeDaPessoa + " com " + maiorIMC + " de IMC.");
        return maiorIMC;
    }

    private static void getMenorIMC(String[] nomes, String[] alturas, String[] pesos, float maiorIMC) {
        float menorIMC = maiorIMC;
        String nomeDaPessoa = "";

        for(int i = 0; i < nomes.length; i++){
            float imc = calcularIMC(alturas[i], pesos[i]);

            if(imc < menorIMC) {
                menorIMC = imc;
                nomeDaPessoa = nomes[i];
            }
        }

        System.out.println("A pessoa com menor IMC é " + nomeDaPessoa + " com " + menorIMC + " de IMC.");
    }

    private static float calcularIMC(String altura, String peso){
        float alturaIMC = Float.valueOf(altura);
        float pesoIMC = Float.valueOf(peso);
        float imc = (alturaIMC * alturaIMC) / pesoIMC;

        return imc;
    }
}