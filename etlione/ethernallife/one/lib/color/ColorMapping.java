package ethernallife.one.lib.color;

import java.util.HashMap;

public class ColorMapping {
	
	private String colorName;
	private int colorValue;
	
	
	
	public ColorMapping(String colorName, int colorValue) {
		this.colorName = colorName;
		this.colorValue = colorValue;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	public int getColorValue() {
		return colorValue;
	}
	public void setColorValue(int colorValue) {
		this.colorValue = colorValue;
	}

	
}
