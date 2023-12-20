package ktratx2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class InteriorManagerIMPL implements InteriorManager {

	private ArrayList<Interior> list;

	public InteriorManagerIMPL() {
		this.list = new ArrayList<Interior>();
	}

	public InteriorManagerIMPL(ArrayList<Interior> list) {
		this.list = list;
	}

	@Override
	public boolean addInterior(Interior i) {
		this.list.add(i); // add last
		return true;
	}

	@Override
	public boolean editInterior(Interior i) {
		for (Interior interior : list) {
			if (interior.getProduct_id() == i.getProduct_id()) {
				int n;
				do {
					System.out.println("\nMENU");
					System.out.println("Enter the selection you want to edit: ");
					System.out.println("" 
							+ "1. Edit Product_name.\n" 
							+ "2. Edit Product_price.\n"
							+ "3. Edit Product_total.\n" 
							+ "4. Edit Color.\n" 
							+ "5. Edit Material.\n"
							+ "6. Edit Style.\n" 
							+ "0. => Exit to see list after edit.\n");
					Scanner sc = new Scanner(System.in);
					n = sc.nextInt();

					if (n == 1) {
						System.out.println("Edited Successfully.");
						interior.setProduct_name(i.getProduct_name());
					} else if (n == 2) {
						System.out.println("Edited Successfully.");
						interior.setProduct_price(i.getProduct_price());
					} else if (n == 3) {
						System.out.println("Edited Successfully.");
						interior.setProduct_total(i.getProduct_total());
					} else if (n == 4) {
						System.out.println("Edited Successfully.");
						interior.setColor(i.getColor());
					} else if (n == 5) {
						System.out.println("Edited Successfully.");
						interior.setMaterial(i.getMaterial());
					} else if (n == 6) {
						System.out.println("Edited Successfully.");
						interior.setStyle(i.getStyle());
					}
				} while (n != 0);

			}
		}
		return true;
	}

	@Override
	public boolean delInterior(Interior i) {
		for (Interior interior : list) {
			if (interior.getProduct_id() == i.getProduct_id()) {
				list.remove(interior);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Interior> searchInterior(String name) {
		ArrayList<Interior> results = new ArrayList<Interior>();
		for (Interior interior : list) {
			if (interior.getProduct_name().equalsIgnoreCase(name)) {
				results.add(interior);
			}
		}
		return results;
	}

	@Override
	public List<Interior> sortedInterior(double price) {
		Collections.sort(this.list, new Comparator<Interior>() {

			@Override
			public int compare(Interior i1, Interior i2) {
				double value = i1.getProduct_price() - i2.getProduct_price();
				if (value > 0) {
					return 1;
				} else if (value < 0) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		return this.list;
	}

}
