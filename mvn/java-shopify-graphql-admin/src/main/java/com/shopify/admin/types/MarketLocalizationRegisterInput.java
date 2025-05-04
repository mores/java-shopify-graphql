package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields and values for creating or updating a market localization.
 */
public class MarketLocalizationRegisterInput {
  /**
   * The ID of the market that the localization is specific to.
   */
  private String marketId;

  /**
   * A reference to the value being localized on the resource that this market localization belongs to.
   */
  private String key;

  /**
   * The value of the market localization.
   */
  private String value;

  /**
   * A hash digest representation of the content being localized.
   */
  private String marketLocalizableContentDigest;

  public MarketLocalizationRegisterInput() {
  }

  /**
   * The ID of the market that the localization is specific to.
   */
  public String getMarketId() {
    return marketId;
  }

  public void setMarketId(String marketId) {
    this.marketId = marketId;
  }

  /**
   * A reference to the value being localized on the resource that this market localization belongs to.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The value of the market localization.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * A hash digest representation of the content being localized.
   */
  public String getMarketLocalizableContentDigest() {
    return marketLocalizableContentDigest;
  }

  public void setMarketLocalizableContentDigest(String marketLocalizableContentDigest) {
    this.marketLocalizableContentDigest = marketLocalizableContentDigest;
  }

  @Override
  public String toString() {
    return "MarketLocalizationRegisterInput{marketId='" + marketId + "', key='" + key + "', value='" + value + "', marketLocalizableContentDigest='" + marketLocalizableContentDigest + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketLocalizationRegisterInput that = (MarketLocalizationRegisterInput) o;
    return Objects.equals(marketId, that.marketId) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value) &&
        Objects.equals(marketLocalizableContentDigest, that.marketLocalizableContentDigest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketId, key, value, marketLocalizableContentDigest);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the market that the localization is specific to.
     */
    private String marketId;

    /**
     * A reference to the value being localized on the resource that this market localization belongs to.
     */
    private String key;

    /**
     * The value of the market localization.
     */
    private String value;

    /**
     * A hash digest representation of the content being localized.
     */
    private String marketLocalizableContentDigest;

    public MarketLocalizationRegisterInput build() {
      MarketLocalizationRegisterInput result = new MarketLocalizationRegisterInput();
      result.marketId = this.marketId;
      result.key = this.key;
      result.value = this.value;
      result.marketLocalizableContentDigest = this.marketLocalizableContentDigest;
      return result;
    }

    /**
     * The ID of the market that the localization is specific to.
     */
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      return this;
    }

    /**
     * A reference to the value being localized on the resource that this market localization belongs to.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The value of the market localization.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * A hash digest representation of the content being localized.
     */
    public Builder marketLocalizableContentDigest(String marketLocalizableContentDigest) {
      this.marketLocalizableContentDigest = marketLocalizableContentDigest;
      return this;
    }
  }
}
