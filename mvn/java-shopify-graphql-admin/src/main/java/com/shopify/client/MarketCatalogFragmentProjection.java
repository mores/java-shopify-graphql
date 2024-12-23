package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
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
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<MarketCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
    getFields().put("markets", projection);
    getInputArguments().computeIfAbsent("markets", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("markets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("markets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("markets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("markets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("markets").add(reverseArg);
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
