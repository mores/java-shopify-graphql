package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MarketsResolvedValuesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketsResolvedValuesProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketsResolvedValues"));
  }

  public MarketsResolvedValuesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketCatalogConnectionProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> catalogs(
      ) {
    MarketCatalogConnectionProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
    getFields().put("catalogs", projection);
    return projection;
  }

  public MarketCatalogConnectionProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> catalogs(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketCatalogConnectionProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
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

  public CurrencyCodeProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> currencyCode(
      ) {
    CurrencyCodeProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currencyCode", projection);
    return projection;
  }

  public ResolvedPriceInclusivityProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> priceInclusivity(
      ) {
    ResolvedPriceInclusivityProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> projection = new ResolvedPriceInclusivityProjection<>(this, this);    
    getFields().put("priceInclusivity", projection);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> webPresences(
      ) {
    MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
    getFields().put("webPresences", projection);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> webPresences(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjectionRoot<PARENT, ROOT>, MarketsResolvedValuesProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
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
}
