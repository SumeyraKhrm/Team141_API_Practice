package Test_API;

import baseUrl.BaseUrlJsonPlaceholder;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C17_BaseUrlDummyRestapi extends BaseUrlJsonPlaceholder {

    //Class icinde 2 Test metodu olusturun ve asagidaki testleri yapin


    @Test
    public void test01(){

        //1-  https://jsonplaceholder.typicode.com/posts endpointine
        //    bir GET request gonderdigimizde donen response’un
        //    status code’unun 200 oldugunu ve Response’ta 100 kayit oldugunu test edin

        // 1- endpoint ve request body olustur
        specJsonPlaceholder.pathParam("pp1","posts"); //bir tane oldugu icin

        // 2- expected data olustur
        // 3- request gonder ve donen response'i kaydet

        Response response = given()
                .when().spec(specJsonPlaceholder)
                .get("/{pp1}");

        //response.prettyPrint();

        response.then().assertThat()
                .statusCode(200)
                .body("title",Matchers.hasSize(100));

    }


        @Test
        public void
        test02(){
            //2- https://jsonplaceholder.typicode.com/posts/44 endpointine
            //   bir GET request gonderdigimizde donen response’un
            //   status code’unun 200 oldugunu
            //   ve “title” degerinin “optio dolor molestias sit” oldugunu test edin

            // 1- endpoint ve request body olustur
        specJsonPlaceholder.pathParams("pp1","posts","pp2",44);


            // 2- expected data olustur
            // 3- request gonder ve donen response'i kaydet
            Response response = given()
                    .when().spec(specJsonPlaceholder)
                    .get("/{pp1/pp2}");

            //response.prettyPrint();


            response.then().assertThat()
                    .statusCode(200)
                    .body("title",Matchers.equalTo("optio dolor molestias sit"));


        }
}
