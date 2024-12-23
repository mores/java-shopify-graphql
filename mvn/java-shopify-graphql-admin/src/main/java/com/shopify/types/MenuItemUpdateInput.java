package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to update a valid Menu item.
 */
public class MenuItemUpdateInput {
  /**
   * The menu item's title.
   */
  private String title;

  /**
   * The menu item's type.
   */
  private MenuItemType type;

  /**
   * The menu item's association with an existing resource.
   */
  private String resourceId;

  /**
   * The menu item's url to be used when the item doesn't point to a resource.
   */
  private String url;

  /**
   * The menu item's tags to filter a collection.
   */
  private List<String> tags;

  /**
   * A globally-unique ID of the online store navigation menu item.
   */
  private String id;

  /**
   * List of the menu items nested under this item sorted by position.
   */
  private List<MenuItemUpdateInput> items;

  public MenuItemUpdateInput() {
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
   * The menu item's association with an existing resource.
   */
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * The menu item's url to be used when the item doesn't point to a resource.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * A globally-unique ID of the online store navigation menu item.
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
  public List<MenuItemUpdateInput> getItems() {
    return items;
  }

  public void setItems(List<MenuItemUpdateInput> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "MenuItemUpdateInput{title='" + title + "', type='" + type + "', resourceId='" + resourceId + "', url='" + url + "', tags='" + tags + "', id='" + id + "', items='" + items + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MenuItemUpdateInput that = (MenuItemUpdateInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(type, that.type) &&
        Objects.equals(resourceId, that.resourceId) &&
        Objects.equals(url, that.url) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(id, that.id) &&
        Objects.equals(items, that.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, type, resourceId, url, tags, id, items);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The menu item's title.
     */
    private String title;

    /**
     * The menu item's type.
     */
    private MenuItemType type;

    /**
     * The menu item's association with an existing resource.
     */
    private String resourceId;

    /**
     * The menu item's url to be used when the item doesn't point to a resource.
     */
    private String url;

    /**
     * The menu item's tags to filter a collection.
     */
    private List<String> tags;

    /**
     * A globally-unique ID of the online store navigation menu item.
     */
    private String id;

    /**
     * List of the menu items nested under this item sorted by position.
     */
    private List<MenuItemUpdateInput> items;

    public MenuItemUpdateInput build() {
      MenuItemUpdateInput result = new MenuItemUpdateInput();
      result.title = this.title;
      result.type = this.type;
      result.resourceId = this.resourceId;
      result.url = this.url;
      result.tags = this.tags;
      result.id = this.id;
      result.items = this.items;
      return result;
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
     * The menu item's association with an existing resource.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * The menu item's url to be used when the item doesn't point to a resource.
     */
    public Builder url(String url) {
      this.url = url;
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
     * A globally-unique ID of the online store navigation menu item.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * List of the menu items nested under this item sorted by position.
     */
    public Builder items(List<MenuItemUpdateInput> items) {
      this.items = items;
      return this;
    }
  }
}
