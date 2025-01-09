package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fileCreate` mutation.
 */
public class FileCreatePayload {
  /**
   * The newly created files.
   */
  private List<File> files;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FilesUserError> userErrors;

  public FileCreatePayload() {
  }

  /**
   * The newly created files.
   */
  public List<File> getFiles() {
    return files;
  }

  public void setFiles(List<File> files) {
    this.files = files;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<FilesUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FilesUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FileCreatePayload{files='" + files + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileCreatePayload that = (FileCreatePayload) o;
    return Objects.equals(files, that.files) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created files.
     */
    private List<File> files;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FilesUserError> userErrors;

    public FileCreatePayload build() {
      FileCreatePayload result = new FileCreatePayload();
      result.files = this.files;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created files.
     */
    public Builder files(List<File> files) {
      this.files = files;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FilesUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
