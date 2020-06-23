package zzzJavaJSONJackson;


import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.junit.Test;


public class CarThree {
	
	
	 
    String brand;
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  //2016-11-16 06:43:19.77
    
    public CarThree(String brand) {
    	super();
    	this.brand = brand;
    }

    public String getBrand() { return this.brand; }
 

	public void   setBrand(String brand){ this.brand = brand;}

    public Timestamp  getTimestamp() 
    	{ return this.timestamp; }
    public void setTimestamp (Timestamp timestamp) 
    	{ this.timestamp = new Timestamp(System.currentTimeMillis());; }
    
}
