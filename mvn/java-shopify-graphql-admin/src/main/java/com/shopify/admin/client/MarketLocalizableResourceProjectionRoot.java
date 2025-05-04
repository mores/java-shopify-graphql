package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class MarketLocalizableResourceProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizableResourceProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketLocalizableResource"));
  }

  public MarketLocalizableResourceProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketLocalizableContentProjection<MarketLocalizableResourceProjectionRoot<PARENT, ROOT>, MarketLocalizableResourceProjectionRoot<PARENT, ROOT>> marketLocalizableContent(
      ) {
    MarketLocalizableContentProjection<MarketLocalizableResourceProjectionRoot<PARENT, ROOT>, MarketLocalizableResourceProjectionRoot<PARENT, ROOT>> projection = new MarketLocalizableContentProjection<>(this, this);    
    getFields().put("marketLocalizableContent", projection);
    return projection;
  }

  public MarketLocalizationProjection<MarketLocalizableResourceProjectionRoot<PARENT, ROOT>, MarketLocalizableResourceProjectionRoot<PARENT, ROOT>> marketLocalizations(
      ) {
    MarketLocalizationProjection<MarketLocalizableResourceProjectionRoot<PARENT, ROOT>, MarketLocalizableResourceProjectionRoot<PARENT, ROOT>> projection = new MarketLocalizationProjection<>(this, this);    
    getFields().put("marketLocalizations", projection);
    return projection;
  }

  public MarketLocalizationProjection<MarketLocalizableResourceProjectionRoot<PARENT, ROOT>, MarketLocalizableResourceProjectionRoot<PARENT, ROOT>> marketLocalizations(
      String marketId) {
    MarketLocalizationProjection<MarketLocalizableResourceProjectionRoot<PARENT, ROOT>, MarketLocalizableResourceProjectionRoot<PARENT, ROOT>> projection = new MarketLocalizationProjection<>(this, this);    
    getFields().put("marketLocalizations", projection);
    getInputArguments().computeIfAbsent("marketLocalizations", k -> new ArrayList<>());                      
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("marketLocalizations").add(marketIdArg);
    return projection;
  }

  public MarketLocalizableResourceProjectionRoot<PARENT, ROOT> resourceId() {
    getFields().put("resourceId", null);
    return this;
  }
}
