package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ProductOptionValueFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductOptionValueFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOptionValue"));
  }

  public ProductOptionValueFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> firstSelectableVariant(
      ) {
     ProductVariantProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("firstSelectableVariant", projection);
     return projection;
  }

  public ProductOptionValueSwatchProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> swatch(
      ) {
     ProductOptionValueSwatchProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionValueSwatchProjection<>(this, getRoot());
     getFields().put("swatch", projection);
     return projection;
  }

  public ProductOptionValueFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductOptionValueFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductOptionValue {");
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
