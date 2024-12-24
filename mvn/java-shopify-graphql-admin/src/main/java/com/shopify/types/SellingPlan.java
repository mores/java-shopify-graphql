package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlan implements com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  
  private SellingPlanBillingPolicy billingPolicy;

  
  private SellingPlanCategory category;

  
  private OffsetDateTime createdAt;

  
  private SellingPlanDeliveryPolicy deliveryPolicy;

  
  private String description;

  
  private String id;

  
  private SellingPlanInventoryPolicy inventoryPolicy;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private String name;

  
  private List<String> options;

  
  private Integer position;

  
  private List<SellingPlanPricingPolicy> pricingPolicies;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private List<Translation> translations;

  public SellingPlan() {
  }

  
  public SellingPlanBillingPolicy getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SellingPlanBillingPolicy billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  
  public SellingPlanCategory getCategory() {
    return category;
  }

  public void setCategory(SellingPlanCategory category) {
    this.category = category;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public SellingPlanDeliveryPolicy getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SellingPlanDeliveryPolicy deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public SellingPlanInventoryPolicy getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(SellingPlanInventoryPolicy inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  
  public List<SellingPlanPricingPolicy> getPricingPolicies() {
    return pricingPolicies;
  }

  public void setPricingPolicies(List<SellingPlanPricingPolicy> pricingPolicies) {
    this.pricingPolicies = pricingPolicies;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "SellingPlan{billingPolicy='" + billingPolicy + "', category='" + category + "', createdAt='" + createdAt + "', deliveryPolicy='" + deliveryPolicy + "', description='" + description + "', id='" + id + "', inventoryPolicy='" + inventoryPolicy + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', options='" + options + "', position='" + position + "', pricingPolicies='" + pricingPolicies + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlan that = (SellingPlan) o;
    return Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(category, that.category) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(options, that.options) &&
        Objects.equals(position, that.position) &&
        Objects.equals(pricingPolicies, that.pricingPolicies) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPolicy, category, createdAt, deliveryPolicy, description, id, inventoryPolicy, metafield, metafieldDefinitions, metafields, name, options, position, pricingPolicies, privateMetafield, privateMetafields, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanBillingPolicy billingPolicy;

    
    private SellingPlanCategory category;

    
    private OffsetDateTime createdAt;

    
    private SellingPlanDeliveryPolicy deliveryPolicy;

    
    private String description;

    
    private String id;

    
    private SellingPlanInventoryPolicy inventoryPolicy;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private String name;

    
    private List<String> options;

    
    private Integer position;

    
    private List<SellingPlanPricingPolicy> pricingPolicies;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private List<Translation> translations;

    public SellingPlan build() {
      SellingPlan result = new SellingPlan();
      result.billingPolicy = this.billingPolicy;
      result.category = this.category;
      result.createdAt = this.createdAt;
      result.deliveryPolicy = this.deliveryPolicy;
      result.description = this.description;
      result.id = this.id;
      result.inventoryPolicy = this.inventoryPolicy;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.options = this.options;
      result.position = this.position;
      result.pricingPolicies = this.pricingPolicies;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.translations = this.translations;
      return result;
    }

    
    public Builder billingPolicy(SellingPlanBillingPolicy billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    
    public Builder category(SellingPlanCategory category) {
      this.category = category;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder deliveryPolicy(SellingPlanDeliveryPolicy deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder inventoryPolicy(SellingPlanInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    
    public Builder pricingPolicies(List<SellingPlanPricingPolicy> pricingPolicies) {
      this.pricingPolicies = pricingPolicies;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
