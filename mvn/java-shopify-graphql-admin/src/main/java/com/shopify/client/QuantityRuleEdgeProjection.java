package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityRuleEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityRuleEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityRuleEdge"));
  }

  public QuantityRuleEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityRuleProjection<QuantityRuleEdgeProjection<PARENT, ROOT>, ROOT> node() {
     QuantityRuleProjection<QuantityRuleEdgeProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public QuantityRuleEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
