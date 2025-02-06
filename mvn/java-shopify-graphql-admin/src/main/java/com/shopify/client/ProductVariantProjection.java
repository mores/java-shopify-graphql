package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.ContextualPricingContext;
import com.shopify.types.CurrencyCode;
import com.shopify.types.EventSortKeys;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductVariantProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariant"));
  }

  public ProductVariantProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> contextualPricing(
      ) {
     ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantContextualPricingProjection<>(this, getRoot());
     getFields().put("contextualPricing", projection);
     return projection;
  }

  public ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> contextualPricing(
      ContextualPricingContext context) {
    ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantContextualPricingProjection<>(this, getRoot());    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public DeliveryProfileProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> deliveryProfile() {
     DeliveryProfileProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileProjection<>(this, getRoot());
     getFields().put("deliveryProfile", projection);
     return projection;
  }

  public EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public ImageProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public InventoryItemProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> inventoryItem() {
     InventoryItemProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public ProductVariantInventoryPolicyProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> inventoryPolicy(
      ) {
     ProductVariantInventoryPolicyProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantInventoryPolicyProjection<>(this, getRoot());
     getFields().put("inventoryPolicy", projection);
     return projection;
  }

  public MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> media() {
     MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());
     getFields().put("media", projection);
     return projection;
  }

  public MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> media(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());    
    getFields().put("media", projection);
    getInputArguments().computeIfAbsent("media", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("media").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("media").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("media").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("media").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("media").add(reverseArg);
    return projection;
  }

  public MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> presentmentPrices(
      ) {
     ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairConnectionProjection<>(this, getRoot());
     getFields().put("presentmentPrices", projection);
     return projection;
  }

  public ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> presentmentPrices(
      List<CurrencyCode> presentmentCurrencies, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairConnectionProjection<>(this, getRoot());    
    getFields().put("presentmentPrices", projection);
    getInputArguments().computeIfAbsent("presentmentPrices", k -> new ArrayList<>());                      
    InputArgument presentmentCurrenciesArg = new InputArgument("presentmentCurrencies", presentmentCurrencies);
    getInputArguments().get("presentmentPrices").add(presentmentCurrenciesArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("presentmentPrices").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("presentmentPrices").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("presentmentPrices").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("presentmentPrices").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("presentmentPrices").add(reverseArg);
    return projection;
  }

  public ProductProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> productVariantComponents(
      ) {
     ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());
     getFields().put("productVariantComponents", projection);
     return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> productVariantComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());    
    getFields().put("productVariantComponents", projection);
    getInputArguments().computeIfAbsent("productVariantComponents", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productVariantComponents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productVariantComponents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productVariantComponents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productVariantComponents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productVariantComponents").add(reverseArg);
    return projection;
  }

  public SelectedOptionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> selectedOptions() {
     SelectedOptionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SelectedOptionProjection<>(this, getRoot());
     getFields().put("selectedOptions", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      ) {
     SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanGroups", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlanGroups", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroups", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlanGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlanGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlanGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlanGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlanGroups").add(reverseArg);
    return projection;
  }

  public CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> sellingPlanGroupsCount() {
     CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("sellingPlanGroupsCount", projection);
     return projection;
  }

  public TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public UnitPriceMeasurementProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> unitPriceMeasurement(
      ) {
     UnitPriceMeasurementProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new UnitPriceMeasurementProjection<>(this, getRoot());
     getFields().put("unitPriceMeasurement", projection);
     return projection;
  }

  public ProductVariantProjection<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> barcode() {
    getFields().put("barcode", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> compareAtPrice() {
    getFields().put("compareAtPrice", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> inventoryQuantity() {
    getFields().put("inventoryQuantity", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> requiresComponents() {
    getFields().put("requiresComponents", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> sellableOnlineQuantity() {
    getFields().put("sellableOnlineQuantity", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> taxCode() {
    getFields().put("taxCode", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
