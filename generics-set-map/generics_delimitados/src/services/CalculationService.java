package services;

import java.util.List;

public class CalculationService<Type>{
	
	public static <Type extends Comparable<? super Type>> Type max(List<Type> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		
		Type max = list.get(0);
		for (Type lis : list) {
			if (lis.compareTo(max) > 0) {
				max = lis;
			}
		}
		return max;
	}
}
