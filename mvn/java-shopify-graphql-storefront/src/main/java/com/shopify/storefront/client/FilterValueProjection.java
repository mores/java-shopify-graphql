package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FilterValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FilterValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FilterValue"));
  }

  public FilterValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaImageProjection<FilterValueProjection<PARENT, ROOT>, ROOT> image() {
     MediaImageProjection<FilterValueProjection<PARENT, ROOT>, ROOT> projection = new MediaImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public SwatchProjection<FilterValueProjection<PARENT, ROOT>, ROOT> swatch() {
     SwatchProjection<FilterValueProjection<PARENT, ROOT>, ROOT> projection = new SwatchProjection<>(this, getRoot());
     getFields().put("swatch", projection);
     return projection;
  }

  public FilterValueProjection<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }

  public FilterValueProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FilterValueProjection<PARENT, ROOT> input() {
    getFields().put("input", null);
    return this;
  }

  public FilterValueProjection<PARENT, ROOT> label() {
    getFields().put("label", null);
    return this;
  }
}
