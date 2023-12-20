package ktratx2;

import java.util.ArrayList;
import java.util.List;

public class TestInterior {

	private static ArrayList<Interior> list;

	public void generateList(int n) {
		this.list = new ArrayList<>(n);

		// name
		String[] p_n = { "Chair", "Table", "Sofa", "Tivi", "Mirror", "Wardrobe ", "Lamp" };

		// color
		String[] c = { "Green", "Red", "Purple", "Yellow", "Brown", "Black", "White" };

		// material
		String[] m = { "Aluminium", "Copper", "Steel", "Plastic", "Rubber", "Glass" };

		// style
		String[] s = { "Big", "Blink", "Soft", "Vintage", "Old", "Luxury" };

		// sinh ngau nhien ptu mang
		int index;
		for (int i = 0; i < n; i++) {

			Interior interior = new Interior();

			interior.setProduct_id(i);

			index = (int) (Math.random() * p_n.length);
			interior.setProduct_name(p_n[index]);

			index = (10000 + (int) (Math.random() * 10000));
			interior.setProduct_price(index);

			index = (int) (Math.random() * 100);
			interior.setProduct_total(index);

			index = (int) (Math.random() * c.length);
			interior.setColor(c[index]);

			index = (int) (Math.random() * m.length);
			interior.setMaterial(m[index]);

			index = (int) (Math.random() * s.length);
			interior.setStyle(s[index]);

			this.list.add(interior);

		}
	}

	public void printList() {
		this.list.forEach(interior -> {
			System.out.println(interior);
		});
		System.out.println();
	}

	public void printList(List<Interior> list) {
		list.forEach(interior -> {
			System.out.println(interior);
		});
		System.out.println();
	}

	public static void main(String[] args) {
		// số phần tử
		int n = (int) (Math.random() * 6);

		TestInterior ti = new TestInterior();
		ti.generateList(n);
		ti.printList();

		// add
		InteriorManagerIMPL im = new InteriorManagerIMPL(list);
		im.addInterior(new Interior(7, "Speaker", 99999, 9, "BlueSky", "Wood", "Vintage"));
		System.out.println("List after add: ");
		System.out.println("------------------------");
		ti.printList();

		// edit
		im.editInterior(new Interior(7, "Laptop", 77777, 7, "Red", "Gold", "Blink"));
		System.out.println("List after edit: ");
		System.out.println("------------------------");
		ti.printList();

		// delete
		im.delInterior(new Interior(2, null, n, n, null, null, null));
		System.out.println("List after delete: ");
		System.out.println("------------------------");
		ti.printList();

		// search
		System.out.println("Search list: ");
		System.out.println("------------------------");
		ti.printList(im.searchInterior("Tivi"));

		// sort
		im.sortedInterior(0);
		System.out.println("List after sort: ");
		System.out.println("------------------------");
		ti.printList();
	}

}
