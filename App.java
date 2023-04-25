package app;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nome = "Manuel";
        String sobrenome = "Neto";
        int idade = 26;
        final String matricula = "202212123";
        String nomePai = "Jose";
        String nomeMae = "Maria";
        boolean temAutorizacao = true;

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        idade = 27;
        System.out.println(idade);
        System.out.println(matricula);
        System.out.println(nomePai);
        System.out.println(nomeMae);
        System.out.println(temAutorizacao);
    
        double matematicaNota1 = 10;
        double matematicaNota2 = 9;
        double matematicaNota3 = 8;
        double matematicaNota4 = 7;

        double mediaMatematica = (matematicaNota1 + matematicaNota2 + matematicaNota3 + matematicaNota4) / 4;
        System.out.println("Média matemática: " + mediaMatematica);

        }
}