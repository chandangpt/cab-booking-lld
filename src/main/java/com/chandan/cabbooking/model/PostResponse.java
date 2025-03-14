package com.chandan.cabbooking.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostResponse {

    public static final String OK_RESPONSE = "ok";
    public static final String ERROR_RESPONSE = "error";

    @JsonProperty private String status;
    @JsonProperty private String message;

    public static PostResponse ok() {
        return new PostResponse(OK_RESPONSE, null);
    }

    public static PostResponse error(final String message) {
        return new PostResponse(ERROR_RESPONSE, message);
    }
}
