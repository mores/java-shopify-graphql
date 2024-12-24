package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodLocalDeliveryOption {
  
  private String code;

  
  private String description;

  
  private String instructions;

  
  private String phone;

  
  private String presentmentTitle;

  
  private String title;

  public SubscriptionDeliveryMethodLocalDeliveryOption() {
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodLocalDeliveryOption{code='" + code + "', description='" + description + "', instructions='" + instructions + "', phone='" + phone + "', presentmentTitle='" + presentmentTitle + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodLocalDeliveryOption that = (SubscriptionDeliveryMethodLocalDeliveryOption) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(instructions, that.instructions) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, instructions, phone, presentmentTitle, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String code;

    
    private String description;

    
    private String instructions;

    
    private String phone;

    
    private String presentmentTitle;

    
    private String title;

    public SubscriptionDeliveryMethodLocalDeliveryOption build() {
      SubscriptionDeliveryMethodLocalDeliveryOption result = new SubscriptionDeliveryMethodLocalDeliveryOption();
      result.code = this.code;
      result.description = this.description;
      result.instructions = this.instructions;
      result.phone = this.phone;
      result.presentmentTitle = this.presentmentTitle;
      result.title = this.title;
      return result;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder instructions(String instructions) {
      this.instructions = instructions;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
