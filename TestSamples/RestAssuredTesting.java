import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class RestAssuredTesting {

    @Test
    public void responseCheck() {

        RestAssured.baseURI = "http://localhost:8063/api/sms/employee";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.queryParam("id","1").get();
        response.prettyPrint();
        String dateOfBirth = response.path("dateOfBirth");
        System.out.println(dateOfBirth);

    }
}
