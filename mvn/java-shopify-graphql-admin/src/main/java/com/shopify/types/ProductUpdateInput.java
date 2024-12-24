package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductUpdateInput {
  
  private String descriptionHtml;

  
  private String handle;

  
  private SEOInput seo;

  
  private String productType;

  
  private String category;

  
  private List<String> tags;

  
  private String templateSuffix;

  
  private String giftCardTemplateSuffix;

  
  private String title;

  
  private String vendor;

  
  private Boolean redirectNewHandle;

  
  private String id;

  
  private List<String> collectionsToJoin;

  
  private List<String> collectionsToLeave;

  
  private List<MetafieldInput> metafields;

  
  private ProductStatus status;

  
  private Boolean requiresSellingPlan;

  public ProductUpdateInput() {
  }

  
  public String getDescriptionHtml() {
    return descriptionHtml;
  }

  public void setDescriptionHtml(String descriptionHtml) {
    this.descriptionHtml = descriptionHtml;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public SEOInput getSeo() {
    return seo;
  }

  public void setSeo(SEOInput seo) {
    this.seo = seo;
  }

  
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  
  public String getGiftCardTemplateSuffix() {
    return giftCardTemplateSuffix;
  }

  public void setGiftCardTemplateSuffix(String giftCardTemplateSuffix) {
    this.giftCardTemplateSuffix = giftCardTemplateSuffix;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<String> getCollectionsToJoin() {
    return collectionsToJoin;
  }

  public void setCollectionsToJoin(List<String> collectionsToJoin) {
    this.collectionsToJoin = collectionsToJoin;
  }

  
  public List<String> getCollectionsToLeave() {
    return collectionsToLeave;
  }

  public void setCollectionsToLeave(List<String> collectionsToLeave) {
    this.collectionsToLeave = collectionsToLeave;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  
  public Boolean getRequiresSellingPlan() {
    return requiresSellingPlan;
  }

  public void setRequiresSellingPlan(Boolean requiresSellingPlan) {
    this.requiresSellingPlan = requiresSellingPlan;
  }

  @Override
  public String toString() {
    return "ProductUpdateInput{descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', seo='" + seo + "', productType='" + productType + "', category='" + category + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', giftCardTemplateSuffix='" + giftCardTemplateSuffix + "', title='" + title + "', vendor='" + vendor + "', redirectNewHandle='" + redirectNewHandle + "', id='" + id + "', collectionsToJoin='" + collectionsToJoin + "', collectionsToLeave='" + collectionsToLeave + "', metafields='" + metafields + "', status='" + status + "', requiresSellingPlan='" + requiresSellingPlan + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductUpdateInput that = (ProductUpdateInput) o;
    return Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(productType, that.productType) &&
        Objects.equals(category, that.category) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(giftCardTemplateSuffix, that.giftCardTemplateSuffix) &&
        Objects.equals(title, that.title) &&
        Objects.equals(vendor, that.vendor) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(collectionsToJoin, that.collectionsToJoin) &&
        Objects.equals(collectionsToLeave, that.collectionsToLeave) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(status, that.status) &&
        Objects.equals(requiresSellingPlan, that.requiresSellingPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionHtml, handle, seo, productType, category, tags, templateSuffix, giftCardTemplateSuffix, title, vendor, redirectNewHandle, id, collectionsToJoin, collectionsToLeave, metafields, status, requiresSellingPlan);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String descriptionHtml;

    
    private String handle;

    
    private SEOInput seo;

    
    private String productType;

    
    private String category;

    
    private List<String> tags;

    
    private String templateSuffix;

    
    private String giftCardTemplateSuffix;

    
    private String title;

    
    private String vendor;

    
    private Boolean redirectNewHandle;

    
    private String id;

    
    private List<String> collectionsToJoin;

    
    private List<String> collectionsToLeave;

    
    private List<MetafieldInput> metafields;

    
    private ProductStatus status;

    
    private Boolean requiresSellingPlan;

    public ProductUpdateInput build() {
      ProductUpdateInput result = new ProductUpdateInput();
      result.descriptionHtml = this.descriptionHtml;
      result.handle = this.handle;
      result.seo = this.seo;
      result.productType = this.productType;
      result.category = this.category;
      result.tags = this.tags;
      result.templateSuffix = this.templateSuffix;
      result.giftCardTemplateSuffix = this.giftCardTemplateSuffix;
      result.title = this.title;
      result.vendor = this.vendor;
      result.redirectNewHandle = this.redirectNewHandle;
      result.id = this.id;
      result.collectionsToJoin = this.collectionsToJoin;
      result.collectionsToLeave = this.collectionsToLeave;
      result.metafields = this.metafields;
      result.status = this.status;
      result.requiresSellingPlan = this.requiresSellingPlan;
      return result;
    }

    
    public Builder descriptionHtml(String descriptionHtml) {
      this.descriptionHtml = descriptionHtml;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder seo(SEOInput seo) {
      this.seo = seo;
      return this;
    }

    
    public Builder productType(String productType) {
      this.productType = productType;
      return this;
    }

    
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    
    public Builder giftCardTemplateSuffix(String giftCardTemplateSuffix) {
      this.giftCardTemplateSuffix = giftCardTemplateSuffix;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }

    
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder collectionsToJoin(List<String> collectionsToJoin) {
      this.collectionsToJoin = collectionsToJoin;
      return this;
    }

    
    public Builder collectionsToLeave(List<String> collectionsToLeave) {
      this.collectionsToLeave = collectionsToLeave;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder status(ProductStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder requiresSellingPlan(Boolean requiresSellingPlan) {
      this.requiresSellingPlan = requiresSellingPlan;
      return this;
    }
  }
}
