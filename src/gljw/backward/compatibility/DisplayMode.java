package gljw.backward.compatibility;

public class DisplayMode {
	
	int w, h;
	int redBits, greenBits, blueBits;
	int refreshRate;
	
	public DisplayMode(int width, int height) {
		w = width;
		h = height;
	}
	
	DisplayMode(int width, int height, int r, int g, int b, int refreshRate) {
		w = width;
		h = height;
		redBits = r;
		greenBits = g;
		blueBits = b;
		this.refreshRate = refreshRate;
	}
	
	@Override
	public String toString() {
		return w + "x" + h + " #" + refreshRate + "Hz";
	}
}
