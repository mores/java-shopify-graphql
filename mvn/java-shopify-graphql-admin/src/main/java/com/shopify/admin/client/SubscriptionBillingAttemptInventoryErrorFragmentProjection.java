package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionBillingAttemptInventoryErrorFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptInventoryError"));
  }

  public SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptInventoryErrorCodeProjection<SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionBillingAttemptInventoryErrorCodeProjection<SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptInventoryErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT, ROOT>, ROOT> insufficientStockProductVariants(
      ) {
     ProductVariantConnectionProjection<SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("insufficientStockProductVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT, ROOT>, ROOT> insufficientStockProductVariants(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantConnectionProjection<SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("insufficientStockProductVariants", projection);
    getInputArguments().computeIfAbsent("insufficientStockProductVariants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("insufficientStockProductVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("insufficientStockProductVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("insufficientStockProductVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("insufficientStockProductVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("insufficientStockProductVariants").add(reverseArg);
    return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionBillingAttemptInventoryError {");
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
