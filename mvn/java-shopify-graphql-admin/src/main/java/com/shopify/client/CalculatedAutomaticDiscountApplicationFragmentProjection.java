package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CalculatedAutomaticDiscountApplicationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedAutomaticDiscountApplication"));
  }

  public CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationAllocationMethodProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     DiscountApplicationAllocationMethodProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public DiscountApplicationLevelProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> appliedTo(
      ) {
     DiscountApplicationLevelProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationLevelProjection<>(this, getRoot());
     getFields().put("appliedTo", projection);
     return projection;
  }

  public DiscountApplicationTargetSelectionProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetSelection(
      ) {
     DiscountApplicationTargetSelectionProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetSelectionProjection<>(this, getRoot());
     getFields().put("targetSelection", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public PricingValueProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     PricingValueProjection<CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CalculatedAutomaticDiscountApplicationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CalculatedAutomaticDiscountApplication {");
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
