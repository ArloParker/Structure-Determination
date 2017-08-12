package NMR;

import java.util.*;

public class Peak {
	
    boolean end;
	public float delta;
	public int integration;
	public int multiplicity;
	Hashtable electronEnvironment = new Hashtable();
	public Peak(){
	int[] adjacentIndex = new int[Spectrum.peaks.size()]; //list with indices of possible adjacent atoms- indices are of peaks ArrayList
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
		if(electronEnvironment.get("alkyl") && (integration%3 == 0)){
			end = true;
		}
		if(electronEnvironment.get("vinyl") && (integration%2 == 0)){
			end = true;
		}
	}
	
	public possibleAdjacent(){
		int j = 0;
		for(int i =0; i< Spectrum.peaks.size(); i++){
			if(multiplicity == Spectrum.peaks.get(i).integration){
				adjacentIndex[j] = i;
				j++;
			}
		}
	}
}

        
        