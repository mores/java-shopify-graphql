package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * Policy that a merchant has configured for their store, such as their refund or privacy policy.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopPolicy implements com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.Node {
  /**
   * The text of the policy. The maximum size is 512kb.
   */
  private String body;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was created.
   */
  private LocalDate createdAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The translated title of the policy. For example, Refund Policy or Politique de remboursement.
   */
  private String title;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The shop policy type.
   */
  private ShopPolicyType type;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was last modified.
   */
  private LocalDate updatedAt;

  /**
   * The public URL of the policy.
   */
  private String url;

  public ShopPolicy() {
  }

  /**
   * The text of the policy. The maximum size is 512kb.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was created.
   */
  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
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
   * The translated title of the policy. For example, Refund Policy or Politique de remboursement.
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

  /**
   * The shop policy type.
   */
  public ShopPolicyType getType() {
    return type;
  }

  public void setType(ShopPolicyType type) {
    this.type = type;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was last modified.
   */
  public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The public URL of the policy.
   */
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
    /**
     * The text of the policy. The maximum size is 512kb.
     */
    private String body;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was created.
     */
    private LocalDate createdAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The translated title of the policy. For example, Refund Policy or Politique de remboursement.
     */
    private String title;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The shop policy type.
     */
    private ShopPolicyType type;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was last modified.
     */
    private LocalDate updatedAt;

    /**
     * The public URL of the policy.
     */
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

    /**
     * The text of the policy. The maximum size is 512kb.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was created.
     */
    public Builder createdAt(LocalDate createdAt) {
      this.createdAt = createdAt;
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
     * The translated title of the policy. For example, Refund Policy or Politique de remboursement.
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

    /**
     * The shop policy type.
     */
    public Builder type(ShopPolicyType type) {
      this.type = type;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was last modified.
     */
    public Builder updatedAt(LocalDate updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The public URL of the policy.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
