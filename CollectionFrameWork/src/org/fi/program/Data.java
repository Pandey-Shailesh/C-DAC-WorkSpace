package org.fi.program;

public class Data implements Comparable {

	int id;
	String name;

	public Data() {

	}

	public Data(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Data nextElement = (Data) o;
		if (this.id > nextElement.id)
			return 1;
		else if (this.id < nextElement.id)
			return -1;
		else {
			if (name.compareTo(nextElement.name) > 0)
				return 1;
			else if (name.compareTo(nextElement.name) < 0)
				return -1;
			else
				return 0;
		}

	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + "]";
	}

}
