import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

public class GetApi {
    public JsonNode getJSON() throws Exception{
        String getApi = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
        return Unirest.get(getApi).asJson().getBody();
    }
}
