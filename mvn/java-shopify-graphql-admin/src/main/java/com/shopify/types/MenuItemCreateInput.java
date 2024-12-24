package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MenuItemCreateInput {
  
  private String title;

  
  private MenuItemType type;

  
  private String resourceId;

  
  private String url;

  
  private List<String> tags;

  
  private List<MenuItemCreateInput> items;

  public MenuItemCreateInput() {
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public MenuItemType getType() {
    return type;
  }

  public void setType(MenuItemType type) {
    this.type = type;
  }

  
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public List<MenuItemCreateInput> getItems() {
    return items;
  }

  public void setItems(List<MenuItemCreateInput> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "MenuItemCreateInput{title='" + title + "', type='" + type + "', resourceId='" + resourceId + "', url='" + url + "', tags='" + tags + "', items='" + items + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MenuItemCreateInput that = (MenuItemCreateInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(type, that.type) &&
        Objects.equals(resourceId, that.resourceId) &&
        Objects.equals(url, that.url) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(items, that.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, type, resourceId, url, tags, items);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String title;

    
    private MenuItemType type;

    
    private String resourceId;

    
    private String url;

    
    private List<String> tags;

    
    private List<MenuItemCreateInput> items;

    public MenuItemCreateInput build() {
      MenuItemCreateInput result = new MenuItemCreateInput();
      result.title = this.title;
      result.type = this.type;
      result.resourceId = this.resourceId;
      result.url = this.url;
      result.tags = this.tags;
      result.items = this.items;
      return result;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder type(MenuItemType type) {
      this.type = type;
      return this;
    }

    
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder items(List<MenuItemCreateInput> items) {
      this.items = items;
      return this;
    }
  }
}
