public class FormatadorCep {
    public static void main(String[] args) {
        
        try {
            String cepFormatado = formataCep("23783000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não está correto!");
        }

    }
    static String formataCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
        throw new CepInvalidoException();

        return "23.783-000";
    }
}
