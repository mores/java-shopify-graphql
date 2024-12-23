package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class PrimaryMarketProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrimaryMarketProjectionRoot() {
    super(null, null, java.util.Optional.of("Market"));
  }

  public PrimaryMarketProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketCatalogConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> catalogs(
      ) {
    MarketCatalogConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
    getFields().put("catalogs", projection);
    return projection;
  }

  public MarketCatalogConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> catalogs(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketCatalogConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
    getFields().put("catalogs", projection);
    getInputArguments().computeIfAbsent("catalogs", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("catalogs").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("catalogs").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("catalogs").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("catalogs").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("catalogs").add(reverseArg);
    return projection;
  }

  public CountProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> catalogsCount(
      ) {
    CountProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("catalogsCount", projection);
    return projection;
  }

  public MarketCurrencySettingsProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> currencySettings(
      ) {
    MarketCurrencySettingsProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MarketCurrencySettingsProjection<>(this, this);    
    getFields().put("currencySettings", projection);
    return projection;
  }

  public MetafieldProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public PriceListProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> priceList(
      ) {
    PriceListProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new PriceListProjection<>(this, this);    
    getFields().put("priceList", projection);
    return projection;
  }

  public PrivateMetafieldProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public PrivateMetafieldProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> privateMetafields(
      ) {
    PrivateMetafieldConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public MarketRegionConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> regions(
      ) {
    MarketRegionConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MarketRegionConnectionProjection<>(this, this);    
    getFields().put("regions", projection);
    return projection;
  }

  public MarketRegionConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> regions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketRegionConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MarketRegionConnectionProjection<>(this, this);    
    getFields().put("regions", projection);
    getInputArguments().computeIfAbsent("regions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("regions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("regions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("regions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("regions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("regions").add(reverseArg);
    return projection;
  }

  public MarketWebPresenceProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> webPresence(
      ) {
    MarketWebPresenceProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceProjection<>(this, this);    
    getFields().put("webPresence", projection);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> webPresences(
      ) {
    MarketWebPresenceConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
    getFields().put("webPresences", projection);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> webPresences(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketWebPresenceConnectionProjection<PrimaryMarketProjectionRoot<PARENT, ROOT>, PrimaryMarketProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
    getFields().put("webPresences", projection);
    getInputArguments().computeIfAbsent("webPresences", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("webPresences").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("webPresences").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("webPresences").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("webPresences").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("webPresences").add(reverseArg);
    return projection;
  }

  public PrimaryMarketProjectionRoot<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public PrimaryMarketProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public PrimaryMarketProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PrimaryMarketProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public PrimaryMarketProjectionRoot<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }
}
