package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `themeCreate` mutation.
 */
public class ThemeCreatePayload {
  /**
   * The theme that was created.
   */
  private OnlineStoreTheme theme;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ThemeCreateUserError> userErrors;

  public ThemeCreatePayload() {
  }

  /**
   * The theme that was created.
   */
  public OnlineStoreTheme getTheme() {
    return theme;
  }

  public void setTheme(OnlineStoreTheme theme) {
    this.theme = theme;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ThemeCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ThemeCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ThemeCreatePayload{theme='" + theme + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ThemeCreatePayload that = (ThemeCreatePayload) o;
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
    /**
     * The theme that was created.
     */
    private OnlineStoreTheme theme;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ThemeCreateUserError> userErrors;

    public ThemeCreatePayload build() {
      ThemeCreatePayload result = new ThemeCreatePayload();
      result.theme = this.theme;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The theme that was created.
     */
    public Builder theme(OnlineStoreTheme theme) {
      this.theme = theme;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ThemeCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
