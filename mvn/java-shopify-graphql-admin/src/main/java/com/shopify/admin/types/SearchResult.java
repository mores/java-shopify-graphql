package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents an individual result returned from a search.
 */
public class SearchResult {
  /**
   * Returns the search result description text.
   */
  private String description;

  /**
   * Returns the Image resource presented to accompany a search result.
   */
  private Image image;

  /**
   * Returns the ID of the resource returned in the search result.
   */
  private Node reference;

  /**
   * Returns the resource title.
   */
  private String title;

  /**
   * Returns the absolute URL to the resource in the search result.
   */
  private String url;

  public SearchResult() {
  }

  /**
   * Returns the search result description text.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Returns the Image resource presented to accompany a search result.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * Returns the ID of the resource returned in the search result.
   */
  public Node getReference() {
    return reference;
  }

  public void setReference(Node reference) {
    this.reference = reference;
  }

  /**
   * Returns the resource title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Returns the absolute URL to the resource in the search result.
   */
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
    /**
     * Returns the search result description text.
     */
    private String description;

    /**
     * Returns the Image resource presented to accompany a search result.
     */
    private Image image;

    /**
     * Returns the ID of the resource returned in the search result.
     */
    private Node reference;

    /**
     * Returns the resource title.
     */
    private String title;

    /**
     * Returns the absolute URL to the resource in the search result.
     */
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

    /**
     * Returns the search result description text.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Returns the Image resource presented to accompany a search result.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * Returns the ID of the resource returned in the search result.
     */
    public Builder reference(Node reference) {
      this.reference = reference;
      return this;
    }

    /**
     * Returns the resource title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Returns the absolute URL to the resource in the search result.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
