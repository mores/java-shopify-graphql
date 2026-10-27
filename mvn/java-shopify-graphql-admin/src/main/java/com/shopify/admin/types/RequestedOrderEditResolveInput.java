package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for resolving a requested order edit.
 */
public class RequestedOrderEditResolveInput {
  /**
   * The ID of the requested order edit to resolve.
   */
  private String id;

  public RequestedOrderEditResolveInput() {
  }

  /**
   * The ID of the requested order edit to resolve.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "RequestedOrderEditResolveInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEditResolveInput that = (RequestedOrderEditResolveInput) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the requested order edit to resolve.
     */
    private String id;

    public RequestedOrderEditResolveInput build() {
      RequestedOrderEditResolveInput result = new RequestedOrderEditResolveInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the requested order edit to resolve.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
