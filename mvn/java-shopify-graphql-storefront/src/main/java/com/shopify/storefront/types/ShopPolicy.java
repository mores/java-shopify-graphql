package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Policy that a merchant has configured for their store, such as their refund or privacy policy.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopPolicy implements MenuItemResource, com.shopify.storefront.types.Node {
  /**
   * Policy text, maximum size of 64kb.
   */
  private String body;

  /**
   * Policy’s handle.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Policy’s title.
   */
  private String title;

  /**
   * Public URL to the policy.
   */
  private String url;

  public ShopPolicy() {
  }

  /**
   * Policy text, maximum size of 64kb.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  /**
   * Policy’s handle.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Policy’s title.
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
    return "ShopPolicy{body='" + body + "', handle='" + handle + "', id='" + id + "', title='" + title + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPolicy that = (ShopPolicy) o;
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
     * Policy text, maximum size of 64kb.
     */
    private String body;

    /**
     * Policy’s handle.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Policy’s title.
     */
    private String title;

    /**
     * Public URL to the policy.
     */
    private String url;

    public ShopPolicy build() {
      ShopPolicy result = new ShopPolicy();
      result.body = this.body;
      result.handle = this.handle;
      result.id = this.id;
      result.title = this.title;
      result.url = this.url;
      return result;
    }

    /**
     * Policy text, maximum size of 64kb.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * Policy’s handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Policy’s title.
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
