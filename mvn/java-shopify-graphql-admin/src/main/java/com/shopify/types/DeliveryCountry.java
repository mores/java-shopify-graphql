package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryCountry implements com.shopify.types.Node {
  
  private DeliveryCountryCodeOrRestOfWorld code;

  
  private String id;

  
  private String name;

  
  private List<DeliveryProvince> provinces;

  
  private String translatedName;

  public DeliveryCountry() {
  }

  
  public DeliveryCountryCodeOrRestOfWorld getCode() {
    return code;
  }

  public void setCode(DeliveryCountryCodeOrRestOfWorld code) {
    this.code = code;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public List<DeliveryProvince> getProvinces() {
    return provinces;
  }

  public void setProvinces(List<DeliveryProvince> provinces) {
    this.provinces = provinces;
  }

  
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
    
    private DeliveryCountryCodeOrRestOfWorld code;

    
    private String id;

    
    private String name;

    
    private List<DeliveryProvince> provinces;

    
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

    
    public Builder code(DeliveryCountryCodeOrRestOfWorld code) {
      this.code = code;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder provinces(List<DeliveryProvince> provinces) {
      this.provinces = provinces;
      return this;
    }

    
    public Builder translatedName(String translatedName) {
      this.translatedName = translatedName;
      return this;
    }
  }
}
