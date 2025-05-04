package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityRuleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityRuleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityRule"));
  }

  public QuantityRuleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityRuleOriginTypeProjection<QuantityRuleProjection<PARENT, ROOT>, ROOT> originType() {
     QuantityRuleOriginTypeProjection<QuantityRuleProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleOriginTypeProjection<>(this, getRoot());
     getFields().put("originType", projection);
     return projection;
  }

  public ProductVariantProjection<QuantityRuleProjection<PARENT, ROOT>, ROOT> productVariant() {
     ProductVariantProjection<QuantityRuleProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("productVariant", projection);
     return projection;
  }

  public QuantityRuleProjection<PARENT, ROOT> increment() {
    getFields().put("increment", null);
    return this;
  }

  public QuantityRuleProjection<PARENT, ROOT> isDefault() {
    getFields().put("isDefault", null);
    return this;
  }

  public QuantityRuleProjection<PARENT, ROOT> maximum() {
    getFields().put("maximum", null);
    return this;
  }

  public QuantityRuleProjection<PARENT, ROOT> minimum() {
    getFields().put("minimum", null);
    return this;
  }
}
