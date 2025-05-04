package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AutomaticDiscountsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AutomaticDiscountsProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticConnection"));
  }

  public AutomaticDiscountsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticEdgeProjection<AutomaticDiscountsProjectionRoot<PARENT, ROOT>, AutomaticDiscountsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DiscountAutomaticEdgeProjection<AutomaticDiscountsProjectionRoot<PARENT, ROOT>, AutomaticDiscountsProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DiscountAutomaticProjection<AutomaticDiscountsProjectionRoot<PARENT, ROOT>, AutomaticDiscountsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DiscountAutomaticProjection<AutomaticDiscountsProjectionRoot<PARENT, ROOT>, AutomaticDiscountsProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<AutomaticDiscountsProjectionRoot<PARENT, ROOT>, AutomaticDiscountsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<AutomaticDiscountsProjectionRoot<PARENT, ROOT>, AutomaticDiscountsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
