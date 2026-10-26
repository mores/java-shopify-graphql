package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MarketsResolvedValuesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketsResolvedValuesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketsResolvedValues"));
  }

  public MarketsResolvedValuesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketCatalogConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> catalogs(
      ) {
     MarketCatalogConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogConnectionProjection<>(this, getRoot());
     getFields().put("catalogs", projection);
     return projection;
  }

  public MarketCatalogConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> catalogs(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketCatalogConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogConnectionProjection<>(this, getRoot());    
    getFields().put("catalogs", projection);
    getInputArguments().computeIfAbsent("catalogs", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("catalogs").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("catalogs").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("catalogs").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("catalogs").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("catalogs").add(reverseArg);
    return projection;
  }

  public MarketCatalogConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> catalogsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketCatalogConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogConnectionProjection<>(this, getRoot());    
    getFields().put("catalogs", projection);
    getInputArguments().computeIfAbsent("catalogs", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("catalogs").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("catalogs").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("catalogs").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("catalogs").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("catalogs").add(reverseArg);
    return projection;
  }

  public CurrencyCodeProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> currencyCode(
      ) {
     CurrencyCodeProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public ResolvedPriceInclusivityProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> priceInclusivity(
      ) {
     ResolvedPriceInclusivityProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> projection = new ResolvedPriceInclusivityProjection<>(this, getRoot());
     getFields().put("priceInclusivity", projection);
     return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> webPresences(
      ) {
     MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());
     getFields().put("webPresences", projection);
     return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> webPresences(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());    
    getFields().put("webPresences", projection);
    getInputArguments().computeIfAbsent("webPresences", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("webPresences").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("webPresences").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("webPresences").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("webPresences").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("webPresences").add(reverseArg);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> webPresencesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketWebPresenceConnectionProjection<MarketsResolvedValuesProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());    
    getFields().put("webPresences", projection);
    getInputArguments().computeIfAbsent("webPresences", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("webPresences").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("webPresences").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("webPresences").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("webPresences").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("webPresences").add(reverseArg);
    return projection;
  }
}
