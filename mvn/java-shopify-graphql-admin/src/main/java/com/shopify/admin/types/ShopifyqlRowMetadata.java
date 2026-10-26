package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Per-row metadata for a ShopifyQL result, aligned by index with the table's rows.
 */
public class ShopifyqlRowMetadata {
  /**
   * Localized display text for null cells in this row, by column.
   */
  private List<ShopifyqlNullCellTranslation> nullCellTranslations;

  /**
   * Raw resource IDs associated with the row, aligned by column index. Each entry
   * is the list of IDs for that column (empty when the cell has none). These are
   * raw ShopifyQL identifiers (numeric IDs, or image URLs for some schemas), not GIDs.
   */
  private List<List<String>> rawResourceIds;

  /**
   * Names of the columns whose values were rolled into the top-N "Other" remainder bucket.
   */
  private List<String> topNRemainderColumnNames;

  public ShopifyqlRowMetadata() {
  }

  /**
   * Localized display text for null cells in this row, by column.
   */
  public List<ShopifyqlNullCellTranslation> getNullCellTranslations() {
    return nullCellTranslations;
  }

  public void setNullCellTranslations(List<ShopifyqlNullCellTranslation> nullCellTranslations) {
    this.nullCellTranslations = nullCellTranslations;
  }

  /**
   * Raw resource IDs associated with the row, aligned by column index. Each entry
   * is the list of IDs for that column (empty when the cell has none). These are
   * raw ShopifyQL identifiers (numeric IDs, or image URLs for some schemas), not GIDs.
   */
  public List<List<String>> getRawResourceIds() {
    return rawResourceIds;
  }

  public void setRawResourceIds(List<List<String>> rawResourceIds) {
    this.rawResourceIds = rawResourceIds;
  }

  /**
   * Names of the columns whose values were rolled into the top-N "Other" remainder bucket.
   */
  public List<String> getTopNRemainderColumnNames() {
    return topNRemainderColumnNames;
  }

  public void setTopNRemainderColumnNames(List<String> topNRemainderColumnNames) {
    this.topNRemainderColumnNames = topNRemainderColumnNames;
  }

  @Override
  public String toString() {
    return "ShopifyqlRowMetadata{nullCellTranslations='" + nullCellTranslations + "', rawResourceIds='" + rawResourceIds + "', topNRemainderColumnNames='" + topNRemainderColumnNames + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyqlRowMetadata that = (ShopifyqlRowMetadata) o;
    return Objects.equals(nullCellTranslations, that.nullCellTranslations) &&
        Objects.equals(rawResourceIds, that.rawResourceIds) &&
        Objects.equals(topNRemainderColumnNames, that.topNRemainderColumnNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nullCellTranslations, rawResourceIds, topNRemainderColumnNames);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Localized display text for null cells in this row, by column.
     */
    private List<ShopifyqlNullCellTranslation> nullCellTranslations;

    /**
     * Raw resource IDs associated with the row, aligned by column index. Each entry
     * is the list of IDs for that column (empty when the cell has none). These are
     * raw ShopifyQL identifiers (numeric IDs, or image URLs for some schemas), not GIDs.
     */
    private List<List<String>> rawResourceIds;

    /**
     * Names of the columns whose values were rolled into the top-N "Other" remainder bucket.
     */
    private List<String> topNRemainderColumnNames;

    public ShopifyqlRowMetadata build() {
      ShopifyqlRowMetadata result = new ShopifyqlRowMetadata();
      result.nullCellTranslations = this.nullCellTranslations;
      result.rawResourceIds = this.rawResourceIds;
      result.topNRemainderColumnNames = this.topNRemainderColumnNames;
      return result;
    }

    /**
     * Localized display text for null cells in this row, by column.
     */
    public Builder nullCellTranslations(List<ShopifyqlNullCellTranslation> nullCellTranslations) {
      this.nullCellTranslations = nullCellTranslations;
      return this;
    }

    /**
     * Raw resource IDs associated with the row, aligned by column index. Each entry
     * is the list of IDs for that column (empty when the cell has none). These are
     * raw ShopifyQL identifiers (numeric IDs, or image URLs for some schemas), not GIDs.
     */
    public Builder rawResourceIds(List<List<String>> rawResourceIds) {
      this.rawResourceIds = rawResourceIds;
      return this;
    }

    /**
     * Names of the columns whose values were rolled into the top-N "Other" remainder bucket.
     */
    public Builder topNRemainderColumnNames(List<String> topNRemainderColumnNames) {
      this.topNRemainderColumnNames = topNRemainderColumnNames;
      return this;
    }
  }
}
