package ethernallife.one.lib.color;

import java.util.HashMap;

public class VanillaColors implements ColorList{
	private HashMap<Integer, ColorMapping> list;

	public VanillaColors() {
			list = new HashMap<Integer, ColorMapping>();
		   list.put(0x0, new ColorMapping("White",0xDDDDDD));
	       list.put(0x1, new ColorMapping("Orange",0xDB7D3E));
	       list.put(0x2, new ColorMapping("Magenta",0xB350BC));
	       list.put(0x3, new ColorMapping("Light Blue",0x6B8AC9));
	       list.put(0x4, new ColorMapping("Yellow",0xB1A627));
	       list.put(0x5, new ColorMapping("Lime",0x41AE38));
	       list.put(0x6, new ColorMapping("Pink",0xD08499));
	       list.put(0x7, new ColorMapping("Gray",0x404040));
	       list.put(0x8, new ColorMapping("Light Gray",0x9AA1A1));
	       list.put(0x9, new ColorMapping("Cyan",0x2E6E89));
	       list.put(0xa, new ColorMapping("Purple",0x7E3DB5));
	       list.put(0xb, new ColorMapping("Blue",0x2E388D));
	       list.put(0xc, new ColorMapping("Brown",0x4F321F));
	       list.put(0xd, new ColorMapping("Green",0x35461B));
	       list.put(0xe, new ColorMapping("Red",0x963430));
	       list.put(0xf, new ColorMapping("Black",0x191616));
	}

	public HashMap<Integer, ColorMapping> getList() {
		return list;
	}
	
	
}
