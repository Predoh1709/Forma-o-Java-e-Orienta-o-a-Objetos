
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem amis de 18 anos");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2){
				System.out.println("Voc� n�o te, 18, mas pode entrar, "
						+ "pois est� acompanhando");
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar");
			}
		}
		
	}

}
