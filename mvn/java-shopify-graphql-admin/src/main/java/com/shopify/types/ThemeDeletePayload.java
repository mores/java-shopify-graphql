package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `themeDelete` mutation.
 */
public class ThemeDeletePayload {
  /**
   * The ID of the deleted theme.
   */
  private String deletedThemeId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ThemeDeleteUserError> userErrors;

  public ThemeDeletePayload() {
  }

  /**
   * The ID of the deleted theme.
   */
  public String getDeletedThemeId() {
    return deletedThemeId;
  }

  public void setDeletedThemeId(String deletedThemeId) {
    this.deletedThemeId = deletedThemeId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The ID of the deleted theme.
     */
    private String deletedThemeId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ThemeDeleteUserError> userErrors;

    public ThemeDeletePayload build() {
      ThemeDeletePayload result = new ThemeDeletePayload();
      result.deletedThemeId = this.deletedThemeId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted theme.
     */
    public Builder deletedThemeId(String deletedThemeId) {
      this.deletedThemeId = deletedThemeId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ThemeDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
