//contrato Autenticavel
	//quem assinar esse contratro, precisa implementar
		//metodo setsenha e metodo sutentica
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
