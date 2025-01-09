package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `abandonmentEmailStateUpdate` mutation.
 */
public class AbandonmentEmailStateUpdatePayload {
  /**
   * The updated abandonment.
   */
  private Abandonment abandonment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<AbandonmentEmailStateUpdateUserError> userErrors;

  public AbandonmentEmailStateUpdatePayload() {
  }

  /**
   * The updated abandonment.
   */
  public Abandonment getAbandonment() {
    return abandonment;
  }

  public void setAbandonment(Abandonment abandonment) {
    this.abandonment = abandonment;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<AbandonmentEmailStateUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AbandonmentEmailStateUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AbandonmentEmailStateUpdatePayload{abandonment='" + abandonment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonmentEmailStateUpdatePayload that = (AbandonmentEmailStateUpdatePayload) o;
    return Objects.equals(abandonment, that.abandonment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated abandonment.
     */
    private Abandonment abandonment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<AbandonmentEmailStateUpdateUserError> userErrors;

    public AbandonmentEmailStateUpdatePayload build() {
      AbandonmentEmailStateUpdatePayload result = new AbandonmentEmailStateUpdatePayload();
      result.abandonment = this.abandonment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated abandonment.
     */
    public Builder abandonment(Abandonment abandonment) {
      this.abandonment = abandonment;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<AbandonmentEmailStateUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
