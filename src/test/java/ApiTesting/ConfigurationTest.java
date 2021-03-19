package ApiTesting;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

// This class contains the configurations needed for the API testing
// This configuration will start Before the the test class
public class ConfigurationTest {

    public static RequestSpecification characters_requestSpec;
    public static ResponseSpecification characters_responseSpec;
    @BeforeClass
    public static void setup(){
        characters_requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://breakingbadapi.com")
                .setBasePath("/api/")
                .addHeader("Content-type","application/json")
                .addHeader("Accept","application/json")
                .build();
        characters_responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

        RestAssured.requestSpecification = characters_requestSpec;
        RestAssured.responseSpecification = characters_responseSpec;
    }
}
