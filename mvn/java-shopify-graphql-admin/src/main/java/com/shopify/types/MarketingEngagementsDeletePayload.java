package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketingEngagementsDelete` mutation.
 */
public class MarketingEngagementsDeletePayload {
  /**
   * Informational message about the engagement data that has been marked for deletion.
   */
  private String result;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketingActivityUserError> userErrors;

  public MarketingEngagementsDeletePayload() {
  }

  /**
   * Informational message about the engagement data that has been marked for deletion.
   */
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
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
    return "MarketingEngagementsDeletePayload{result='" + result + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingEngagementsDeletePayload that = (MarketingEngagementsDeletePayload) o;
    return Objects.equals(result, that.result) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Informational message about the engagement data that has been marked for deletion.
     */
    private String result;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketingActivityUserError> userErrors;

    public MarketingEngagementsDeletePayload build() {
      MarketingEngagementsDeletePayload result = new MarketingEngagementsDeletePayload();
      result.result = this.result;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Informational message about the engagement data that has been marked for deletion.
     */
    public Builder result(String result) {
      this.result = result;
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
