package datastructure.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CircularSinglyLinkedListTest { 
    @Test
    public void deveAdicionarUmElementoNaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

		circularSinglyLinkedList.add("a");

		assertEquals(circularSinglyLinkedList.head.data, "a");
		assertEquals(circularSinglyLinkedList.head.next, null);
    }
	
	@Test
    public void deveAdicionarDoisElementosNaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");

		assertEquals(circularSinglyLinkedList.head.data, "a");
		assertEquals(circularSinglyLinkedList.head.next.data, "b");
		assertEquals(circularSinglyLinkedList.head.next.next, circularSinglyLinkedList.head);
    }
	
	@Test
    public void deveAdicionarTresElementosNaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");

		assertEquals(circularSinglyLinkedList.head.data, "a");
		assertEquals(circularSinglyLinkedList.head.next.data, "b");
		assertEquals(circularSinglyLinkedList.head.next.next.data, "c");

		assertEquals(circularSinglyLinkedList.head.next.next.next, circularSinglyLinkedList.head);
    }

	@Test
    public void deveTentarRemoverUmElementoDaListaVazia() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

		circularSinglyLinkedList.remove("a");

		assertEquals(circularSinglyLinkedList.head, null);		
    }

	@Test
    public void deveRemoveOPrimeiroEUnicoElementoDaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");

		circularSinglyLinkedList.remove("a");

		assertEquals(circularSinglyLinkedList.head, null);
    }

	@Test
    public void removeOPrimeiroElementoDaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");
		circularSinglyLinkedList.add("d");
		circularSinglyLinkedList.add("e");

		circularSinglyLinkedList.remove("a");

		assertEquals(circularSinglyLinkedList.head.data, "b");
		assertEquals(circularSinglyLinkedList.head.next.next.next.next, circularSinglyLinkedList.head);
    }

	@Test
    public void removeOSegundoElementoDaListaDeDoisElementos() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");

		circularSinglyLinkedList.remove("b");

		assertEquals(circularSinglyLinkedList.head.data, "a");
		assertEquals(circularSinglyLinkedList.head.next, null);
    }

	@Test
    public void removeOSegundoElementoDaListaDeCincoElementos() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");
		circularSinglyLinkedList.add("d");
		circularSinglyLinkedList.add("e");

		circularSinglyLinkedList.remove("b");

		assertEquals(circularSinglyLinkedList.head.data, "a");
		assertEquals(circularSinglyLinkedList.head.next.data, "c");
    }

	@Test
    public void removeOTerceiroElementoDaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");
		circularSinglyLinkedList.add("d");
		circularSinglyLinkedList.add("e");

		circularSinglyLinkedList.remove("c");

		assertEquals(circularSinglyLinkedList.head.data, "a");
		assertEquals(circularSinglyLinkedList.head.next.next.data, "d");
    }

	@Test
    public void removeOQuartoElementoDaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");
		circularSinglyLinkedList.add("d");
		circularSinglyLinkedList.add("e");

		circularSinglyLinkedList.remove("d");

		assertEquals(circularSinglyLinkedList.head.data, "a");
		assertEquals(circularSinglyLinkedList.head.next.next.next.data, "e");
    }

	@Test
    public void removeOUltimoElementoDaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");
		circularSinglyLinkedList.add("d");
		circularSinglyLinkedList.add("e");

		circularSinglyLinkedList.remove("e");

		assertEquals(circularSinglyLinkedList.head.data, "a");
		assertEquals(circularSinglyLinkedList.head.next.next.next.next, circularSinglyLinkedList.head);
		
	}

	@Test
    public void deveTentarAcharUmElementoNaListaVazia() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		assertEquals(circularSinglyLinkedList.get("a"), false);
    }

	@Test
    public void deveAcharOPrimeiroElementoDaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");

		assertEquals(circularSinglyLinkedList.get("a"), true);
    }

	@Test
    public void deveAcharOSegundoElementoDaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");

		assertEquals(circularSinglyLinkedList.get("b"), true);
    }

	@Test
    public void deveAcharOTerceitoEUltimoElementoDaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");

		assertEquals(circularSinglyLinkedList.get("c"), true);
    }

	@Test
    public void deveTentarAcharUmElementoQueNaoEstaNaLista() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");

		assertEquals(circularSinglyLinkedList.get("x"), false);
    }

	@Test
    public void retornaUmaListaVazia() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		assertEquals(circularSinglyLinkedList.get(), "");
    }

	@Test
    public void retornaUmaListaComUmElemento() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");

		assertEquals(circularSinglyLinkedList.get(), "a ");
    }

	@Test
    public void retornaUmaListaComDoisElementos() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");

		assertEquals(circularSinglyLinkedList.get(), "a b ");
    }

	@Test
    public void retornaUmaListaComTresElementos() {
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		
		circularSinglyLinkedList.add("a");
		circularSinglyLinkedList.add("b");
		circularSinglyLinkedList.add("c");

		assertEquals(circularSinglyLinkedList.get(), "a b c ");
    }
}
