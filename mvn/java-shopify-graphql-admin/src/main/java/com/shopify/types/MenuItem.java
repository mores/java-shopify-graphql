package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MenuItem {
  
  private String id;

  
  private List<MenuItem> items;

  
  private String resourceId;

  
  private List<String> tags;

  
  private String title;

  
  private MenuItemType type;

  
  private String url;

  public MenuItem() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<MenuItem> getItems() {
    return items;
  }

  public void setItems(List<MenuItem> items) {
    this.items = items;
  }

  
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
    
    private String id;

    
    private List<MenuItem> items;

    
    private String resourceId;

    
    private List<String> tags;

    
    private String title;

    
    private MenuItemType type;

    
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder items(List<MenuItem> items) {
      this.items = items;
      return this;
    }

    
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder type(MenuItemType type) {
      this.type = type;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
