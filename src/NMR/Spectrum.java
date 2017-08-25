package NMR;
import java.util.*;
public class Spectrum {
//Data Assuming Formula is Known
    int carbon; 
    int hydrogen;
    int oxygen;
    int nitrogen;
    int halogen;
    int hydrogenDeficit;
    ArrayList peaks = new ArrayList(); //list of peak objects
    
    public Spectrum(){
    }
    
    public void calcDeficit(){
    	hydrogenDeficit = (((carbon+nitrogen)*2)+2-hydrogen-nitrogen)/2;
    	
    }
    
    public int integrationRatio(){
    	int totalH = 0;
    	for(int i =0; i<peaks.size(); i++){
    		totalH += (peaks.get(i)).integration;
    	}
    	int ratioH = hydrogen/totalH;
    	return ratioH;
    }
}

        		