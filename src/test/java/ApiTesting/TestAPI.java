package ApiTesting;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

// This class contains the tests that we are going to do for the breakingbad API
public class TestAPI extends ConfigurationTest {

    @Test
    public void showCharacterBirthdayTest(){
        CharacterPojo pj = new CharacterPojo();
        pj.setName(given()
                .when()
                .get("characters/3")
                .then().extract().path("name"));
        pj.setBirthday(given()
                        .when()
                        .get("characters/3")
                .then().extract().path("birthday"));

        System.out.println("-- Getting Birthday of Skyler White --");
        System.out.println("Characters name: "+pj.getName());
        System.out.println("Birthday:" +pj.getBirthday());
    }

    @Test
    public void showCharacterInformationTest(){
        CharacterPojo pj = new CharacterPojo();
        pj.setName(given()
                .when()
                .get("characters/")
                .then().extract().path("name"));
        pj.setPortrayed(given()
                .when()
                .get("characters/")
                .then().extract().path("portrayed"));

        System.out.println("-- Getting 'Name' and 'Interpreted by' --");

        for (int i=0; i<62; i++)
        {

            System.out.println("Characters name: " + pj.getName().get(i));
            System.out.println("interpreted by:" + pj.getPortrayed().get(i));
            System.out.println("---------------------------------------------");
        }
    }

    @Test
    public static void showAllCharacterInformationTest(){
        given()
                .log().all()
                .when().get("characters")
                .then()
                .log().all();
    }
}