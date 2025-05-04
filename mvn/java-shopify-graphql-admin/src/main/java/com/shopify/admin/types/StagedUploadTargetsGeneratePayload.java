package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `stagedUploadTargetsGenerate` mutation.
 */
public class StagedUploadTargetsGeneratePayload {
  /**
   * The staged upload targets that were generated.
   */
  private List<StagedUploadTarget> urls;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public StagedUploadTargetsGeneratePayload() {
  }

  /**
   * The staged upload targets that were generated.
   */
  public List<StagedUploadTarget> getUrls() {
    return urls;
  }

  public void setUrls(List<StagedUploadTarget> urls) {
    this.urls = urls;
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
    return "StagedUploadTargetsGeneratePayload{urls='" + urls + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedUploadTargetsGeneratePayload that = (StagedUploadTargetsGeneratePayload) o;
    return Objects.equals(urls, that.urls) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urls, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The staged upload targets that were generated.
     */
    private List<StagedUploadTarget> urls;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public StagedUploadTargetsGeneratePayload build() {
      StagedUploadTargetsGeneratePayload result = new StagedUploadTargetsGeneratePayload();
      result.urls = this.urls;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The staged upload targets that were generated.
     */
    public Builder urls(List<StagedUploadTarget> urls) {
      this.urls = urls;
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
