package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A menu item for display on the storefront.
 */
public class MenuItem {
  /**
   * A globally-unique ID of the navigation menu item.
   */
  private String id;

  /**
   * List of the menu items nested under this item sorted by position.
   */
  private List<MenuItem> items;

  /**
   * The ID of the resource to link to.
   */
  private String resourceId;

  /**
   * The menu item's tags to filter a collection.
   */
  private List<String> tags;

  /**
   * The menu item's title.
   */
  private String title;

  /**
   * The menu item's type.
   */
  private MenuItemType type;

  /**
   * The menu item's url.
   */
  private String url;

  public MenuItem() {
  }

  /**
   * A globally-unique ID of the navigation menu item.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * List of the menu items nested under this item sorted by position.
   */
  public List<MenuItem> getItems() {
    return items;
  }

  public void setItems(List<MenuItem> items) {
    this.items = items;
  }

  /**
   * The ID of the resource to link to.
   */
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * The menu item's tags to filter a collection.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The menu item's title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The menu item's type.
   */
  public MenuItemType getType() {
    return type;
  }

  public void setType(MenuItemType type) {
    this.type = type;
  }

  /**
   * The menu item's url.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "MenuItem{id='" + id + "', items='" + items + "', resourceId='" + resourceId + "', tags='" + tags + "', title='" + title + "', type='" + type + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MenuItem that = (MenuItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(items, that.items) &&
        Objects.equals(resourceId, that.resourceId) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(title, that.title) &&
        Objects.equals(type, that.type) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items, resourceId, tags, title, type, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID of the navigation menu item.
     */
    private String id;

    /**
     * List of the menu items nested under this item sorted by position.
     */
    private List<MenuItem> items;

    /**
     * The ID of the resource to link to.
     */
    private String resourceId;

    /**
     * The menu item's tags to filter a collection.
     */
    private List<String> tags;

    /**
     * The menu item's title.
     */
    private String title;

    /**
     * The menu item's type.
     */
    private MenuItemType type;

    /**
     * The menu item's url.
     */
    private String url;

    public MenuItem build() {
      MenuItem result = new MenuItem();
      result.id = this.id;
      result.items = this.items;
      result.resourceId = this.resourceId;
      result.tags = this.tags;
      result.title = this.title;
      result.type = this.type;
      result.url = this.url;
      return result;
    }

    /**
     * A globally-unique ID of the navigation menu item.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * List of the menu items nested under this item sorted by position.
     */
    public Builder items(List<MenuItem> items) {
      this.items = items;
      return this;
    }

    /**
     * The ID of the resource to link to.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * The menu item's tags to filter a collection.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The menu item's title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The menu item's type.
     */
    public Builder type(MenuItemType type) {
      this.type = type;
      return this;
    }

    /**
     * The menu item's url.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
