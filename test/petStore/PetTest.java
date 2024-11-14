package petStore;


import io.restassured.http.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;


public class PetTest extends BaseTest{

    @DataProvider(name = "FindPetById")
    public Iterator<Object[]> findPetDp () {
        Collection<Object[]> dp = new ArrayList<>();
      //  dp.add(new String[] {"100","200"});
        dp.add(new String[] {"9999","404",""});
        dp.add(new String[] {"10","200","doggie"});
        return dp.iterator();
    }

    @Test(dataProvider = "FindPetById")
    public void findPetById(String petId, String responseCode,String name){

        Response response =  httpRequest.request(Method.GET,"/pet/{petId}", petId);
        Assert.assertEquals(response.getStatusCode(),Integer.parseInt(responseCode));
        assertThat(response.getStatusLine(), Matchers.containsStringIgnoringCase("HTTP/1.1"));
        Assert.assertEquals(response.getHeader("Content-Type"),"application/json");
        Assert.assertEquals(response.getHeader("Access-Control-Allow-Methods"),"GET, POST, DELETE, PUT");
        Assert.assertEquals(response.getDetailedCookies().asList().size(),0);
        System.out.println(response.getBody().asString());
        JsonPath jsonPathEvaluator = response.jsonPath();
//        System.out.println(jsonPathEvaluator.get("name").toString());
        if(response.getStatusCode()==404){
            Assert.assertEquals(jsonPathEvaluator.getString("message"),"Pet not found");
        }
        if(response.getStatusCode()==200){
            Assert.assertEquals(jsonPathEvaluator.getString("name"),name);
      //      Assert.assertEquals(jsonPathEvaluator.getString("category.name"),"string");

        }


//        Cookies cookies = response.getDetailedCookies();
//        System.out.println("Found cookies: "+ cookies.asList().size());
//        for(Cookie c : cookies){
//            System.out.println(c.getName() + ": " + c.getValue());
//        }
//
//        Headers headers = response.getHeaders();
//        for (Header h:headers)
//              {
//                  System.out.println(h.getName()+": " + h.getValue());
//        }
//        System.out.println(response.prettyPrint());

    }
    @Test
    public void createPet(){
        httpRequest.body("{\"{\\n\" +\n" +
                "                \"  \\\"id\\\": 0,\\n\" +\n" +
                "                \"  \\\"category\\\": {\\n\" +\n" +
                "                \"    \\\"id\\\": 0,\\n\" +\n" +
                "                \"    \\\"name\\\": \\\"string\\\"\\n\" +\n" +
                "                \"  },\\n\" +\n" +
                "                \"  \\\"name\\\": \\\"doggie\\\",\\n\" +\n" +
                "                \"  \\\"photoUrls\\\": [\\n\" +\n" +
                "                \"    \\\"string\\\"\\n\" +\n" +
                "                \"  ],\\n\" +\n" +
                "                \"  \\\"tags\\\": [\\n\" +\n" +
                "                \"    {\\n\" +\n" +
                "                \"      \\\"id\\\": 0,\\n\" +\n" +
                "                \"      \\\"name\\\": \\\"}");
        Response response =  httpRequest.request(Method.GET,"/pet");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());


    }
    @Test
    public void createPet2(){
        JSONObject requestParams = new JSONObject();
        requestParams.put("id", "100");
        requestParams.put("name", "doggie");
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(requestParams.toString());
        Response response = httpRequest.request(Method.POST, "/pet");
        System.out.println(response.getBody().asString());


    }



}
