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
public class SellingPlanGroup implements com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  
  private String appId;

  
  private boolean appliesToProduct;

  
  private boolean appliesToProductVariant;

  
  private boolean appliesToProductVariants;

  
  private OffsetDateTime createdAt;

  
  private String description;

  
  private String id;

  
  private String merchantCode;

  
  private String name;

  
  private List<String> options;

  
  private Integer position;

  
  private ProductVariantConnection productVariants;

  
  private Count productVariantsCount;

  
  private ProductConnection products;

  
  private Count productsCount;

  
  private SellingPlanConnection sellingPlans;

  
  private String summary;

  
  private List<Translation> translations;

  public SellingPlanGroup() {
  }

  
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  public boolean getAppliesToProduct() {
    return appliesToProduct;
  }

  public void setAppliesToProduct(boolean appliesToProduct) {
    this.appliesToProduct = appliesToProduct;
  }

  
  public boolean getAppliesToProductVariant() {
    return appliesToProductVariant;
  }

  public void setAppliesToProductVariant(boolean appliesToProductVariant) {
    this.appliesToProductVariant = appliesToProductVariant;
  }

  
  public boolean getAppliesToProductVariants() {
    return appliesToProductVariants;
  }

  public void setAppliesToProductVariants(boolean appliesToProductVariants) {
    this.appliesToProductVariants = appliesToProductVariants;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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

  
  public String getMerchantCode() {
    return merchantCode;
  }

  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
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

  
  public ProductVariantConnection getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(ProductVariantConnection productVariants) {
    this.productVariants = productVariants;
  }

  
  public Count getProductVariantsCount() {
    return productVariantsCount;
  }

  public void setProductVariantsCount(Count productVariantsCount) {
    this.productVariantsCount = productVariantsCount;
  }

  
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  
  public Count getProductsCount() {
    return productsCount;
  }

  public void setProductsCount(Count productsCount) {
    this.productsCount = productsCount;
  }

  
  public SellingPlanConnection getSellingPlans() {
    return sellingPlans;
  }

  public void setSellingPlans(SellingPlanConnection sellingPlans) {
    this.sellingPlans = sellingPlans;
  }

  
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "SellingPlanGroup{appId='" + appId + "', appliesToProduct='" + appliesToProduct + "', appliesToProductVariant='" + appliesToProductVariant + "', appliesToProductVariants='" + appliesToProductVariants + "', createdAt='" + createdAt + "', description='" + description + "', id='" + id + "', merchantCode='" + merchantCode + "', name='" + name + "', options='" + options + "', position='" + position + "', productVariants='" + productVariants + "', productVariantsCount='" + productVariantsCount + "', products='" + products + "', productsCount='" + productsCount + "', sellingPlans='" + sellingPlans + "', summary='" + summary + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroup that = (SellingPlanGroup) o;
    return Objects.equals(appId, that.appId) &&
        appliesToProduct == that.appliesToProduct &&
        appliesToProductVariant == that.appliesToProductVariant &&
        appliesToProductVariants == that.appliesToProductVariants &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(merchantCode, that.merchantCode) &&
        Objects.equals(name, that.name) &&
        Objects.equals(options, that.options) &&
        Objects.equals(position, that.position) &&
        Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(productVariantsCount, that.productVariantsCount) &&
        Objects.equals(products, that.products) &&
        Objects.equals(productsCount, that.productsCount) &&
        Objects.equals(sellingPlans, that.sellingPlans) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appliesToProduct, appliesToProductVariant, appliesToProductVariants, createdAt, description, id, merchantCode, name, options, position, productVariants, productVariantsCount, products, productsCount, sellingPlans, summary, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String appId;

    
    private boolean appliesToProduct;

    
    private boolean appliesToProductVariant;

    
    private boolean appliesToProductVariants;

    
    private OffsetDateTime createdAt;

    
    private String description;

    
    private String id;

    
    private String merchantCode;

    
    private String name;

    
    private List<String> options;

    
    private Integer position;

    
    private ProductVariantConnection productVariants;

    
    private Count productVariantsCount;

    
    private ProductConnection products;

    
    private Count productsCount;

    
    private SellingPlanConnection sellingPlans;

    
    private String summary;

    
    private List<Translation> translations;

    public SellingPlanGroup build() {
      SellingPlanGroup result = new SellingPlanGroup();
      result.appId = this.appId;
      result.appliesToProduct = this.appliesToProduct;
      result.appliesToProductVariant = this.appliesToProductVariant;
      result.appliesToProductVariants = this.appliesToProductVariants;
      result.createdAt = this.createdAt;
      result.description = this.description;
      result.id = this.id;
      result.merchantCode = this.merchantCode;
      result.name = this.name;
      result.options = this.options;
      result.position = this.position;
      result.productVariants = this.productVariants;
      result.productVariantsCount = this.productVariantsCount;
      result.products = this.products;
      result.productsCount = this.productsCount;
      result.sellingPlans = this.sellingPlans;
      result.summary = this.summary;
      result.translations = this.translations;
      return result;
    }

    
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    
    public Builder appliesToProduct(boolean appliesToProduct) {
      this.appliesToProduct = appliesToProduct;
      return this;
    }

    
    public Builder appliesToProductVariant(boolean appliesToProductVariant) {
      this.appliesToProductVariant = appliesToProductVariant;
      return this;
    }

    
    public Builder appliesToProductVariants(boolean appliesToProductVariants) {
      this.appliesToProductVariants = appliesToProductVariants;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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

    
    public Builder merchantCode(String merchantCode) {
      this.merchantCode = merchantCode;
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

    
    public Builder productVariants(ProductVariantConnection productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    
    public Builder productVariantsCount(Count productVariantsCount) {
      this.productVariantsCount = productVariantsCount;
      return this;
    }

    
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    
    public Builder productsCount(Count productsCount) {
      this.productsCount = productsCount;
      return this;
    }

    
    public Builder sellingPlans(SellingPlanConnection sellingPlans) {
      this.sellingPlans = sellingPlans;
      return this;
    }

    
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
