package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslationsRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslationsRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("TranslationsRemovePayload"));
  }

  public TranslationsRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslationProjection<TranslationsRemoveProjectionRoot<PARENT, ROOT>, TranslationsRemoveProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<TranslationsRemoveProjectionRoot<PARENT, ROOT>, TranslationsRemoveProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationUserErrorProjection<TranslationsRemoveProjectionRoot<PARENT, ROOT>, TranslationsRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    TranslationUserErrorProjection<TranslationsRemoveProjectionRoot<PARENT, ROOT>, TranslationsRemoveProjectionRoot<PARENT, ROOT>> projection = new TranslationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
