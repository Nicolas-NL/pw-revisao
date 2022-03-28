
public class ExercicioSete {
	public static void main(String[] args) {
		double l1 = 2, l2 = 3, l3 = 1;
		
		if(l1 == l2 && l2 == l3){
			System.out.println("Equilatero");
		
		}
		else if (l1 == l2 || l1 == l3 || l2 == l3 )
		{
			System.out.println("Isosceles");
		}
		else
		{
			System.out.println("Escaleno");
		}
	}

}
