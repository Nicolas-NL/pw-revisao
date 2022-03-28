
public class ExercicioOito {
	 public static void main(String[] args) {
		 int Segunda = 0, Terca= 0, Quarta = 0, Quinta = 0, Sexta = 0, Sabado = 0, Domingo = 0;
		 String DiaSemana = "Segunda";
		 
		 if(DiaSemana == "Segunda" || DiaSemana == "Terca" || DiaSemana == "Quarta" || DiaSemana == "Quinta" || DiaSemana == "Sexta") {
			System.out.println("Voce pode ir ao Banco.");
		 }
		 else if(DiaSemana == "Sabado" || DiaSemana == "Domingo") {
			 System.out.println("O Banco esta fechado, tente outro dia.");
		 }
	 }
}
