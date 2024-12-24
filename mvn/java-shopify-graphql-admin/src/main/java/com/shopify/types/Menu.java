package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Menu implements com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  
  private String handle;

  
  private String id;

  
  private boolean isDefault;

  
  private List<MenuItem> items;

  
  private String title;

  
  private List<Translation> translations;

  public Menu() {
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(boolean isDefault) {
    this.isDefault = isDefault;
  }

  
  public List<MenuItem> getItems() {
    return items;
  }

  public void setItems(List<MenuItem> items) {
    this.items = items;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
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
    
    private String handle;

    
    private String id;

    
    private boolean isDefault;

    
    private List<MenuItem> items;

    
    private String title;

    
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

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder isDefault(boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }

    
    public Builder items(List<MenuItem> items) {
      this.items = items;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
