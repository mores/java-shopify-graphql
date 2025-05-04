package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.ContextualPricingContext;
import com.shopify.admin.types.CurrencyCode;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductVariantFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductVariantFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariant"));
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantContextualPricingProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> contextualPricing(
      ) {
     ProductVariantContextualPricingProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantContextualPricingProjection<>(this, getRoot());
     getFields().put("contextualPricing", projection);
     return projection;
  }

  public ProductVariantContextualPricingProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> contextualPricing(
      ContextualPricingContext context) {
    ProductVariantContextualPricingProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantContextualPricingProjection<>(this, getRoot());    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public DeliveryProfileProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> deliveryProfile(
      ) {
     DeliveryProfileProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileProjection<>(this, getRoot());
     getFields().put("deliveryProfile", projection);
     return projection;
  }

  public EventConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public ImageProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public InventoryItemProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> inventoryItem(
      ) {
     InventoryItemProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public ProductVariantInventoryPolicyProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> inventoryPolicy(
      ) {
     ProductVariantInventoryPolicyProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantInventoryPolicyProjection<>(this, getRoot());
     getFields().put("inventoryPolicy", projection);
     return projection;
  }

  public MediaConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> media() {
     MediaConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());
     getFields().put("media", projection);
     return projection;
  }

  public MediaConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> media(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MediaConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());    
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

  public MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public ProductVariantPricePairConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> presentmentPrices(
      ) {
     ProductVariantPricePairConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairConnectionProjection<>(this, getRoot());
     getFields().put("presentmentPrices", projection);
     return projection;
  }

  public ProductVariantPricePairConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> presentmentPrices(
      List<CurrencyCode> presentmentCurrencies, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ProductVariantPricePairConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairConnectionProjection<>(this, getRoot());    
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

  public ProductProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> productVariantComponents(
      ) {
     ProductVariantComponentConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());
     getFields().put("productVariantComponents", projection);
     return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> productVariantComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantComponentConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());    
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

  public SelectedOptionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> selectedOptions(
      ) {
     SelectedOptionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new SelectedOptionProjection<>(this, getRoot());
     getFields().put("selectedOptions", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      ) {
     SellingPlanGroupConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanGroups", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
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

  public CountProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanGroupsCount(
      ) {
     CountProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("sellingPlanGroupsCount", projection);
     return projection;
  }

  public TranslationProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> translations(
      ) {
     TranslationProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public UnitPriceMeasurementProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> unitPriceMeasurement(
      ) {
     UnitPriceMeasurementProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new UnitPriceMeasurementProjection<>(this, getRoot());
     getFields().put("unitPriceMeasurement", projection);
     return projection;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> barcode() {
    getFields().put("barcode", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> compareAtPrice() {
    getFields().put("compareAtPrice", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> inventoryQuantity() {
    getFields().put("inventoryQuantity", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> requiresComponents() {
    getFields().put("requiresComponents", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> sellableOnlineQuantity() {
    getFields().put("sellableOnlineQuantity", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> taxCode() {
    getFields().put("taxCode", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductVariant {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
