package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `urlRedirectImportCreate` mutation.
 */
public class UrlRedirectImportCreatePayload {
  /**
   * The created `URLRedirectImport` object.
   */
  private UrlRedirectImport urlRedirectImport;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UrlRedirectImportUserError> userErrors;

  public UrlRedirectImportCreatePayload() {
  }

  /**
   * The created `URLRedirectImport` object.
   */
  public UrlRedirectImport getUrlRedirectImport() {
    return urlRedirectImport;
  }

  public void setUrlRedirectImport(UrlRedirectImport urlRedirectImport) {
    this.urlRedirectImport = urlRedirectImport;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The created `URLRedirectImport` object.
     */
    private UrlRedirectImport urlRedirectImport;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UrlRedirectImportUserError> userErrors;

    public UrlRedirectImportCreatePayload build() {
      UrlRedirectImportCreatePayload result = new UrlRedirectImportCreatePayload();
      result.urlRedirectImport = this.urlRedirectImport;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created `URLRedirectImport` object.
     */
    public Builder urlRedirectImport(UrlRedirectImport urlRedirectImport) {
      this.urlRedirectImport = urlRedirectImport;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UrlRedirectImportUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
