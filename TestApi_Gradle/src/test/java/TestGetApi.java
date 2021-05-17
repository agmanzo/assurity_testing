import org.json.JSONArray;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestGetApi {
    @Test
    public void testName() throws Exception{
        GetApi testClass = new GetApi();
        String expectedValue = "Carbon credits";
        String actualValue = testClass.getJSON().getObject().get("Name").toString();
        Assert.assertEquals("Test for api name", expectedValue, actualValue);
    }

    @Test
    public void testCanRelist() throws Exception{
        GetApi testClass = new GetApi();
        Boolean expectedValue = true;
        Boolean actualValue = Boolean.parseBoolean(testClass.getJSON().getObject().get("CanRelist").toString());
        Assert.assertEquals("Test for api CanRelist", expectedValue, actualValue);
    }

    @Test
    public void testPromotions() throws Exception{
        GetApi testClass = new GetApi();
        Boolean galleryExists = false;
        String promotionName = "Gallery";
        String expectedValue = "2x larger image";
        String actualValue = "";
        JSONArray promotionsArray = testClass.getJSON().getObject().getJSONArray("Promotions");
        for(int x=0; x < promotionsArray.length(); x++) {
            if(!promotionsArray.getJSONObject(x).get("Name").toString().contains(promotionName)) continue;
            galleryExists = true; //set to true meaning the name exists
            actualValue = promotionsArray.getJSONObject(x).get("Description").toString();
        }
        Assert.assertEquals("Test for promotion Gallery Exists", true, galleryExists);
        Assert.assertEquals("Test for promotion Gallery Description", expectedValue, actualValue);
    }
}
