package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Trace information for a single country-language product feed sync triggered by [`channelFullSync`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/channelFullSync).
 */
public class FullSyncTraceInfo {
  /**
   * The country of the product feed that was triggered.
   */
  private CountryCode country;

  /**
   * The language of the product feed that was triggered.
   */
  private LanguageCode language;

  /**
   * The operation ID of a successfully initiated product full sync operation. This
   * field is set to nil when the full sync operation isn't successfully initiated.
   */
  private String operationId;

  public FullSyncTraceInfo() {
  }

  /**
   * The country of the product feed that was triggered.
   */
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  /**
   * The language of the product feed that was triggered.
   */
  public LanguageCode getLanguage() {
    return language;
  }

  public void setLanguage(LanguageCode language) {
    this.language = language;
  }

  /**
   * The operation ID of a successfully initiated product full sync operation. This
   * field is set to nil when the full sync operation isn't successfully initiated.
   */
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  @Override
  public String toString() {
    return "FullSyncTraceInfo{country='" + country + "', language='" + language + "', operationId='" + operationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FullSyncTraceInfo that = (FullSyncTraceInfo) o;
    return Objects.equals(country, that.country) &&
        Objects.equals(language, that.language) &&
        Objects.equals(operationId, that.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The country of the product feed that was triggered.
     */
    private CountryCode country;

    /**
     * The language of the product feed that was triggered.
     */
    private LanguageCode language;

    /**
     * The operation ID of a successfully initiated product full sync operation. This
     * field is set to nil when the full sync operation isn't successfully initiated.
     */
    private String operationId;

    public FullSyncTraceInfo build() {
      FullSyncTraceInfo result = new FullSyncTraceInfo();
      result.country = this.country;
      result.language = this.language;
      result.operationId = this.operationId;
      return result;
    }

    /**
     * The country of the product feed that was triggered.
     */
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }

    /**
     * The language of the product feed that was triggered.
     */
    public Builder language(LanguageCode language) {
      this.language = language;
      return this;
    }

    /**
     * The operation ID of a successfully initiated product full sync operation. This
     * field is set to nil when the full sync operation isn't successfully initiated.
     */
    public Builder operationId(String operationId) {
      this.operationId = operationId;
      return this;
    }
  }
}
