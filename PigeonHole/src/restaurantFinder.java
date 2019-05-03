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
		String restaurantName = "";
		try {
			doc = Jsoup.connect("https://www.yelp.com/search?find_desc=" + person1Food + "%20" + person2Food + "&find_loc=Mantua%2C%20Philadelphia%2C%20PA").get();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		Elements allResults = doc.getElementsByAttributeValue("class", "lemon--ul__373c0__1_cxs undefined list__373c0__2G8oH");
		
		for (Element rank : allResults.select("li")) {
			if (rank.text().contains("1.")) {
				restaurantName = rank.select("h3 a").text();
				break;
			}
		}		
		
		System.out.println("A date is set!! You two will be going to " + restaurantName + " for a romantic dinner. Have fun!!");
	}
}
