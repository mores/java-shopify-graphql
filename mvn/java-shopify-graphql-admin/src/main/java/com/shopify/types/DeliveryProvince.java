package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A region that is used to define a shipping zone.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryProvince implements com.shopify.types.Node {
  /**
   * The code of the region.
   */
  private String code;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The full name of the region.
   */
  private String name;

  /**
   * The translated name of the region. The translation returned is based on the system's locale.
   */
  private String translatedName;

  public DeliveryProvince() {
  }

  /**
   * The code of the region.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
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
   * The full name of the region.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The translated name of the region. The translation returned is based on the system's locale.
   */
  public String getTranslatedName() {
    return translatedName;
  }

  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }

  @Override
  public String toString() {
    return "DeliveryProvince{code='" + code + "', id='" + id + "', name='" + name + "', translatedName='" + translatedName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProvince that = (DeliveryProvince) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(translatedName, that.translatedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, id, name, translatedName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the region.
     */
    private String code;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The full name of the region.
     */
    private String name;

    /**
     * The translated name of the region. The translation returned is based on the system's locale.
     */
    private String translatedName;

    public DeliveryProvince build() {
      DeliveryProvince result = new DeliveryProvince();
      result.code = this.code;
      result.id = this.id;
      result.name = this.name;
      result.translatedName = this.translatedName;
      return result;
    }

    /**
     * The code of the region.
     */
    public Builder code(String code) {
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
     * The full name of the region.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The translated name of the region. The translation returned is based on the system's locale.
     */
    public Builder translatedName(String translatedName) {
      this.translatedName = translatedName;
      return this;
    }
  }
}
