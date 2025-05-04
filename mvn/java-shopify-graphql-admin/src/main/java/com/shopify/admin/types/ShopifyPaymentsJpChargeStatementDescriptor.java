package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The charge descriptors for a Japanese payments account.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsJpChargeStatementDescriptor implements com.shopify.admin.types.ShopifyPaymentsChargeStatementDescriptor {
  /**
   * The default charge statement descriptor.
   */
  private String _default;

  /**
   * The charge statement descriptor in kana.
   */
  private String kana;

  /**
   * The charge statement descriptor in kanji.
   */
  private String kanji;

  /**
   * The prefix of the statement descriptor.
   */
  private String prefix;

  public ShopifyPaymentsJpChargeStatementDescriptor() {
  }

  /**
   * The default charge statement descriptor.
   */
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  /**
   * The charge statement descriptor in kana.
   */
  public String getKana() {
    return kana;
  }

  public void setKana(String kana) {
    this.kana = kana;
  }

  /**
   * The charge statement descriptor in kanji.
   */
  public String getKanji() {
    return kanji;
  }

  public void setKanji(String kanji) {
    this.kanji = kanji;
  }

  /**
   * The prefix of the statement descriptor.
   */
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsJpChargeStatementDescriptor{default='" + _default + "', kana='" + kana + "', kanji='" + kanji + "', prefix='" + prefix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsJpChargeStatementDescriptor that = (ShopifyPaymentsJpChargeStatementDescriptor) o;
    return Objects.equals(_default, that._default) &&
        Objects.equals(kana, that.kana) &&
        Objects.equals(kanji, that.kanji) &&
        Objects.equals(prefix, that.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, kana, kanji, prefix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The default charge statement descriptor.
     */
    private String _default;

    /**
     * The charge statement descriptor in kana.
     */
    private String kana;

    /**
     * The charge statement descriptor in kanji.
     */
    private String kanji;

    /**
     * The prefix of the statement descriptor.
     */
    private String prefix;

    public ShopifyPaymentsJpChargeStatementDescriptor build() {
      ShopifyPaymentsJpChargeStatementDescriptor result = new ShopifyPaymentsJpChargeStatementDescriptor();
      result._default = this._default;
      result.kana = this.kana;
      result.kanji = this.kanji;
      result.prefix = this.prefix;
      return result;
    }

    /**
     * The default charge statement descriptor.
     */
    public Builder _default(String _default) {
      this._default = _default;
      return this;
    }

    /**
     * The charge statement descriptor in kana.
     */
    public Builder kana(String kana) {
      this.kana = kana;
      return this;
    }

    /**
     * The charge statement descriptor in kanji.
     */
    public Builder kanji(String kanji) {
      this.kanji = kanji;
      return this;
    }

    /**
     * The prefix of the statement descriptor.
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }
}
