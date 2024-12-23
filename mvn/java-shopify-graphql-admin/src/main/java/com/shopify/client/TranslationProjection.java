package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Translation"));
  }

  public TranslationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<TranslationProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<TranslationProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public TranslationProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public TranslationProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public TranslationProjection<PARENT, ROOT> outdated() {
    getFields().put("outdated", null);
    return this;
  }

  public TranslationProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public TranslationProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
