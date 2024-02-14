package com.example.demo;
public class SeriesCalculator {
	private float x;
	private int n;
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void calculate() {
		float result=1;
		for(int i=1;i<=n;i++) {
			result+=Math.pow(x, i)/fact(i);
		}
		System.out.println(result);
	}
	public int fact(int n) {
		int factorial=1;
		if(n!=1) {
			factorial= n*fact(n-1);	
		}
		return factorial;
		
	}

}