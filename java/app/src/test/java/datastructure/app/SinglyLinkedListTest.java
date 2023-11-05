package datastructure.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest { 
    @Test
    public void deveAdicionarCincoElementosNaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");
		singlyLinkedList.add("d");
		singlyLinkedList.add("e");

		assertEquals(singlyLinkedList.head.data, "a");
		assertEquals(singlyLinkedList.head.next.data, "b");
		assertEquals(singlyLinkedList.head.next.next.data, "c");
		assertEquals(singlyLinkedList.head.next.next.next.data, "d");
		assertEquals(singlyLinkedList.head.next.next.next.next.data, "e");
    }

	@Test
    public void tentaRemoverUmElementoDaListaVazia() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.remove("a");

		assertEquals(singlyLinkedList.head, null);
    }

	@Test
    public void removeOPrimeiroEUnicoElementoDaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");

		singlyLinkedList.remove("a");

		assertEquals(singlyLinkedList.head, null);
    }

	@Test
    public void removeOPrimeiroElementoDaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");
		singlyLinkedList.add("d");
		singlyLinkedList.add("e");

		singlyLinkedList.remove("a");

		assertEquals(singlyLinkedList.head.data, "b");
    }

	@Test
    public void removeOSegundoElementoDaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");
		singlyLinkedList.add("d");
		singlyLinkedList.add("e");

		singlyLinkedList.remove("b");

		assertEquals(singlyLinkedList.head.data, "a");
		assertEquals(singlyLinkedList.head.next.data, "c");
    }

	@Test
    public void removeOTerceitoElementoDaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");
		singlyLinkedList.add("d");
		singlyLinkedList.add("e");

		singlyLinkedList.remove("c");

		assertEquals(singlyLinkedList.head.data, "a");
		assertEquals(singlyLinkedList.head.next.next.data, "d");
    }

	@Test
    public void removeOQuartoElementoDaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");
		singlyLinkedList.add("d");
		singlyLinkedList.add("e");

		singlyLinkedList.remove("d");

		assertEquals(singlyLinkedList.head.data, "a");
		assertEquals(singlyLinkedList.head.next.next.next.data, "e");
    }

	@Test
    public void removeOUltimoElementoDaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");
		singlyLinkedList.add("d");
		singlyLinkedList.add("e");

		singlyLinkedList.remove("e");

		assertEquals(singlyLinkedList.head.data, "a");
		assertEquals(singlyLinkedList.head.next.next.next.next, null);
    }

	@Test
    public void tentaAcharUmElementoNaListaVazia() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		assertEquals(singlyLinkedList.get("a"), false);
    }

	@Test
    public void deveAcharOPrimeiroElementoDaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");

		assertEquals(singlyLinkedList.get("a"), true);
    }

	@Test
    public void deveAcharOSegundoElementoDaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");

		assertEquals(singlyLinkedList.get("b"), true);
    }

	@Test
    public void deveAcharOTerceitoEUltimoElementoDaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");

		assertEquals(singlyLinkedList.get("c"), true);
    }

	@Test
    public void deveAcharUmElementoQueNaoEstaNaLista() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");

		assertEquals(singlyLinkedList.get("x"), false);
    }

	@Test
    public void retornaUmaListaVazia() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		assertEquals(singlyLinkedList.get(), "");
    }

	@Test
    public void retornaUmaListaComUmElemento() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");

		assertEquals(singlyLinkedList.get(), "a ");
    }

	@Test
    public void retornaUmaListaComDoisElementos() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");

		assertEquals(singlyLinkedList.get(), "a b ");
    }

	@Test
    public void retornaUmaListaComTresElementos() {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.add("a");
		singlyLinkedList.add("b");
		singlyLinkedList.add("c");

		assertEquals(singlyLinkedList.get(), "a b c ");
    }
}
