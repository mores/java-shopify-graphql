package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ThemePublishPayload {
  
  private OnlineStoreTheme theme;

  
  private List<ThemePublishUserError> userErrors;

  public ThemePublishPayload() {
  }

  
  public OnlineStoreTheme getTheme() {
    return theme;
  }

  public void setTheme(OnlineStoreTheme theme) {
    this.theme = theme;
  }

  
  public List<ThemePublishUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ThemePublishUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ThemePublishPayload{theme='" + theme + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ThemePublishPayload that = (ThemePublishPayload) o;
    return Objects.equals(theme, that.theme) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theme, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OnlineStoreTheme theme;

    
    private List<ThemePublishUserError> userErrors;

    public ThemePublishPayload build() {
      ThemePublishPayload result = new ThemePublishPayload();
      result.theme = this.theme;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder theme(OnlineStoreTheme theme) {
      this.theme = theme;
      return this;
    }

    
    public Builder userErrors(List<ThemePublishUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
