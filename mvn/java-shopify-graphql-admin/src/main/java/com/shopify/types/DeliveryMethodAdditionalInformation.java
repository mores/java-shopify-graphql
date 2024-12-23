package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Additional information included on a delivery method that will help during the delivery process.
 */
public class DeliveryMethodAdditionalInformation {
  /**
   * The delivery instructions to follow when performing the delivery.
   */
  private String instructions;

  /**
   * The phone number to contact when performing the delivery.
   */
  private String phone;

  public DeliveryMethodAdditionalInformation() {
  }

  /**
   * The delivery instructions to follow when performing the delivery.
   */
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * The phone number to contact when performing the delivery.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "DeliveryMethodAdditionalInformation{instructions='" + instructions + "', phone='" + phone + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryMethodAdditionalInformation that = (DeliveryMethodAdditionalInformation) o;
    return Objects.equals(instructions, that.instructions) &&
        Objects.equals(phone, that.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructions, phone);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The delivery instructions to follow when performing the delivery.
     */
    private String instructions;

    /**
     * The phone number to contact when performing the delivery.
     */
    private String phone;

    public DeliveryMethodAdditionalInformation build() {
      DeliveryMethodAdditionalInformation result = new DeliveryMethodAdditionalInformation();
      result.instructions = this.instructions;
      result.phone = this.phone;
      return result;
    }

    /**
     * The delivery instructions to follow when performing the delivery.
     */
    public Builder instructions(String instructions) {
      this.instructions = instructions;
      return this;
    }

    /**
     * The phone number to contact when performing the delivery.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }
  }
}
