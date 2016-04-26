package edu.stanford.rsl.tutorial.JuliaG;

import ij.ImageJ;
import edu.stanford.rsl.conrad.data.numeric.Grid2D;
import edu.stanford.rsl.conrad.data.numeric.NumericGrid;
import edu.stanford.rsl.conrad.data.numeric.NumericPointwiseOperators;

public class BIO extends Grid2D {

	public BIO (int x, int y){
		super(x, y);
		//this.square(70,70,50,5);
		this.filledcircle(250, 250, 200, 2);
		this.filledellipse(2,1, 150, 170, 25, 1);
		this.filledellipse(2,1, 350, 170, 25, 1);
		this.filledellipse(2,1, 250, 350, 25, 1);
		//this.geometricobjects();
		spacing (1);
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
	
	public void spacing (double val){
		super.setSpacing (val,val);
		double origin = -(this.getWidth()-1)*(val/2);
		super.setOrigin(origin,origin);
	}
		
	
	public static void main (String[] args){
		new ImageJ();
		BIO b = new BIO(512,512);
		b.show("phantom1");
		//NumericPointwiseOperators.addBy(b, b);
		NumericGrid added = NumericPointwiseOperators.addedBy(b, b);
		added.show("addiert");
		double point [] = b.indexToPhysical (0,0);
		System.out.println (point[1]);
		
				
	}
}
 