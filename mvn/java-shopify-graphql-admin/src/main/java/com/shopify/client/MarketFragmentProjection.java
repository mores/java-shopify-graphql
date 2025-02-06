package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class MarketFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MarketFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Market"));
  }

  public MarketFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> catalogs(
      ) {
     MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogConnectionProjection<>(this, getRoot());
     getFields().put("catalogs", projection);
     return projection;
  }

  public MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> catalogs(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogConnectionProjection<>(this, getRoot());    
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

  public CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> catalogsCount() {
     CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("catalogsCount", projection);
     return projection;
  }

  public MarketCurrencySettingsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> currencySettings(
      ) {
     MarketCurrencySettingsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketCurrencySettingsProjection<>(this, getRoot());
     getFields().put("currencySettings", projection);
     return projection;
  }

  public MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public PriceListProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> regions() {
     MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionConnectionProjection<>(this, getRoot());
     getFields().put("regions", projection);
     return projection;
  }

  public MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> regions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionConnectionProjection<>(this, getRoot());    
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

  public MarketWebPresenceProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> webPresence() {
     MarketWebPresenceProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceProjection<>(this, getRoot());
     getFields().put("webPresence", projection);
     return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> webPresences(
      ) {
     MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());
     getFields().put("webPresences", projection);
     return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> webPresences(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());    
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

  public MarketFragmentProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public MarketFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MarketFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MarketFragmentProjection<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Market {");
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
