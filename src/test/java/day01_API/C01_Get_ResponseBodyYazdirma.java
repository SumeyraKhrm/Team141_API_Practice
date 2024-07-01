package day01_API;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;



public class C01_Get_ResponseBodyYazdirma {


    @Test
    public void get01(){

        // manuel olarak postman de kontrol edildi
        // https://restful-booker.herokuapp.com/booking/10 url’ine
        // bir GET request gonderdigimizde donen Response’u yazdirin.

        // 1- Request body ve end-point hazirlama

        String Url = "https://restful-booker.herokuapp.com/booking/10";

        // 2- Expected data hazirlama

        // 3- Request gonderip, donen response'i kaydetme

        Response response = given().when().get(Url);
        response.prettyPrint();

        // 4- Assertion

        //Postman daki responce un aynısınıı getirdi !!


    }


    }
