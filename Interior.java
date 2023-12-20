package ktratx2;

public class Interior extends Product {
	private String color;
	private String material;
	private String style;

	public Interior() {

	}

	public Interior(int product_id, String product_name, double product_price, int product_total, String color,
			String material, String style) {
		super(product_id, product_name, product_price, product_total);
		this.color = color;
		this.material = material;
		this.style = style;
	}

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	public String getStyle() {
		return style;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "Interior " + super.toString() + " color=" + color + ", material=" + material + ", style=" + style;
	}

}
