public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMInutos = 180;

        System.out.println(meuFilme);
        System.out.println(meuFilme.nome);
    }
}
