package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionInput {
  
  private String descriptionHtml;

  
  private String handle;

  
  private String id;

  
  private ImageInput image;

  
  private List<String> products;

  
  private CollectionRuleSetInput ruleSet;

  
  private String templateSuffix;

  
  private CollectionSortOrder sortOrder;

  
  private String title;

  
  private List<MetafieldInput> metafields;

  
  private SEOInput seo;

  
  private Boolean redirectNewHandle = false;

  public CollectionInput() {
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

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ImageInput getImage() {
    return image;
  }

  public void setImage(ImageInput image) {
    this.image = image;
  }

  
  public List<String> getProducts() {
    return products;
  }

  public void setProducts(List<String> products) {
    this.products = products;
  }

  
  public CollectionRuleSetInput getRuleSet() {
    return ruleSet;
  }

  public void setRuleSet(CollectionRuleSetInput ruleSet) {
    this.ruleSet = ruleSet;
  }

  
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  
  public CollectionSortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(CollectionSortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public SEOInput getSeo() {
    return seo;
  }

  public void setSeo(SEOInput seo) {
    this.seo = seo;
  }

  
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  @Override
  public String toString() {
    return "CollectionInput{descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', id='" + id + "', image='" + image + "', products='" + products + "', ruleSet='" + ruleSet + "', templateSuffix='" + templateSuffix + "', sortOrder='" + sortOrder + "', title='" + title + "', metafields='" + metafields + "', seo='" + seo + "', redirectNewHandle='" + redirectNewHandle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionInput that = (CollectionInput) o;
    return Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(products, that.products) &&
        Objects.equals(ruleSet, that.ruleSet) &&
        Objects.equals(templateSuffix, that.templateSuffix) &&
        Objects.equals(sortOrder, that.sortOrder) &&
        Objects.equals(title, that.title) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionHtml, handle, id, image, products, ruleSet, templateSuffix, sortOrder, title, metafields, seo, redirectNewHandle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String descriptionHtml;

    
    private String handle;

    
    private String id;

    
    private ImageInput image;

    
    private List<String> products;

    
    private CollectionRuleSetInput ruleSet;

    
    private String templateSuffix;

    
    private CollectionSortOrder sortOrder;

    
    private String title;

    
    private List<MetafieldInput> metafields;

    
    private SEOInput seo;

    
    private Boolean redirectNewHandle = false;

    public CollectionInput build() {
      CollectionInput result = new CollectionInput();
      result.descriptionHtml = this.descriptionHtml;
      result.handle = this.handle;
      result.id = this.id;
      result.image = this.image;
      result.products = this.products;
      result.ruleSet = this.ruleSet;
      result.templateSuffix = this.templateSuffix;
      result.sortOrder = this.sortOrder;
      result.title = this.title;
      result.metafields = this.metafields;
      result.seo = this.seo;
      result.redirectNewHandle = this.redirectNewHandle;
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder image(ImageInput image) {
      this.image = image;
      return this;
    }

    
    public Builder products(List<String> products) {
      this.products = products;
      return this;
    }

    
    public Builder ruleSet(CollectionRuleSetInput ruleSet) {
      this.ruleSet = ruleSet;
      return this;
    }

    
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }

    
    public Builder sortOrder(CollectionSortOrder sortOrder) {
      this.sortOrder = sortOrder;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder seo(SEOInput seo) {
      this.seo = seo;
      return this;
    }

    
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }
  }
}
