package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CalculatedManualDiscountApplicationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CalculatedManualDiscountApplicationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedManualDiscountApplication"));
  }

  public CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationAllocationMethodProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     DiscountApplicationAllocationMethodProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public DiscountApplicationLevelProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> appliedTo(
      ) {
     DiscountApplicationLevelProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationLevelProjection<>(this, getRoot());
     getFields().put("appliedTo", projection);
     return projection;
  }

  public DiscountApplicationTargetSelectionProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetSelection(
      ) {
     DiscountApplicationTargetSelectionProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetSelectionProjection<>(this, getRoot());
     getFields().put("targetSelection", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public PricingValueProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     PricingValueProjection<CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CalculatedManualDiscountApplicationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CalculatedManualDiscountApplication {");
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
