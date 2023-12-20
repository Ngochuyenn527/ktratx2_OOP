package ktratx2;

import java.util.*;

public interface InteriorManager {
	public boolean addInterior(Interior i);

	public boolean editInterior(Interior i);

	public boolean delInterior(Interior i);

	public List<Interior> searchInterior(String name);

	public List<Interior> sortedInterior(double price);
}
