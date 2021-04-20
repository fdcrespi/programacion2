package ejercicio1;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack pila = new Stack();
		Stack pilaCopy = new Stack();
		Stack pilaReverse = new Stack();
		pila.push("fede");
		pila.push("crespi");
		pila.push(5);
		pila.push(10);
		pilaReverse = pila.reverse();
		pilaCopy = pila.copy();
		System.out.println(pila.size());
		System.out.println(pila.top());
		System.out.println("------------");
		System.out.println(pilaCopy.size());
		System.out.println(pilaCopy.top());
		System.out.println("------------");
		pilaReverse.pop();
		System.out.println(pilaReverse.size());
		System.out.println(pilaReverse.top());

	}

}
