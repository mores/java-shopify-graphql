package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketWebPresenceDelete` mutation.
 */
public class MarketWebPresenceDeletePayload {
  /**
   * The ID of the deleted web presence.
   */
  private String deletedId;

  /**
   * The market for which the web presence was deleted.
   */
  private Market market;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketUserError> userErrors;

  public MarketWebPresenceDeletePayload() {
  }

  /**
   * The ID of the deleted web presence.
   */
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
  }

  /**
   * The market for which the web presence was deleted.
   */
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
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

  @Override
  public String toString() {
    return "MarketWebPresenceDeletePayload{deletedId='" + deletedId + "', market='" + market + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketWebPresenceDeletePayload that = (MarketWebPresenceDeletePayload) o;
    return Objects.equals(deletedId, that.deletedId) &&
        Objects.equals(market, that.market) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedId, market, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted web presence.
     */
    private String deletedId;

    /**
     * The market for which the web presence was deleted.
     */
    private Market market;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketUserError> userErrors;

    public MarketWebPresenceDeletePayload build() {
      MarketWebPresenceDeletePayload result = new MarketWebPresenceDeletePayload();
      result.deletedId = this.deletedId;
      result.market = this.market;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted web presence.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    /**
     * The market for which the web presence was deleted.
     */
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MarketUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
