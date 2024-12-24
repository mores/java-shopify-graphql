package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductSetInput {
  
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

  
  private String id;

  
  private List<String> collections;

  
  private List<MetafieldInput> metafields;

  
  private List<ProductVariantSetInput> variants;

  
  private List<FileSetInput> files;

  
  private ProductStatus status;

  
  private Boolean requiresSellingPlan;

  
  private List<OptionSetInput> productOptions;

  
  private ProductClaimOwnershipInput claimOwnership;

  
  private CombinedListingsRole combinedListingRole;

  public ProductSetInput() {
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

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<String> getCollections() {
    return collections;
  }

  public void setCollections(List<String> collections) {
    this.collections = collections;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public List<ProductVariantSetInput> getVariants() {
    return variants;
  }

  public void setVariants(List<ProductVariantSetInput> variants) {
    this.variants = variants;
  }

  
  public List<FileSetInput> getFiles() {
    return files;
  }

  public void setFiles(List<FileSetInput> files) {
    this.files = files;
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

  
  public List<OptionSetInput> getProductOptions() {
    return productOptions;
  }

  public void setProductOptions(List<OptionSetInput> productOptions) {
    this.productOptions = productOptions;
  }

  
  public ProductClaimOwnershipInput getClaimOwnership() {
    return claimOwnership;
  }

  public void setClaimOwnership(ProductClaimOwnershipInput claimOwnership) {
    this.claimOwnership = claimOwnership;
  }

  
  public CombinedListingsRole getCombinedListingRole() {
    return combinedListingRole;
  }

  public void setCombinedListingRole(CombinedListingsRole combinedListingRole) {
    this.combinedListingRole = combinedListingRole;
  }

  @Override
  public String toString() {
    return "ProductSetInput{descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', seo='" + seo + "', productType='" + productType + "', category='" + category + "', tags='" + tags + "', templateSuffix='" + templateSuffix + "', giftCardTemplateSuffix='" + giftCardTemplateSuffix + "', title='" + title + "', vendor='" + vendor + "', giftCard='" + giftCard + "', redirectNewHandle='" + redirectNewHandle + "', id='" + id + "', collections='" + collections + "', metafields='" + metafields + "', variants='" + variants + "', files='" + files + "', status='" + status + "', requiresSellingPlan='" + requiresSellingPlan + "', productOptions='" + productOptions + "', claimOwnership='" + claimOwnership + "', combinedListingRole='" + combinedListingRole + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductSetInput that = (ProductSetInput) o;
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
        Objects.equals(id, that.id) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(variants, that.variants) &&
        Objects.equals(files, that.files) &&
        Objects.equals(status, that.status) &&
        Objects.equals(requiresSellingPlan, that.requiresSellingPlan) &&
        Objects.equals(productOptions, that.productOptions) &&
        Objects.equals(claimOwnership, that.claimOwnership) &&
        Objects.equals(combinedListingRole, that.combinedListingRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionHtml, handle, seo, productType, category, tags, templateSuffix, giftCardTemplateSuffix, title, vendor, giftCard, redirectNewHandle, id, collections, metafields, variants, files, status, requiresSellingPlan, productOptions, claimOwnership, combinedListingRole);
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

    
    private String id;

    
    private List<String> collections;

    
    private List<MetafieldInput> metafields;

    
    private List<ProductVariantSetInput> variants;

    
    private List<FileSetInput> files;

    
    private ProductStatus status;

    
    private Boolean requiresSellingPlan;

    
    private List<OptionSetInput> productOptions;

    
    private ProductClaimOwnershipInput claimOwnership;

    
    private CombinedListingsRole combinedListingRole;

    public ProductSetInput build() {
      ProductSetInput result = new ProductSetInput();
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
      result.id = this.id;
      result.collections = this.collections;
      result.metafields = this.metafields;
      result.variants = this.variants;
      result.files = this.files;
      result.status = this.status;
      result.requiresSellingPlan = this.requiresSellingPlan;
      result.productOptions = this.productOptions;
      result.claimOwnership = this.claimOwnership;
      result.combinedListingRole = this.combinedListingRole;
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder collections(List<String> collections) {
      this.collections = collections;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder variants(List<ProductVariantSetInput> variants) {
      this.variants = variants;
      return this;
    }

    
    public Builder files(List<FileSetInput> files) {
      this.files = files;
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

    
    public Builder productOptions(List<OptionSetInput> productOptions) {
      this.productOptions = productOptions;
      return this;
    }

    
    public Builder claimOwnership(ProductClaimOwnershipInput claimOwnership) {
      this.claimOwnership = claimOwnership;
      return this;
    }

    
    public Builder combinedListingRole(CombinedListingsRole combinedListingRole) {
      this.combinedListingRole = combinedListingRole;
      return this;
    }
  }
}
