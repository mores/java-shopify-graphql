package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the payment terms template object.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PaymentTermsTemplate implements com.shopify.admin.types.Node {
  /**
   * The description of the payment terms template.
   */
  private String description;

  /**
   * The number of days between the issued date and due date if this is the net type of payment terms.
   */
  private Integer dueInDays;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the payment terms template.
   */
  private String name;

  /**
   * The type of the payment terms template.
   */
  private PaymentTermsType paymentTermsType;

  /**
   * The translated payment terms template name.
   */
  private String translatedName;

  public PaymentTermsTemplate() {
  }

  /**
   * The description of the payment terms template.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The number of days between the issued date and due date if this is the net type of payment terms.
   */
  public Integer getDueInDays() {
    return dueInDays;
  }

  public void setDueInDays(Integer dueInDays) {
    this.dueInDays = dueInDays;
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
   * The name of the payment terms template.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of the payment terms template.
   */
  public PaymentTermsType getPaymentTermsType() {
    return paymentTermsType;
  }

  public void setPaymentTermsType(PaymentTermsType paymentTermsType) {
    this.paymentTermsType = paymentTermsType;
  }

  /**
   * The translated payment terms template name.
   */
  public String getTranslatedName() {
    return translatedName;
  }

  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }

  @Override
  public String toString() {
    return "PaymentTermsTemplate{description='" + description + "', dueInDays='" + dueInDays + "', id='" + id + "', name='" + name + "', paymentTermsType='" + paymentTermsType + "', translatedName='" + translatedName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTermsTemplate that = (PaymentTermsTemplate) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(dueInDays, that.dueInDays) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(paymentTermsType, that.paymentTermsType) &&
        Objects.equals(translatedName, that.translatedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dueInDays, id, name, paymentTermsType, translatedName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The description of the payment terms template.
     */
    private String description;

    /**
     * The number of days between the issued date and due date if this is the net type of payment terms.
     */
    private Integer dueInDays;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the payment terms template.
     */
    private String name;

    /**
     * The type of the payment terms template.
     */
    private PaymentTermsType paymentTermsType;

    /**
     * The translated payment terms template name.
     */
    private String translatedName;

    public PaymentTermsTemplate build() {
      PaymentTermsTemplate result = new PaymentTermsTemplate();
      result.description = this.description;
      result.dueInDays = this.dueInDays;
      result.id = this.id;
      result.name = this.name;
      result.paymentTermsType = this.paymentTermsType;
      result.translatedName = this.translatedName;
      return result;
    }

    /**
     * The description of the payment terms template.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The number of days between the issued date and due date if this is the net type of payment terms.
     */
    public Builder dueInDays(Integer dueInDays) {
      this.dueInDays = dueInDays;
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
     * The name of the payment terms template.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The type of the payment terms template.
     */
    public Builder paymentTermsType(PaymentTermsType paymentTermsType) {
      this.paymentTermsType = paymentTermsType;
      return this;
    }

    /**
     * The translated payment terms template name.
     */
    public Builder translatedName(String translatedName) {
      this.translatedName = translatedName;
      return this;
    }
  }
}
