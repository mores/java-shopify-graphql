package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslationsRegisterProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslationsRegisterProjectionRoot() {
    super(null, null, java.util.Optional.of("TranslationsRegisterPayload"));
  }

  public TranslationsRegisterProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslationProjection<TranslationsRegisterProjectionRoot<PARENT, ROOT>, TranslationsRegisterProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<TranslationsRegisterProjectionRoot<PARENT, ROOT>, TranslationsRegisterProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationUserErrorProjection<TranslationsRegisterProjectionRoot<PARENT, ROOT>, TranslationsRegisterProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    TranslationUserErrorProjection<TranslationsRegisterProjectionRoot<PARENT, ROOT>, TranslationsRegisterProjectionRoot<PARENT, ROOT>> projection = new TranslationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
