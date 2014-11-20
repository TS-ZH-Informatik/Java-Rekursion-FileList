package com.soe.alfano.SmallestValue;

public class SmallestValueTest {
	
	public static void main(String[] args){
		
		int[] data = {1,342,123,412,1,34,21,45};
		SmallestValue sv = new SmallestValue(data);
		System.out.println(sv.getSmallestValue());
	}

}
