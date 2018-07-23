package OPTIONALpackage;

/**
 * @author Renjith
 *
 */
import java.util.Optional;

public class MobileJava8 {

	private long id;
	private String brand;
	private String name;
	private Optional<DisplayFeaturesJava8> displayFeatures;
	// Like wise we can see MemoryFeatures, CameraFeatures etc.
	// For simplicity, using only one Features
	
	public MobileJava8(long id, String brand, String name, Optional<DisplayFeaturesJava8> displayFeatures){
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.displayFeatures = displayFeatures;
	}

	public long getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public Optional<DisplayFeaturesJava8> getDisplayFeatures() {
		return displayFeatures;
	}
	
}
