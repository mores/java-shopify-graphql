package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOption"));
  }

  public ProductOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductOptionValueProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> optionValues() {
     ProductOptionValueProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionValueProjection<>(this, getRoot());
     getFields().put("optionValues", projection);
     return projection;
  }

  public ProductOptionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductOptionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ProductOptionProjection<PARENT, ROOT> values() {
    getFields().put("values", null);
    return this;
  }
}
