package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class CookieBannerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CookieBannerProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CookieBanner"));
  }

  public CookieBannerProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslationProjection<CookieBannerProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<CookieBannerProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<CookieBannerProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<CookieBannerProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public CookieBannerProjection<PARENT, ROOT> autoManaged() {
    getFields().put("autoManaged", null);
    return this;
  }

  public CookieBannerProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
