import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

public class SearchEngine implements URLHandler{
    ArrayList<String> arrayList= new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")){
            return null;
        }
        else if ((url.getPath().equals("/add"))){

        }
    }
}

