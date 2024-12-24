package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopPolicy implements com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  
  private String body;

  
  private LocalDate createdAt;

  
  private String id;

  
  private String title;

  
  private List<Translation> translations;

  
  private ShopPolicyType type;

  
  private LocalDate updatedAt;

  
  private String url;

  public ShopPolicy() {
  }

  
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  
  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  
  public ShopPolicyType getType() {
    return type;
  }

  public void setType(ShopPolicyType type) {
    this.type = type;
  }

  
  public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ShopPolicy{body='" + body + "', createdAt='" + createdAt + "', id='" + id + "', title='" + title + "', translations='" + translations + "', type='" + type + "', updatedAt='" + updatedAt + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPolicy that = (ShopPolicy) o;
    return Objects.equals(body, that.body) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(title, that.title) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(type, that.type) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, createdAt, id, title, translations, type, updatedAt, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String body;

    
    private LocalDate createdAt;

    
    private String id;

    
    private String title;

    
    private List<Translation> translations;

    
    private ShopPolicyType type;

    
    private LocalDate updatedAt;

    
    private String url;

    public ShopPolicy build() {
      ShopPolicy result = new ShopPolicy();
      result.body = this.body;
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.title = this.title;
      result.translations = this.translations;
      result.type = this.type;
      result.updatedAt = this.updatedAt;
      result.url = this.url;
      return result;
    }

    
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    
    public Builder createdAt(LocalDate createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
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

    
    public Builder type(ShopPolicyType type) {
      this.type = type;
      return this;
    }

    
    public Builder updatedAt(LocalDate updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
