package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketingActivityDeleteExternal` mutation.
 */
public class MarketingActivityDeleteExternalPayload {
  /**
   * The ID of the marketing activity that was deleted, if one was deleted.
   */
  private String deletedMarketingActivityId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketingActivityUserError> userErrors;

  public MarketingActivityDeleteExternalPayload() {
  }

  /**
   * The ID of the marketing activity that was deleted, if one was deleted.
   */
  public String getDeletedMarketingActivityId() {
    return deletedMarketingActivityId;
  }

  public void setDeletedMarketingActivityId(String deletedMarketingActivityId) {
    this.deletedMarketingActivityId = deletedMarketingActivityId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MarketingActivityUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketingActivityUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingActivityDeleteExternalPayload{deletedMarketingActivityId='" + deletedMarketingActivityId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityDeleteExternalPayload that = (MarketingActivityDeleteExternalPayload) o;
    return Objects.equals(deletedMarketingActivityId, that.deletedMarketingActivityId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMarketingActivityId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the marketing activity that was deleted, if one was deleted.
     */
    private String deletedMarketingActivityId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketingActivityUserError> userErrors;

    public MarketingActivityDeleteExternalPayload build() {
      MarketingActivityDeleteExternalPayload result = new MarketingActivityDeleteExternalPayload();
      result.deletedMarketingActivityId = this.deletedMarketingActivityId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the marketing activity that was deleted, if one was deleted.
     */
    public Builder deletedMarketingActivityId(String deletedMarketingActivityId) {
      this.deletedMarketingActivityId = deletedMarketingActivityId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MarketingActivityUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
