package edu.stanford.rsl.tutorial.JuliaG;

import ij.ImageJ;
import edu.stanford.rsl.conrad.data.numeric.Grid2D;

public class BIO extends Grid2D {

	public BIO (int x, int y){
		super(x, y);
		//this.square(70,70,50,5);
		this.filledcircle(270, 270, 220, 2);
		this.filledellipse(2,1, 160, 180, 20, 1);
		this.filledellipse(2,1, 400, 180, 20, 1);
		this.filledellipse(2,1, 280, 400, 40, 1);
		//this.geometricobjects();
	}
	private void square (int x, int y, int w, int i){
		for (int j = x; j<=(w+x); j++){
			for (int k = y; k<=(w+y);k++){
				this.setAtIndex(j, k, i);
			}
		}
	}
	
	private void filledcircle (int m, int n, int r, int i){
		for (int j=0; j<=this.getHeight(); j++){
			for (int k = 0; k<= this.getWidth(); k++){
				int val=(j-m)*(j-m)+(k-n)*(k-n);
				if (val<= (r*r)){
					this.setAtIndex(j,k,i);
				}
					
			}
		}
	}
	
	private void filledellipse(int a, int b, int m, int n, int r, int i){
		for (int j=0; j<=this.getHeight(); j++){
			for (int k = 0; k<= this.getWidth(); k++){
				int val=(j-m)*(j-m)/(a*a)+(k-n)*(k-n)/(b*b);
				if (val<= (r*r)){
					this.setAtIndex(j,k,i);
				}
					
			}
		}	
	}
	
	private void geometricobjects() {
		
		
		for (int i=392;i<=442;i++){
			for (int j=392;j<=442;j++){
					this.setAtIndex(i,j,1);
			}
		}
		for (int i=70;i<=120;i++){
			for (int j=70;j<=120;j++){
					this.setAtIndex(i,j,5);
			}
		}
	
		for (int i=500;i<=512;i++){
			for (int j=500;j<=512;j++){
					this.setAtIndex(i,j,1);
			}
		}		
		
	}
	public static void main (String[] args){
		new ImageJ();
		BIO b = new BIO(512,512);
		b.show();
	}
}
 