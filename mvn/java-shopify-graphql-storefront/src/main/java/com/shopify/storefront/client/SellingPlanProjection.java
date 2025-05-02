package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class SellingPlanProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlan"));
  }

  public SellingPlanProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanBillingPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> billingPolicy(
      ) {
     SellingPlanBillingPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanBillingPolicyProjection<>(this, getRoot());
     getFields().put("billingPolicy", projection);
     return projection;
  }

  public SellingPlanCheckoutChargeProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> checkoutCharge(
      ) {
     SellingPlanCheckoutChargeProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanCheckoutChargeProjection<>(this, getRoot());
     getFields().put("checkoutCharge", projection);
     return projection;
  }

  public SellingPlanDeliveryPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> deliveryPolicy(
      ) {
     SellingPlanDeliveryPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanDeliveryPolicyProjection<>(this, getRoot());
     getFields().put("deliveryPolicy", projection);
     return projection;
  }

  public MetafieldProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> metafield(String key,
      String namespace) {
    MetafieldProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SellingPlanOptionProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> options() {
     SellingPlanOptionProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanOptionProjection<>(this, getRoot());
     getFields().put("options", projection);
     return projection;
  }

  public SellingPlanPriceAdjustmentProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> priceAdjustments(
      ) {
     SellingPlanPriceAdjustmentProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPriceAdjustmentProjection<>(this, getRoot());
     getFields().put("priceAdjustments", projection);
     return projection;
  }

  public SellingPlanProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SellingPlanProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SellingPlanProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SellingPlanProjection<PARENT, ROOT> recurringDeliveries() {
    getFields().put("recurringDeliveries", null);
    return this;
  }
}
