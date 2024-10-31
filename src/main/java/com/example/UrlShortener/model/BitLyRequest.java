package com.example.UrlShortener.model;

import lombok.Data;

@Data
public class BitLyRequest {

    private String longURL;


   public String getLongURL() {
       return longURL;

   }

   public void setLongURL(String longURL) {
      this.longURL = longURL;

   }
}
