package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A filter in a search query represented by a key value pair.
 */
public class SearchFilter {
  /**
   * The key of the search filter.
   */
  private String key;

  /**
   * The value of the search filter.
   */
  private String value;

  public SearchFilter() {
  }

  /**
   * The key of the search filter.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The value of the search filter.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SearchFilter{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchFilter that = (SearchFilter) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The key of the search filter.
     */
    private String key;

    /**
     * The value of the search filter.
     */
    private String value;

    public SearchFilter build() {
      SearchFilter result = new SearchFilter();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The key of the search filter.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The value of the search filter.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
