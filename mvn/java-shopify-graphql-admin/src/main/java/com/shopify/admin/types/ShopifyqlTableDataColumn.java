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
   * The data type of the column.
   */
  private ColumnDataType dataType;

  /**
   * The human-readable display name of the column.
   */
  private String displayName;

  /**
   * The name of the column.
   */
  private String name;

  /**
   * The sub type of an array column.
   */
  private ColumnDataType subType;

  public ShopifyqlTableDataColumn() {
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
   * The name of the column.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The sub type of an array column.
   */
  public ColumnDataType getSubType() {
    return subType;
  }

  public void setSubType(ColumnDataType subType) {
    this.subType = subType;
  }

  @Override
  public String toString() {
    return "ShopifyqlTableDataColumn{dataType='" + dataType + "', displayName='" + displayName + "', name='" + name + "', subType='" + subType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyqlTableDataColumn that = (ShopifyqlTableDataColumn) o;
    return Objects.equals(dataType, that.dataType) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(name, that.name) &&
        Objects.equals(subType, that.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, displayName, name, subType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The data type of the column.
     */
    private ColumnDataType dataType;

    /**
     * The human-readable display name of the column.
     */
    private String displayName;

    /**
     * The name of the column.
     */
    private String name;

    /**
     * The sub type of an array column.
     */
    private ColumnDataType subType;

    public ShopifyqlTableDataColumn build() {
      ShopifyqlTableDataColumn result = new ShopifyqlTableDataColumn();
      result.dataType = this.dataType;
      result.displayName = this.displayName;
      result.name = this.name;
      result.subType = this.subType;
      return result;
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
     * The name of the column.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The sub type of an array column.
     */
    public Builder subType(ColumnDataType subType) {
      this.subType = subType;
      return this;
    }
  }
}
