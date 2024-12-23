package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutProfilesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutProfilesProjectionRoot() {
    super(null, null, java.util.Optional.of("CheckoutProfileConnection"));
  }

  public CheckoutProfilesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutProfileEdgeProjection<CheckoutProfilesProjectionRoot<PARENT, ROOT>, CheckoutProfilesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CheckoutProfileEdgeProjection<CheckoutProfilesProjectionRoot<PARENT, ROOT>, CheckoutProfilesProjectionRoot<PARENT, ROOT>> projection = new CheckoutProfileEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CheckoutProfileProjection<CheckoutProfilesProjectionRoot<PARENT, ROOT>, CheckoutProfilesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CheckoutProfileProjection<CheckoutProfilesProjectionRoot<PARENT, ROOT>, CheckoutProfilesProjectionRoot<PARENT, ROOT>> projection = new CheckoutProfileProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CheckoutProfilesProjectionRoot<PARENT, ROOT>, CheckoutProfilesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CheckoutProfilesProjectionRoot<PARENT, ROOT>, CheckoutProfilesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
