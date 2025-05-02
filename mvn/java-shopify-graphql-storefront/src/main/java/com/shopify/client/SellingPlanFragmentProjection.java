package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.HasMetafieldsIdentifier;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class SellingPlanFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SellingPlanFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlan"));
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanBillingPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> billingPolicy(
      ) {
     SellingPlanBillingPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanBillingPolicyProjection<>(this, getRoot());
     getFields().put("billingPolicy", projection);
     return projection;
  }

  public SellingPlanCheckoutChargeProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> checkoutCharge(
      ) {
     SellingPlanCheckoutChargeProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanCheckoutChargeProjection<>(this, getRoot());
     getFields().put("checkoutCharge", projection);
     return projection;
  }

  public SellingPlanDeliveryPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> deliveryPolicy(
      ) {
     SellingPlanDeliveryPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanDeliveryPolicyProjection<>(this, getRoot());
     getFields().put("deliveryPolicy", projection);
     return projection;
  }

  public MetafieldProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String key, String namespace) {
    MetafieldProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SellingPlanOptionProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> options() {
     SellingPlanOptionProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanOptionProjection<>(this, getRoot());
     getFields().put("options", projection);
     return projection;
  }

  public SellingPlanPriceAdjustmentProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> priceAdjustments(
      ) {
     SellingPlanPriceAdjustmentProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPriceAdjustmentProjection<>(this, getRoot());
     getFields().put("priceAdjustments", projection);
     return projection;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> recurringDeliveries() {
    getFields().put("recurringDeliveries", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SellingPlan {");
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
