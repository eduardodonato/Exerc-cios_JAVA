package fundamentos.Estudar;

public class UsuarioParaLista {

	String nome;

	public UsuarioParaLista(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Meu nome � " + this.nome + ".";
	}

	//Podemos criar o equals e o hashCode automaticamente atraves do proprio
	//eclipse (bot�o direito do mouse, source,  generate....
	
	
	public int hashCode() {
		return 0;
	}

	public boolean equals(Object obj) {
		UsuarioParaLista OutroUsuario = (UsuarioParaLista) obj;
		return this.nome.equals(OutroUsuario.nome);
	}

}
