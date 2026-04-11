package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountTagsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountTagsProjectionRoot() {
    super(null, null, java.util.Optional.of("StringConnection"));
  }

  public DiscountTagsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StringEdgeProjection<DiscountTagsProjectionRoot<PARENT, ROOT>, DiscountTagsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    StringEdgeProjection<DiscountTagsProjectionRoot<PARENT, ROOT>, DiscountTagsProjectionRoot<PARENT, ROOT>> projection = new StringEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PageInfoProjection<DiscountTagsProjectionRoot<PARENT, ROOT>, DiscountTagsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DiscountTagsProjectionRoot<PARENT, ROOT>, DiscountTagsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }

  public DiscountTagsProjectionRoot<PARENT, ROOT> nodes() {
    getFields().put("nodes", null);
    return this;
  }
}
