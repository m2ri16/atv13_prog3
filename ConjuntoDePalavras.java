import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    private Set<String> conjuntoDePalavras = new HashSet<>();

    public ConjuntoDePalavras(String palavrasSeparadasPorVirgula) {
        String[] palavras = palavrasSeparadasPorVirgula.split(",");
        for (String palavra : palavras) {
            conjuntoDePalavras.add(palavra.trim()); 
        }
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasParaVerificar = palavras.split(",");
        for (String palavra : palavrasParaVerificar) {
            if (!conjuntoDePalavras.contains(palavra.trim())) {
                return false;
            }
        }
        return true;
    }
}
