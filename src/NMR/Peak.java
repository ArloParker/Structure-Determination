package NMR;

import java.util.*;

public class Peak {
	
	boolean end;
	public float delta;
	public int integration;
	public int multiplicity;
	int[] adjacentIndex; //list with indices of possible adjacent atoms- indices are of peaks ArrayList
	Hashtable electronEnvironment = new Hashtable();
	
	
	public Peak(Spectrum spectrum){
		 adjacentIndex = new int[spectrum.peaks.size()];
		 
	}
	
	
	public void typeEval(){
		if(2.5 > delta){
			electronEnvironment.put("alkyl", new Boolean(true));
		}
		if(4.5 > delta && delta > 3){
			electronEnvironment.put("halogen", new Boolean(true));
		}
		if(6 > delta && delta > 4){
			electronEnvironment.put("vinyl", new Boolean(true));
		}
		if(9.5 > delta && delta > 6){
			electronEnvironment.put("aromatic", new Boolean(true));
		}
		if(3 > delta && delta > 2){
			electronEnvironment.put("acetyl", new Boolean(true));
		}
		if(13 > delta && delta > 10){
			electronEnvironment.put("acid", new Boolean(true));
		}
		if(4.5 > delta && delta > 3){
			electronEnvironment.put("e_adj", new Boolean(true));
		}
	}
	
	public void endAtomEval(){
		if(((Boolean)(electronEnvironment.get("alkyl"))).booleanValue() && (integration%3 == 0)){
			end = true;
		}
		if(((Boolean)(electronEnvironment.get("vinyl"))).booleanValue() && (integration%2 == 0)){
			end = true;
		}
	}
	
	public void possibleAdjacent(Spectrum spectrum){
		int j = 0;
		for(int i =0; i< spectrum.peaks.size(); i++){
			if(multiplicity == spectrum.peaks.get(i).integration){
				adjacentIndex[j] = i;
				j++;
			}
		}
	}
}

        
        