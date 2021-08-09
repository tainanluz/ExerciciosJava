package PackagePOO;

public class Cliente
{
/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
	private String nome;
	private String email;
	private int telefone;
	
	public Cliente (String nome, String email, int telefone)
	{
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	public void imprimirInfo()
	{
		System.out.println("***Dados do cliente***");
		System.out.println("\nNome: " + nome + "\nE-mail: " + email + "\nTelefone: "+ telefone);	
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
