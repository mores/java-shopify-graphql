package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a list of countries to add or remove from the free shipping discount.
 */
public class DiscountCountriesInput {
  /**
   * The country codes to add to the list of countries where the discount applies.
   */
  private List<CountryCode> add;

  /**
   * The country codes to remove from the list of countries where the discount applies.
   */
  private List<CountryCode> remove;

  public DiscountCountriesInput() {
  }

  /**
   * The country codes to add to the list of countries where the discount applies.
   */
  public List<CountryCode> getAdd() {
    return add;
  }

  public void setAdd(List<CountryCode> add) {
    this.add = add;
  }

  /**
   * The country codes to remove from the list of countries where the discount applies.
   */
  public List<CountryCode> getRemove() {
    return remove;
  }

  public void setRemove(List<CountryCode> remove) {
    this.remove = remove;
  }

  @Override
  public String toString() {
    return "DiscountCountriesInput{add='" + add + "', remove='" + remove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCountriesInput that = (DiscountCountriesInput) o;
    return Objects.equals(add, that.add) &&
        Objects.equals(remove, that.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The country codes to add to the list of countries where the discount applies.
     */
    private List<CountryCode> add;

    /**
     * The country codes to remove from the list of countries where the discount applies.
     */
    private List<CountryCode> remove;

    public DiscountCountriesInput build() {
      DiscountCountriesInput result = new DiscountCountriesInput();
      result.add = this.add;
      result.remove = this.remove;
      return result;
    }

    /**
     * The country codes to add to the list of countries where the discount applies.
     */
    public Builder add(List<CountryCode> add) {
      this.add = add;
      return this;
    }

    /**
     * The country codes to remove from the list of countries where the discount applies.
     */
    public Builder remove(List<CountryCode> remove) {
      this.remove = remove;
      return this;
    }
  }
}
