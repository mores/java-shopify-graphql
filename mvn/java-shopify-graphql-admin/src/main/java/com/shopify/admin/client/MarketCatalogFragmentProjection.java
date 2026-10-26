package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.MarketStatus;
import com.shopify.admin.types.MarketType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class MarketCatalogFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MarketCatalogFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketCatalog"));
  }

  public MarketCatalogFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketConnectionProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> markets() {
     MarketConnectionProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());
     getFields().put("markets", projection);
     return projection;
  }

  public MarketConnectionProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> markets(
      MarketType type, MarketStatus status, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    MarketConnectionProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
    getFields().put("markets", projection);
    getInputArguments().computeIfAbsent("markets", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type, false, null);
    getInputArguments().get("markets").add(typeArg);
    InputArgument statusArg = new InputArgument("status", status, false, null);
    getInputArguments().get("markets").add(statusArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("markets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("markets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("markets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("markets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("markets").add(reverseArg);
    return projection;
  }

  public MarketConnectionProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> marketsWithVariableReferences(
      String typeReference, String statusReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MarketConnectionProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
    getFields().put("markets", projection);
    getInputArguments().computeIfAbsent("markets", k -> new ArrayList<>());              
    InputArgument typeArg = new InputArgument("type", typeReference, true, new graphql.language.TypeName("MarketType"));
    getInputArguments().get("markets").add(typeArg);
    InputArgument statusArg = new InputArgument("status", statusReference, true, new graphql.language.TypeName("MarketStatus"));
    getInputArguments().get("markets").add(statusArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("markets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("markets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("markets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("markets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("markets").add(reverseArg);
    return projection;
  }

  public CountProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> marketsCount() {
     CountProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("marketsCount", projection);
     return projection;
  }

  public CountProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> marketsCount(
      MarketType type, MarketStatus status, String query, Integer limit) {
    CountProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("marketsCount", projection);
    getInputArguments().computeIfAbsent("marketsCount", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type, false, null);
    getInputArguments().get("marketsCount").add(typeArg);
    InputArgument statusArg = new InputArgument("status", status, false, null);
    getInputArguments().get("marketsCount").add(statusArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("marketsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit, false, null);
    getInputArguments().get("marketsCount").add(limitArg);
    return projection;
  }

  public CountProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> marketsCountWithVariableReferences(
      String typeReference, String statusReference, String queryReference, String limitReference) {
    CountProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("marketsCount", projection);
    getInputArguments().computeIfAbsent("marketsCount", k -> new ArrayList<>());              
    InputArgument typeArg = new InputArgument("type", typeReference, true, new graphql.language.TypeName("MarketType"));
    getInputArguments().get("marketsCount").add(typeArg);
    InputArgument statusArg = new InputArgument("status", statusReference, true, new graphql.language.TypeName("MarketStatus"));
    getInputArguments().get("marketsCount").add(statusArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("marketsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limitReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("marketsCount").add(limitArg);
    return projection;
  }

  public ResourceOperationProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> operations(
      ) {
     ResourceOperationProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationProjection<>(this, getRoot());
     getFields().put("operations", projection);
     return projection;
  }

  public PriceListProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public PublicationProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public CatalogStatusProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> status() {
     CatalogStatusProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CatalogStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MarketCatalogFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketCatalogFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MarketCatalog {");
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
