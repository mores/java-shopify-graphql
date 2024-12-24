package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class LineItem implements com.shopify.types.Node {
  
  private boolean canRestock;

  
  private SubscriptionContract contract;

  
  private int currentQuantity;

  
  private List<Attribute> customAttributes;

  
  private List<DiscountAllocation> discountAllocations;

  
  private String discountedTotal;

  
  private MoneyBag discountedTotalSet;

  
  private String discountedUnitPrice;

  
  private MoneyBag discountedUnitPriceAfterAllDiscountsSet;

  
  private MoneyBag discountedUnitPriceSet;

  
  private List<Duty> duties;

  
  private int fulfillableQuantity;

  
  private FulfillmentService fulfillmentService;

  
  private String fulfillmentStatus;

  
  private String id;

  
  private Image image;

  
  private boolean isGiftCard;

  
  private LineItemGroup lineItemGroup;

  
  private boolean merchantEditable;

  
  private String name;

  
  private int nonFulfillableQuantity;

  
  private String originalTotal;

  
  private MoneyBag originalTotalSet;

  
  private String originalUnitPrice;

  
  private MoneyBag originalUnitPriceSet;

  
  private Product product;

  
  private int quantity;

  
  private int refundableQuantity;

  
  private boolean requiresShipping;

  
  private boolean restockable;

  
  private LineItemSellingPlan sellingPlan;

  
  private String sku;

  
  private StaffMember staffMember;

  
  private List<TaxLine> taxLines;

  
  private boolean taxable;

  
  private String title;

  
  private String totalDiscount;

  
  private MoneyBag totalDiscountSet;

  
  private String unfulfilledDiscountedTotal;

  
  private MoneyBag unfulfilledDiscountedTotalSet;

  
  private String unfulfilledOriginalTotal;

  
  private MoneyBag unfulfilledOriginalTotalSet;

  
  private int unfulfilledQuantity;

  
  private ProductVariant variant;

  
  private String variantTitle;

  
  private String vendor;

  public LineItem() {
  }

  
  public boolean getCanRestock() {
    return canRestock;
  }

  public void setCanRestock(boolean canRestock) {
    this.canRestock = canRestock;
  }

  
  public SubscriptionContract getContract() {
    return contract;
  }

  public void setContract(SubscriptionContract contract) {
    this.contract = contract;
  }

  
  public int getCurrentQuantity() {
    return currentQuantity;
  }

  public void setCurrentQuantity(int currentQuantity) {
    this.currentQuantity = currentQuantity;
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public List<DiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<DiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
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

  
  public MoneyBag getDiscountedUnitPriceAfterAllDiscountsSet() {
    return discountedUnitPriceAfterAllDiscountsSet;
  }

  public void setDiscountedUnitPriceAfterAllDiscountsSet(
      MoneyBag discountedUnitPriceAfterAllDiscountsSet) {
    this.discountedUnitPriceAfterAllDiscountsSet = discountedUnitPriceAfterAllDiscountsSet;
  }

  
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  
  public List<Duty> getDuties() {
    return duties;
  }

  public void setDuties(List<Duty> duties) {
    this.duties = duties;
  }

  
  public int getFulfillableQuantity() {
    return fulfillableQuantity;
  }

  public void setFulfillableQuantity(int fulfillableQuantity) {
    this.fulfillableQuantity = fulfillableQuantity;
  }

  
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  
  public String getFulfillmentStatus() {
    return fulfillmentStatus;
  }

  public void setFulfillmentStatus(String fulfillmentStatus) {
    this.fulfillmentStatus = fulfillmentStatus;
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

  
  public LineItemGroup getLineItemGroup() {
    return lineItemGroup;
  }

  public void setLineItemGroup(LineItemGroup lineItemGroup) {
    this.lineItemGroup = lineItemGroup;
  }

  
  public boolean getMerchantEditable() {
    return merchantEditable;
  }

  public void setMerchantEditable(boolean merchantEditable) {
    this.merchantEditable = merchantEditable;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public int getNonFulfillableQuantity() {
    return nonFulfillableQuantity;
  }

  public void setNonFulfillableQuantity(int nonFulfillableQuantity) {
    this.nonFulfillableQuantity = nonFulfillableQuantity;
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

  
  public int getRefundableQuantity() {
    return refundableQuantity;
  }

  public void setRefundableQuantity(int refundableQuantity) {
    this.refundableQuantity = refundableQuantity;
  }

  
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  
  public boolean getRestockable() {
    return restockable;
  }

  public void setRestockable(boolean restockable) {
    this.restockable = restockable;
  }

  
  public LineItemSellingPlan getSellingPlan() {
    return sellingPlan;
  }

  public void setSellingPlan(LineItemSellingPlan sellingPlan) {
    this.sellingPlan = sellingPlan;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
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

  
  public String getUnfulfilledDiscountedTotal() {
    return unfulfilledDiscountedTotal;
  }

  public void setUnfulfilledDiscountedTotal(String unfulfilledDiscountedTotal) {
    this.unfulfilledDiscountedTotal = unfulfilledDiscountedTotal;
  }

  
  public MoneyBag getUnfulfilledDiscountedTotalSet() {
    return unfulfilledDiscountedTotalSet;
  }

  public void setUnfulfilledDiscountedTotalSet(MoneyBag unfulfilledDiscountedTotalSet) {
    this.unfulfilledDiscountedTotalSet = unfulfilledDiscountedTotalSet;
  }

  
  public String getUnfulfilledOriginalTotal() {
    return unfulfilledOriginalTotal;
  }

  public void setUnfulfilledOriginalTotal(String unfulfilledOriginalTotal) {
    this.unfulfilledOriginalTotal = unfulfilledOriginalTotal;
  }

  
  public MoneyBag getUnfulfilledOriginalTotalSet() {
    return unfulfilledOriginalTotalSet;
  }

  public void setUnfulfilledOriginalTotalSet(MoneyBag unfulfilledOriginalTotalSet) {
    this.unfulfilledOriginalTotalSet = unfulfilledOriginalTotalSet;
  }

  
  public int getUnfulfilledQuantity() {
    return unfulfilledQuantity;
  }

  public void setUnfulfilledQuantity(int unfulfilledQuantity) {
    this.unfulfilledQuantity = unfulfilledQuantity;
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

  @Override
  public String toString() {
    return "LineItem{canRestock='" + canRestock + "', contract='" + contract + "', currentQuantity='" + currentQuantity + "', customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', discountedTotal='" + discountedTotal + "', discountedTotalSet='" + discountedTotalSet + "', discountedUnitPrice='" + discountedUnitPrice + "', discountedUnitPriceAfterAllDiscountsSet='" + discountedUnitPriceAfterAllDiscountsSet + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', duties='" + duties + "', fulfillableQuantity='" + fulfillableQuantity + "', fulfillmentService='" + fulfillmentService + "', fulfillmentStatus='" + fulfillmentStatus + "', id='" + id + "', image='" + image + "', isGiftCard='" + isGiftCard + "', lineItemGroup='" + lineItemGroup + "', merchantEditable='" + merchantEditable + "', name='" + name + "', nonFulfillableQuantity='" + nonFulfillableQuantity + "', originalTotal='" + originalTotal + "', originalTotalSet='" + originalTotalSet + "', originalUnitPrice='" + originalUnitPrice + "', originalUnitPriceSet='" + originalUnitPriceSet + "', product='" + product + "', quantity='" + quantity + "', refundableQuantity='" + refundableQuantity + "', requiresShipping='" + requiresShipping + "', restockable='" + restockable + "', sellingPlan='" + sellingPlan + "', sku='" + sku + "', staffMember='" + staffMember + "', taxLines='" + taxLines + "', taxable='" + taxable + "', title='" + title + "', totalDiscount='" + totalDiscount + "', totalDiscountSet='" + totalDiscountSet + "', unfulfilledDiscountedTotal='" + unfulfilledDiscountedTotal + "', unfulfilledDiscountedTotalSet='" + unfulfilledDiscountedTotalSet + "', unfulfilledOriginalTotal='" + unfulfilledOriginalTotal + "', unfulfilledOriginalTotalSet='" + unfulfilledOriginalTotalSet + "', unfulfilledQuantity='" + unfulfilledQuantity + "', variant='" + variant + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineItem that = (LineItem) o;
    return canRestock == that.canRestock &&
        Objects.equals(contract, that.contract) &&
        currentQuantity == that.currentQuantity &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedTotal, that.discountedTotal) &&
        Objects.equals(discountedTotalSet, that.discountedTotalSet) &&
        Objects.equals(discountedUnitPrice, that.discountedUnitPrice) &&
        Objects.equals(discountedUnitPriceAfterAllDiscountsSet, that.discountedUnitPriceAfterAllDiscountsSet) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(duties, that.duties) &&
        fulfillableQuantity == that.fulfillableQuantity &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(fulfillmentStatus, that.fulfillmentStatus) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        isGiftCard == that.isGiftCard &&
        Objects.equals(lineItemGroup, that.lineItemGroup) &&
        merchantEditable == that.merchantEditable &&
        Objects.equals(name, that.name) &&
        nonFulfillableQuantity == that.nonFulfillableQuantity &&
        Objects.equals(originalTotal, that.originalTotal) &&
        Objects.equals(originalTotalSet, that.originalTotalSet) &&
        Objects.equals(originalUnitPrice, that.originalUnitPrice) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        Objects.equals(product, that.product) &&
        quantity == that.quantity &&
        refundableQuantity == that.refundableQuantity &&
        requiresShipping == that.requiresShipping &&
        restockable == that.restockable &&
        Objects.equals(sellingPlan, that.sellingPlan) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(taxLines, that.taxLines) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalDiscount, that.totalDiscount) &&
        Objects.equals(totalDiscountSet, that.totalDiscountSet) &&
        Objects.equals(unfulfilledDiscountedTotal, that.unfulfilledDiscountedTotal) &&
        Objects.equals(unfulfilledDiscountedTotalSet, that.unfulfilledDiscountedTotalSet) &&
        Objects.equals(unfulfilledOriginalTotal, that.unfulfilledOriginalTotal) &&
        Objects.equals(unfulfilledOriginalTotalSet, that.unfulfilledOriginalTotalSet) &&
        unfulfilledQuantity == that.unfulfilledQuantity &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRestock, contract, currentQuantity, customAttributes, discountAllocations, discountedTotal, discountedTotalSet, discountedUnitPrice, discountedUnitPriceAfterAllDiscountsSet, discountedUnitPriceSet, duties, fulfillableQuantity, fulfillmentService, fulfillmentStatus, id, image, isGiftCard, lineItemGroup, merchantEditable, name, nonFulfillableQuantity, originalTotal, originalTotalSet, originalUnitPrice, originalUnitPriceSet, product, quantity, refundableQuantity, requiresShipping, restockable, sellingPlan, sku, staffMember, taxLines, taxable, title, totalDiscount, totalDiscountSet, unfulfilledDiscountedTotal, unfulfilledDiscountedTotalSet, unfulfilledOriginalTotal, unfulfilledOriginalTotalSet, unfulfilledQuantity, variant, variantTitle, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean canRestock;

    
    private SubscriptionContract contract;

    
    private int currentQuantity;

    
    private List<Attribute> customAttributes;

    
    private List<DiscountAllocation> discountAllocations;

    
    private String discountedTotal;

    
    private MoneyBag discountedTotalSet;

    
    private String discountedUnitPrice;

    
    private MoneyBag discountedUnitPriceAfterAllDiscountsSet;

    
    private MoneyBag discountedUnitPriceSet;

    
    private List<Duty> duties;

    
    private int fulfillableQuantity;

    
    private FulfillmentService fulfillmentService;

    
    private String fulfillmentStatus;

    
    private String id;

    
    private Image image;

    
    private boolean isGiftCard;

    
    private LineItemGroup lineItemGroup;

    
    private boolean merchantEditable;

    
    private String name;

    
    private int nonFulfillableQuantity;

    
    private String originalTotal;

    
    private MoneyBag originalTotalSet;

    
    private String originalUnitPrice;

    
    private MoneyBag originalUnitPriceSet;

    
    private Product product;

    
    private int quantity;

    
    private int refundableQuantity;

    
    private boolean requiresShipping;

    
    private boolean restockable;

    
    private LineItemSellingPlan sellingPlan;

    
    private String sku;

    
    private StaffMember staffMember;

    
    private List<TaxLine> taxLines;

    
    private boolean taxable;

    
    private String title;

    
    private String totalDiscount;

    
    private MoneyBag totalDiscountSet;

    
    private String unfulfilledDiscountedTotal;

    
    private MoneyBag unfulfilledDiscountedTotalSet;

    
    private String unfulfilledOriginalTotal;

    
    private MoneyBag unfulfilledOriginalTotalSet;

    
    private int unfulfilledQuantity;

    
    private ProductVariant variant;

    
    private String variantTitle;

    
    private String vendor;

    public LineItem build() {
      LineItem result = new LineItem();
      result.canRestock = this.canRestock;
      result.contract = this.contract;
      result.currentQuantity = this.currentQuantity;
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.discountedTotal = this.discountedTotal;
      result.discountedTotalSet = this.discountedTotalSet;
      result.discountedUnitPrice = this.discountedUnitPrice;
      result.discountedUnitPriceAfterAllDiscountsSet = this.discountedUnitPriceAfterAllDiscountsSet;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.duties = this.duties;
      result.fulfillableQuantity = this.fulfillableQuantity;
      result.fulfillmentService = this.fulfillmentService;
      result.fulfillmentStatus = this.fulfillmentStatus;
      result.id = this.id;
      result.image = this.image;
      result.isGiftCard = this.isGiftCard;
      result.lineItemGroup = this.lineItemGroup;
      result.merchantEditable = this.merchantEditable;
      result.name = this.name;
      result.nonFulfillableQuantity = this.nonFulfillableQuantity;
      result.originalTotal = this.originalTotal;
      result.originalTotalSet = this.originalTotalSet;
      result.originalUnitPrice = this.originalUnitPrice;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.product = this.product;
      result.quantity = this.quantity;
      result.refundableQuantity = this.refundableQuantity;
      result.requiresShipping = this.requiresShipping;
      result.restockable = this.restockable;
      result.sellingPlan = this.sellingPlan;
      result.sku = this.sku;
      result.staffMember = this.staffMember;
      result.taxLines = this.taxLines;
      result.taxable = this.taxable;
      result.title = this.title;
      result.totalDiscount = this.totalDiscount;
      result.totalDiscountSet = this.totalDiscountSet;
      result.unfulfilledDiscountedTotal = this.unfulfilledDiscountedTotal;
      result.unfulfilledDiscountedTotalSet = this.unfulfilledDiscountedTotalSet;
      result.unfulfilledOriginalTotal = this.unfulfilledOriginalTotal;
      result.unfulfilledOriginalTotalSet = this.unfulfilledOriginalTotalSet;
      result.unfulfilledQuantity = this.unfulfilledQuantity;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      return result;
    }

    
    public Builder canRestock(boolean canRestock) {
      this.canRestock = canRestock;
      return this;
    }

    
    public Builder contract(SubscriptionContract contract) {
      this.contract = contract;
      return this;
    }

    
    public Builder currentQuantity(int currentQuantity) {
      this.currentQuantity = currentQuantity;
      return this;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder discountAllocations(List<DiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
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

    
    public Builder discountedUnitPriceAfterAllDiscountsSet(
        MoneyBag discountedUnitPriceAfterAllDiscountsSet) {
      this.discountedUnitPriceAfterAllDiscountsSet = discountedUnitPriceAfterAllDiscountsSet;
      return this;
    }

    
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    
    public Builder duties(List<Duty> duties) {
      this.duties = duties;
      return this;
    }

    
    public Builder fulfillableQuantity(int fulfillableQuantity) {
      this.fulfillableQuantity = fulfillableQuantity;
      return this;
    }

    
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    
    public Builder fulfillmentStatus(String fulfillmentStatus) {
      this.fulfillmentStatus = fulfillmentStatus;
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

    
    public Builder lineItemGroup(LineItemGroup lineItemGroup) {
      this.lineItemGroup = lineItemGroup;
      return this;
    }

    
    public Builder merchantEditable(boolean merchantEditable) {
      this.merchantEditable = merchantEditable;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder nonFulfillableQuantity(int nonFulfillableQuantity) {
      this.nonFulfillableQuantity = nonFulfillableQuantity;
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

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder refundableQuantity(int refundableQuantity) {
      this.refundableQuantity = refundableQuantity;
      return this;
    }

    
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    
    public Builder restockable(boolean restockable) {
      this.restockable = restockable;
      return this;
    }

    
    public Builder sellingPlan(LineItemSellingPlan sellingPlan) {
      this.sellingPlan = sellingPlan;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
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

    
    public Builder unfulfilledDiscountedTotal(String unfulfilledDiscountedTotal) {
      this.unfulfilledDiscountedTotal = unfulfilledDiscountedTotal;
      return this;
    }

    
    public Builder unfulfilledDiscountedTotalSet(MoneyBag unfulfilledDiscountedTotalSet) {
      this.unfulfilledDiscountedTotalSet = unfulfilledDiscountedTotalSet;
      return this;
    }

    
    public Builder unfulfilledOriginalTotal(String unfulfilledOriginalTotal) {
      this.unfulfilledOriginalTotal = unfulfilledOriginalTotal;
      return this;
    }

    
    public Builder unfulfilledOriginalTotalSet(MoneyBag unfulfilledOriginalTotalSet) {
      this.unfulfilledOriginalTotalSet = unfulfilledOriginalTotalSet;
      return this;
    }

    
    public Builder unfulfilledQuantity(int unfulfilledQuantity) {
      this.unfulfilledQuantity = unfulfilledQuantity;
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
  }
}
