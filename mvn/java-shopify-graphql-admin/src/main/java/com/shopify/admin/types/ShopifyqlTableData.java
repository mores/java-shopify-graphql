package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The result of a ShopifyQL query.
 */
public class ShopifyqlTableData {
  /**
   * The columns of the table.
   */
  private List<ShopifyqlTableDataColumn> columns;

  /**
   * The rows of the table.
   */
  private String rows;

  public ShopifyqlTableData() {
  }

  /**
   * The columns of the table.
   */
  public List<ShopifyqlTableDataColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ShopifyqlTableDataColumn> columns) {
    this.columns = columns;
  }

  /**
   * The rows of the table.
   */
  public String getRows() {
    return rows;
  }

  public void setRows(String rows) {
    this.rows = rows;
  }

  @Override
  public String toString() {
    return "ShopifyqlTableData{columns='" + columns + "', rows='" + rows + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyqlTableData that = (ShopifyqlTableData) o;
    return Objects.equals(columns, that.columns) &&
        Objects.equals(rows, that.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, rows);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The columns of the table.
     */
    private List<ShopifyqlTableDataColumn> columns;

    /**
     * The rows of the table.
     */
    private String rows;

    public ShopifyqlTableData build() {
      ShopifyqlTableData result = new ShopifyqlTableData();
      result.columns = this.columns;
      result.rows = this.rows;
      return result;
    }

    /**
     * The columns of the table.
     */
    public Builder columns(List<ShopifyqlTableDataColumn> columns) {
      this.columns = columns;
      return this;
    }

    /**
     * The rows of the table.
     */
    public Builder rows(String rows) {
      this.rows = rows;
      return this;
    }
  }
}
