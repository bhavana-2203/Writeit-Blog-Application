package com.writeit.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
	private String message;
	private LocalDateTime timestamp;
	private HttpStatus status;
	private int statuscode;

    public void setMessage(String all_Users_Deleted_Successfully_) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTimestamp(LocalDateTime now) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setStatuscode(int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setStatus(HttpStatus httpStatus) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}