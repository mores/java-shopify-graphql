package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fileAcknowledgeUpdateFailed` mutation.
 */
public class FileAcknowledgeUpdateFailedPayload {
  /**
   * The updated file(s).
   */
  private List<File> files;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FilesUserError> userErrors;

  public FileAcknowledgeUpdateFailedPayload() {
  }

  /**
   * The updated file(s).
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
    return "FileAcknowledgeUpdateFailedPayload{files='" + files + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileAcknowledgeUpdateFailedPayload that = (FileAcknowledgeUpdateFailedPayload) o;
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
     * The updated file(s).
     */
    private List<File> files;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FilesUserError> userErrors;

    public FileAcknowledgeUpdateFailedPayload build() {
      FileAcknowledgeUpdateFailedPayload result = new FileAcknowledgeUpdateFailedPayload();
      result.files = this.files;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated file(s).
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
