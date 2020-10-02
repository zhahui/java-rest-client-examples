package net.huizha.examples.restclient;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.huizha.examples.restclient.models.RestApiExampleEmployeeResponse;

/**
 * Apache fluent API REST client.
 * https://stackoverflow.com/questions/6349421/how-to-use-jackson-to-deserialise-an-array-of-objects
 *
 */
public class ApacheFluentApiRestClient {
    private static Logger LOGGER = LogManager.getLogger(ApacheFluentApiRestClient.class);

    public static void main(String[] args) {
        try {
            String response = Request.Get("http://dummy.restapiexample.com/api/v1/employees").connectTimeout(1000)
                    .socketTimeout(1000).execute().returnContent().asString();
            JSONObject json = new JSONObject(response);
            LOGGER.debug(json.toString(2));
            RestApiExampleEmployeeResponse responseObject = new ObjectMapper().readValue(response, RestApiExampleEmployeeResponse.class);
        } catch (ClientProtocolException e) {
            LOGGER.error("HTTP protocol error", e);
        } catch (IOException e) {
            LOGGER.error("IO exception", e);
        }
    }
}
