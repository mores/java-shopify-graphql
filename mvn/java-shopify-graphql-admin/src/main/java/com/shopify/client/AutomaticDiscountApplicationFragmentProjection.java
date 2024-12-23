package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AutomaticDiscountApplicationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AutomaticDiscountApplicationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AutomaticDiscountApplication"));
  }

  public AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationAllocationMethodProjection<AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     DiscountApplicationAllocationMethodProjection<AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public DiscountApplicationTargetSelectionProjection<AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetSelection(
      ) {
     DiscountApplicationTargetSelectionProjection<AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetSelectionProjection<>(this, getRoot());
     getFields().put("targetSelection", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public PricingValueProjection<AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     PricingValueProjection<AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT> index() {
    getFields().put("index", null);
    return this;
  }

  public AutomaticDiscountApplicationFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AutomaticDiscountApplication {");
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
