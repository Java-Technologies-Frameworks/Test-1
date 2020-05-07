import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map map = new LinkedHashMap();

		map.put("src1", "dest1");
		map.put("src2", "dest2");
		map.put("src3", "dest3");
		map.put("src4", "dest4");

		String[] keys = new String[map.size()];
		String[] values = new String[map.size()];
        String filter="";
		int i = 0;
		Set entries = map.entrySet();
		Iterator iterator = entries.iterator();

		while (iterator.hasNext()) {
			Map.Entry mapping = (Map.Entry) iterator.next();
			keys[i] = mapping.getKey().toString();
			filter=filter+keys[i]+":(";
			values[i] = map.get(keys[i]).toString();
			filter=filter+values[i]+")"+" ";	
			i++;
		}
		
		System.out.println(filter);
	}

}
