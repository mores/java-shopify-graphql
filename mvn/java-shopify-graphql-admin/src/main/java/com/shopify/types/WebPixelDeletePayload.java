package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class WebPixelDeletePayload {
  
  private String deletedWebPixelId;

  
  private List<ErrorsWebPixelUserError> userErrors;

  public WebPixelDeletePayload() {
  }

  
  public String getDeletedWebPixelId() {
    return deletedWebPixelId;
  }

  public void setDeletedWebPixelId(String deletedWebPixelId) {
    this.deletedWebPixelId = deletedWebPixelId;
  }

  
  public List<ErrorsWebPixelUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ErrorsWebPixelUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "WebPixelDeletePayload{deletedWebPixelId='" + deletedWebPixelId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebPixelDeletePayload that = (WebPixelDeletePayload) o;
    return Objects.equals(deletedWebPixelId, that.deletedWebPixelId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedWebPixelId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedWebPixelId;

    
    private List<ErrorsWebPixelUserError> userErrors;

    public WebPixelDeletePayload build() {
      WebPixelDeletePayload result = new WebPixelDeletePayload();
      result.deletedWebPixelId = this.deletedWebPixelId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedWebPixelId(String deletedWebPixelId) {
      this.deletedWebPixelId = deletedWebPixelId;
      return this;
    }

    
    public Builder userErrors(List<ErrorsWebPixelUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
