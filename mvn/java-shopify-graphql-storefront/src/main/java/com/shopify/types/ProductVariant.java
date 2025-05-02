package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A product variant represents a different version of a product, such as differing sizes or differing colors.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductVariant implements Merchandise, MetafieldParentResource, MetafieldReference, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * Indicates if the product variant is available for sale.
   */
  private boolean availableForSale;

  /**
   * The barcode (for example, ISBN, UPC, or GTIN) associated with the variant.
   */
  private String barcode;

  /**
   * The compare at price of the variant. This can be used to mark a variant as on
   * sale, when `compareAtPrice` is higher than `price`.
   */
  private MoneyV2 compareAtPrice;

  /**
   * The compare at price of the variant. This can be used to mark a variant as on
   * sale, when `compareAtPriceV2` is higher than `priceV2`.
   */
  private MoneyV2 compareAtPriceV2;

  /**
   * List of bundles components included in the variant considering only fixed bundles.
   */
  private ProductVariantComponentConnection components;

  /**
   * Whether a product is out of stock but still available for purchase (used for backorders).
   */
  private boolean currentlyNotInStock;

  /**
   * List of bundles that include this variant considering only fixed bundles.
   */
  private ProductVariantConnection groupedBy;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Image associated with the product variant. This field falls back to the product image if no image is available.
   */
  private Image image;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * The product variant’s price.
   */
  private MoneyV2 price;

  /**
   * The product variant’s price.
   */
  private MoneyV2 priceV2;

  /**
   * The product object that the product variant belongs to.
   */
  private Product product;

  /**
   * The total sellable quantity of the variant for online sales channels.
   */
  private Integer quantityAvailable;

  /**
   * A list of quantity breaks for the product variant.
   */
  private QuantityPriceBreakConnection quantityPriceBreaks;

  /**
   * The quantity rule for the product variant in a given context.
   */
  private QuantityRule quantityRule;

  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components.
   */
  private boolean requiresComponents;

  /**
   * Whether a customer needs to provide a shipping address when placing an order for the product variant.
   */
  private boolean requiresShipping;

  /**
   * List of product options applied to the variant.
   */
  private List<SelectedOption> selectedOptions;

  /**
   * Represents an association between a variant and a selling plan. Selling plan
   * allocations describe which selling plans are available for each variant, and
   * what their impact is on pricing.
   */
  private SellingPlanAllocationConnection sellingPlanAllocations;

  /**
   * The Shop Pay Installments pricing information for the product variant.
   */
  private ShopPayInstallmentsProductVariantPricing shopPayInstallmentsPricing;

  /**
   * The SKU (stock keeping unit) associated with the variant.
   */
  private String sku;

  /**
   * The in-store pickup availability of this variant by location.
   */
  private StoreAvailabilityConnection storeAvailability;

  /**
   * Whether tax is charged when the product variant is sold.
   */
  private boolean taxable;

  /**
   * The product variant’s title.
   */
  private String title;

  /**
   * The unit price value for the variant based on the variant's measurement.
   */
  private MoneyV2 unitPrice;

  /**
   * The unit price measurement for the variant.
   */
  private UnitPriceMeasurement unitPriceMeasurement;

  /**
   * The weight of the product variant in the unit system specified with `weight_unit`.
   */
  private Double weight;

  /**
   * Unit of measurement for weight.
   */
  private WeightUnit weightUnit;

  public ProductVariant() {
  }

  /**
   * Indicates if the product variant is available for sale.
   */
  public boolean getAvailableForSale() {
    return availableForSale;
  }

  public void setAvailableForSale(boolean availableForSale) {
    this.availableForSale = availableForSale;
  }

  /**
   * The barcode (for example, ISBN, UPC, or GTIN) associated with the variant.
   */
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  /**
   * The compare at price of the variant. This can be used to mark a variant as on
   * sale, when `compareAtPrice` is higher than `price`.
   */
  public MoneyV2 getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyV2 compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  /**
   * The compare at price of the variant. This can be used to mark a variant as on
   * sale, when `compareAtPriceV2` is higher than `priceV2`.
   */
  public MoneyV2 getCompareAtPriceV2() {
    return compareAtPriceV2;
  }

  public void setCompareAtPriceV2(MoneyV2 compareAtPriceV2) {
    this.compareAtPriceV2 = compareAtPriceV2;
  }

  /**
   * List of bundles components included in the variant considering only fixed bundles.
   */
  public ProductVariantComponentConnection getComponents() {
    return components;
  }

  public void setComponents(ProductVariantComponentConnection components) {
    this.components = components;
  }

  /**
   * Whether a product is out of stock but still available for purchase (used for backorders).
   */
  public boolean getCurrentlyNotInStock() {
    return currentlyNotInStock;
  }

  public void setCurrentlyNotInStock(boolean currentlyNotInStock) {
    this.currentlyNotInStock = currentlyNotInStock;
  }

  /**
   * List of bundles that include this variant considering only fixed bundles.
   */
  public ProductVariantConnection getGroupedBy() {
    return groupedBy;
  }

  public void setGroupedBy(ProductVariantConnection groupedBy) {
    this.groupedBy = groupedBy;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Image associated with the product variant. This field falls back to the product image if no image is available.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * The product variant’s price.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  /**
   * The product variant’s price.
   */
  public MoneyV2 getPriceV2() {
    return priceV2;
  }

  public void setPriceV2(MoneyV2 priceV2) {
    this.priceV2 = priceV2;
  }

  /**
   * The product object that the product variant belongs to.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The total sellable quantity of the variant for online sales channels.
   */
  public Integer getQuantityAvailable() {
    return quantityAvailable;
  }

  public void setQuantityAvailable(Integer quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
  }

  /**
   * A list of quantity breaks for the product variant.
   */
  public QuantityPriceBreakConnection getQuantityPriceBreaks() {
    return quantityPriceBreaks;
  }

  public void setQuantityPriceBreaks(QuantityPriceBreakConnection quantityPriceBreaks) {
    this.quantityPriceBreaks = quantityPriceBreaks;
  }

  /**
   * The quantity rule for the product variant in a given context.
   */
  public QuantityRule getQuantityRule() {
    return quantityRule;
  }

  public void setQuantityRule(QuantityRule quantityRule) {
    this.quantityRule = quantityRule;
  }

  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components.
   */
  public boolean getRequiresComponents() {
    return requiresComponents;
  }

  public void setRequiresComponents(boolean requiresComponents) {
    this.requiresComponents = requiresComponents;
  }

  /**
   * Whether a customer needs to provide a shipping address when placing an order for the product variant.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * List of product options applied to the variant.
   */
  public List<SelectedOption> getSelectedOptions() {
    return selectedOptions;
  }

  public void setSelectedOptions(List<SelectedOption> selectedOptions) {
    this.selectedOptions = selectedOptions;
  }

  /**
   * Represents an association between a variant and a selling plan. Selling plan
   * allocations describe which selling plans are available for each variant, and
   * what their impact is on pricing.
   */
  public SellingPlanAllocationConnection getSellingPlanAllocations() {
    return sellingPlanAllocations;
  }

  public void setSellingPlanAllocations(SellingPlanAllocationConnection sellingPlanAllocations) {
    this.sellingPlanAllocations = sellingPlanAllocations;
  }

  /**
   * The Shop Pay Installments pricing information for the product variant.
   */
  public ShopPayInstallmentsProductVariantPricing getShopPayInstallmentsPricing() {
    return shopPayInstallmentsPricing;
  }

  public void setShopPayInstallmentsPricing(
      ShopPayInstallmentsProductVariantPricing shopPayInstallmentsPricing) {
    this.shopPayInstallmentsPricing = shopPayInstallmentsPricing;
  }

  /**
   * The SKU (stock keeping unit) associated with the variant.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * The in-store pickup availability of this variant by location.
   */
  public StoreAvailabilityConnection getStoreAvailability() {
    return storeAvailability;
  }

  public void setStoreAvailability(StoreAvailabilityConnection storeAvailability) {
    this.storeAvailability = storeAvailability;
  }

  /**
   * Whether tax is charged when the product variant is sold.
   */
  public boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * The product variant’s title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The unit price value for the variant based on the variant's measurement.
   */
  public MoneyV2 getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(MoneyV2 unitPrice) {
    this.unitPrice = unitPrice;
  }

  /**
   * The unit price measurement for the variant.
   */
  public UnitPriceMeasurement getUnitPriceMeasurement() {
    return unitPriceMeasurement;
  }

  public void setUnitPriceMeasurement(UnitPriceMeasurement unitPriceMeasurement) {
    this.unitPriceMeasurement = unitPriceMeasurement;
  }

  /**
   * The weight of the product variant in the unit system specified with `weight_unit`.
   */
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   * Unit of measurement for weight.
   */
  public WeightUnit getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(WeightUnit weightUnit) {
    this.weightUnit = weightUnit;
  }

  @Override
  public String toString() {
    return "ProductVariant{availableForSale='" + availableForSale + "', barcode='" + barcode + "', compareAtPrice='" + compareAtPrice + "', compareAtPriceV2='" + compareAtPriceV2 + "', components='" + components + "', currentlyNotInStock='" + currentlyNotInStock + "', groupedBy='" + groupedBy + "', id='" + id + "', image='" + image + "', metafield='" + metafield + "', metafields='" + metafields + "', price='" + price + "', priceV2='" + priceV2 + "', product='" + product + "', quantityAvailable='" + quantityAvailable + "', quantityPriceBreaks='" + quantityPriceBreaks + "', quantityRule='" + quantityRule + "', requiresComponents='" + requiresComponents + "', requiresShipping='" + requiresShipping + "', selectedOptions='" + selectedOptions + "', sellingPlanAllocations='" + sellingPlanAllocations + "', shopPayInstallmentsPricing='" + shopPayInstallmentsPricing + "', sku='" + sku + "', storeAvailability='" + storeAvailability + "', taxable='" + taxable + "', title='" + title + "', unitPrice='" + unitPrice + "', unitPriceMeasurement='" + unitPriceMeasurement + "', weight='" + weight + "', weightUnit='" + weightUnit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariant that = (ProductVariant) o;
    return availableForSale == that.availableForSale &&
        Objects.equals(barcode, that.barcode) &&
        Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(compareAtPriceV2, that.compareAtPriceV2) &&
        Objects.equals(components, that.components) &&
        currentlyNotInStock == that.currentlyNotInStock &&
        Objects.equals(groupedBy, that.groupedBy) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(price, that.price) &&
        Objects.equals(priceV2, that.priceV2) &&
        Objects.equals(product, that.product) &&
        Objects.equals(quantityAvailable, that.quantityAvailable) &&
        Objects.equals(quantityPriceBreaks, that.quantityPriceBreaks) &&
        Objects.equals(quantityRule, that.quantityRule) &&
        requiresComponents == that.requiresComponents &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(selectedOptions, that.selectedOptions) &&
        Objects.equals(sellingPlanAllocations, that.sellingPlanAllocations) &&
        Objects.equals(shopPayInstallmentsPricing, that.shopPayInstallmentsPricing) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(storeAvailability, that.storeAvailability) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(unitPrice, that.unitPrice) &&
        Objects.equals(unitPriceMeasurement, that.unitPriceMeasurement) &&
        Objects.equals(weight, that.weight) &&
        Objects.equals(weightUnit, that.weightUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableForSale, barcode, compareAtPrice, compareAtPriceV2, components, currentlyNotInStock, groupedBy, id, image, metafield, metafields, price, priceV2, product, quantityAvailable, quantityPriceBreaks, quantityRule, requiresComponents, requiresShipping, selectedOptions, sellingPlanAllocations, shopPayInstallmentsPricing, sku, storeAvailability, taxable, title, unitPrice, unitPriceMeasurement, weight, weightUnit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates if the product variant is available for sale.
     */
    private boolean availableForSale;

    /**
     * The barcode (for example, ISBN, UPC, or GTIN) associated with the variant.
     */
    private String barcode;

    /**
     * The compare at price of the variant. This can be used to mark a variant as on
     * sale, when `compareAtPrice` is higher than `price`.
     */
    private MoneyV2 compareAtPrice;

    /**
     * The compare at price of the variant. This can be used to mark a variant as on
     * sale, when `compareAtPriceV2` is higher than `priceV2`.
     */
    private MoneyV2 compareAtPriceV2;

    /**
     * List of bundles components included in the variant considering only fixed bundles.
     */
    private ProductVariantComponentConnection components;

    /**
     * Whether a product is out of stock but still available for purchase (used for backorders).
     */
    private boolean currentlyNotInStock;

    /**
     * List of bundles that include this variant considering only fixed bundles.
     */
    private ProductVariantConnection groupedBy;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Image associated with the product variant. This field falls back to the product image if no image is available.
     */
    private Image image;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * The product variant’s price.
     */
    private MoneyV2 price;

    /**
     * The product variant’s price.
     */
    private MoneyV2 priceV2;

    /**
     * The product object that the product variant belongs to.
     */
    private Product product;

    /**
     * The total sellable quantity of the variant for online sales channels.
     */
    private Integer quantityAvailable;

    /**
     * A list of quantity breaks for the product variant.
     */
    private QuantityPriceBreakConnection quantityPriceBreaks;

    /**
     * The quantity rule for the product variant in a given context.
     */
    private QuantityRule quantityRule;

    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components.
     */
    private boolean requiresComponents;

    /**
     * Whether a customer needs to provide a shipping address when placing an order for the product variant.
     */
    private boolean requiresShipping;

    /**
     * List of product options applied to the variant.
     */
    private List<SelectedOption> selectedOptions;

    /**
     * Represents an association between a variant and a selling plan. Selling plan
     * allocations describe which selling plans are available for each variant, and
     * what their impact is on pricing.
     */
    private SellingPlanAllocationConnection sellingPlanAllocations;

    /**
     * The Shop Pay Installments pricing information for the product variant.
     */
    private ShopPayInstallmentsProductVariantPricing shopPayInstallmentsPricing;

    /**
     * The SKU (stock keeping unit) associated with the variant.
     */
    private String sku;

    /**
     * The in-store pickup availability of this variant by location.
     */
    private StoreAvailabilityConnection storeAvailability;

    /**
     * Whether tax is charged when the product variant is sold.
     */
    private boolean taxable;

    /**
     * The product variant’s title.
     */
    private String title;

    /**
     * The unit price value for the variant based on the variant's measurement.
     */
    private MoneyV2 unitPrice;

    /**
     * The unit price measurement for the variant.
     */
    private UnitPriceMeasurement unitPriceMeasurement;

    /**
     * The weight of the product variant in the unit system specified with `weight_unit`.
     */
    private Double weight;

    /**
     * Unit of measurement for weight.
     */
    private WeightUnit weightUnit;

    public ProductVariant build() {
      ProductVariant result = new ProductVariant();
      result.availableForSale = this.availableForSale;
      result.barcode = this.barcode;
      result.compareAtPrice = this.compareAtPrice;
      result.compareAtPriceV2 = this.compareAtPriceV2;
      result.components = this.components;
      result.currentlyNotInStock = this.currentlyNotInStock;
      result.groupedBy = this.groupedBy;
      result.id = this.id;
      result.image = this.image;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.price = this.price;
      result.priceV2 = this.priceV2;
      result.product = this.product;
      result.quantityAvailable = this.quantityAvailable;
      result.quantityPriceBreaks = this.quantityPriceBreaks;
      result.quantityRule = this.quantityRule;
      result.requiresComponents = this.requiresComponents;
      result.requiresShipping = this.requiresShipping;
      result.selectedOptions = this.selectedOptions;
      result.sellingPlanAllocations = this.sellingPlanAllocations;
      result.shopPayInstallmentsPricing = this.shopPayInstallmentsPricing;
      result.sku = this.sku;
      result.storeAvailability = this.storeAvailability;
      result.taxable = this.taxable;
      result.title = this.title;
      result.unitPrice = this.unitPrice;
      result.unitPriceMeasurement = this.unitPriceMeasurement;
      result.weight = this.weight;
      result.weightUnit = this.weightUnit;
      return result;
    }

    /**
     * Indicates if the product variant is available for sale.
     */
    public Builder availableForSale(boolean availableForSale) {
      this.availableForSale = availableForSale;
      return this;
    }

    /**
     * The barcode (for example, ISBN, UPC, or GTIN) associated with the variant.
     */
    public Builder barcode(String barcode) {
      this.barcode = barcode;
      return this;
    }

    /**
     * The compare at price of the variant. This can be used to mark a variant as on
     * sale, when `compareAtPrice` is higher than `price`.
     */
    public Builder compareAtPrice(MoneyV2 compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    /**
     * The compare at price of the variant. This can be used to mark a variant as on
     * sale, when `compareAtPriceV2` is higher than `priceV2`.
     */
    public Builder compareAtPriceV2(MoneyV2 compareAtPriceV2) {
      this.compareAtPriceV2 = compareAtPriceV2;
      return this;
    }

    /**
     * List of bundles components included in the variant considering only fixed bundles.
     */
    public Builder components(ProductVariantComponentConnection components) {
      this.components = components;
      return this;
    }

    /**
     * Whether a product is out of stock but still available for purchase (used for backorders).
     */
    public Builder currentlyNotInStock(boolean currentlyNotInStock) {
      this.currentlyNotInStock = currentlyNotInStock;
      return this;
    }

    /**
     * List of bundles that include this variant considering only fixed bundles.
     */
    public Builder groupedBy(ProductVariantConnection groupedBy) {
      this.groupedBy = groupedBy;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Image associated with the product variant. This field falls back to the product image if no image is available.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The product variant’s price.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    /**
     * The product variant’s price.
     */
    public Builder priceV2(MoneyV2 priceV2) {
      this.priceV2 = priceV2;
      return this;
    }

    /**
     * The product object that the product variant belongs to.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The total sellable quantity of the variant for online sales channels.
     */
    public Builder quantityAvailable(Integer quantityAvailable) {
      this.quantityAvailable = quantityAvailable;
      return this;
    }

    /**
     * A list of quantity breaks for the product variant.
     */
    public Builder quantityPriceBreaks(QuantityPriceBreakConnection quantityPriceBreaks) {
      this.quantityPriceBreaks = quantityPriceBreaks;
      return this;
    }

    /**
     * The quantity rule for the product variant in a given context.
     */
    public Builder quantityRule(QuantityRule quantityRule) {
      this.quantityRule = quantityRule;
      return this;
    }

    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components.
     */
    public Builder requiresComponents(boolean requiresComponents) {
      this.requiresComponents = requiresComponents;
      return this;
    }

    /**
     * Whether a customer needs to provide a shipping address when placing an order for the product variant.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * List of product options applied to the variant.
     */
    public Builder selectedOptions(List<SelectedOption> selectedOptions) {
      this.selectedOptions = selectedOptions;
      return this;
    }

    /**
     * Represents an association between a variant and a selling plan. Selling plan
     * allocations describe which selling plans are available for each variant, and
     * what their impact is on pricing.
     */
    public Builder sellingPlanAllocations(SellingPlanAllocationConnection sellingPlanAllocations) {
      this.sellingPlanAllocations = sellingPlanAllocations;
      return this;
    }

    /**
     * The Shop Pay Installments pricing information for the product variant.
     */
    public Builder shopPayInstallmentsPricing(
        ShopPayInstallmentsProductVariantPricing shopPayInstallmentsPricing) {
      this.shopPayInstallmentsPricing = shopPayInstallmentsPricing;
      return this;
    }

    /**
     * The SKU (stock keeping unit) associated with the variant.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * The in-store pickup availability of this variant by location.
     */
    public Builder storeAvailability(StoreAvailabilityConnection storeAvailability) {
      this.storeAvailability = storeAvailability;
      return this;
    }

    /**
     * Whether tax is charged when the product variant is sold.
     */
    public Builder taxable(boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * The product variant’s title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The unit price value for the variant based on the variant's measurement.
     */
    public Builder unitPrice(MoneyV2 unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }

    /**
     * The unit price measurement for the variant.
     */
    public Builder unitPriceMeasurement(UnitPriceMeasurement unitPriceMeasurement) {
      this.unitPriceMeasurement = unitPriceMeasurement;
      return this;
    }

    /**
     * The weight of the product variant in the unit system specified with `weight_unit`.
     */
    public Builder weight(Double weight) {
      this.weight = weight;
      return this;
    }

    /**
     * Unit of measurement for weight.
     */
    public Builder weightUnit(WeightUnit weightUnit) {
      this.weightUnit = weightUnit;
      return this;
    }
  }
}
