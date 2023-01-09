package aplicacao;

import javax.swing.JOptionPane;

import entidade.Calculadora;

public class Programa {

	public static void main(String[] args) {

		String resultado = JOptionPane.showInputDialog("Digite um numero: ");
		double resultadoFormatado = Double.parseDouble(resultado);
		Calculadora cal = new Calculadora(resultadoFormatado);

		String op = JOptionPane.showInputDialog("(-) Subtrair , (+) somar, (/) Dividir , (x) Multiplicar, (*) sair");

		while (op.equals("-") || op.equals("+") || op.equals("x") || op.equals("/")) {
			cal.setOp(op);
			String entrada = JOptionPane.showInputDialog("Digite um número");
			double entradaFormatada = Double.parseDouble(entrada);
			cal.setEntrada(entradaFormatada);
			cal.operacao();

			op = JOptionPane.showInputDialog("Resultado " + cal.getResultado() + "\n"
					+ "(-) Subtrair , (+) somar, (/) Dividir , (x) Multiplicar, (*) sair");

		}
		if (op.equals("*")) {
			JOptionPane.showMessageDialog(null, "Programa finalizado!!");
		} else {

			JOptionPane.showMessageDialog(null, "Comando inválido!!");

		}
	}

}
