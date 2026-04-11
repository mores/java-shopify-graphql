package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Navigation menus that organize links into logical structures to guide customers
 * through a store. Menus serve as the backbone of store navigation, making it easy
 * for customers to find products, pages, and other content through organized
 * hierarchical links.
 *
 * For example, a merchant might create a main navigation menu with top-level
 * categories like "Products," "About Us," and "Contact," where each category can
 * contain nested menu items linking to specific collections, pages, or external resources.
 *
 * Use the `Menu` object to:
 * - Build and customize store navigation structures
 * - Organize hierarchical menu systems with nested items
 * - Work with default menus that can't be deleted
 * - Access menu items for building navigation
 *
 * Menus can be designated as default navigation elements (like main menu or
 * footer), which can't be deleted and have restricted handle updates. The handle
 * provides a unique identifier that themes can reference, while the items
 * collection enables nested navigation structures.
 *
 * Each menu contains menu items that can link to various resource types. This
 * flexibility lets merchants create navigation experiences that guide customers
 * through their store.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Menu implements com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.Node {
  /**
   * The menu's handle.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether the menu is a default. The handle for default menus can't be updated and default menus can't be deleted.
   */
  private boolean isDefault;

  /**
   * A list of items on the menu sorted by position.
   */
  private List<MenuItem> items;

  /**
   * The menu's title.
   */
  private String title;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

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
   * Whether the menu is a default. The handle for default menus can't be updated and default menus can't be deleted.
   */
  public boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * A list of items on the menu sorted by position.
   */
  public List<MenuItem> getItems() {
    return items;
  }

  public void setItems(List<MenuItem> items) {
    this.items = items;
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

  /**
   * The published translations associated with the resource.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "Menu{handle='" + handle + "', id='" + id + "', isDefault='" + isDefault + "', items='" + items + "', title='" + title + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Menu that = (Menu) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        isDefault == that.isDefault &&
        Objects.equals(items, that.items) &&
        Objects.equals(title, that.title) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, id, isDefault, items, title, translations);
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
     * Whether the menu is a default. The handle for default menus can't be updated and default menus can't be deleted.
     */
    private boolean isDefault;

    /**
     * A list of items on the menu sorted by position.
     */
    private List<MenuItem> items;

    /**
     * The menu's title.
     */
    private String title;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    public Menu build() {
      Menu result = new Menu();
      result.handle = this.handle;
      result.id = this.id;
      result.isDefault = this.isDefault;
      result.items = this.items;
      result.title = this.title;
      result.translations = this.translations;
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
     * Whether the menu is a default. The handle for default menus can't be updated and default menus can't be deleted.
     */
    public Builder isDefault(boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }

    /**
     * A list of items on the menu sorted by position.
     */
    public Builder items(List<MenuItem> items) {
      this.items = items;
      return this;
    }

    /**
     * The menu's title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
