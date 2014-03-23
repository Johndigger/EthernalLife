package ethernallife.one.lib.color;

import java.util.HashMap;

public class VanillaChatColors implements ColorList {
	private HashMap<Integer, ColorMapping> list;

	public VanillaChatColors() {
			list = new HashMap<Integer, ColorMapping>();
		   list.put(0x0, new ColorMapping("Black",0x000000));
	       list.put(0x1, new ColorMapping("Dark Blue",0x0000AA));
	       list.put(0x2, new ColorMapping("Dark Green",0x00AA00));
	       list.put(0x3, new ColorMapping("Dark Aqua",0x00AAAA));
	       list.put(0x4, new ColorMapping("Dark Red",0xAA0000));
	       list.put(0x5, new ColorMapping("Dark Purple",0xAA00AA));
	       list.put(0x6, new ColorMapping("Gold",0xFFAA00));
	       list.put(0x7, new ColorMapping("Gray",0xAAAAAA));
	       list.put(0x8, new ColorMapping("Dark Gray",0x555555));
	       list.put(0x9, new ColorMapping("Blue",0x5555FF));
	       list.put(0xa, new ColorMapping("Green",0x55FF55));
	       list.put(0xb, new ColorMapping("Aqua",0x55FFFF));
	       list.put(0xc, new ColorMapping("Red",0xFF5555));
	       list.put(0xd, new ColorMapping("Light Purple",0xFF55FF));
	       list.put(0xe, new ColorMapping("Yellow",0xFFFF55));
	       list.put(0xf, new ColorMapping("White",0xFFFFFF));
	       
	}

	@Override
	public HashMap<Integer, ColorMapping> getList() {
		return list;
	}
	
}
