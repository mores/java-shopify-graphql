package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStoreThemeFilesUserErrors implements com.shopify.types.DisplayableError {
  
  private OnlineStoreThemeFilesUserErrorsCode code;

  
  private List<String> field;

  
  private String filename;

  
  private String message;

  public OnlineStoreThemeFilesUserErrors() {
  }

  
  public OnlineStoreThemeFilesUserErrorsCode getCode() {
    return code;
  }

  public void setCode(OnlineStoreThemeFilesUserErrorsCode code) {
    this.code = code;
  }

  
  public List<String> getField() {
    return field;
  }

  public void setField(List<String> field) {
    this.field = field;
  }

  
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFilesUserErrors{code='" + code + "', field='" + field + "', filename='" + filename + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFilesUserErrors that = (OnlineStoreThemeFilesUserErrors) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(field, that.field) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, filename, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OnlineStoreThemeFilesUserErrorsCode code;

    
    private List<String> field;

    
    private String filename;

    
    private String message;

    public OnlineStoreThemeFilesUserErrors build() {
      OnlineStoreThemeFilesUserErrors result = new OnlineStoreThemeFilesUserErrors();
      result.code = this.code;
      result.field = this.field;
      result.filename = this.filename;
      result.message = this.message;
      return result;
    }

    
    public Builder code(OnlineStoreThemeFilesUserErrorsCode code) {
      this.code = code;
      return this;
    }

    
    public Builder field(List<String> field) {
      this.field = field;
      return this;
    }

    
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
