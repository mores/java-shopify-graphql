package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ProductDuplicateOperationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductDuplicateOperationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductDuplicateOperation"));
  }

  public ProductDuplicateOperationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductDuplicateOperationFragmentProjection<PARENT, ROOT>, ROOT> newProduct(
      ) {
     ProductProjection<ProductDuplicateOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("newProduct", projection);
     return projection;
  }

  public ProductProjection<ProductDuplicateOperationFragmentProjection<PARENT, ROOT>, ROOT> product(
      ) {
     ProductProjection<ProductDuplicateOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductOperationStatusProjection<ProductDuplicateOperationFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ProductOperationStatusProjection<ProductDuplicateOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public UserErrorProjection<ProductDuplicateOperationFragmentProjection<PARENT, ROOT>, ROOT> userErrors(
      ) {
     UserErrorProjection<ProductDuplicateOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new UserErrorProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }

  public ProductDuplicateOperationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductDuplicateOperation {");
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
