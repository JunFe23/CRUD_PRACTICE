package sist.com.basic4.di;




public class Node {
	
	private String id;
	private String name;
	private String value;
	private int since;	
	
	public Node() {
		super();
	}
	public Node(String id, String name, String value, int since) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.since = since;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getSince() {
		return since;
	}
	public void setSince(int since) {
		this.since = since;
	}
	@Override
	public String toString() {
		return "Node [id=" + id + ", name=" + name + ", value=" + value + ", since=" + since + "]";
	}
	
	
	
	

}
