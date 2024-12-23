package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fileDelete` mutation.
 */
public class FileDeletePayload {
  /**
   * The IDs of the deleted files.
   */
  private List<String> deletedFileIds;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FilesUserError> userErrors;

  public FileDeletePayload() {
  }

  /**
   * The IDs of the deleted files.
   */
  public List<String> getDeletedFileIds() {
    return deletedFileIds;
  }

  public void setDeletedFileIds(List<String> deletedFileIds) {
    this.deletedFileIds = deletedFileIds;
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
    return "FileDeletePayload{deletedFileIds='" + deletedFileIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileDeletePayload that = (FileDeletePayload) o;
    return Objects.equals(deletedFileIds, that.deletedFileIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedFileIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The IDs of the deleted files.
     */
    private List<String> deletedFileIds;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FilesUserError> userErrors;

    public FileDeletePayload build() {
      FileDeletePayload result = new FileDeletePayload();
      result.deletedFileIds = this.deletedFileIds;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The IDs of the deleted files.
     */
    public Builder deletedFileIds(List<String> deletedFileIds) {
      this.deletedFileIds = deletedFileIds;
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
