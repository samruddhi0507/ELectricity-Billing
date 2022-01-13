package com.wipro.eb.entity;

public class Commercial extends Connection {
	public Commercial ( int previousReading,int currentReading,float slabs[]) {
		super( previousReading, currentReading,slabs);
		}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		float amount =0 ;
		int consumed = currentReading+ previousReading;
		if(consumed<=50) {
			amount = consumed*slabs[0];
		}
		else if (consumed>50 && consumed<=100) {
			amount= 50*slabs[0]+(consumed-50)*slabs[1];
		}
		else {
			amount= 50*slabs[0]+50*slabs[1]+(consumed-100)*slabs[2];
		}
		if(amount>=10000) {
			amount = amount + (float)(amount*0.09);
		}
		else if (amount>=5000){
			amount = amount + (float)(amount*0.06);
		}
		else {
			amount = amount + (float)(amount*0.02) ;
		}
		return amount;		
	}
	
	}


