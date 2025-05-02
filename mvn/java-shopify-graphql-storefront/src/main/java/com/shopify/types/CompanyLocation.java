package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A company's location.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyLocation implements MetafieldParentResource, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company location was created in Shopify.
   */
  private OffsetDateTime createdAt;

  /**
   * A unique externally-supplied ID for the company.
   */
  private String externalId;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The preferred locale of the company location.
   */
  private String locale;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * The name of the company location.
   */
  private String name;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company location was last modified.
   */
  private OffsetDateTime updatedAt;

  public CompanyLocation() {
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company location was created in Shopify.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A unique externally-supplied ID for the company.
   */
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
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
   * The preferred locale of the company location.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * The name of the company location.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
   * at which the company location was last modified.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "CompanyLocation{createdAt='" + createdAt + "', externalId='" + externalId + "', id='" + id + "', locale='" + locale + "', metafield='" + metafield + "', metafields='" + metafields + "', name='" + name + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocation that = (CompanyLocation) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(externalId, that.externalId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, externalId, id, locale, metafield, metafields, name, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company location was created in Shopify.
     */
    private OffsetDateTime createdAt;

    /**
     * A unique externally-supplied ID for the company.
     */
    private String externalId;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The preferred locale of the company location.
     */
    private String locale;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * The name of the company location.
     */
    private String name;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company location was last modified.
     */
    private OffsetDateTime updatedAt;

    public CompanyLocation build() {
      CompanyLocation result = new CompanyLocation();
      result.createdAt = this.createdAt;
      result.externalId = this.externalId;
      result.id = this.id;
      result.locale = this.locale;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.name = this.name;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company location was created in Shopify.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A unique externally-supplied ID for the company.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
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
     * The preferred locale of the company location.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The name of the company location.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601))
     * at which the company location was last modified.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
