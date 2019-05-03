import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class restaurantFinder {
	
	private static Document doc;
	
	public static void main(String[] args) {
		findRestaurant("pizza", "pasta");
	}
	
	public static void findRestaurant(String person1Food, String person2Food) {
		try {
			doc = Jsoup.connect("https://www.yelp.com/search?find_desc=" + person1Food + "%20" + person2Food + "&find_loc=Mantua%2C%20Philadelphia%2C%20PA").get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		Element allResults = doc.getElementsByAttributeValue("class", "lemon--a__373c0__IEZFH link__373c0__29943 link-color--blue-dark__373c0__1mhJo link-size--inherit__373c0__2JXk5").first();
		System.out.println(allResults.text());
	}
}
