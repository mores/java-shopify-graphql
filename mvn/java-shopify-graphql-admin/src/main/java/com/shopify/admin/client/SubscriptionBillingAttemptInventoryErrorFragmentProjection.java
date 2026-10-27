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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(reverseArg);
    return projection;
  }

  public ProductVariantConnectionProjection<SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT, ROOT>, ROOT> insufficientStockProductVariantsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductVariantConnectionProjection<SubscriptionBillingAttemptInventoryErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("insufficientStockProductVariants", projection);
    getInputArguments().computeIfAbsent("insufficientStockProductVariants", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("insufficientStockProductVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("insufficientStockProductVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("insufficientStockProductVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("insufficientStockProductVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
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
