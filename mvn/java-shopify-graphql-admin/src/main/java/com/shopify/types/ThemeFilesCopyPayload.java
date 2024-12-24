package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ThemeFilesCopyPayload {
  
  private List<OnlineStoreThemeFileOperationResult> copiedThemeFiles;

  
  private List<OnlineStoreThemeFilesUserErrors> userErrors;

  public ThemeFilesCopyPayload() {
  }

  
  public List<OnlineStoreThemeFileOperationResult> getCopiedThemeFiles() {
    return copiedThemeFiles;
  }

  public void setCopiedThemeFiles(List<OnlineStoreThemeFileOperationResult> copiedThemeFiles) {
    this.copiedThemeFiles = copiedThemeFiles;
  }

  
  public List<OnlineStoreThemeFilesUserErrors> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OnlineStoreThemeFilesUserErrors> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ThemeFilesCopyPayload{copiedThemeFiles='" + copiedThemeFiles + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ThemeFilesCopyPayload that = (ThemeFilesCopyPayload) o;
    return Objects.equals(copiedThemeFiles, that.copiedThemeFiles) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copiedThemeFiles, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<OnlineStoreThemeFileOperationResult> copiedThemeFiles;

    
    private List<OnlineStoreThemeFilesUserErrors> userErrors;

    public ThemeFilesCopyPayload build() {
      ThemeFilesCopyPayload result = new ThemeFilesCopyPayload();
      result.copiedThemeFiles = this.copiedThemeFiles;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder copiedThemeFiles(List<OnlineStoreThemeFileOperationResult> copiedThemeFiles) {
      this.copiedThemeFiles = copiedThemeFiles;
      return this;
    }

    
    public Builder userErrors(List<OnlineStoreThemeFilesUserErrors> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
