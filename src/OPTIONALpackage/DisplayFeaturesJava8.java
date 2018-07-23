package OPTIONALpackage;

import java.util.Optional;

/**
 * @author Renjith
 *
 */
public class DisplayFeaturesJava8 {

	private String size; // In inches
	private Optional<ScreenResolution> resolution;
	
	public DisplayFeaturesJava8(String size, Optional<ScreenResolution> resolution){
		this.size = size;
		this.resolution = resolution;
	}
	
	public String getSize() {
		return size;
	}
	public Optional<ScreenResolution> getResolution() {
		return resolution;
	}
	
}