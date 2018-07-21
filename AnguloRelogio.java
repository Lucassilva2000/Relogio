package Relogio.Angulo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AnguloRelogio {
	private long hora;
	private long minuto;
	private long anguloHora;
	private long anguloMinuto;
	
	public double gethora(){
		return hora;
	}
	
	public void sethora(long hora){
		this.hora = hora;
	}
	
	public long getminuto(){
		return minuto;
	}
	
	public void setminuto(long minuto){
		this.minuto = minuto;
	}
	
	public long RetornaAnguloRelogio(GregorianCalendar horario){
		
		this.sethora(horario.get(Calendar.HOUR_OF_DAY));
		this.setminuto(horario.get(Calendar.MINUTE));
		
		/*Um relogio possui uma circunferencia de 360 graus, com 12 horas, e dividindo 360
		 * por 12 é igual a 30, ou seja a cada cinco minutos o ponteiro vai percorrer 30 graus.
		 * Para saber a quantidade de graus do ponteiro maior, calculo a quantidade de horas vezes 30. E para saber quanto o ponteiro menor percorreu eu divido 
		 * a quantidade de minutos por 60, que equivale ao minutos, e multiplico por 30, que sao os graus, e somo  resultado a quantidade de graus
		 * do ponteiro maior. Já para saber a quantidade de graus do ponteiro maior de minutos, apenas multipico a quantidade de minutos por 6, que é
		 *  o resultado de 360 graus que a circunferencia do relogio, dividido por 60, que é quantidade de minutos. Ao fim é tirar a diferença dos
		 *  dois ponteiros subtraindo os, assim chegara ao valor final do angulo entre os dois ponteiros do relogio./*/
		
		this.anguloHora = (long) (30*this.gethora() + (this.getminuto()/60)*30);
		this.anguloMinuto = 6 * this.getminuto();
		
		return this.anguloMinuto - this.anguloHora;
		
		
		
		
	}
	
public class AnguloRelogio_teste {

	/**
	 * @param args
	 */
	public void main(String[] args) {
		GregorianCalendar horario = new GregorianCalendar();
		AnguloRelogio angulo = new AnguloRelogio();
		
		long relogio = angulo.RetornaAnguloRelogio(horario);
		
		System.out.print(angulo.gethora()+":"+angulo.getminuto()+"H possui um angulo de "+relogio+"graus");

	}

}

}


/*Uma duvida que tive foi o enunciado do desafio, pois nas premissas de angulos, diz que 00:15 equivale a 45 graus. Pesquisei muito sobre o assunto,
 * e essa informaçao nao procede, posso estar enganado, mas pelo que eu entendi, 00:15 equivale a 90 graus. Pois a circunfenrencia do relogio possui
 * 360 graus, e divindo o mesmo por 60, que é a quantidade de minutos, tera o resultado de 6. E com esse 6 posso descobrir o angulo  dos ponteiros
 * de minutos, e multiplicando 6 X 15 da 90, e nao 45, com diz o enunciado*/
 