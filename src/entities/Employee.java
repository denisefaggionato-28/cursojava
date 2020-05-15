package entities;

public class Employee {
	public String nome;
	public double salario;
	public double imposto;
	public double porcentagem;
	
	public void addSalario(double porcentagem) {
		 this.salario += (this.salario/porcentagem);
	}
	public double salarioLiquido() {
	return salario - imposto;
	}
	public String toString() {
		return nome 
		      +  String.format(" %.2f", salarioLiquido());
	}

}
