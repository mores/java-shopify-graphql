package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class FunctionsErrorHistory {
  
  private OffsetDateTime errorsFirstOccurredAt;

  
  private OffsetDateTime firstOccurredAt;

  
  private boolean hasBeenSharedSinceLastError;

  
  private boolean hasSharedRecentErrors;

  public FunctionsErrorHistory() {
  }

  
  public OffsetDateTime getErrorsFirstOccurredAt() {
    return errorsFirstOccurredAt;
  }

  public void setErrorsFirstOccurredAt(OffsetDateTime errorsFirstOccurredAt) {
    this.errorsFirstOccurredAt = errorsFirstOccurredAt;
  }

  
  public OffsetDateTime getFirstOccurredAt() {
    return firstOccurredAt;
  }

  public void setFirstOccurredAt(OffsetDateTime firstOccurredAt) {
    this.firstOccurredAt = firstOccurredAt;
  }

  
  public boolean getHasBeenSharedSinceLastError() {
    return hasBeenSharedSinceLastError;
  }

  public void setHasBeenSharedSinceLastError(boolean hasBeenSharedSinceLastError) {
    this.hasBeenSharedSinceLastError = hasBeenSharedSinceLastError;
  }

  
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
    
    private OffsetDateTime errorsFirstOccurredAt;

    
    private OffsetDateTime firstOccurredAt;

    
    private boolean hasBeenSharedSinceLastError;

    
    private boolean hasSharedRecentErrors;

    public FunctionsErrorHistory build() {
      FunctionsErrorHistory result = new FunctionsErrorHistory();
      result.errorsFirstOccurredAt = this.errorsFirstOccurredAt;
      result.firstOccurredAt = this.firstOccurredAt;
      result.hasBeenSharedSinceLastError = this.hasBeenSharedSinceLastError;
      result.hasSharedRecentErrors = this.hasSharedRecentErrors;
      return result;
    }

    
    public Builder errorsFirstOccurredAt(OffsetDateTime errorsFirstOccurredAt) {
      this.errorsFirstOccurredAt = errorsFirstOccurredAt;
      return this;
    }

    
    public Builder firstOccurredAt(OffsetDateTime firstOccurredAt) {
      this.firstOccurredAt = firstOccurredAt;
      return this;
    }

    
    public Builder hasBeenSharedSinceLastError(boolean hasBeenSharedSinceLastError) {
      this.hasBeenSharedSinceLastError = hasBeenSharedSinceLastError;
      return this;
    }

    
    public Builder hasSharedRecentErrors(boolean hasSharedRecentErrors) {
      this.hasSharedRecentErrors = hasSharedRecentErrors;
      return this;
    }
  }
}
