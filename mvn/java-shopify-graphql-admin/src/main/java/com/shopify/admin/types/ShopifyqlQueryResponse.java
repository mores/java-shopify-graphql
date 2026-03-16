package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A response to a ShopifyQL query.
 */
public class ShopifyqlQueryResponse {
  /**
   * A list of parse errors, if parsing fails.
   */
  private List<String> parseErrors;

  /**
   * The result in a tabular format with column and row data.
   */
  private ShopifyqlTableData tableData;

  public ShopifyqlQueryResponse() {
  }

  /**
   * A list of parse errors, if parsing fails.
   */
  public List<String> getParseErrors() {
    return parseErrors;
  }

  public void setParseErrors(List<String> parseErrors) {
    this.parseErrors = parseErrors;
  }

  /**
   * The result in a tabular format with column and row data.
   */
  public ShopifyqlTableData getTableData() {
    return tableData;
  }

  public void setTableData(ShopifyqlTableData tableData) {
    this.tableData = tableData;
  }

  @Override
  public String toString() {
    return "ShopifyqlQueryResponse{parseErrors='" + parseErrors + "', tableData='" + tableData + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyqlQueryResponse that = (ShopifyqlQueryResponse) o;
    return Objects.equals(parseErrors, that.parseErrors) &&
        Objects.equals(tableData, that.tableData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parseErrors, tableData);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of parse errors, if parsing fails.
     */
    private List<String> parseErrors;

    /**
     * The result in a tabular format with column and row data.
     */
    private ShopifyqlTableData tableData;

    public ShopifyqlQueryResponse build() {
      ShopifyqlQueryResponse result = new ShopifyqlQueryResponse();
      result.parseErrors = this.parseErrors;
      result.tableData = this.tableData;
      return result;
    }

    /**
     * A list of parse errors, if parsing fails.
     */
    public Builder parseErrors(List<String> parseErrors) {
      this.parseErrors = parseErrors;
      return this;
    }

    /**
     * The result in a tabular format with column and row data.
     */
    public Builder tableData(ShopifyqlTableData tableData) {
      this.tableData = tableData;
      return this;
    }
  }
}
