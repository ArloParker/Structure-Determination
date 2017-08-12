package NMR;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileInterpreter {
	
	ArrayList possiblePeaks = new ArrayList();
	ArrayList xData = new ArrayList();
	ArrayList yData = new ArrayList();
	
	
	public FileInterpreter(File data){
	}
	
	public void getData(File data){
		try {
	    	Scanner sc = new Scanner(data);
	    	int i = 0;
	    	while(sc.hasNextLine()){
	    		xData.set(i, sc.nextInt());
	    		yData.set(i,sc.nextInt());
	    		i++;
	    	}
	    }
	    	catch (FileNotFoundException e) {
	    	        e.printStackTrace();
	    	
	    }
	}
	
	public void findPeaks(){
		float prevDelta = 0;
		for(int i=0; i < xData.size(); i++){

			float delta = (yData.get(i+1) - yData.get(i)) / (xData.get(i+1) - xData.get(i));
			if(float delta < 0 && prevdelta > 0){
				
			}
			
		}
	}

	
}
