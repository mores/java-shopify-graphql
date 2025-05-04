package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.ContextualPricingContext;
import com.shopify.admin.types.CurrencyCode;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductVariantProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariant"));
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantContextualPricingProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> contextualPricing(
      ) {
    ProductVariantContextualPricingProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new ProductVariantContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    return projection;
  }

  public ProductVariantContextualPricingProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> contextualPricing(
      ContextualPricingContext context) {
    ProductVariantContextualPricingProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new ProductVariantContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public DeliveryProfileProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> deliveryProfile(
      ) {
    DeliveryProfileProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileProjection<>(this, this);    
    getFields().put("deliveryProfile", projection);
    return projection;
  }

  public EventConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public ImageProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> image(
      ) {
    ImageProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("image", projection);
    return projection;
  }

  public InventoryItemProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> inventoryItem(
      ) {
    InventoryItemProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new InventoryItemProjection<>(this, this);    
    getFields().put("inventoryItem", projection);
    return projection;
  }

  public ProductVariantInventoryPolicyProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> inventoryPolicy(
      ) {
    ProductVariantInventoryPolicyProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new ProductVariantInventoryPolicyProjection<>(this, this);    
    getFields().put("inventoryPolicy", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> media(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MediaConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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

  public MetafieldProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public ProductVariantPricePairConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> presentmentPrices(
      ) {
    ProductVariantPricePairConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new ProductVariantPricePairConnectionProjection<>(this, this);    
    getFields().put("presentmentPrices", projection);
    return projection;
  }

  public ProductVariantPricePairConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> presentmentPrices(
      List<CurrencyCode> presentmentCurrencies, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ProductVariantPricePairConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new ProductVariantPricePairConnectionProjection<>(this, this);    
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

  public ProductProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> productVariantComponents(
      ) {
    ProductVariantComponentConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new ProductVariantComponentConnectionProjection<>(this, this);    
    getFields().put("productVariantComponents", projection);
    return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> productVariantComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantComponentConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new ProductVariantComponentConnectionProjection<>(this, this);    
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

  public SelectedOptionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> selectedOptions(
      ) {
    SelectedOptionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new SelectedOptionProjection<>(this, this);    
    getFields().put("selectedOptions", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      ) {
    SellingPlanGroupConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
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

  public CountProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> sellingPlanGroupsCount(
      ) {
    CountProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("sellingPlanGroupsCount", projection);
    return projection;
  }

  public TranslationProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public UnitPriceMeasurementProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> unitPriceMeasurement(
      ) {
    UnitPriceMeasurementProjection<ProductVariantProjectionRoot<PARENT, ROOT>, ProductVariantProjectionRoot<PARENT, ROOT>> projection = new UnitPriceMeasurementProjection<>(this, this);    
    getFields().put("unitPriceMeasurement", projection);
    return projection;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> barcode() {
    getFields().put("barcode", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> compareAtPrice() {
    getFields().put("compareAtPrice", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> inventoryQuantity() {
    getFields().put("inventoryQuantity", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> requiresComponents() {
    getFields().put("requiresComponents", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> sellableOnlineQuantity() {
    getFields().put("sellableOnlineQuantity", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> taxCode() {
    getFields().put("taxCode", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductVariantProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
