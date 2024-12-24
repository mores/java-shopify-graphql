package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class UrlRedirectImportCreatePayload {
  
  private UrlRedirectImport urlRedirectImport;

  
  private List<UrlRedirectImportUserError> userErrors;

  public UrlRedirectImportCreatePayload() {
  }

  
  public UrlRedirectImport getUrlRedirectImport() {
    return urlRedirectImport;
  }

  public void setUrlRedirectImport(UrlRedirectImport urlRedirectImport) {
    this.urlRedirectImport = urlRedirectImport;
  }

  
  public List<UrlRedirectImportUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UrlRedirectImportUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "UrlRedirectImportCreatePayload{urlRedirectImport='" + urlRedirectImport + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirectImportCreatePayload that = (UrlRedirectImportCreatePayload) o;
    return Objects.equals(urlRedirectImport, that.urlRedirectImport) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlRedirectImport, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private UrlRedirectImport urlRedirectImport;

    
    private List<UrlRedirectImportUserError> userErrors;

    public UrlRedirectImportCreatePayload build() {
      UrlRedirectImportCreatePayload result = new UrlRedirectImportCreatePayload();
      result.urlRedirectImport = this.urlRedirectImport;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder urlRedirectImport(UrlRedirectImport urlRedirectImport) {
      this.urlRedirectImport = urlRedirectImport;
      return this;
    }

    
    public Builder userErrors(List<UrlRedirectImportUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
