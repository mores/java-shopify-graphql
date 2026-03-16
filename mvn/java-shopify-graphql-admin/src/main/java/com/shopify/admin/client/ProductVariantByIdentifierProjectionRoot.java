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

public class ProductVariantByIdentifierProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantByIdentifierProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariant"));
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> contextualPricing(
      ) {
    ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    return projection;
  }

  public ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> contextualPricing(
      ContextualPricingContext context) {
    ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public DeliveryProfileProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> deliveryProfile(
      ) {
    DeliveryProfileProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileProjection<>(this, this);    
    getFields().put("deliveryProfile", projection);
    return projection;
  }

  public EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public ImageProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> image(
      ) {
    ImageProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("image", projection);
    return projection;
  }

  public InventoryItemProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> inventoryItem(
      ) {
    InventoryItemProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new InventoryItemProjection<>(this, this);    
    getFields().put("inventoryItem", projection);
    return projection;
  }

  public ProductVariantInventoryPolicyProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> inventoryPolicy(
      ) {
    ProductVariantInventoryPolicyProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantInventoryPolicyProjection<>(this, this);    
    getFields().put("inventoryPolicy", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> media(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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

  public MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> presentmentPrices(
      ) {
    ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantPricePairConnectionProjection<>(this, this);    
    getFields().put("presentmentPrices", projection);
    return projection;
  }

  public ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> presentmentPrices(
      List<CurrencyCode> presentmentCurrencies, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantPricePairConnectionProjection<>(this, this);    
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

  public ProductProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productParents(
      ) {
    ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("productParents", projection);
    return projection;
  }

  public ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productParents(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("productParents", projection);
    getInputArguments().computeIfAbsent("productParents", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productParents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productParents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productParents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productParents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productParents").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("productParents").add(queryArg);
    return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productVariantComponents(
      ) {
    ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantComponentConnectionProjection<>(this, this);    
    getFields().put("productVariantComponents", projection);
    return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productVariantComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantComponentConnectionProjection<>(this, this);    
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

  public SelectedOptionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> selectedOptions(
      ) {
    SelectedOptionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SelectedOptionProjection<>(this, this);    
    getFields().put("selectedOptions", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      ) {
    SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
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

  public CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroupsCount(
      ) {
    CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("sellingPlanGroupsCount", projection);
    return projection;
  }

  public TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public MoneyV2Projection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unitPrice(
      ) {
    MoneyV2Projection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("unitPrice", projection);
    return projection;
  }

  public UnitPriceMeasurementProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unitPriceMeasurement(
      ) {
    UnitPriceMeasurementProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new UnitPriceMeasurementProjection<>(this, this);    
    getFields().put("unitPriceMeasurement", projection);
    return projection;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> barcode() {
    getFields().put("barcode", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> compareAtPrice() {
    getFields().put("compareAtPrice", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> inventoryQuantity() {
    getFields().put("inventoryQuantity", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> requiresComponents() {
    getFields().put("requiresComponents", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> sellableOnlineQuantity() {
    getFields().put("sellableOnlineQuantity", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> showUnitPrice() {
    getFields().put("showUnitPrice", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> taxCode() {
    getFields().put("taxCode", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
