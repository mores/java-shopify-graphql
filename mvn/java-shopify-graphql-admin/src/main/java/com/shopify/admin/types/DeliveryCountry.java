package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A country that is used to define a shipping zone.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryCountry implements com.shopify.admin.types.Node {
  /**
   * A two-letter country code in ISO 3166-1 alpha-2 standard.
   * It also includes a flag indicating whether the country should be
   * a part of the 'Rest Of World' shipping zone.
   */
  private DeliveryCountryCodeOrRestOfWorld code;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The full name of the country.
   */
  private String name;

  /**
   * The list of regions associated with this country.
   */
  private List<DeliveryProvince> provinces;

  /**
   * The translated name of the country. The translation returned is based on the system's locale.
   */
  private String translatedName;

  public DeliveryCountry() {
  }

  /**
   * A two-letter country code in ISO 3166-1 alpha-2 standard.
   * It also includes a flag indicating whether the country should be
   * a part of the 'Rest Of World' shipping zone.
   */
  public DeliveryCountryCodeOrRestOfWorld getCode() {
    return code;
  }

  public void setCode(DeliveryCountryCodeOrRestOfWorld code) {
    this.code = code;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The full name of the country.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The list of regions associated with this country.
   */
  public List<DeliveryProvince> getProvinces() {
    return provinces;
  }

  public void setProvinces(List<DeliveryProvince> provinces) {
    this.provinces = provinces;
  }

  /**
   * The translated name of the country. The translation returned is based on the system's locale.
   */
  public String getTranslatedName() {
    return translatedName;
  }

  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }

  @Override
  public String toString() {
    return "DeliveryCountry{code='" + code + "', id='" + id + "', name='" + name + "', provinces='" + provinces + "', translatedName='" + translatedName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCountry that = (DeliveryCountry) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(provinces, that.provinces) &&
        Objects.equals(translatedName, that.translatedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, id, name, provinces, translatedName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A two-letter country code in ISO 3166-1 alpha-2 standard.
     * It also includes a flag indicating whether the country should be
     * a part of the 'Rest Of World' shipping zone.
     */
    private DeliveryCountryCodeOrRestOfWorld code;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The full name of the country.
     */
    private String name;

    /**
     * The list of regions associated with this country.
     */
    private List<DeliveryProvince> provinces;

    /**
     * The translated name of the country. The translation returned is based on the system's locale.
     */
    private String translatedName;

    public DeliveryCountry build() {
      DeliveryCountry result = new DeliveryCountry();
      result.code = this.code;
      result.id = this.id;
      result.name = this.name;
      result.provinces = this.provinces;
      result.translatedName = this.translatedName;
      return result;
    }

    /**
     * A two-letter country code in ISO 3166-1 alpha-2 standard.
     * It also includes a flag indicating whether the country should be
     * a part of the 'Rest Of World' shipping zone.
     */
    public Builder code(DeliveryCountryCodeOrRestOfWorld code) {
      this.code = code;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The full name of the country.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The list of regions associated with this country.
     */
    public Builder provinces(List<DeliveryProvince> provinces) {
      this.provinces = provinces;
      return this;
    }

    /**
     * The translated name of the country. The translation returned is based on the system's locale.
     */
    public Builder translatedName(String translatedName) {
      this.translatedName = translatedName;
      return this;
    }
  }
}
