package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `urlRedirectUpdate` mutation.
 */
public class UrlRedirectUpdatePayload {
  /**
   * Returns the updated URL redirect.
   */
  private UrlRedirect urlRedirect;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UrlRedirectUserError> userErrors;

  public UrlRedirectUpdatePayload() {
  }

  /**
   * Returns the updated URL redirect.
   */
  public UrlRedirect getUrlRedirect() {
    return urlRedirect;
  }

  public void setUrlRedirect(UrlRedirect urlRedirect) {
    this.urlRedirect = urlRedirect;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UrlRedirectUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UrlRedirectUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "UrlRedirectUpdatePayload{urlRedirect='" + urlRedirect + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirectUpdatePayload that = (UrlRedirectUpdatePayload) o;
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
    /**
     * Returns the updated URL redirect.
     */
    private UrlRedirect urlRedirect;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UrlRedirectUserError> userErrors;

    public UrlRedirectUpdatePayload build() {
      UrlRedirectUpdatePayload result = new UrlRedirectUpdatePayload();
      result.urlRedirect = this.urlRedirect;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Returns the updated URL redirect.
     */
    public Builder urlRedirect(UrlRedirect urlRedirect) {
      this.urlRedirect = urlRedirect;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UrlRedirectUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
