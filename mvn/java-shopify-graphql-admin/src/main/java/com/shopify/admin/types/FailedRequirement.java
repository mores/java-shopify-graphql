package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Requirements that must be met before an app can be installed.
 */
public class FailedRequirement {
  /**
   * Action to be taken to resolve a failed requirement, including URL link.
   */
  private NavigationItem action;

  /**
   * A concise set of copy strings to be displayed to merchants, to guide them in resolving problems your app
   * encounters when trying to make use of their Shop and its resources.
   */
  private String message;

  public FailedRequirement() {
  }

  /**
   * Action to be taken to resolve a failed requirement, including URL link.
   */
  public NavigationItem getAction() {
    return action;
  }

  public void setAction(NavigationItem action) {
    this.action = action;
  }

  /**
   * A concise set of copy strings to be displayed to merchants, to guide them in resolving problems your app
   * encounters when trying to make use of their Shop and its resources.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "FailedRequirement{action='" + action + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FailedRequirement that = (FailedRequirement) o;
    return Objects.equals(action, that.action) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Action to be taken to resolve a failed requirement, including URL link.
     */
    private NavigationItem action;

    /**
     * A concise set of copy strings to be displayed to merchants, to guide them in resolving problems your app
     * encounters when trying to make use of their Shop and its resources.
     */
    private String message;

    public FailedRequirement build() {
      FailedRequirement result = new FailedRequirement();
      result.action = this.action;
      result.message = this.message;
      return result;
    }

    /**
     * Action to be taken to resolve a failed requirement, including URL link.
     */
    public Builder action(NavigationItem action) {
      this.action = action;
      return this;
    }

    /**
     * A concise set of copy strings to be displayed to merchants, to guide them in resolving problems your app
     * encounters when trying to make use of their Shop and its resources.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
