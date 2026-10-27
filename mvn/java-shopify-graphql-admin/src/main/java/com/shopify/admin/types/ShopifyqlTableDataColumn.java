package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a column in a ShopifyQL query response.
 */
public class ShopifyqlTableDataColumn {
  /**
   * Whether the column was explicitly requested in the query or dynamically generated.
   */
  private ShopifyqlColumnOrigin columnOrigin;

  /**
   * The data type of the column.
   */
  private ColumnDataType dataType;

  /**
   * The human-readable display name of the column.
   */
  private String displayName;

  /**
   * Metadata describing how a dynamic column was generated (comparison, totals,
   * benchmark, attribution, etc.). Null for non-dynamic columns.
   */
  private ShopifyqlDynamicColumnMetadata dynamicColumnMetadata;

  /**
   * The name of the column.
   */
  private String name;

  /**
   * A shortened display name for the column, suitable for compact UI such as metric tiles.
   */
  private String shortDisplayName;

  /**
   * The element type of an array column or DAY_DURATION for a range column.
   */
  private ColumnDataType subType;

  public ShopifyqlTableDataColumn() {
  }

  /**
   * Whether the column was explicitly requested in the query or dynamically generated.
   */
  public ShopifyqlColumnOrigin getColumnOrigin() {
    return columnOrigin;
  }

  public void setColumnOrigin(ShopifyqlColumnOrigin columnOrigin) {
    this.columnOrigin = columnOrigin;
  }

  /**
   * The data type of the column.
   */
  public ColumnDataType getDataType() {
    return dataType;
  }

  public void setDataType(ColumnDataType dataType) {
    this.dataType = dataType;
  }

  /**
   * The human-readable display name of the column.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Metadata describing how a dynamic column was generated (comparison, totals,
   * benchmark, attribution, etc.). Null for non-dynamic columns.
   */
  public ShopifyqlDynamicColumnMetadata getDynamicColumnMetadata() {
    return dynamicColumnMetadata;
  }

  public void setDynamicColumnMetadata(ShopifyqlDynamicColumnMetadata dynamicColumnMetadata) {
    this.dynamicColumnMetadata = dynamicColumnMetadata;
  }

  /**
   * The name of the column.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A shortened display name for the column, suitable for compact UI such as metric tiles.
   */
  public String getShortDisplayName() {
    return shortDisplayName;
  }

  public void setShortDisplayName(String shortDisplayName) {
    this.shortDisplayName = shortDisplayName;
  }

  /**
   * The element type of an array column or DAY_DURATION for a range column.
   */
  public ColumnDataType getSubType() {
    return subType;
  }

  public void setSubType(ColumnDataType subType) {
    this.subType = subType;
  }

  @Override
  public String toString() {
    return "ShopifyqlTableDataColumn{columnOrigin='" + columnOrigin + "', dataType='" + dataType + "', displayName='" + displayName + "', dynamicColumnMetadata='" + dynamicColumnMetadata + "', name='" + name + "', shortDisplayName='" + shortDisplayName + "', subType='" + subType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyqlTableDataColumn that = (ShopifyqlTableDataColumn) o;
    return Objects.equals(columnOrigin, that.columnOrigin) &&
        Objects.equals(dataType, that.dataType) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(dynamicColumnMetadata, that.dynamicColumnMetadata) &&
        Objects.equals(name, that.name) &&
        Objects.equals(shortDisplayName, that.shortDisplayName) &&
        Objects.equals(subType, that.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnOrigin, dataType, displayName, dynamicColumnMetadata, name, shortDisplayName, subType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the column was explicitly requested in the query or dynamically generated.
     */
    private ShopifyqlColumnOrigin columnOrigin;

    /**
     * The data type of the column.
     */
    private ColumnDataType dataType;

    /**
     * The human-readable display name of the column.
     */
    private String displayName;

    /**
     * Metadata describing how a dynamic column was generated (comparison, totals,
     * benchmark, attribution, etc.). Null for non-dynamic columns.
     */
    private ShopifyqlDynamicColumnMetadata dynamicColumnMetadata;

    /**
     * The name of the column.
     */
    private String name;

    /**
     * A shortened display name for the column, suitable for compact UI such as metric tiles.
     */
    private String shortDisplayName;

    /**
     * The element type of an array column or DAY_DURATION for a range column.
     */
    private ColumnDataType subType;

    public ShopifyqlTableDataColumn build() {
      ShopifyqlTableDataColumn result = new ShopifyqlTableDataColumn();
      result.columnOrigin = this.columnOrigin;
      result.dataType = this.dataType;
      result.displayName = this.displayName;
      result.dynamicColumnMetadata = this.dynamicColumnMetadata;
      result.name = this.name;
      result.shortDisplayName = this.shortDisplayName;
      result.subType = this.subType;
      return result;
    }

    /**
     * Whether the column was explicitly requested in the query or dynamically generated.
     */
    public Builder columnOrigin(ShopifyqlColumnOrigin columnOrigin) {
      this.columnOrigin = columnOrigin;
      return this;
    }

    /**
     * The data type of the column.
     */
    public Builder dataType(ColumnDataType dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * The human-readable display name of the column.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Metadata describing how a dynamic column was generated (comparison, totals,
     * benchmark, attribution, etc.). Null for non-dynamic columns.
     */
    public Builder dynamicColumnMetadata(ShopifyqlDynamicColumnMetadata dynamicColumnMetadata) {
      this.dynamicColumnMetadata = dynamicColumnMetadata;
      return this;
    }

    /**
     * The name of the column.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A shortened display name for the column, suitable for compact UI such as metric tiles.
     */
    public Builder shortDisplayName(String shortDisplayName) {
      this.shortDisplayName = shortDisplayName;
      return this;
    }

    /**
     * The element type of an array column or DAY_DURATION for a range column.
     */
    public Builder subType(ColumnDataType subType) {
      this.subType = subType;
      return this;
    }
  }
}
