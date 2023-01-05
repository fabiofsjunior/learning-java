package cursojava.auxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {
    
    public boolean autenticarCursoJava(PermitirAcesso acesso){
        return acesso.autenticar(null, null);
    }
}
