package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketWebPresenceUpdate` mutation.
 */
public class MarketWebPresenceUpdatePayload {
  /**
   * The market object.
   */
  private Market market;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketUserError> userErrors;

  public MarketWebPresenceUpdatePayload() {
  }

  /**
   * The market object.
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
    return "MarketWebPresenceUpdatePayload{market='" + market + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketWebPresenceUpdatePayload that = (MarketWebPresenceUpdatePayload) o;
    return Objects.equals(market, that.market) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(market, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The market object.
     */
    private Market market;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketUserError> userErrors;

    public MarketWebPresenceUpdatePayload build() {
      MarketWebPresenceUpdatePayload result = new MarketWebPresenceUpdatePayload();
      result.market = this.market;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The market object.
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
