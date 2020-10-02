package net.huizha.examples.restclient.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RestApiExampleEmployeeResponse {
    private RestApiExampleEmployee[] data;
    private String status;

    @JsonGetter("data")
    public RestApiExampleEmployee[] getData() {
        return data;
    }

    @JsonSetter("data")
    public void setData(RestApiExampleEmployee[] data) {
        this.data = data;
    }

    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }
}
