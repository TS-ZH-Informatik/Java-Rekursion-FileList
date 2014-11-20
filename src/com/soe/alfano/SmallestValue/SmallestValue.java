package com.soe.alfano.SmallestValue;

public class SmallestValue {

	private int[] data;
	private int value;
	
	public SmallestValue(int[] data){
		this.data = data;
	}
	
	public int getSmallestValue(){
		if(data.length == 2){
			if(data[0] < data[1])
				return data[0];
			else
				return data[1];
		}

		int length = data.length-1;
		value = data[length];
		
		int[] smallerData = new int[length-1];
		for (int i=0; i < smallerData.length; i++){
			smallerData[i] = data[i];
		}
		
		SmallestValue smaller = new SmallestValue(smallerData);
		int smallerValue = smaller.getSmallestValue();
		if(smallerValue < value)
			value = smallerValue;
		return value;
	}
}
