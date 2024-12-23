package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The error history from running a Shopify Function.
 */
public class FunctionsErrorHistory {
  /**
   * The date and time that the first error occurred.
   */
  private OffsetDateTime errorsFirstOccurredAt;

  /**
   * The date and time that the first error occurred.
   */
  private OffsetDateTime firstOccurredAt;

  /**
   * Whether the merchant has shared all the recent errors with the developer.
   */
  private boolean hasBeenSharedSinceLastError;

  /**
   * Whether the merchant has shared all the recent errors with the developer.
   */
  private boolean hasSharedRecentErrors;

  public FunctionsErrorHistory() {
  }

  /**
   * The date and time that the first error occurred.
   */
  public OffsetDateTime getErrorsFirstOccurredAt() {
    return errorsFirstOccurredAt;
  }

  public void setErrorsFirstOccurredAt(OffsetDateTime errorsFirstOccurredAt) {
    this.errorsFirstOccurredAt = errorsFirstOccurredAt;
  }

  /**
   * The date and time that the first error occurred.
   */
  public OffsetDateTime getFirstOccurredAt() {
    return firstOccurredAt;
  }

  public void setFirstOccurredAt(OffsetDateTime firstOccurredAt) {
    this.firstOccurredAt = firstOccurredAt;
  }

  /**
   * Whether the merchant has shared all the recent errors with the developer.
   */
  public boolean getHasBeenSharedSinceLastError() {
    return hasBeenSharedSinceLastError;
  }

  public void setHasBeenSharedSinceLastError(boolean hasBeenSharedSinceLastError) {
    this.hasBeenSharedSinceLastError = hasBeenSharedSinceLastError;
  }

  /**
   * Whether the merchant has shared all the recent errors with the developer.
   */
  public boolean getHasSharedRecentErrors() {
    return hasSharedRecentErrors;
  }

  public void setHasSharedRecentErrors(boolean hasSharedRecentErrors) {
    this.hasSharedRecentErrors = hasSharedRecentErrors;
  }

  @Override
  public String toString() {
    return "FunctionsErrorHistory{errorsFirstOccurredAt='" + errorsFirstOccurredAt + "', firstOccurredAt='" + firstOccurredAt + "', hasBeenSharedSinceLastError='" + hasBeenSharedSinceLastError + "', hasSharedRecentErrors='" + hasSharedRecentErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionsErrorHistory that = (FunctionsErrorHistory) o;
    return Objects.equals(errorsFirstOccurredAt, that.errorsFirstOccurredAt) &&
        Objects.equals(firstOccurredAt, that.firstOccurredAt) &&
        hasBeenSharedSinceLastError == that.hasBeenSharedSinceLastError &&
        hasSharedRecentErrors == that.hasSharedRecentErrors;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorsFirstOccurredAt, firstOccurredAt, hasBeenSharedSinceLastError, hasSharedRecentErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time that the first error occurred.
     */
    private OffsetDateTime errorsFirstOccurredAt;

    /**
     * The date and time that the first error occurred.
     */
    private OffsetDateTime firstOccurredAt;

    /**
     * Whether the merchant has shared all the recent errors with the developer.
     */
    private boolean hasBeenSharedSinceLastError;

    /**
     * Whether the merchant has shared all the recent errors with the developer.
     */
    private boolean hasSharedRecentErrors;

    public FunctionsErrorHistory build() {
      FunctionsErrorHistory result = new FunctionsErrorHistory();
      result.errorsFirstOccurredAt = this.errorsFirstOccurredAt;
      result.firstOccurredAt = this.firstOccurredAt;
      result.hasBeenSharedSinceLastError = this.hasBeenSharedSinceLastError;
      result.hasSharedRecentErrors = this.hasSharedRecentErrors;
      return result;
    }

    /**
     * The date and time that the first error occurred.
     */
    public Builder errorsFirstOccurredAt(OffsetDateTime errorsFirstOccurredAt) {
      this.errorsFirstOccurredAt = errorsFirstOccurredAt;
      return this;
    }

    /**
     * The date and time that the first error occurred.
     */
    public Builder firstOccurredAt(OffsetDateTime firstOccurredAt) {
      this.firstOccurredAt = firstOccurredAt;
      return this;
    }

    /**
     * Whether the merchant has shared all the recent errors with the developer.
     */
    public Builder hasBeenSharedSinceLastError(boolean hasBeenSharedSinceLastError) {
      this.hasBeenSharedSinceLastError = hasBeenSharedSinceLastError;
      return this;
    }

    /**
     * Whether the merchant has shared all the recent errors with the developer.
     */
    public Builder hasSharedRecentErrors(boolean hasSharedRecentErrors) {
      this.hasSharedRecentErrors = hasSharedRecentErrors;
      return this;
    }
  }
}
