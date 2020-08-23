package trycatch;

import javax.swing.JOptionPane;

public class TesteOperacoesMatematicas {

	public static void main(String[] args) {
		double resultado = 0;
		double primeiroValorConvertido = 0;
		double segundoValorConvertido = 0;
		boolean continua = true;

		String tipo = null;
		primeiroValorConvertido = 0.0;

		do {
			try {
				primeiroValorConvertido = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro numero"));
			} catch (Exception ex) {
				JOptionPane.showInputDialog(null, "não e numero: " + ex.getMessage());

			}

			try {
				segundoValorConvertido = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo numero"));
			} catch (Exception ex) {
				JOptionPane.showInputDialog(null, "não é numero: " + ex.getMessage());
			}

			try {
				tipo = JOptionPane.showInputDialog("digite o tipo");
			} catch (Exception e) {
			}

			continua = false;

		} while (continua);

		switch (tipo) {
		case "soma":
			resultado = primeiroValorConvertido + segundoValorConvertido;
			break;
		case "subtrai":
			resultado = primeiroValorConvertido - segundoValorConvertido;
			break;
		case "divide":
			resultado = primeiroValorConvertido / segundoValorConvertido;
			break;
		case "multiplica":
			resultado = primeiroValorConvertido * segundoValorConvertido;
			break;
		default:
			resultado = 0.0;
			break;
		}

		JOptionPane.showInputDialog(null, resultado);

	}
}
