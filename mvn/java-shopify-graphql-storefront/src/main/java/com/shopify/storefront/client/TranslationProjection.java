package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Translation"));
  }

  public TranslationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslationProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public TranslationProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
