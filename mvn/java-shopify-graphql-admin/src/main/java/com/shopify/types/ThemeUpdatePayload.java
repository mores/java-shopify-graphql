package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ThemeUpdatePayload {
  
  private OnlineStoreTheme theme;

  
  private List<ThemeUpdateUserError> userErrors;

  public ThemeUpdatePayload() {
  }

  
  public OnlineStoreTheme getTheme() {
    return theme;
  }

  public void setTheme(OnlineStoreTheme theme) {
    this.theme = theme;
  }

  
  public List<ThemeUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ThemeUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ThemeUpdatePayload{theme='" + theme + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ThemeUpdatePayload that = (ThemeUpdatePayload) o;
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

    
    private List<ThemeUpdateUserError> userErrors;

    public ThemeUpdatePayload build() {
      ThemeUpdatePayload result = new ThemeUpdatePayload();
      result.theme = this.theme;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder theme(OnlineStoreTheme theme) {
      this.theme = theme;
      return this;
    }

    
    public Builder userErrors(List<ThemeUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
