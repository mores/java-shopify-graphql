package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A policy for the store that comes with a default value, such as a subscription policy.
 * If the merchant hasn't configured a policy for their store, then the policy will return the default value.
 * Otherwise, the policy will return the merchant-configured value.
 */
public class ShopPolicyWithDefault {
  /**
   * The text of the policy. Maximum size: 64KB.
   */
  private String body;

  /**
   * The handle of the policy.
   */
  private String handle;

  /**
   * The unique ID of the policy. A default policy doesn't have an ID.
   */
  private String id;

  /**
   * The title of the policy.
   */
  private String title;

  /**
   * Public URL to the policy.
   */
  private String url;

  public ShopPolicyWithDefault() {
  }

  /**
   * The text of the policy. Maximum size: 64KB.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  /**
   * The handle of the policy.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The unique ID of the policy. A default policy doesn't have an ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The title of the policy.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Public URL to the policy.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ShopPolicyWithDefault{body='" + body + "', handle='" + handle + "', id='" + id + "', title='" + title + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPolicyWithDefault that = (ShopPolicyWithDefault) o;
    return Objects.equals(body, that.body) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(title, that.title) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, handle, id, title, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The text of the policy. Maximum size: 64KB.
     */
    private String body;

    /**
     * The handle of the policy.
     */
    private String handle;

    /**
     * The unique ID of the policy. A default policy doesn't have an ID.
     */
    private String id;

    /**
     * The title of the policy.
     */
    private String title;

    /**
     * Public URL to the policy.
     */
    private String url;

    public ShopPolicyWithDefault build() {
      ShopPolicyWithDefault result = new ShopPolicyWithDefault();
      result.body = this.body;
      result.handle = this.handle;
      result.id = this.id;
      result.title = this.title;
      result.url = this.url;
      return result;
    }

    /**
     * The text of the policy. Maximum size: 64KB.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * The handle of the policy.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The unique ID of the policy. A default policy doesn't have an ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The title of the policy.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Public URL to the policy.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
