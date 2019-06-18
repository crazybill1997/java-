package Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 首先来看看Map集合获取元素的三种常见方法keySet()、values()、entrySet()
 * @author 李若冰
 *
 */

public class Map01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "aaa");
		map.put("b", "bbb");
		map.put("c", "ccc");
		
		Collection<String> coll = map.values(); //获取map集合的所有value的Collection集合（于集合中无序存放）
		System.out.println(coll);
	}
}
