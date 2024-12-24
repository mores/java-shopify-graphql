package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DraftOrderLineItem implements DraftOrderPlatformDiscountAllocationTarget, com.shopify.types.Node {
  
  private DraftOrderAppliedDiscount appliedDiscount;

  
  private MoneyBag approximateDiscountedUnitPriceSet;

  
  private List<DraftOrderLineItem> bundleComponents;

  
  private boolean custom;

  
  private List<Attribute> customAttributes;

  
  private List<TypedAttribute> customAttributesV2;

  
  private String discountedTotal;

  
  private MoneyBag discountedTotalSet;

  
  private String discountedUnitPrice;

  
  private MoneyBag discountedUnitPriceSet;

  
  private FulfillmentService fulfillmentService;

  
  private Integer grams;

  
  private String id;

  
  private Image image;

  
  private boolean isGiftCard;

  
  private String name;

  
  private String originalTotal;

  
  private MoneyBag originalTotalSet;

  
  private String originalUnitPrice;

  
  private MoneyBag originalUnitPriceSet;

  
  private MoneyV2 originalUnitPriceWithCurrency;

  
  private Product product;

  
  private int quantity;

  
  private boolean requiresShipping;

  
  private String sku;

  
  private List<TaxLine> taxLines;

  
  private boolean taxable;

  
  private String title;

  
  private String totalDiscount;

  
  private MoneyBag totalDiscountSet;

  
  private String uuid;

  
  private ProductVariant variant;

  
  private String variantTitle;

  
  private String vendor;

  
  private Weight weight;

  public DraftOrderLineItem() {
  }

  
  public DraftOrderAppliedDiscount getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  
  public MoneyBag getApproximateDiscountedUnitPriceSet() {
    return approximateDiscountedUnitPriceSet;
  }

  public void setApproximateDiscountedUnitPriceSet(MoneyBag approximateDiscountedUnitPriceSet) {
    this.approximateDiscountedUnitPriceSet = approximateDiscountedUnitPriceSet;
  }

  
  public List<DraftOrderLineItem> getBundleComponents() {
    return bundleComponents;
  }

  public void setBundleComponents(List<DraftOrderLineItem> bundleComponents) {
    this.bundleComponents = bundleComponents;
  }

  
  public boolean getCustom() {
    return custom;
  }

  public void setCustom(boolean custom) {
    this.custom = custom;
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public List<TypedAttribute> getCustomAttributesV2() {
    return customAttributesV2;
  }

  public void setCustomAttributesV2(List<TypedAttribute> customAttributesV2) {
    this.customAttributesV2 = customAttributesV2;
  }

  
  public String getDiscountedTotal() {
    return discountedTotal;
  }

  public void setDiscountedTotal(String discountedTotal) {
    this.discountedTotal = discountedTotal;
  }

  
  public MoneyBag getDiscountedTotalSet() {
    return discountedTotalSet;
  }

  public void setDiscountedTotalSet(MoneyBag discountedTotalSet) {
    this.discountedTotalSet = discountedTotalSet;
  }

  
  public String getDiscountedUnitPrice() {
    return discountedUnitPrice;
  }

  public void setDiscountedUnitPrice(String discountedUnitPrice) {
    this.discountedUnitPrice = discountedUnitPrice;
  }

  
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  
  public Integer getGrams() {
    return grams;
  }

  public void setGrams(Integer grams) {
    this.grams = grams;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  
  public boolean getIsGiftCard() {
    return isGiftCard;
  }

  public void setIsGiftCard(boolean isGiftCard) {
    this.isGiftCard = isGiftCard;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getOriginalTotal() {
    return originalTotal;
  }

  public void setOriginalTotal(String originalTotal) {
    this.originalTotal = originalTotal;
  }

  
  public MoneyBag getOriginalTotalSet() {
    return originalTotalSet;
  }

  public void setOriginalTotalSet(MoneyBag originalTotalSet) {
    this.originalTotalSet = originalTotalSet;
  }

  
  public String getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(String originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  
  public MoneyV2 getOriginalUnitPriceWithCurrency() {
    return originalUnitPriceWithCurrency;
  }

  public void setOriginalUnitPriceWithCurrency(MoneyV2 originalUnitPriceWithCurrency) {
    this.originalUnitPriceWithCurrency = originalUnitPriceWithCurrency;
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  
  public boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(boolean taxable) {
    this.taxable = taxable;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(String totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  
  public MoneyBag getTotalDiscountSet() {
    return totalDiscountSet;
  }

  public void setTotalDiscountSet(MoneyBag totalDiscountSet) {
    this.totalDiscountSet = totalDiscountSet;
  }

  
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "DraftOrderLineItem{appliedDiscount='" + appliedDiscount + "', approximateDiscountedUnitPriceSet='" + approximateDiscountedUnitPriceSet + "', bundleComponents='" + bundleComponents + "', custom='" + custom + "', customAttributes='" + customAttributes + "', customAttributesV2='" + customAttributesV2 + "', discountedTotal='" + discountedTotal + "', discountedTotalSet='" + discountedTotalSet + "', discountedUnitPrice='" + discountedUnitPrice + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', fulfillmentService='" + fulfillmentService + "', grams='" + grams + "', id='" + id + "', image='" + image + "', isGiftCard='" + isGiftCard + "', name='" + name + "', originalTotal='" + originalTotal + "', originalTotalSet='" + originalTotalSet + "', originalUnitPrice='" + originalUnitPrice + "', originalUnitPriceSet='" + originalUnitPriceSet + "', originalUnitPriceWithCurrency='" + originalUnitPriceWithCurrency + "', product='" + product + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', taxLines='" + taxLines + "', taxable='" + taxable + "', title='" + title + "', totalDiscount='" + totalDiscount + "', totalDiscountSet='" + totalDiscountSet + "', uuid='" + uuid + "', variant='" + variant + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderLineItem that = (DraftOrderLineItem) o;
    return Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(approximateDiscountedUnitPriceSet, that.approximateDiscountedUnitPriceSet) &&
        Objects.equals(bundleComponents, that.bundleComponents) &&
        custom == that.custom &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customAttributesV2, that.customAttributesV2) &&
        Objects.equals(discountedTotal, that.discountedTotal) &&
        Objects.equals(discountedTotalSet, that.discountedTotalSet) &&
        Objects.equals(discountedUnitPrice, that.discountedUnitPrice) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(grams, that.grams) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        isGiftCard == that.isGiftCard &&
        Objects.equals(name, that.name) &&
        Objects.equals(originalTotal, that.originalTotal) &&
        Objects.equals(originalTotalSet, that.originalTotalSet) &&
        Objects.equals(originalUnitPrice, that.originalUnitPrice) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        Objects.equals(originalUnitPriceWithCurrency, that.originalUnitPriceWithCurrency) &&
        Objects.equals(product, that.product) &&
        quantity == that.quantity &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxLines, that.taxLines) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalDiscount, that.totalDiscount) &&
        Objects.equals(totalDiscountSet, that.totalDiscountSet) &&
        Objects.equals(uuid, that.uuid) &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor) &&
        Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, approximateDiscountedUnitPriceSet, bundleComponents, custom, customAttributes, customAttributesV2, discountedTotal, discountedTotalSet, discountedUnitPrice, discountedUnitPriceSet, fulfillmentService, grams, id, image, isGiftCard, name, originalTotal, originalTotalSet, originalUnitPrice, originalUnitPriceSet, originalUnitPriceWithCurrency, product, quantity, requiresShipping, sku, taxLines, taxable, title, totalDiscount, totalDiscountSet, uuid, variant, variantTitle, vendor, weight);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DraftOrderAppliedDiscount appliedDiscount;

    
    private MoneyBag approximateDiscountedUnitPriceSet;

    
    private List<DraftOrderLineItem> bundleComponents;

    
    private boolean custom;

    
    private List<Attribute> customAttributes;

    
    private List<TypedAttribute> customAttributesV2;

    
    private String discountedTotal;

    
    private MoneyBag discountedTotalSet;

    
    private String discountedUnitPrice;

    
    private MoneyBag discountedUnitPriceSet;

    
    private FulfillmentService fulfillmentService;

    
    private Integer grams;

    
    private String id;

    
    private Image image;

    
    private boolean isGiftCard;

    
    private String name;

    
    private String originalTotal;

    
    private MoneyBag originalTotalSet;

    
    private String originalUnitPrice;

    
    private MoneyBag originalUnitPriceSet;

    
    private MoneyV2 originalUnitPriceWithCurrency;

    
    private Product product;

    
    private int quantity;

    
    private boolean requiresShipping;

    
    private String sku;

    
    private List<TaxLine> taxLines;

    
    private boolean taxable;

    
    private String title;

    
    private String totalDiscount;

    
    private MoneyBag totalDiscountSet;

    
    private String uuid;

    
    private ProductVariant variant;

    
    private String variantTitle;

    
    private String vendor;

    
    private Weight weight;

    public DraftOrderLineItem build() {
      DraftOrderLineItem result = new DraftOrderLineItem();
      result.appliedDiscount = this.appliedDiscount;
      result.approximateDiscountedUnitPriceSet = this.approximateDiscountedUnitPriceSet;
      result.bundleComponents = this.bundleComponents;
      result.custom = this.custom;
      result.customAttributes = this.customAttributes;
      result.customAttributesV2 = this.customAttributesV2;
      result.discountedTotal = this.discountedTotal;
      result.discountedTotalSet = this.discountedTotalSet;
      result.discountedUnitPrice = this.discountedUnitPrice;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.fulfillmentService = this.fulfillmentService;
      result.grams = this.grams;
      result.id = this.id;
      result.image = this.image;
      result.isGiftCard = this.isGiftCard;
      result.name = this.name;
      result.originalTotal = this.originalTotal;
      result.originalTotalSet = this.originalTotalSet;
      result.originalUnitPrice = this.originalUnitPrice;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.originalUnitPriceWithCurrency = this.originalUnitPriceWithCurrency;
      result.product = this.product;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.taxLines = this.taxLines;
      result.taxable = this.taxable;
      result.title = this.title;
      result.totalDiscount = this.totalDiscount;
      result.totalDiscountSet = this.totalDiscountSet;
      result.uuid = this.uuid;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      result.weight = this.weight;
      return result;
    }

    
    public Builder appliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    
    public Builder approximateDiscountedUnitPriceSet(MoneyBag approximateDiscountedUnitPriceSet) {
      this.approximateDiscountedUnitPriceSet = approximateDiscountedUnitPriceSet;
      return this;
    }

    
    public Builder bundleComponents(List<DraftOrderLineItem> bundleComponents) {
      this.bundleComponents = bundleComponents;
      return this;
    }

    
    public Builder custom(boolean custom) {
      this.custom = custom;
      return this;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder customAttributesV2(List<TypedAttribute> customAttributesV2) {
      this.customAttributesV2 = customAttributesV2;
      return this;
    }

    
    public Builder discountedTotal(String discountedTotal) {
      this.discountedTotal = discountedTotal;
      return this;
    }

    
    public Builder discountedTotalSet(MoneyBag discountedTotalSet) {
      this.discountedTotalSet = discountedTotalSet;
      return this;
    }

    
    public Builder discountedUnitPrice(String discountedUnitPrice) {
      this.discountedUnitPrice = discountedUnitPrice;
      return this;
    }

    
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    
    public Builder grams(Integer grams) {
      this.grams = grams;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    
    public Builder isGiftCard(boolean isGiftCard) {
      this.isGiftCard = isGiftCard;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder originalTotal(String originalTotal) {
      this.originalTotal = originalTotal;
      return this;
    }

    
    public Builder originalTotalSet(MoneyBag originalTotalSet) {
      this.originalTotalSet = originalTotalSet;
      return this;
    }

    
    public Builder originalUnitPrice(String originalUnitPrice) {
      this.originalUnitPrice = originalUnitPrice;
      return this;
    }

    
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    
    public Builder originalUnitPriceWithCurrency(MoneyV2 originalUnitPriceWithCurrency) {
      this.originalUnitPriceWithCurrency = originalUnitPriceWithCurrency;
      return this;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    
    public Builder taxable(boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder totalDiscount(String totalDiscount) {
      this.totalDiscount = totalDiscount;
      return this;
    }

    
    public Builder totalDiscountSet(MoneyBag totalDiscountSet) {
      this.totalDiscountSet = totalDiscountSet;
      return this;
    }

    
    public Builder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }

    
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }

    
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }

    
    public Builder weight(Weight weight) {
      this.weight = weight;
      return this;
    }
  }
}
