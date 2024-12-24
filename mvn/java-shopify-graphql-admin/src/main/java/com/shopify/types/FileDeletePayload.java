package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FileDeletePayload {
  
  private List<String> deletedFileIds;

  
  private List<FilesUserError> userErrors;

  public FileDeletePayload() {
  }

  
  public List<String> getDeletedFileIds() {
    return deletedFileIds;
  }

  public void setDeletedFileIds(List<String> deletedFileIds) {
    this.deletedFileIds = deletedFileIds;
  }

  
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
    
    private List<String> deletedFileIds;

    
    private List<FilesUserError> userErrors;

    public FileDeletePayload build() {
      FileDeletePayload result = new FileDeletePayload();
      result.deletedFileIds = this.deletedFileIds;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedFileIds(List<String> deletedFileIds) {
      this.deletedFileIds = deletedFileIds;
      return this;
    }

    
    public Builder userErrors(List<FilesUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
