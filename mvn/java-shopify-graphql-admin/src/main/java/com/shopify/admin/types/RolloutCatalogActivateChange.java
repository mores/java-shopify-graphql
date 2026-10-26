package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A rollout treatment change that activates a catalog for the buyers the treatment
 * serves, without changing the catalog's native status. Returned by [`RolloutTreatment.changes`](https://shopify.dev/docs/api/admin-graphql/latest/objects/RolloutTreatment#field-RolloutTreatment.fields.changes).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RolloutCatalogActivateChange implements com.shopify.admin.types.RolloutCatalogChange, com.shopify.admin.types.RolloutChange {
  /**
   * The catalog that the change applies to. Returns `null` when the catalog has been deleted or the caller can't read it.
   */
  private Catalog catalog;

  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  private String id;

  public RolloutCatalogActivateChange() {
  }

  /**
   * The catalog that the change applies to. Returns `null` when the catalog has been deleted or the caller can't read it.
   */
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "RolloutCatalogActivateChange{catalog='" + catalog + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RolloutCatalogActivateChange that = (RolloutCatalogActivateChange) o;
    return Objects.equals(catalog, that.catalog) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The catalog that the change applies to. Returns `null` when the catalog has been deleted or the caller can't read it.
     */
    private Catalog catalog;

    /**
     * A globally unique ID for this change, not the resource it affects.
     */
    private String id;

    public RolloutCatalogActivateChange build() {
      RolloutCatalogActivateChange result = new RolloutCatalogActivateChange();
      result.catalog = this.catalog;
      result.id = this.id;
      return result;
    }

    /**
     * The catalog that the change applies to. Returns `null` when the catalog has been deleted or the caller can't read it.
     */
    public Builder catalog(Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * A globally unique ID for this change, not the resource it affects.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
