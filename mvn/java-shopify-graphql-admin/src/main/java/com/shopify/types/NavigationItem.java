package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A navigation item, holding basic link attributes.
 */
public class NavigationItem {
  /**
   * The unique identifier of the navigation item.
   */
  private String id;

  /**
   * The name of the navigation item.
   */
  private String title;

  /**
   * The URL of the page that the navigation item links to.
   */
  private String url;

  public NavigationItem() {
  }

  /**
   * The unique identifier of the navigation item.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the navigation item.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The URL of the page that the navigation item links to.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "NavigationItem{id='" + id + "', title='" + title + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NavigationItem that = (NavigationItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(title, that.title) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique identifier of the navigation item.
     */
    private String id;

    /**
     * The name of the navigation item.
     */
    private String title;

    /**
     * The URL of the page that the navigation item links to.
     */
    private String url;

    public NavigationItem build() {
      NavigationItem result = new NavigationItem();
      result.id = this.id;
      result.title = this.title;
      result.url = this.url;
      return result;
    }

    /**
     * The unique identifier of the navigation item.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the navigation item.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The URL of the page that the navigation item links to.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
