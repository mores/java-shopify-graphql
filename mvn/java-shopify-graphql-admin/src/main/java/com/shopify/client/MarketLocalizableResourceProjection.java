package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class MarketLocalizableResourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizableResourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketLocalizableResource"));
  }

  public MarketLocalizableResourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketLocalizableContentProjection<MarketLocalizableResourceProjection<PARENT, ROOT>, ROOT> marketLocalizableContent(
      ) {
     MarketLocalizableContentProjection<MarketLocalizableResourceProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableContentProjection<>(this, getRoot());
     getFields().put("marketLocalizableContent", projection);
     return projection;
  }

  public MarketLocalizationProjection<MarketLocalizableResourceProjection<PARENT, ROOT>, ROOT> marketLocalizations(
      ) {
     MarketLocalizationProjection<MarketLocalizableResourceProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizationProjection<>(this, getRoot());
     getFields().put("marketLocalizations", projection);
     return projection;
  }

  public MarketLocalizationProjection<MarketLocalizableResourceProjection<PARENT, ROOT>, ROOT> marketLocalizations(
      String marketId) {
    MarketLocalizationProjection<MarketLocalizableResourceProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizationProjection<>(this, getRoot());    
    getFields().put("marketLocalizations", projection);
    getInputArguments().computeIfAbsent("marketLocalizations", k -> new ArrayList<>());                      
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("marketLocalizations").add(marketIdArg);
    return projection;
  }

  public MarketLocalizableResourceProjection<PARENT, ROOT> resourceId() {
    getFields().put("resourceId", null);
    return this;
  }
}
