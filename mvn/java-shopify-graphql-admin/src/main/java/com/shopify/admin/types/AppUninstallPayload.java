package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `appUninstall` mutation.
 */
public class AppUninstallPayload {
  /**
   * The uninstalled app.
   */
  private App app;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<AppUninstallAppUninstallError> userErrors;

  public AppUninstallPayload() {
  }

  /**
   * The uninstalled app.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<AppUninstallAppUninstallError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AppUninstallAppUninstallError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AppUninstallPayload{app='" + app + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUninstallPayload that = (AppUninstallPayload) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The uninstalled app.
     */
    private App app;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<AppUninstallAppUninstallError> userErrors;

    public AppUninstallPayload build() {
      AppUninstallPayload result = new AppUninstallPayload();
      result.app = this.app;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The uninstalled app.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<AppUninstallAppUninstallError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
