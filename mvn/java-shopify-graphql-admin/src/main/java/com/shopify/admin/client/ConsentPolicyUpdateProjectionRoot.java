package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ConsentPolicyUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ConsentPolicyUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ConsentPolicyUpdatePayload"));
  }

  public ConsentPolicyUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ConsentPolicyProjection<ConsentPolicyUpdateProjectionRoot<PARENT, ROOT>, ConsentPolicyUpdateProjectionRoot<PARENT, ROOT>> updatedPolicies(
      ) {
    ConsentPolicyProjection<ConsentPolicyUpdateProjectionRoot<PARENT, ROOT>, ConsentPolicyUpdateProjectionRoot<PARENT, ROOT>> projection = new ConsentPolicyProjection<>(this, this);    
    getFields().put("updatedPolicies", projection);
    return projection;
  }

  public ConsentPolicyErrorProjection<ConsentPolicyUpdateProjectionRoot<PARENT, ROOT>, ConsentPolicyUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ConsentPolicyErrorProjection<ConsentPolicyUpdateProjectionRoot<PARENT, ROOT>, ConsentPolicyUpdateProjectionRoot<PARENT, ROOT>> projection = new ConsentPolicyErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
