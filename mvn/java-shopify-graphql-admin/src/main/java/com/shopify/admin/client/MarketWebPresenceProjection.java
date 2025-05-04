package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MarketWebPresenceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketWebPresenceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketWebPresence"));
  }

  public MarketWebPresenceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopLocaleProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> alternateLocales() {
     ShopLocaleProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());
     getFields().put("alternateLocales", projection);
     return projection;
  }

  public ShopLocaleProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> defaultLocale() {
     ShopLocaleProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());
     getFields().put("defaultLocale", projection);
     return projection;
  }

  public DomainProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> domain() {
     DomainProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());
     getFields().put("domain", projection);
     return projection;
  }

  public MarketProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public MarketConnectionProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> markets() {
     MarketConnectionProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());
     getFields().put("markets", projection);
     return projection;
  }

  public MarketConnectionProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> markets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
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

  public MarketWebPresenceRootUrlProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> rootUrls(
      ) {
     MarketWebPresenceRootUrlProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceRootUrlProjection<>(this, getRoot());
     getFields().put("rootUrls", projection);
     return projection;
  }

  public MarketWebPresenceProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketWebPresenceProjection<PARENT, ROOT> subfolderSuffix() {
    getFields().put("subfolderSuffix", null);
    return this;
  }
}
