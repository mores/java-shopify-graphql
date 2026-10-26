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
   * A list of analytics targets that match the ShopifyQL query.
   * For target gauge queries, returns the matching target if one exists.
   * For `COMPARE TO targets` queries, returns matching targets for visualized metrics in `VISUALIZE` order.
   * Returns an empty list when no targets match or the ShopifyQL query cannot be matched.
   * Query `parseErrors` to detect invalid ShopifyQL.
   */
  private List<AnalyticsTarget> analyticsTargets;

  /**
   * A list of parse errors, if parsing fails.
   */
  private List<String> parseErrors;

  /**
   * A list of non-fatal parse warnings, such as use of a deprecated field. Unlike
   * `parseErrors`, warnings are returned alongside results.
   */
  private List<String> parseWarnings;

  /**
   * The result in a tabular format with column and row data.
   */
  private ShopifyqlTableData tableData;

  public ShopifyqlQueryResponse() {
  }

  /**
   * A list of analytics targets that match the ShopifyQL query.
   * For target gauge queries, returns the matching target if one exists.
   * For `COMPARE TO targets` queries, returns matching targets for visualized metrics in `VISUALIZE` order.
   * Returns an empty list when no targets match or the ShopifyQL query cannot be matched.
   * Query `parseErrors` to detect invalid ShopifyQL.
   */
  public List<AnalyticsTarget> getAnalyticsTargets() {
    return analyticsTargets;
  }

  public void setAnalyticsTargets(List<AnalyticsTarget> analyticsTargets) {
    this.analyticsTargets = analyticsTargets;
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
   * A list of non-fatal parse warnings, such as use of a deprecated field. Unlike
   * `parseErrors`, warnings are returned alongside results.
   */
  public List<String> getParseWarnings() {
    return parseWarnings;
  }

  public void setParseWarnings(List<String> parseWarnings) {
    this.parseWarnings = parseWarnings;
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
    return "ShopifyqlQueryResponse{analyticsTargets='" + analyticsTargets + "', parseErrors='" + parseErrors + "', parseWarnings='" + parseWarnings + "', tableData='" + tableData + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyqlQueryResponse that = (ShopifyqlQueryResponse) o;
    return Objects.equals(analyticsTargets, that.analyticsTargets) &&
        Objects.equals(parseErrors, that.parseErrors) &&
        Objects.equals(parseWarnings, that.parseWarnings) &&
        Objects.equals(tableData, that.tableData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyticsTargets, parseErrors, parseWarnings, tableData);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of analytics targets that match the ShopifyQL query.
     * For target gauge queries, returns the matching target if one exists.
     * For `COMPARE TO targets` queries, returns matching targets for visualized metrics in `VISUALIZE` order.
     * Returns an empty list when no targets match or the ShopifyQL query cannot be matched.
     * Query `parseErrors` to detect invalid ShopifyQL.
     */
    private List<AnalyticsTarget> analyticsTargets;

    /**
     * A list of parse errors, if parsing fails.
     */
    private List<String> parseErrors;

    /**
     * A list of non-fatal parse warnings, such as use of a deprecated field. Unlike
     * `parseErrors`, warnings are returned alongside results.
     */
    private List<String> parseWarnings;

    /**
     * The result in a tabular format with column and row data.
     */
    private ShopifyqlTableData tableData;

    public ShopifyqlQueryResponse build() {
      ShopifyqlQueryResponse result = new ShopifyqlQueryResponse();
      result.analyticsTargets = this.analyticsTargets;
      result.parseErrors = this.parseErrors;
      result.parseWarnings = this.parseWarnings;
      result.tableData = this.tableData;
      return result;
    }

    /**
     * A list of analytics targets that match the ShopifyQL query.
     * For target gauge queries, returns the matching target if one exists.
     * For `COMPARE TO targets` queries, returns matching targets for visualized metrics in `VISUALIZE` order.
     * Returns an empty list when no targets match or the ShopifyQL query cannot be matched.
     * Query `parseErrors` to detect invalid ShopifyQL.
     */
    public Builder analyticsTargets(List<AnalyticsTarget> analyticsTargets) {
      this.analyticsTargets = analyticsTargets;
      return this;
    }

    /**
     * A list of parse errors, if parsing fails.
     */
    public Builder parseErrors(List<String> parseErrors) {
      this.parseErrors = parseErrors;
      return this;
    }

    /**
     * A list of non-fatal parse warnings, such as use of a deprecated field. Unlike
     * `parseErrors`, warnings are returned alongside results.
     */
    public Builder parseWarnings(List<String> parseWarnings) {
      this.parseWarnings = parseWarnings;
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
