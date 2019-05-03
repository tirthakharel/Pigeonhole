import java.util.HashMap;

/*this class keeps track of a document\ 
 *edited version of Swapneel's original
 *document class to account for websites
 *instead of .txt files
 *
 *author: Tirtha Kharel
 */
public class Document implements Comparable<Document> {
    
    private HashMap<String, Integer> termFrequencies;
    
    public Document(String songName) {
        
    }

    @Override
    public int compareTo(Document o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}