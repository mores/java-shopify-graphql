package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Specifies the condition by which metaobjects are deleted.
 * Exactly one field of input is required.
 */
public class MetaobjectBulkDeleteWhereCondition {
  /**
   * Deletes all metaobjects with the specified `type`.
   */
  private String type;

  /**
   * A list of metaobjects IDs to delete.
   */
  private List<String> ids;

  public MetaobjectBulkDeleteWhereCondition() {
  }

  /**
   * Deletes all metaobjects with the specified `type`.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * A list of metaobjects IDs to delete.
   */
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  @Override
  public String toString() {
    return "MetaobjectBulkDeleteWhereCondition{type='" + type + "', ids='" + ids + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectBulkDeleteWhereCondition that = (MetaobjectBulkDeleteWhereCondition) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(ids, that.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ids);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Deletes all metaobjects with the specified `type`.
     */
    private String type;

    /**
     * A list of metaobjects IDs to delete.
     */
    private List<String> ids;

    public MetaobjectBulkDeleteWhereCondition build() {
      MetaobjectBulkDeleteWhereCondition result = new MetaobjectBulkDeleteWhereCondition();
      result.type = this.type;
      result.ids = this.ids;
      return result;
    }

    /**
     * Deletes all metaobjects with the specified `type`.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * A list of metaobjects IDs to delete.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      return this;
    }
  }
}
