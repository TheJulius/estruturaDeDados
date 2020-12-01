package listaDoisExcOito;

public class Node {
	
	private String data;
	private Node nextNode;
	public Node( String element ) {
	this( element, null );
	}
	public Node( String element, Node node ) {
	data = element;
	nextNode = node;
	}
	public String getData() {
	return data;
	}
	public void setData(String element){
	data = element;
	}
	public Node getNext() {
	return nextNode;
	}
	public void setNext(Node node) {
	nextNode = node;
	}

}
