package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ProductBundleOperationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductBundleOperationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleOperation"));
  }

  public ProductBundleOperationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductBundleOperationFragmentProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductBundleOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductOperationStatusProjection<ProductBundleOperationFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ProductOperationStatusProjection<ProductBundleOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ProductBundleMutationUserErrorProjection<ProductBundleOperationFragmentProjection<PARENT, ROOT>, ROOT> userErrors(
      ) {
     ProductBundleMutationUserErrorProjection<ProductBundleOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleMutationUserErrorProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }

  public ProductBundleOperationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductBundleOperation {");
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
