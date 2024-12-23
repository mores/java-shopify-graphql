package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class ShopPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPolicy"));
  }

  public ShopPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslationProjection<ShopPolicyProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<ShopPolicyProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ShopPolicyProjection<PARENT, ROOT>, ROOT> translations(String locale,
      String marketId) {
    TranslationProjection<ShopPolicyProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ShopPolicyTypeProjection<ShopPolicyProjection<PARENT, ROOT>, ROOT> type() {
     ShopPolicyTypeProjection<ShopPolicyProjection<PARENT, ROOT>, ROOT> projection = new ShopPolicyTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ShopPolicyProjection<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
