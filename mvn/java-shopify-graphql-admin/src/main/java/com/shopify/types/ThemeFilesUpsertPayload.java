package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ThemeFilesUpsertPayload {
  
  private Job job;

  
  private List<OnlineStoreThemeFileOperationResult> upsertedThemeFiles;

  
  private List<OnlineStoreThemeFilesUserErrors> userErrors;

  public ThemeFilesUpsertPayload() {
  }

  
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  
  public List<OnlineStoreThemeFileOperationResult> getUpsertedThemeFiles() {
    return upsertedThemeFiles;
  }

  public void setUpsertedThemeFiles(List<OnlineStoreThemeFileOperationResult> upsertedThemeFiles) {
    this.upsertedThemeFiles = upsertedThemeFiles;
  }

  
  public List<OnlineStoreThemeFilesUserErrors> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OnlineStoreThemeFilesUserErrors> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ThemeFilesUpsertPayload{job='" + job + "', upsertedThemeFiles='" + upsertedThemeFiles + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ThemeFilesUpsertPayload that = (ThemeFilesUpsertPayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(upsertedThemeFiles, that.upsertedThemeFiles) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, upsertedThemeFiles, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Job job;

    
    private List<OnlineStoreThemeFileOperationResult> upsertedThemeFiles;

    
    private List<OnlineStoreThemeFilesUserErrors> userErrors;

    public ThemeFilesUpsertPayload build() {
      ThemeFilesUpsertPayload result = new ThemeFilesUpsertPayload();
      result.job = this.job;
      result.upsertedThemeFiles = this.upsertedThemeFiles;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    
    public Builder upsertedThemeFiles(
        List<OnlineStoreThemeFileOperationResult> upsertedThemeFiles) {
      this.upsertedThemeFiles = upsertedThemeFiles;
      return this;
    }

    
    public Builder userErrors(List<OnlineStoreThemeFilesUserErrors> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
