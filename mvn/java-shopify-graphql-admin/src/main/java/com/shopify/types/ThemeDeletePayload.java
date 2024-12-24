package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ThemeDeletePayload {
  
  private String deletedThemeId;

  
  private List<ThemeDeleteUserError> userErrors;

  public ThemeDeletePayload() {
  }

  
  public String getDeletedThemeId() {
    return deletedThemeId;
  }

  public void setDeletedThemeId(String deletedThemeId) {
    this.deletedThemeId = deletedThemeId;
  }

  
  public List<ThemeDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ThemeDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ThemeDeletePayload{deletedThemeId='" + deletedThemeId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ThemeDeletePayload that = (ThemeDeletePayload) o;
    return Objects.equals(deletedThemeId, that.deletedThemeId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedThemeId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedThemeId;

    
    private List<ThemeDeleteUserError> userErrors;

    public ThemeDeletePayload build() {
      ThemeDeletePayload result = new ThemeDeletePayload();
      result.deletedThemeId = this.deletedThemeId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedThemeId(String deletedThemeId) {
      this.deletedThemeId = deletedThemeId;
      return this;
    }

    
    public Builder userErrors(List<ThemeDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
