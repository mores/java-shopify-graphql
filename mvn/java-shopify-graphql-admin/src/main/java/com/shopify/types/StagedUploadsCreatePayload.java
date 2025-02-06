package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `stagedUploadsCreate` mutation.
 */
public class StagedUploadsCreatePayload {
  /**
   * The staged upload targets that were generated.
   */
  private List<StagedMediaUploadTarget> stagedTargets;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public StagedUploadsCreatePayload() {
  }

  /**
   * The staged upload targets that were generated.
   */
  public List<StagedMediaUploadTarget> getStagedTargets() {
    return stagedTargets;
  }

  public void setStagedTargets(List<StagedMediaUploadTarget> stagedTargets) {
    this.stagedTargets = stagedTargets;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "StagedUploadsCreatePayload{stagedTargets='" + stagedTargets + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedUploadsCreatePayload that = (StagedUploadsCreatePayload) o;
    return Objects.equals(stagedTargets, that.stagedTargets) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stagedTargets, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The staged upload targets that were generated.
     */
    private List<StagedMediaUploadTarget> stagedTargets;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public StagedUploadsCreatePayload build() {
      StagedUploadsCreatePayload result = new StagedUploadsCreatePayload();
      result.stagedTargets = this.stagedTargets;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The staged upload targets that were generated.
     */
    public Builder stagedTargets(List<StagedMediaUploadTarget> stagedTargets) {
      this.stagedTargets = stagedTargets;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
