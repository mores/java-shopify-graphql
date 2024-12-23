package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productReorderMedia` mutation.
 */
public class ProductReorderMediaPayload {
  /**
   * The asynchronous job which reorders the media.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MediaUserError> mediaUserErrors;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductReorderMediaPayload() {
  }

  /**
   * The asynchronous job which reorders the media.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MediaUserError> getMediaUserErrors() {
    return mediaUserErrors;
  }

  public void setMediaUserErrors(List<MediaUserError> mediaUserErrors) {
    this.mediaUserErrors = mediaUserErrors;
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
    return "ProductReorderMediaPayload{job='" + job + "', mediaUserErrors='" + mediaUserErrors + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductReorderMediaPayload that = (ProductReorderMediaPayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(mediaUserErrors, that.mediaUserErrors) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, mediaUserErrors, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The asynchronous job which reorders the media.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MediaUserError> mediaUserErrors;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductReorderMediaPayload build() {
      ProductReorderMediaPayload result = new ProductReorderMediaPayload();
      result.job = this.job;
      result.mediaUserErrors = this.mediaUserErrors;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job which reorders the media.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder mediaUserErrors(List<MediaUserError> mediaUserErrors) {
      this.mediaUserErrors = mediaUserErrors;
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
