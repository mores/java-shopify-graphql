package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountShareableUrlProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountShareableUrlProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountShareableUrl"));
  }

  public DiscountShareableUrlProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<DiscountShareableUrlProjection<PARENT, ROOT>, ROOT> targetItemImage() {
     ImageProjection<DiscountShareableUrlProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("targetItemImage", projection);
     return projection;
  }

  public DiscountShareableUrlTargetTypeProjection<DiscountShareableUrlProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountShareableUrlTargetTypeProjection<DiscountShareableUrlProjection<PARENT, ROOT>, ROOT> projection = new DiscountShareableUrlTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public DiscountShareableUrlProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountShareableUrlProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
