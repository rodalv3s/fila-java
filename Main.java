public class Main {
	public static void main(String args[]) {
		//Criando a fila do tipo inteiro
        Fila<Integer> f = new Fila<Integer>(10);
        //Auxiliar para armazenar os inseridos
		int e;
		//Inserindo elementos na fila
		f.insert(100);
		f.insert(99);
		f.insert(98);
		f.insert(97);

		System.out.println("Bem vindo ao RodrizBank!");
		System.out.println("Atendimento---------");
		while(!f.isEmpty()) {
			e = f.remove();
			//primeiro a ser inserido na fila, é o primeiro a ser atendido.
			System.out.println("Senha a ser atendida: "+e);
		}
	}
}
