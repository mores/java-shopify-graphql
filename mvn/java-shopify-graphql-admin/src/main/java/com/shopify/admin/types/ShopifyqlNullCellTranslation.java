package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Localized display text shown in place of a null cell in a ShopifyQL result row.
 */
public class ShopifyqlNullCellTranslation {
  /**
   * The name of the column the translation applies to.
   */
  private String columnName;

  /**
   * The localized text to display in place of the null value.
   */
  private String displayText;

  public ShopifyqlNullCellTranslation() {
  }

  /**
   * The name of the column the translation applies to.
   */
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  /**
   * The localized text to display in place of the null value.
   */
  public String getDisplayText() {
    return displayText;
  }

  public void setDisplayText(String displayText) {
    this.displayText = displayText;
  }

  @Override
  public String toString() {
    return "ShopifyqlNullCellTranslation{columnName='" + columnName + "', displayText='" + displayText + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyqlNullCellTranslation that = (ShopifyqlNullCellTranslation) o;
    return Objects.equals(columnName, that.columnName) &&
        Objects.equals(displayText, that.displayText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, displayText);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the column the translation applies to.
     */
    private String columnName;

    /**
     * The localized text to display in place of the null value.
     */
    private String displayText;

    public ShopifyqlNullCellTranslation build() {
      ShopifyqlNullCellTranslation result = new ShopifyqlNullCellTranslation();
      result.columnName = this.columnName;
      result.displayText = this.displayText;
      return result;
    }

    /**
     * The name of the column the translation applies to.
     */
    public Builder columnName(String columnName) {
      this.columnName = columnName;
      return this;
    }

    /**
     * The localized text to display in place of the null value.
     */
    public Builder displayText(String displayText) {
      this.displayText = displayText;
      return this;
    }
  }
}
