package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FileUpdatePayload {
  
  private List<File> files;

  
  private List<FilesUserError> userErrors;

  public FileUpdatePayload() {
  }

  
  public List<File> getFiles() {
    return files;
  }

  public void setFiles(List<File> files) {
    this.files = files;
  }

  
  public List<FilesUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FilesUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FileUpdatePayload{files='" + files + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileUpdatePayload that = (FileUpdatePayload) o;
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
    
    private List<File> files;

    
    private List<FilesUserError> userErrors;

    public FileUpdatePayload build() {
      FileUpdatePayload result = new FileUpdatePayload();
      result.files = this.files;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder files(List<File> files) {
      this.files = files;
      return this;
    }

    
    public Builder userErrors(List<FilesUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
