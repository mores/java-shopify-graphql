package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class UrlRedirectCreatePayload {
  
  private UrlRedirect urlRedirect;

  
  private List<UrlRedirectUserError> userErrors;

  public UrlRedirectCreatePayload() {
  }

  
  public UrlRedirect getUrlRedirect() {
    return urlRedirect;
  }

  public void setUrlRedirect(UrlRedirect urlRedirect) {
    this.urlRedirect = urlRedirect;
  }

  
  public List<UrlRedirectUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UrlRedirectUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "UrlRedirectCreatePayload{urlRedirect='" + urlRedirect + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirectCreatePayload that = (UrlRedirectCreatePayload) o;
    return Objects.equals(urlRedirect, that.urlRedirect) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlRedirect, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private UrlRedirect urlRedirect;

    
    private List<UrlRedirectUserError> userErrors;

    public UrlRedirectCreatePayload build() {
      UrlRedirectCreatePayload result = new UrlRedirectCreatePayload();
      result.urlRedirect = this.urlRedirect;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder urlRedirect(UrlRedirect urlRedirect) {
      this.urlRedirect = urlRedirect;
      return this;
    }

    
    public Builder userErrors(List<UrlRedirectUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
