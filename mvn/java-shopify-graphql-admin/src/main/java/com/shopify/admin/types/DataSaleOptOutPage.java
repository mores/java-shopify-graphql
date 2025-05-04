package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shop's data sale opt out page.
 */
public class DataSaleOptOutPage {
  /**
   * If the data sale opt out page is auto managed.
   */
  private boolean autoManaged;

  public DataSaleOptOutPage() {
  }

  /**
   * If the data sale opt out page is auto managed.
   */
  public boolean getAutoManaged() {
    return autoManaged;
  }

  public void setAutoManaged(boolean autoManaged) {
    this.autoManaged = autoManaged;
  }

  @Override
  public String toString() {
    return "DataSaleOptOutPage{autoManaged='" + autoManaged + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataSaleOptOutPage that = (DataSaleOptOutPage) o;
    return autoManaged == that.autoManaged;
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoManaged);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * If the data sale opt out page is auto managed.
     */
    private boolean autoManaged;

    public DataSaleOptOutPage build() {
      DataSaleOptOutPage result = new DataSaleOptOutPage();
      result.autoManaged = this.autoManaged;
      return result;
    }

    /**
     * If the data sale opt out page is auto managed.
     */
    public Builder autoManaged(boolean autoManaged) {
      this.autoManaged = autoManaged;
      return this;
    }
  }
}
