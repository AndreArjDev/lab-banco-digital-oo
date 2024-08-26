import java.util.ArrayList;
import java.util.List;

public class ClientePJ extends Cliente{

    private String cnpj;

    ClientePJ(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

}
