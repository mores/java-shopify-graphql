package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ProductDeleteOperationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductDeleteOperationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductDeleteOperation"));
  }

  public ProductDeleteOperationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductDeleteOperationFragmentProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductDeleteOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductOperationStatusProjection<ProductDeleteOperationFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ProductOperationStatusProjection<ProductDeleteOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public UserErrorProjection<ProductDeleteOperationFragmentProjection<PARENT, ROOT>, ROOT> userErrors(
      ) {
     UserErrorProjection<ProductDeleteOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new UserErrorProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }

  public ProductDeleteOperationFragmentProjection<PARENT, ROOT> deletedProductId() {
    getFields().put("deletedProductId", null);
    return this;
  }

  public ProductDeleteOperationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductDeleteOperation {");
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
