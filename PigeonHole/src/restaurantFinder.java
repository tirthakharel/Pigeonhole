import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class restaurantFinder {
	
	private static Document doc;
	
	public static void findRestaurant(String person1Food, String person2Food) {
		try {
			doc = Jsoup.connect("https://www.yelp.com").get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
