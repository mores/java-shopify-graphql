package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class UrlRedirectDeletePayload {
  
  private String deletedUrlRedirectId;

  
  private List<UrlRedirectUserError> userErrors;

  public UrlRedirectDeletePayload() {
  }

  
  public String getDeletedUrlRedirectId() {
    return deletedUrlRedirectId;
  }

  public void setDeletedUrlRedirectId(String deletedUrlRedirectId) {
    this.deletedUrlRedirectId = deletedUrlRedirectId;
  }

  
  public List<UrlRedirectUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UrlRedirectUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "UrlRedirectDeletePayload{deletedUrlRedirectId='" + deletedUrlRedirectId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirectDeletePayload that = (UrlRedirectDeletePayload) o;
    return Objects.equals(deletedUrlRedirectId, that.deletedUrlRedirectId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedUrlRedirectId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedUrlRedirectId;

    
    private List<UrlRedirectUserError> userErrors;

    public UrlRedirectDeletePayload build() {
      UrlRedirectDeletePayload result = new UrlRedirectDeletePayload();
      result.deletedUrlRedirectId = this.deletedUrlRedirectId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedUrlRedirectId(String deletedUrlRedirectId) {
      this.deletedUrlRedirectId = deletedUrlRedirectId;
      return this;
    }

    
    public Builder userErrors(List<UrlRedirectUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
