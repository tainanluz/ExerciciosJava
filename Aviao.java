package PackagePOO;

public class Aviao 
{
/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
	private String cor; //branco
	private String modelo; // boing 707
	private int numPassageiros;// 140
	
	public Aviao (String cor,String modelo,int numPassageiros)
	{
		this.cor = cor;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
	}
	public void imprimirInfo()
	{
		System.out.println("***Informações do avião***" + "\nCor: " + cor +
				"\nModelo: "+modelo+"\nNumerodePassageiros: "+ numPassageiros);
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	

}
