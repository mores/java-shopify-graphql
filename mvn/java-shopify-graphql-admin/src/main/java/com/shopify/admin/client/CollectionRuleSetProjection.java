package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionRuleSetProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionRuleSetProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRuleSet"));
  }

  public CollectionRuleSetProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionRuleProjection<CollectionRuleSetProjection<PARENT, ROOT>, ROOT> rules() {
     CollectionRuleProjection<CollectionRuleSetProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleProjection<>(this, getRoot());
     getFields().put("rules", projection);
     return projection;
  }

  public CollectionRuleSetProjection<PARENT, ROOT> appliedDisjunctively() {
    getFields().put("appliedDisjunctively", null);
    return this;
  }
}
