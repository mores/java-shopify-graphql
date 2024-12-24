package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SearchResult {
  
  private String description;

  
  private Image image;

  
  private Node reference;

  
  private String title;

  
  private String url;

  public SearchResult() {
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  
  public Node getReference() {
    return reference;
  }

  public void setReference(Node reference) {
    this.reference = reference;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "SearchResult{description='" + description + "', image='" + image + "', reference='" + reference + "', title='" + title + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchResult that = (SearchResult) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(image, that.image) &&
        Objects.equals(reference, that.reference) &&
        Objects.equals(title, that.title) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, image, reference, title, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String description;

    
    private Image image;

    
    private Node reference;

    
    private String title;

    
    private String url;

    public SearchResult build() {
      SearchResult result = new SearchResult();
      result.description = this.description;
      result.image = this.image;
      result.reference = this.reference;
      result.title = this.title;
      result.url = this.url;
      return result;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    
    public Builder reference(Node reference) {
      this.reference = reference;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
