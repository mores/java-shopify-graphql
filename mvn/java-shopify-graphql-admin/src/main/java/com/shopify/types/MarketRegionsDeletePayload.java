package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketRegionsDelete` mutation.
 */
public class MarketRegionsDeletePayload {
  /**
   * The ID of the deleted market region.
   */
  private List<String> deletedIds;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketUserError> userErrors;

  public MarketRegionsDeletePayload() {
  }

  /**
   * The ID of the deleted market region.
   */
  public List<String> getDeletedIds() {
    return deletedIds;
  }

  public void setDeletedIds(List<String> deletedIds) {
    this.deletedIds = deletedIds;
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
    return "MarketRegionsDeletePayload{deletedIds='" + deletedIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRegionsDeletePayload that = (MarketRegionsDeletePayload) o;
    return Objects.equals(deletedIds, that.deletedIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted market region.
     */
    private List<String> deletedIds;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketUserError> userErrors;

    public MarketRegionsDeletePayload build() {
      MarketRegionsDeletePayload result = new MarketRegionsDeletePayload();
      result.deletedIds = this.deletedIds;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted market region.
     */
    public Builder deletedIds(List<String> deletedIds) {
      this.deletedIds = deletedIds;
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
