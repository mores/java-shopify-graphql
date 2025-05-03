package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FilterProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FilterProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Filter"));
  }

  public FilterProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FilterPresentationProjection<FilterProjection<PARENT, ROOT>, ROOT> presentation() {
     FilterPresentationProjection<FilterProjection<PARENT, ROOT>, ROOT> projection = new FilterPresentationProjection<>(this, getRoot());
     getFields().put("presentation", projection);
     return projection;
  }

  public FilterTypeProjection<FilterProjection<PARENT, ROOT>, ROOT> type() {
     FilterTypeProjection<FilterProjection<PARENT, ROOT>, ROOT> projection = new FilterTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public FilterValueProjection<FilterProjection<PARENT, ROOT>, ROOT> values() {
     FilterValueProjection<FilterProjection<PARENT, ROOT>, ROOT> projection = new FilterValueProjection<>(this, getRoot());
     getFields().put("values", projection);
     return projection;
  }

  public FilterProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FilterProjection<PARENT, ROOT> label() {
    getFields().put("label", null);
    return this;
  }
}
