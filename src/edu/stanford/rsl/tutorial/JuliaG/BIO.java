package edu.stanford.rsl.tutorial.JuliaG;

import edu.stanford.rsl.conrad.data.numeric.Grid2D;

public class BIO extends Grid2D {

	public BIO (int x, int y){
		super(x, y);
		this.geometricobjects();
	}

	private void geometricobjects() {
		
		
	}
	public static void main (String[] args){
		BIO b = new BIO(512,512);
		b.show();
	}
}
 