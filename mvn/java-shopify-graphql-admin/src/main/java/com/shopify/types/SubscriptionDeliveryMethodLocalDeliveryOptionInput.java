package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodLocalDeliveryOptionInput {
  
  private String title;

  
  private String presentmentTitle;

  
  private String description;

  
  private String code;

  
  private String phone;

  
  private String instructions;

  public SubscriptionDeliveryMethodLocalDeliveryOptionInput() {
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodLocalDeliveryOptionInput{title='" + title + "', presentmentTitle='" + presentmentTitle + "', description='" + description + "', code='" + code + "', phone='" + phone + "', instructions='" + instructions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodLocalDeliveryOptionInput that = (SubscriptionDeliveryMethodLocalDeliveryOptionInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(description, that.description) &&
        Objects.equals(code, that.code) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(instructions, that.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, presentmentTitle, description, code, phone, instructions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String title;

    
    private String presentmentTitle;

    
    private String description;

    
    private String code;

    
    private String phone;

    
    private String instructions;

    public SubscriptionDeliveryMethodLocalDeliveryOptionInput build() {
      SubscriptionDeliveryMethodLocalDeliveryOptionInput result = new SubscriptionDeliveryMethodLocalDeliveryOptionInput();
      result.title = this.title;
      result.presentmentTitle = this.presentmentTitle;
      result.description = this.description;
      result.code = this.code;
      result.phone = this.phone;
      result.instructions = this.instructions;
      return result;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder instructions(String instructions) {
      this.instructions = instructions;
      return this;
    }
  }
}
