package OPTIONALpackage;

/**
 * @author Renjith
 *
 */
import java.util.Optional;

public class MobileServiceJava8 {

  public Integer getMobileScreenWidth(Optional<MobileJava8> mobile){
	return mobile.flatMap(MobileJava8::getDisplayFeatures)
		 .flatMap(DisplayFeaturesJava8::getResolution)
		 .map(ScreenResolution::getWidth)
		 .orElse(0);

  }

}
