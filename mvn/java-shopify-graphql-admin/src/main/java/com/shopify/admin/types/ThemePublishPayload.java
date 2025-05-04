package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `themePublish` mutation.
 */
public class ThemePublishPayload {
  /**
   * The theme that was published.
   */
  private OnlineStoreTheme theme;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ThemePublishUserError> userErrors;

  public ThemePublishPayload() {
  }

  /**
   * The theme that was published.
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
    /**
     * The theme that was published.
     */
    private OnlineStoreTheme theme;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ThemePublishUserError> userErrors;

    public ThemePublishPayload build() {
      ThemePublishPayload result = new ThemePublishPayload();
      result.theme = this.theme;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The theme that was published.
     */
    public Builder theme(OnlineStoreTheme theme) {
      this.theme = theme;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ThemePublishUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
