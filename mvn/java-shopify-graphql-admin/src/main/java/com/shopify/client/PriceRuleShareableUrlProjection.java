package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleShareableUrlProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleShareableUrlProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleShareableUrl"));
  }

  public PriceRuleShareableUrlProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<PriceRuleShareableUrlProjection<PARENT, ROOT>, ROOT> targetItemImage() {
     ImageProjection<PriceRuleShareableUrlProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("targetItemImage", projection);
     return projection;
  }

  public PriceRuleShareableUrlTargetTypeProjection<PriceRuleShareableUrlProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     PriceRuleShareableUrlTargetTypeProjection<PriceRuleShareableUrlProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleShareableUrlTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public PriceRuleShareableUrlProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public PriceRuleShareableUrlProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
