//Tendo quatro pontos como referência, a equação reduzida de uma reta será calculada.

public class EquacaoReduzidaDaReta{
	public static void main(String []args){

	//Fórmula: y-y0 = m(x-x0)	

	//Variáveis que recebem os pontos
	double xA = 0;
	double yA = 90;
	double xB = 10;
	double yB = 0;

	//Processamento das variáveis
	double y0 = yA * -1; 
	double xBmenosXa = xB - xA;
	double coeficienteAngular = (yB-yA) / xBmenosXa;
	double alterandoSinalY0 = y0 * -1;
	double coeficienteLinear = xA + alterandoSinalY0;

	if(xBmenosXa == 0){
	    System.out.println("A diferença entre Xb e Xa = 0. Yb - Ya será divido por Xb - Xa. Não existe divisão por zero.");
	}else if(coeficienteAngular == 0){
	     System.out.println("O coeficiente angular não pode ser zero.");
	}else if(coeficienteLinear == 0){
	    System.out.println("y = " + " " + coeficienteAngular);
	}else if(coeficienteLinear < 0){
	    System.out.println("y = " + " " + coeficienteAngular + " " + "-" + coeficienteLinear * -1);
	}else{
	    System.out.println("y = " + " " + coeficienteAngular + " " + "+" + " " + coeficienteLinear);
	}

	
	}
}
