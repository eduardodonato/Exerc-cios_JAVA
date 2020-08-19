package fundamentos.Estudar;

public class UsuarioParaLista {

	String nome;

	public UsuarioParaLista(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}

	//Podemos criar o equals e o hashCode automaticamente atraves do proprio
	//eclipse (botão direito do mouse, source,  generate....
	
	
	public int hashCode() {
		return 0;
	}

	public boolean equals(Object obj) {
		UsuarioParaLista OutroUsuario = (UsuarioParaLista) obj;
		return this.nome.equals(OutroUsuario.nome);
	}

}
