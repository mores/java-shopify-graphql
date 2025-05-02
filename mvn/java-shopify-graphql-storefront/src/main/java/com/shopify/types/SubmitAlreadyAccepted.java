package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Cart submit for checkout completion is successful.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubmitAlreadyAccepted implements CartSubmitForCompletionResult {
  /**
   * The ID of the cart completion attempt that will be used for polling for the result.
   */
  private String attemptId;

  public SubmitAlreadyAccepted() {
  }

  /**
   * The ID of the cart completion attempt that will be used for polling for the result.
   */
  public String getAttemptId() {
    return attemptId;
  }

  public void setAttemptId(String attemptId) {
    this.attemptId = attemptId;
  }

  @Override
  public String toString() {
    return "SubmitAlreadyAccepted{attemptId='" + attemptId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubmitAlreadyAccepted that = (SubmitAlreadyAccepted) o;
    return Objects.equals(attemptId, that.attemptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the cart completion attempt that will be used for polling for the result.
     */
    private String attemptId;

    public SubmitAlreadyAccepted build() {
      SubmitAlreadyAccepted result = new SubmitAlreadyAccepted();
      result.attemptId = this.attemptId;
      return result;
    }

    /**
     * The ID of the cart completion attempt that will be used for polling for the result.
     */
    public Builder attemptId(String attemptId) {
      this.attemptId = attemptId;
      return this;
    }
  }
}
