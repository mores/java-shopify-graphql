package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A [navigation menu](https://help.shopify.com/manual/online-store/menus-and-links) representing a hierarchy
 * of hyperlinks (items).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Menu implements com.shopify.types.Node {
  /**
   * The menu's handle.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The menu's child items.
   */
  private List<MenuItem> items;

  /**
   * The count of items on the menu.
   */
  private int itemsCount;

  /**
   * The menu's title.
   */
  private String title;

  public Menu() {
  }

  /**
   * The menu's handle.
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
   * The menu's child items.
   */
  public List<MenuItem> getItems() {
    return items;
  }

  public void setItems(List<MenuItem> items) {
    this.items = items;
  }

  /**
   * The count of items on the menu.
   */
  public int getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(int itemsCount) {
    this.itemsCount = itemsCount;
  }

  /**
   * The menu's title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Menu{handle='" + handle + "', id='" + id + "', items='" + items + "', itemsCount='" + itemsCount + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Menu that = (Menu) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(items, that.items) &&
        itemsCount == that.itemsCount &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, id, items, itemsCount, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The menu's handle.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The menu's child items.
     */
    private List<MenuItem> items;

    /**
     * The count of items on the menu.
     */
    private int itemsCount;

    /**
     * The menu's title.
     */
    private String title;

    public Menu build() {
      Menu result = new Menu();
      result.handle = this.handle;
      result.id = this.id;
      result.items = this.items;
      result.itemsCount = this.itemsCount;
      result.title = this.title;
      return result;
    }

    /**
     * The menu's handle.
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
     * The menu's child items.
     */
    public Builder items(List<MenuItem> items) {
      this.items = items;
      return this;
    }

    /**
     * The count of items on the menu.
     */
    public Builder itemsCount(int itemsCount) {
      this.itemsCount = itemsCount;
      return this;
    }

    /**
     * The menu's title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
