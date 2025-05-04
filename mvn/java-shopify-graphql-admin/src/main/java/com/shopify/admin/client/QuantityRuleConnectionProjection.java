package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityRuleConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityRuleConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityRuleConnection"));
  }

  public QuantityRuleConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityRuleEdgeProjection<QuantityRuleConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     QuantityRuleEdgeProjection<QuantityRuleConnectionProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public QuantityRuleProjection<QuantityRuleConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     QuantityRuleProjection<QuantityRuleConnectionProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<QuantityRuleConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<QuantityRuleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
