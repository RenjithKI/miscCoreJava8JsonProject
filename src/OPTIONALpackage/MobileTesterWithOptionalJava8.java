package OPTIONALpackage;

/**
 * @author Renjith
 *
 */
import java.util.Optional;

public class MobileTesterWithOptionalJava8 {
	
  public static void main(String[] args) {
	ScreenResolution resolution = new ScreenResolution(750,1334);
	DisplayFeaturesJava8 dfeatures = new DisplayFeaturesJava8("4.7", Optional.of(resolution));
	MobileJava8 mobile = new MobileJava8(2015001, "Apple", "iPhone 6s", Optional.of(dfeatures));
		
	MobileServiceJava8 mService = new MobileServiceJava8();
		
	int width = mService.getMobileScreenWidth(Optional.of(mobile));
	System.out.println("Apple iPhone 6s Screen Width = " + width);

	MobileJava8 mobile2 = new MobileJava8(2015001, "Apple", "iPhone 6s", Optional.empty());		
	int width2 = mService.getMobileScreenWidth(Optional.of(mobile2));
	System.out.println("Apple iPhone 16s Screen Width = " + width2);
  }
}