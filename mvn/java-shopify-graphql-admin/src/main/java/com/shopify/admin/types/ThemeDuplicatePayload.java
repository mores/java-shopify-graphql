package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `themeDuplicate` mutation.
 */
public class ThemeDuplicatePayload {
  /**
   * The newly duplicated theme.
   */
  private OnlineStoreTheme newTheme;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ThemeDuplicateUserError> userErrors;

  public ThemeDuplicatePayload() {
  }

  /**
   * The newly duplicated theme.
   */
  public OnlineStoreTheme getNewTheme() {
    return newTheme;
  }

  public void setNewTheme(OnlineStoreTheme newTheme) {
    this.newTheme = newTheme;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ThemeDuplicateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ThemeDuplicateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ThemeDuplicatePayload{newTheme='" + newTheme + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ThemeDuplicatePayload that = (ThemeDuplicatePayload) o;
    return Objects.equals(newTheme, that.newTheme) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newTheme, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly duplicated theme.
     */
    private OnlineStoreTheme newTheme;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ThemeDuplicateUserError> userErrors;

    public ThemeDuplicatePayload build() {
      ThemeDuplicatePayload result = new ThemeDuplicatePayload();
      result.newTheme = this.newTheme;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly duplicated theme.
     */
    public Builder newTheme(OnlineStoreTheme newTheme) {
      this.newTheme = newTheme;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ThemeDuplicateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
