package listaDoisExcOito;

public class List {
	private Node firstNode;
	private Node lastNode;
	private String name;
	public List() {
	this("list");
	}
	
	public List(String listName) {
		name = listName;
		firstNode = lastNode = null;
	}

	public boolean isEmpty() {
		return firstNode == null;
	}	

	public String getFirst() throws Exception {
		if (isEmpty()) throw new Exception();
		return firstNode.getData();
	}

	public String getLast() throws Exception {
		if (isEmpty()) throw new Exception();
		return lastNode.getData();
	}

	public void insertAtFront (String insertItem) {
		if (isEmpty()) {
		firstNode = lastNode = new Node(insertItem);
	} else {
		firstNode = new Node(insertItem, firstNode);
		}
	}

	public void insertAtBack (String insertItem) {
		if (isEmpty()) {
		firstNode = lastNode = new Node(insertItem);
		} else {
		lastNode.setNext(new Node(insertItem));
		lastNode = lastNode.getNext();
		}
	}

	public String removeFromFront() throws Exception {
		if (isEmpty()) {
		throw new Exception();
	}

	String removedItem = firstNode.getData();
		if (firstNode == lastNode) {
		firstNode = lastNode = null;
	} else {
		firstNode = firstNode.getNext();
		}return removedItem;
	}

	public String removeFromBack() throws Exception {
		if (isEmpty()) {
		throw new Exception();
	}
	String removedItem = lastNode.getData();
		if (firstNode == lastNode) {
		firstNode = lastNode = null;
	} else {
	Node current = firstNode;
	while (current.getNext() != lastNode) {
		current = current.getNext();
		} lastNode = current;
		current.setNext(null);
	}
	return removedItem;
	}

	public void print() {
		if (isEmpty()) {
		System.out.println("Empty " + name);
	} else {
		System.out.print("The " + name + " is: ");
		Node current = firstNode;
		while (current != null) {
			System.out.print(current.getData().toString() + " ");
			current = current.getNext();
	}
	System.out.println("\n");
	}

	}
	
	public void inserePosicionado(String s) {
		if (isEmpty() || firstNode.getData().compareTo(s) > 0) {
			// insere na primeira posicao caso a lista esteja vazia ou o
			// primeiro noh ja eh menor
			insertAtFront(s);
		} else {
			Node current = firstNode;
			while (current != null) {
				final Node next = current.getNext();
				if (next == null) {
					// insere na ultima posicao caso chegou ao final da
					// lista sem achar ponto de insercao
					insertAtBack(s);
					return;
				}

				if (next.getData().compareTo(s) > 0) {
					// insere na posicao encontrada, ou seja, cria o node
					// com o next sendo o next do node atual, e o node
					// criado sendo o next do node atual
					final Node node = new Node(s, next);
					current.setNext(node);
					return;
				}
				current = current.getNext();
			}
		}
	}
}

