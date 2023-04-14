import java.util.ArrayList;

public class AL_Demo{
	
	public static void main(String[] args) {
		ArrayList<String> band = new ArrayList<String>();
		band.add("Lindsey");
		band.add("Mick");
		band.add("Stevie");
		band.add("Dave");
		band.add("Christine");
		String remove = (String) band.remove(band.size() - 1);
		System.out.println(band);
		System.out.println(remove);
		System.out.println(band.size());
	}//eo main
	
}//eo AL_Demo