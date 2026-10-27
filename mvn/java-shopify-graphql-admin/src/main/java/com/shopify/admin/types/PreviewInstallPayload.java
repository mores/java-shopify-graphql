package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `previewInstall` mutation.
 */
public class PreviewInstallPayload {
  /**
   * The installed theme.
   */
  private OnlineStoreTheme newTheme;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PreviewInstallUserError> userErrors;

  public PreviewInstallPayload() {
  }

  /**
   * The installed theme.
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
  public List<PreviewInstallUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PreviewInstallUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PreviewInstallPayload{newTheme='" + newTheme + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PreviewInstallPayload that = (PreviewInstallPayload) o;
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
     * The installed theme.
     */
    private OnlineStoreTheme newTheme;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PreviewInstallUserError> userErrors;

    public PreviewInstallPayload build() {
      PreviewInstallPayload result = new PreviewInstallPayload();
      result.newTheme = this.newTheme;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The installed theme.
     */
    public Builder newTheme(OnlineStoreTheme newTheme) {
      this.newTheme = newTheme;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PreviewInstallUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
