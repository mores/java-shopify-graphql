package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MarketCatalogProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketCatalogProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketCatalog"));
  }

  public MarketCatalogProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketConnectionProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> markets() {
     MarketConnectionProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());
     getFields().put("markets", projection);
     return projection;
  }

  public MarketConnectionProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> markets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
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

  public ResourceOperationProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> operations() {
     ResourceOperationProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationProjection<>(this, getRoot());
     getFields().put("operations", projection);
     return projection;
  }

  public PriceListProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public PublicationProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public CatalogStatusProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> status() {
     CatalogStatusProjection<MarketCatalogProjection<PARENT, ROOT>, ROOT> projection = new CatalogStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MarketCatalogProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketCatalogProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
