package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `themeFilesCopy` mutation.
 */
public class ThemeFilesCopyPayload {
  /**
   * The resulting theme files.
   */
  private List<OnlineStoreThemeFileOperationResult> copiedThemeFiles;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OnlineStoreThemeFilesUserErrors> userErrors;

  public ThemeFilesCopyPayload() {
  }

  /**
   * The resulting theme files.
   */
  public List<OnlineStoreThemeFileOperationResult> getCopiedThemeFiles() {
    return copiedThemeFiles;
  }

  public void setCopiedThemeFiles(List<OnlineStoreThemeFileOperationResult> copiedThemeFiles) {
    this.copiedThemeFiles = copiedThemeFiles;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The resulting theme files.
     */
    private List<OnlineStoreThemeFileOperationResult> copiedThemeFiles;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OnlineStoreThemeFilesUserErrors> userErrors;

    public ThemeFilesCopyPayload build() {
      ThemeFilesCopyPayload result = new ThemeFilesCopyPayload();
      result.copiedThemeFiles = this.copiedThemeFiles;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The resulting theme files.
     */
    public Builder copiedThemeFiles(List<OnlineStoreThemeFileOperationResult> copiedThemeFiles) {
      this.copiedThemeFiles = copiedThemeFiles;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OnlineStoreThemeFilesUserErrors> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
