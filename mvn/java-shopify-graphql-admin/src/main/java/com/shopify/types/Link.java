package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A link to direct users to.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Link implements com.shopify.types.HasPublishedTranslations {
  /**
   * A context-sensitive label for the link.
   */
  private String label;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The URL that the link visits.
   */
  private String url;

  public Link() {
  }

  /**
   * A context-sensitive label for the link.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
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

  /**
   * The URL that the link visits.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Link{label='" + label + "', translations='" + translations + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Link that = (Link) o;
    return Objects.equals(label, that.label) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, translations, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A context-sensitive label for the link.
     */
    private String label;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The URL that the link visits.
     */
    private String url;

    public Link build() {
      Link result = new Link();
      result.label = this.label;
      result.translations = this.translations;
      result.url = this.url;
      return result;
    }

    /**
     * A context-sensitive label for the link.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    /**
     * The URL that the link visits.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
