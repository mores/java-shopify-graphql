package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductInput {
  
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

  
  private Boolean giftCard;

  
  private Boolean redirectNewHandle;

  
  private List<String> collectionsToJoin;

  
  private List<String> collectionsToLeave;

  
  private CombinedListingsRole combinedListingRole;

  
  private String id;

  
  private List<MetafieldInput> metafields;

  
  private List<OptionCreateInput> productOptions;

  
  private ProductStatus status;

  
  private Boolean requiresSellingPlan;

  
  private ProductClaimOwnershipInput claimOwnership;

  public ProductInput() {
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

  
  public Boolean getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(Boolean giftCard) {
    this.giftCard = giftCard;
  }

  
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
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

  
  public CombinedListingsRole getCombinedListingRole() {
    return combinedListingRole;
  }

  public void setCombinedListingRole(CombinedListingsRole combinedListingRole) {
    this.combinedListingRole = combinedListingRole;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public List<OptionCreateInput> getProductOptions() {
    return productOptions;
  }

  public void setProductOptions(List<OptionCreateInput> productOptions) {
    this.productOptions = productOptions;
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

  
  public ProductClaimOwnershipInput getClaimOwnership() {
    return claimOwnership;
  }

  public void setClaimOwnership(ProductClaimOwnershipInput claimOwnership) {
    this.claimOwnership = claimOwnership;
  }

  @Override
  public String toString() {
    return "ProductInput{descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', seo='" + seo + "', productType='" + productType + "', category='" + category + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', giftCardTemplateSuffix='" + giftCardTemplateSuffix + "', title='" + title + "', vendor='" + vendor + "', giftCard='" + giftCard + "', redirectNewHandle='" + redirectNewHandle + "', collectionsToJoin='" + collectionsToJoin + "', collectionsToLeave='" + collectionsToLeave + "', combinedListingRole='" + combinedListingRole + "', id='" + id + "', metafields='" + metafields + "', productOptions='" + productOptions + "', status='" + status + "', requiresSellingPlan='" + requiresSellingPlan + "', claimOwnership='" + claimOwnership + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductInput that = (ProductInput) o;
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
        Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle) &&
        Objects.equals(collectionsToJoin, that.collectionsToJoin) &&
        Objects.equals(collectionsToLeave, that.collectionsToLeave) &&
        Objects.equals(combinedListingRole, that.combinedListingRole) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(productOptions, that.productOptions) &&
        Objects.equals(status, that.status) &&
        Objects.equals(requiresSellingPlan, that.requiresSellingPlan) &&
        Objects.equals(claimOwnership, that.claimOwnership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionHtml, handle, seo, productType, category, tags, templateSuffix, giftCardTemplateSuffix, title, vendor, giftCard, redirectNewHandle, collectionsToJoin, collectionsToLeave, combinedListingRole, id, metafields, productOptions, status, requiresSellingPlan, claimOwnership);
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

    
    private Boolean giftCard;

    
    private Boolean redirectNewHandle;

    
    private List<String> collectionsToJoin;

    
    private List<String> collectionsToLeave;

    
    private CombinedListingsRole combinedListingRole;

    
    private String id;

    
    private List<MetafieldInput> metafields;

    
    private List<OptionCreateInput> productOptions;

    
    private ProductStatus status;

    
    private Boolean requiresSellingPlan;

    
    private ProductClaimOwnershipInput claimOwnership;

    public ProductInput build() {
      ProductInput result = new ProductInput();
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
      result.giftCard = this.giftCard;
      result.redirectNewHandle = this.redirectNewHandle;
      result.collectionsToJoin = this.collectionsToJoin;
      result.collectionsToLeave = this.collectionsToLeave;
      result.combinedListingRole = this.combinedListingRole;
      result.id = this.id;
      result.metafields = this.metafields;
      result.productOptions = this.productOptions;
      result.status = this.status;
      result.requiresSellingPlan = this.requiresSellingPlan;
      result.claimOwnership = this.claimOwnership;
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

    
    public Builder giftCard(Boolean giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
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

    
    public Builder combinedListingRole(CombinedListingsRole combinedListingRole) {
      this.combinedListingRole = combinedListingRole;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder productOptions(List<OptionCreateInput> productOptions) {
      this.productOptions = productOptions;
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

    
    public Builder claimOwnership(ProductClaimOwnershipInput claimOwnership) {
      this.claimOwnership = claimOwnership;
      return this;
    }
  }
}
