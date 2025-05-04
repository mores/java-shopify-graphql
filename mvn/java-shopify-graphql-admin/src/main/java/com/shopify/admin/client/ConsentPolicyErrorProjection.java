package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ConsentPolicyErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ConsentPolicyErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ConsentPolicyError"));
  }

  public ConsentPolicyErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ConsentPolicyErrorCodeProjection<ConsentPolicyErrorProjection<PARENT, ROOT>, ROOT> code() {
     ConsentPolicyErrorCodeProjection<ConsentPolicyErrorProjection<PARENT, ROOT>, ROOT> projection = new ConsentPolicyErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ConsentPolicyErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ConsentPolicyErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
