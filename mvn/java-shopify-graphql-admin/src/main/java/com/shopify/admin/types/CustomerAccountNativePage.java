package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A native page for the customer account navigation menu.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerAccountNativePage implements com.shopify.admin.types.CustomerAccountPage, com.shopify.admin.types.Navigable, com.shopify.admin.types.Node {
  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * A unique, human-friendly string for the customer account page.
   */
  private String handle;

  /**
   * The unique ID for the customer account page.
   */
  private String id;

  /**
   * The type of customer account native page.
   */
  private CustomerAccountNativePagePageType pageType;

  /**
   * The title of the customer account page.
   */
  private String title;

  public CustomerAccountNativePage() {
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * A unique, human-friendly string for the customer account page.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The unique ID for the customer account page.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of customer account native page.
   */
  public CustomerAccountNativePagePageType getPageType() {
    return pageType;
  }

  public void setPageType(CustomerAccountNativePagePageType pageType) {
    this.pageType = pageType;
  }

  /**
   * The title of the customer account page.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "CustomerAccountNativePage{defaultCursor='" + defaultCursor + "', handle='" + handle + "', id='" + id + "', pageType='" + pageType + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAccountNativePage that = (CustomerAccountNativePage) o;
    return Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(pageType, that.pageType) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCursor, handle, id, pageType, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * A unique, human-friendly string for the customer account page.
     */
    private String handle;

    /**
     * The unique ID for the customer account page.
     */
    private String id;

    /**
     * The type of customer account native page.
     */
    private CustomerAccountNativePagePageType pageType;

    /**
     * The title of the customer account page.
     */
    private String title;

    public CustomerAccountNativePage build() {
      CustomerAccountNativePage result = new CustomerAccountNativePage();
      result.defaultCursor = this.defaultCursor;
      result.handle = this.handle;
      result.id = this.id;
      result.pageType = this.pageType;
      result.title = this.title;
      return result;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * A unique, human-friendly string for the customer account page.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The unique ID for the customer account page.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The type of customer account native page.
     */
    public Builder pageType(CustomerAccountNativePagePageType pageType) {
      this.pageType = pageType;
      return this;
    }

    /**
     * The title of the customer account page.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
