package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `webPixelCreate` mutation.
 */
public class WebPixelCreatePayload {
  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ErrorsWebPixelUserError> userErrors;

  /**
   * The created web pixel settings.
   */
  private WebPixel webPixel;

  public WebPixelCreatePayload() {
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ErrorsWebPixelUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ErrorsWebPixelUserError> userErrors) {
    this.userErrors = userErrors;
  }

  /**
   * The created web pixel settings.
   */
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
    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ErrorsWebPixelUserError> userErrors;

    /**
     * The created web pixel settings.
     */
    private WebPixel webPixel;

    public WebPixelCreatePayload build() {
      WebPixelCreatePayload result = new WebPixelCreatePayload();
      result.userErrors = this.userErrors;
      result.webPixel = this.webPixel;
      return result;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ErrorsWebPixelUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }

    /**
     * The created web pixel settings.
     */
    public Builder webPixel(WebPixel webPixel) {
      this.webPixel = webPixel;
      return this;
    }
  }
}
