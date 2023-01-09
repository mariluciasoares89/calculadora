package entidade;

public class Calculadora {
	
	private double resultado = 0.0;
	private double entrada = 0;
	private String op = "";

	public Calculadora(double resultado) {
		this.resultado = resultado;
	}
	public void somar(){
		resultado = resultado + entrada;
	}
	public void subtrair() {
		resultado = resultado - entrada;
		
	}
	
	public void multiplicar() {
		resultado = resultado * entrada;
	}
	
	public void dividir() {
		resultado = resultado / entrada;
	}
	
	public void operacao() {
		if(op.equals("x")) {
			multiplicar();
			
		}else if(op.equals("-")){
			subtrair();
			
		}else if(op.equals("+")) {
			somar();
			
		}else if(op.equals("/")) {
			dividir();
		}
	}
	

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}
	
}
