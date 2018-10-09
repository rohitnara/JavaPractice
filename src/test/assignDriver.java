package test;
import java.util.*;
import java.lang.*;
import java.io.*;
public class assignDriver implements Comparable {
	int dId;
	double bestRating;
	assignDriver(int dId,double bestRating){
		this.dId=dId;
		this.bestRating=bestRating;
	}
	public int compareTo(Object o){
		assignDriver a=(assignDriver)o;
		if(this.bestRating==a.bestRating)
			return 0;
		else if(this.bestRating<a.bestRating)
			return 1;
		else 
			return -1;
	}
}
