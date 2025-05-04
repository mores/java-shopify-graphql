package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `webPresenceUpdate` mutation.
 */
public class WebPresenceUpdatePayload {
  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketUserError> userErrors;

  /**
   * The web presence object.
   */
  private MarketWebPresence webPresence;

  public WebPresenceUpdatePayload() {
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MarketUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketUserError> userErrors) {
    this.userErrors = userErrors;
  }

  /**
   * The web presence object.
   */
  public MarketWebPresence getWebPresence() {
    return webPresence;
  }

  public void setWebPresence(MarketWebPresence webPresence) {
    this.webPresence = webPresence;
  }

  @Override
  public String toString() {
    return "WebPresenceUpdatePayload{userErrors='" + userErrors + "', webPresence='" + webPresence + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebPresenceUpdatePayload that = (WebPresenceUpdatePayload) o;
    return Objects.equals(userErrors, that.userErrors) &&
        Objects.equals(webPresence, that.webPresence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors, webPresence);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketUserError> userErrors;

    /**
     * The web presence object.
     */
    private MarketWebPresence webPresence;

    public WebPresenceUpdatePayload build() {
      WebPresenceUpdatePayload result = new WebPresenceUpdatePayload();
      result.userErrors = this.userErrors;
      result.webPresence = this.webPresence;
      return result;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MarketUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }

    /**
     * The web presence object.
     */
    public Builder webPresence(MarketWebPresence webPresence) {
      this.webPresence = webPresence;
      return this;
    }
  }
}
