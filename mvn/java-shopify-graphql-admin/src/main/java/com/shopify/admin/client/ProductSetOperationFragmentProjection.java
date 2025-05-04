package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ProductSetOperationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductSetOperationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductSetOperation"));
  }

  public ProductSetOperationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductSetOperationFragmentProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductSetOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductOperationStatusProjection<ProductSetOperationFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ProductOperationStatusProjection<ProductSetOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ProductSetUserErrorProjection<ProductSetOperationFragmentProjection<PARENT, ROOT>, ROOT> userErrors(
      ) {
     ProductSetUserErrorProjection<ProductSetOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductSetUserErrorProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }

  public ProductSetOperationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductSetOperation {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
