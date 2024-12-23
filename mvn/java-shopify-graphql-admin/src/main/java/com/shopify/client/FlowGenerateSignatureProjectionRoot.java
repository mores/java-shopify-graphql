package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FlowGenerateSignatureProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FlowGenerateSignatureProjectionRoot() {
    super(null, null, java.util.Optional.of("FlowGenerateSignaturePayload"));
  }

  public FlowGenerateSignatureProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<FlowGenerateSignatureProjectionRoot<PARENT, ROOT>, FlowGenerateSignatureProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FlowGenerateSignatureProjectionRoot<PARENT, ROOT>, FlowGenerateSignatureProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public FlowGenerateSignatureProjectionRoot<PARENT, ROOT> payload() {
    getFields().put("payload", null);
    return this;
  }

  public FlowGenerateSignatureProjectionRoot<PARENT, ROOT> signature() {
    getFields().put("signature", null);
    return this;
  }
}
