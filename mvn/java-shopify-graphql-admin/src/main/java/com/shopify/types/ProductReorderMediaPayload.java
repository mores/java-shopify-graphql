package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductReorderMediaPayload {
  
  private Job job;

  
  private List<MediaUserError> mediaUserErrors;

  
  private List<UserError> userErrors;

  public ProductReorderMediaPayload() {
  }

  
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  
  public List<MediaUserError> getMediaUserErrors() {
    return mediaUserErrors;
  }

  public void setMediaUserErrors(List<MediaUserError> mediaUserErrors) {
    this.mediaUserErrors = mediaUserErrors;
  }

  
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
    
    private Job job;

    
    private List<MediaUserError> mediaUserErrors;

    
    private List<UserError> userErrors;

    public ProductReorderMediaPayload build() {
      ProductReorderMediaPayload result = new ProductReorderMediaPayload();
      result.job = this.job;
      result.mediaUserErrors = this.mediaUserErrors;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    
    public Builder mediaUserErrors(List<MediaUserError> mediaUserErrors) {
      this.mediaUserErrors = mediaUserErrors;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
