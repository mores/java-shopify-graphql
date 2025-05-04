package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `themeFilesDelete` mutation.
 */
public class ThemeFilesDeletePayload {
  /**
   * The resulting theme files.
   */
  private List<OnlineStoreThemeFileOperationResult> deletedThemeFiles;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OnlineStoreThemeFilesUserErrors> userErrors;

  public ThemeFilesDeletePayload() {
  }

  /**
   * The resulting theme files.
   */
  public List<OnlineStoreThemeFileOperationResult> getDeletedThemeFiles() {
    return deletedThemeFiles;
  }

  public void setDeletedThemeFiles(List<OnlineStoreThemeFileOperationResult> deletedThemeFiles) {
    this.deletedThemeFiles = deletedThemeFiles;
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
    return "ThemeFilesDeletePayload{deletedThemeFiles='" + deletedThemeFiles + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ThemeFilesDeletePayload that = (ThemeFilesDeletePayload) o;
    return Objects.equals(deletedThemeFiles, that.deletedThemeFiles) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedThemeFiles, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The resulting theme files.
     */
    private List<OnlineStoreThemeFileOperationResult> deletedThemeFiles;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OnlineStoreThemeFilesUserErrors> userErrors;

    public ThemeFilesDeletePayload build() {
      ThemeFilesDeletePayload result = new ThemeFilesDeletePayload();
      result.deletedThemeFiles = this.deletedThemeFiles;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The resulting theme files.
     */
    public Builder deletedThemeFiles(List<OnlineStoreThemeFileOperationResult> deletedThemeFiles) {
      this.deletedThemeFiles = deletedThemeFiles;
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
