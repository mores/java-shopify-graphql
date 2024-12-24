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
public class ProductVariant implements CommentEventEmbed, MetafieldReference, MetafieldReferencer, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.LegacyInteroperability, com.shopify.types.Navigable, com.shopify.types.Node {
  
  private boolean availableForSale;

  
  private String barcode;

  
  private String compareAtPrice;

  
  private ProductVariantContextualPricing contextualPricing;

  
  private OffsetDateTime createdAt;

  
  private String defaultCursor;

  
  private DeliveryProfile deliveryProfile;

  
  private String displayName;

  
  private EventConnection events;

  
  private String id;

  
  private Image image;

  
  private InventoryItem inventoryItem;

  
  private ProductVariantInventoryPolicy inventoryPolicy;

  
  private Integer inventoryQuantity;

  
  private String legacyResourceId;

  
  private MediaConnection media;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private int position;

  
  private ProductVariantPricePairConnection presentmentPrices;

  
  private String price;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private Product product;

  
  private ProductVariantComponentConnection productVariantComponents;

  
  private boolean requiresComponents;

  
  private List<SelectedOption> selectedOptions;

  
  private int sellableOnlineQuantity;

  
  private int sellingPlanGroupCount;

  
  private SellingPlanGroupConnection sellingPlanGroups;

  
  private Count sellingPlanGroupsCount;

  
  private String sku;

  
  private String storefrontId;

  
  private String taxCode;

  
  private boolean taxable;

  
  private String title;

  
  private List<Translation> translations;

  
  private UnitPriceMeasurement unitPriceMeasurement;

  
  private OffsetDateTime updatedAt;

  public ProductVariant() {
  }

  
  public boolean getAvailableForSale() {
    return availableForSale;
  }

  public void setAvailableForSale(boolean availableForSale) {
    this.availableForSale = availableForSale;
  }

  
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  
  public String getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(String compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  
  public ProductVariantContextualPricing getContextualPricing() {
    return contextualPricing;
  }

  public void setContextualPricing(ProductVariantContextualPricing contextualPricing) {
    this.contextualPricing = contextualPricing;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  
  public DeliveryProfile getDeliveryProfile() {
    return deliveryProfile;
  }

  public void setDeliveryProfile(DeliveryProfile deliveryProfile) {
    this.deliveryProfile = deliveryProfile;
  }

  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
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

  
  public InventoryItem getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItem inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  
  public ProductVariantInventoryPolicy getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  
  public Integer getInventoryQuantity() {
    return inventoryQuantity;
  }

  public void setInventoryQuantity(Integer inventoryQuantity) {
    this.inventoryQuantity = inventoryQuantity;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public MediaConnection getMedia() {
    return media;
  }

  public void setMedia(MediaConnection media) {
    this.media = media;
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

  
  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  
  public ProductVariantPricePairConnection getPresentmentPrices() {
    return presentmentPrices;
  }

  public void setPresentmentPrices(ProductVariantPricePairConnection presentmentPrices) {
    this.presentmentPrices = presentmentPrices;
  }

  
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
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

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public ProductVariantComponentConnection getProductVariantComponents() {
    return productVariantComponents;
  }

  public void setProductVariantComponents(
      ProductVariantComponentConnection productVariantComponents) {
    this.productVariantComponents = productVariantComponents;
  }

  
  public boolean getRequiresComponents() {
    return requiresComponents;
  }

  public void setRequiresComponents(boolean requiresComponents) {
    this.requiresComponents = requiresComponents;
  }

  
  public List<SelectedOption> getSelectedOptions() {
    return selectedOptions;
  }

  public void setSelectedOptions(List<SelectedOption> selectedOptions) {
    this.selectedOptions = selectedOptions;
  }

  
  public int getSellableOnlineQuantity() {
    return sellableOnlineQuantity;
  }

  public void setSellableOnlineQuantity(int sellableOnlineQuantity) {
    this.sellableOnlineQuantity = sellableOnlineQuantity;
  }

  
  public int getSellingPlanGroupCount() {
    return sellingPlanGroupCount;
  }

  public void setSellingPlanGroupCount(int sellingPlanGroupCount) {
    this.sellingPlanGroupCount = sellingPlanGroupCount;
  }

  
  public SellingPlanGroupConnection getSellingPlanGroups() {
    return sellingPlanGroups;
  }

  public void setSellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
    this.sellingPlanGroups = sellingPlanGroups;
  }

  
  public Count getSellingPlanGroupsCount() {
    return sellingPlanGroupsCount;
  }

  public void setSellingPlanGroupsCount(Count sellingPlanGroupsCount) {
    this.sellingPlanGroupsCount = sellingPlanGroupsCount;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public String getStorefrontId() {
    return storefrontId;
  }

  public void setStorefrontId(String storefrontId) {
    this.storefrontId = storefrontId;
  }

  
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
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

  
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  
  public UnitPriceMeasurement getUnitPriceMeasurement() {
    return unitPriceMeasurement;
  }

  public void setUnitPriceMeasurement(UnitPriceMeasurement unitPriceMeasurement) {
    this.unitPriceMeasurement = unitPriceMeasurement;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "ProductVariant{availableForSale='" + availableForSale + "', barcode='" + barcode + "', compareAtPrice='" + compareAtPrice + "', contextualPricing='" + contextualPricing + "', createdAt='" + createdAt + "', defaultCursor='" + defaultCursor + "', deliveryProfile='" + deliveryProfile + "', displayName='" + displayName + "', events='" + events + "', id='" + id + "', image='" + image + "', inventoryItem='" + inventoryItem + "', inventoryPolicy='" + inventoryPolicy + "', inventoryQuantity='" + inventoryQuantity + "', legacyResourceId='" + legacyResourceId + "', media='" + media + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', position='" + position + "', presentmentPrices='" + presentmentPrices + "', price='" + price + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', product='" + product + "', productVariantComponents='" + productVariantComponents + "', requiresComponents='" + requiresComponents + "', selectedOptions='" + selectedOptions + "', sellableOnlineQuantity='" + sellableOnlineQuantity + "', sellingPlanGroupCount='" + sellingPlanGroupCount + "', sellingPlanGroups='" + sellingPlanGroups + "', sellingPlanGroupsCount='" + sellingPlanGroupsCount + "', sku='" + sku + "', storefrontId='" + storefrontId + "', taxCode='" + taxCode + "', taxable='" + taxable + "', title='" + title + "', translations='" + translations + "', unitPriceMeasurement='" + unitPriceMeasurement + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariant that = (ProductVariant) o;
    return availableForSale == that.availableForSale &&
        Objects.equals(barcode, that.barcode) &&
        Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(contextualPricing, that.contextualPricing) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(deliveryProfile, that.deliveryProfile) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(events, that.events) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(inventoryQuantity, that.inventoryQuantity) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(media, that.media) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        position == that.position &&
        Objects.equals(presentmentPrices, that.presentmentPrices) &&
        Objects.equals(price, that.price) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(product, that.product) &&
        Objects.equals(productVariantComponents, that.productVariantComponents) &&
        requiresComponents == that.requiresComponents &&
        Objects.equals(selectedOptions, that.selectedOptions) &&
        sellableOnlineQuantity == that.sellableOnlineQuantity &&
        sellingPlanGroupCount == that.sellingPlanGroupCount &&
        Objects.equals(sellingPlanGroups, that.sellingPlanGroups) &&
        Objects.equals(sellingPlanGroupsCount, that.sellingPlanGroupsCount) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(storefrontId, that.storefrontId) &&
        Objects.equals(taxCode, that.taxCode) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(unitPriceMeasurement, that.unitPriceMeasurement) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableForSale, barcode, compareAtPrice, contextualPricing, createdAt, defaultCursor, deliveryProfile, displayName, events, id, image, inventoryItem, inventoryPolicy, inventoryQuantity, legacyResourceId, media, metafield, metafieldDefinitions, metafields, position, presentmentPrices, price, privateMetafield, privateMetafields, product, productVariantComponents, requiresComponents, selectedOptions, sellableOnlineQuantity, sellingPlanGroupCount, sellingPlanGroups, sellingPlanGroupsCount, sku, storefrontId, taxCode, taxable, title, translations, unitPriceMeasurement, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean availableForSale;

    
    private String barcode;

    
    private String compareAtPrice;

    
    private ProductVariantContextualPricing contextualPricing;

    
    private OffsetDateTime createdAt;

    
    private String defaultCursor;

    
    private DeliveryProfile deliveryProfile;

    
    private String displayName;

    
    private EventConnection events;

    
    private String id;

    
    private Image image;

    
    private InventoryItem inventoryItem;

    
    private ProductVariantInventoryPolicy inventoryPolicy;

    
    private Integer inventoryQuantity;

    
    private String legacyResourceId;

    
    private MediaConnection media;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private int position;

    
    private ProductVariantPricePairConnection presentmentPrices;

    
    private String price;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private Product product;

    
    private ProductVariantComponentConnection productVariantComponents;

    
    private boolean requiresComponents;

    
    private List<SelectedOption> selectedOptions;

    
    private int sellableOnlineQuantity;

    
    private int sellingPlanGroupCount;

    
    private SellingPlanGroupConnection sellingPlanGroups;

    
    private Count sellingPlanGroupsCount;

    
    private String sku;

    
    private String storefrontId;

    
    private String taxCode;

    
    private boolean taxable;

    
    private String title;

    
    private List<Translation> translations;

    
    private UnitPriceMeasurement unitPriceMeasurement;

    
    private OffsetDateTime updatedAt;

    public ProductVariant build() {
      ProductVariant result = new ProductVariant();
      result.availableForSale = this.availableForSale;
      result.barcode = this.barcode;
      result.compareAtPrice = this.compareAtPrice;
      result.contextualPricing = this.contextualPricing;
      result.createdAt = this.createdAt;
      result.defaultCursor = this.defaultCursor;
      result.deliveryProfile = this.deliveryProfile;
      result.displayName = this.displayName;
      result.events = this.events;
      result.id = this.id;
      result.image = this.image;
      result.inventoryItem = this.inventoryItem;
      result.inventoryPolicy = this.inventoryPolicy;
      result.inventoryQuantity = this.inventoryQuantity;
      result.legacyResourceId = this.legacyResourceId;
      result.media = this.media;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.position = this.position;
      result.presentmentPrices = this.presentmentPrices;
      result.price = this.price;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.product = this.product;
      result.productVariantComponents = this.productVariantComponents;
      result.requiresComponents = this.requiresComponents;
      result.selectedOptions = this.selectedOptions;
      result.sellableOnlineQuantity = this.sellableOnlineQuantity;
      result.sellingPlanGroupCount = this.sellingPlanGroupCount;
      result.sellingPlanGroups = this.sellingPlanGroups;
      result.sellingPlanGroupsCount = this.sellingPlanGroupsCount;
      result.sku = this.sku;
      result.storefrontId = this.storefrontId;
      result.taxCode = this.taxCode;
      result.taxable = this.taxable;
      result.title = this.title;
      result.translations = this.translations;
      result.unitPriceMeasurement = this.unitPriceMeasurement;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder availableForSale(boolean availableForSale) {
      this.availableForSale = availableForSale;
      return this;
    }

    
    public Builder barcode(String barcode) {
      this.barcode = barcode;
      return this;
    }

    
    public Builder compareAtPrice(String compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    
    public Builder contextualPricing(ProductVariantContextualPricing contextualPricing) {
      this.contextualPricing = contextualPricing;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    
    public Builder deliveryProfile(DeliveryProfile deliveryProfile) {
      this.deliveryProfile = deliveryProfile;
      return this;
    }

    
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    
    public Builder events(EventConnection events) {
      this.events = events;
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

    
    public Builder inventoryItem(InventoryItem inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    
    public Builder inventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    
    public Builder inventoryQuantity(Integer inventoryQuantity) {
      this.inventoryQuantity = inventoryQuantity;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder media(MediaConnection media) {
      this.media = media;
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

    
    public Builder position(int position) {
      this.position = position;
      return this;
    }

    
    public Builder presentmentPrices(ProductVariantPricePairConnection presentmentPrices) {
      this.presentmentPrices = presentmentPrices;
      return this;
    }

    
    public Builder price(String price) {
      this.price = price;
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

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder productVariantComponents(
        ProductVariantComponentConnection productVariantComponents) {
      this.productVariantComponents = productVariantComponents;
      return this;
    }

    
    public Builder requiresComponents(boolean requiresComponents) {
      this.requiresComponents = requiresComponents;
      return this;
    }

    
    public Builder selectedOptions(List<SelectedOption> selectedOptions) {
      this.selectedOptions = selectedOptions;
      return this;
    }

    
    public Builder sellableOnlineQuantity(int sellableOnlineQuantity) {
      this.sellableOnlineQuantity = sellableOnlineQuantity;
      return this;
    }

    
    public Builder sellingPlanGroupCount(int sellingPlanGroupCount) {
      this.sellingPlanGroupCount = sellingPlanGroupCount;
      return this;
    }

    
    public Builder sellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
      this.sellingPlanGroups = sellingPlanGroups;
      return this;
    }

    
    public Builder sellingPlanGroupsCount(Count sellingPlanGroupsCount) {
      this.sellingPlanGroupsCount = sellingPlanGroupsCount;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder storefrontId(String storefrontId) {
      this.storefrontId = storefrontId;
      return this;
    }

    
    public Builder taxCode(String taxCode) {
      this.taxCode = taxCode;
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

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    
    public Builder unitPriceMeasurement(UnitPriceMeasurement unitPriceMeasurement) {
      this.unitPriceMeasurement = unitPriceMeasurement;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
