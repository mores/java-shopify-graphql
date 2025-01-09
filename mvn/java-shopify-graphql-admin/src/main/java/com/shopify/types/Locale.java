package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A locale.
 */
public class Locale {
  /**
   * Locale ISO code.
   */
  private String isoCode;

  /**
   * Human-readable locale name.
   */
  private String name;

  public Locale() {
  }

  /**
   * Locale ISO code.
   */
  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  /**
   * Human-readable locale name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Locale{isoCode='" + isoCode + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Locale that = (Locale) o;
    return Objects.equals(isoCode, that.isoCode) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCode, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Locale ISO code.
     */
    private String isoCode;

    /**
     * Human-readable locale name.
     */
    private String name;

    public Locale build() {
      Locale result = new Locale();
      result.isoCode = this.isoCode;
      result.name = this.name;
      return result;
    }

    /**
     * Locale ISO code.
     */
    public Builder isoCode(String isoCode) {
      this.isoCode = isoCode;
      return this;
    }

    /**
     * Human-readable locale name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
