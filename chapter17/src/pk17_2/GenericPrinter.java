package pk17_2;

public class GenericPrinter<T extends Material> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	//메서드 안에 또 다른 객체의 메서드가 존재
	public void printing() {
		material.doPrinting();
	}
}
