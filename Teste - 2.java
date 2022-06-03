package Animal;

public class Cavalo {

	public static void main(String[] args) {
		
		Animal Cavalo = new Animal();
		
		Cavalo.getClass();
		Cavalo.setNome(" Pé de pano");
		Cavalo.setIdade( 5 );
		
		{
			System.out.println(" Hiin in in ");
			System.out.println("O nome do cavalo é: " +Cavalo.getNome());
			System.out.println("A idade do cavalo é: " +Cavalo.getIdade());
			System.out.println("Este animal corre, corre, corre... !");
		}
		

	}

}
