package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsJpChargeStatementDescriptor implements com.shopify.types.ShopifyPaymentsChargeStatementDescriptor {
  
  private String _default;

  
  private String kana;

  
  private String kanji;

  
  private String prefix;

  public ShopifyPaymentsJpChargeStatementDescriptor() {
  }

  
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  
  public String getKana() {
    return kana;
  }

  public void setKana(String kana) {
    this.kana = kana;
  }

  
  public String getKanji() {
    return kanji;
  }

  public void setKanji(String kanji) {
    this.kanji = kanji;
  }

  
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
    
    private String _default;

    
    private String kana;

    
    private String kanji;

    
    private String prefix;

    public ShopifyPaymentsJpChargeStatementDescriptor build() {
      ShopifyPaymentsJpChargeStatementDescriptor result = new ShopifyPaymentsJpChargeStatementDescriptor();
      result._default = this._default;
      result.kana = this.kana;
      result.kanji = this.kanji;
      result.prefix = this.prefix;
      return result;
    }

    
    public Builder _default(String _default) {
      this._default = _default;
      return this;
    }

    
    public Builder kana(String kana) {
      this.kana = kana;
      return this;
    }

    
    public Builder kanji(String kanji) {
      this.kanji = kanji;
      return this;
    }

    
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }
}
