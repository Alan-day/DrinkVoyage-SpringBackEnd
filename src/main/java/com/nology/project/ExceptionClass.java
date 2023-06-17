package com.nology.project;

import org.springframework.http.HttpStatus;


public class ExceptionClass extends RuntimeException{



        private HttpStatus code = HttpStatus.NOT_FOUND;

    public void NotFoundException(String message) {

    }
        public HttpStatus getCode() {
            return code;
        }

        public void setCode(HttpStatus code) {
            this.code = code;
        }
    }








