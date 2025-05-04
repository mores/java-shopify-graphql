package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `appRevokeAccessScopes` mutation.
 */
public class AppRevokeAccessScopesPayload {
  /**
   * The list of scope handles that have been revoked.
   */
  private List<AccessScope> revoked;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<AppRevokeAccessScopesAppRevokeScopeError> userErrors;

  public AppRevokeAccessScopesPayload() {
  }

  /**
   * The list of scope handles that have been revoked.
   */
  public List<AccessScope> getRevoked() {
    return revoked;
  }

  public void setRevoked(List<AccessScope> revoked) {
    this.revoked = revoked;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<AppRevokeAccessScopesAppRevokeScopeError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AppRevokeAccessScopesAppRevokeScopeError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AppRevokeAccessScopesPayload{revoked='" + revoked + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppRevokeAccessScopesPayload that = (AppRevokeAccessScopesPayload) o;
    return Objects.equals(revoked, that.revoked) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revoked, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of scope handles that have been revoked.
     */
    private List<AccessScope> revoked;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<AppRevokeAccessScopesAppRevokeScopeError> userErrors;

    public AppRevokeAccessScopesPayload build() {
      AppRevokeAccessScopesPayload result = new AppRevokeAccessScopesPayload();
      result.revoked = this.revoked;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of scope handles that have been revoked.
     */
    public Builder revoked(List<AccessScope> revoked) {
      this.revoked = revoked;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<AppRevokeAccessScopesAppRevokeScopeError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
