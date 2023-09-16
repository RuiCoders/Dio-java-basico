public class FormatadorCep {
    public static void main(String[] args) {
        String cepFormatado;
        try {
            cepFormatado = formatarCep("2576506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep informado esta incorreto deve conter somente 8 digitos numericos");
            e.printStackTrace();
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "25.765-064";
    }
}