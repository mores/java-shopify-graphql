package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class StagedUploadTargetsGeneratePayload {
  
  private List<StagedUploadTarget> urls;

  
  private List<UserError> userErrors;

  public StagedUploadTargetsGeneratePayload() {
  }

  
  public List<StagedUploadTarget> getUrls() {
    return urls;
  }

  public void setUrls(List<StagedUploadTarget> urls) {
    this.urls = urls;
  }

  
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
    
    private List<StagedUploadTarget> urls;

    
    private List<UserError> userErrors;

    public StagedUploadTargetsGeneratePayload build() {
      StagedUploadTargetsGeneratePayload result = new StagedUploadTargetsGeneratePayload();
      result.urls = this.urls;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder urls(List<StagedUploadTarget> urls) {
      this.urls = urls;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
