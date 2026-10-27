package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Describes how a dynamically generated column relates to the query.
 */
public class ShopifyqlDynamicColumnMetadata {
  /**
   * The names of the dimension columns this column is aggregated (grouped) by.
   */
  private List<String> aggregatedBy;

  /**
   * What the column is compared against. For benchmark columns, the percentile
   * (e.g. `p50`); for comparison columns, the comparison period or date offset.
   * Interpret based on `type`.
   */
  private String comparisonReference;

  /**
   * The query column this dynamic column was derived from (e.g. `total_sales`).
   */
  private String originalColumnName;

  /**
   * The kind of dynamic column.
   */
  private ShopifyqlDynamicColumnType type;

  public ShopifyqlDynamicColumnMetadata() {
  }

  /**
   * The names of the dimension columns this column is aggregated (grouped) by.
   */
  public List<String> getAggregatedBy() {
    return aggregatedBy;
  }

  public void setAggregatedBy(List<String> aggregatedBy) {
    this.aggregatedBy = aggregatedBy;
  }

  /**
   * What the column is compared against. For benchmark columns, the percentile
   * (e.g. `p50`); for comparison columns, the comparison period or date offset.
   * Interpret based on `type`.
   */
  public String getComparisonReference() {
    return comparisonReference;
  }

  public void setComparisonReference(String comparisonReference) {
    this.comparisonReference = comparisonReference;
  }

  /**
   * The query column this dynamic column was derived from (e.g. `total_sales`).
   */
  public String getOriginalColumnName() {
    return originalColumnName;
  }

  public void setOriginalColumnName(String originalColumnName) {
    this.originalColumnName = originalColumnName;
  }

  /**
   * The kind of dynamic column.
   */
  public ShopifyqlDynamicColumnType getType() {
    return type;
  }

  public void setType(ShopifyqlDynamicColumnType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "ShopifyqlDynamicColumnMetadata{aggregatedBy='" + aggregatedBy + "', comparisonReference='" + comparisonReference + "', originalColumnName='" + originalColumnName + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyqlDynamicColumnMetadata that = (ShopifyqlDynamicColumnMetadata) o;
    return Objects.equals(aggregatedBy, that.aggregatedBy) &&
        Objects.equals(comparisonReference, that.comparisonReference) &&
        Objects.equals(originalColumnName, that.originalColumnName) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedBy, comparisonReference, originalColumnName, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The names of the dimension columns this column is aggregated (grouped) by.
     */
    private List<String> aggregatedBy;

    /**
     * What the column is compared against. For benchmark columns, the percentile
     * (e.g. `p50`); for comparison columns, the comparison period or date offset.
     * Interpret based on `type`.
     */
    private String comparisonReference;

    /**
     * The query column this dynamic column was derived from (e.g. `total_sales`).
     */
    private String originalColumnName;

    /**
     * The kind of dynamic column.
     */
    private ShopifyqlDynamicColumnType type;

    public ShopifyqlDynamicColumnMetadata build() {
      ShopifyqlDynamicColumnMetadata result = new ShopifyqlDynamicColumnMetadata();
      result.aggregatedBy = this.aggregatedBy;
      result.comparisonReference = this.comparisonReference;
      result.originalColumnName = this.originalColumnName;
      result.type = this.type;
      return result;
    }

    /**
     * The names of the dimension columns this column is aggregated (grouped) by.
     */
    public Builder aggregatedBy(List<String> aggregatedBy) {
      this.aggregatedBy = aggregatedBy;
      return this;
    }

    /**
     * What the column is compared against. For benchmark columns, the percentile
     * (e.g. `p50`); for comparison columns, the comparison period or date offset.
     * Interpret based on `type`.
     */
    public Builder comparisonReference(String comparisonReference) {
      this.comparisonReference = comparisonReference;
      return this;
    }

    /**
     * The query column this dynamic column was derived from (e.g. `total_sales`).
     */
    public Builder originalColumnName(String originalColumnName) {
      this.originalColumnName = originalColumnName;
      return this;
    }

    /**
     * The kind of dynamic column.
     */
    public Builder type(ShopifyqlDynamicColumnType type) {
      this.type = type;
      return this;
    }
  }
}
