package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class WebPixelCreatePayload {
  
  private List<ErrorsWebPixelUserError> userErrors;

  
  private WebPixel webPixel;

  public WebPixelCreatePayload() {
  }

  
  public List<ErrorsWebPixelUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ErrorsWebPixelUserError> userErrors) {
    this.userErrors = userErrors;
  }

  
  public WebPixel getWebPixel() {
    return webPixel;
  }

  public void setWebPixel(WebPixel webPixel) {
    this.webPixel = webPixel;
  }

  @Override
  public String toString() {
    return "WebPixelCreatePayload{userErrors='" + userErrors + "', webPixel='" + webPixel + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebPixelCreatePayload that = (WebPixelCreatePayload) o;
    return Objects.equals(userErrors, that.userErrors) &&
        Objects.equals(webPixel, that.webPixel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors, webPixel);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ErrorsWebPixelUserError> userErrors;

    
    private WebPixel webPixel;

    public WebPixelCreatePayload build() {
      WebPixelCreatePayload result = new WebPixelCreatePayload();
      result.userErrors = this.userErrors;
      result.webPixel = this.webPixel;
      return result;
    }

    
    public Builder userErrors(List<ErrorsWebPixelUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }

    
    public Builder webPixel(WebPixel webPixel) {
      this.webPixel = webPixel;
      return this;
    }
  }
}
