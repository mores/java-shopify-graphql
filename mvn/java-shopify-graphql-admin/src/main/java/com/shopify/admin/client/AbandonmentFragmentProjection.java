package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class AbandonmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AbandonmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Abandonment"));
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> abandonedCheckoutPayload(
      ) {
     AbandonedCheckoutProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutProjection<>(this, getRoot());
     getFields().put("abandonedCheckoutPayload", projection);
     return projection;
  }

  public AbandonmentAbandonmentTypeProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> abandonmentType(
      ) {
     AbandonmentAbandonmentTypeProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentAbandonmentTypeProjection<>(this, getRoot());
     getFields().put("abandonmentType", projection);
     return projection;
  }

  public AppProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public CustomerProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public AbandonmentEmailStateProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> emailState(
      ) {
     AbandonmentEmailStateProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentEmailStateProjection<>(this, getRoot());
     getFields().put("emailState", projection);
     return projection;
  }

  public AbandonmentAbandonmentTypeProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> mostRecentStep(
      ) {
     AbandonmentAbandonmentTypeProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentAbandonmentTypeProjection<>(this, getRoot());
     getFields().put("mostRecentStep", projection);
     return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> productsAddedToCart(
      ) {
     CustomerVisitProductInfoConnectionProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoConnectionProjection<>(this, getRoot());
     getFields().put("productsAddedToCart", projection);
     return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> productsAddedToCart(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoConnectionProjection<>(this, getRoot());    
    getFields().put("productsAddedToCart", projection);
    getInputArguments().computeIfAbsent("productsAddedToCart", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productsAddedToCart").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productsAddedToCart").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productsAddedToCart").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productsAddedToCart").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productsAddedToCart").add(reverseArg);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> productsViewed(
      ) {
     CustomerVisitProductInfoConnectionProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoConnectionProjection<>(this, getRoot());
     getFields().put("productsViewed", projection);
     return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> productsViewed(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoConnectionProjection<>(this, getRoot());    
    getFields().put("productsViewed", projection);
    getInputArguments().computeIfAbsent("productsViewed", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productsViewed").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productsViewed").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productsViewed").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productsViewed").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productsViewed").add(reverseArg);
    return projection;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> cartUrl() {
    getFields().put("cartUrl", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> customerHasNoDraftOrderSinceAbandonment() {
    getFields().put("customerHasNoDraftOrderSinceAbandonment", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> customerHasNoOrderSinceAbandonment() {
    getFields().put("customerHasNoOrderSinceAbandonment", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> daysSinceLastAbandonmentEmail() {
    getFields().put("daysSinceLastAbandonmentEmail", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> emailSentAt() {
    getFields().put("emailSentAt", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> hoursSinceLastAbandonedCheckout() {
    getFields().put("hoursSinceLastAbandonedCheckout", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> inventoryAvailable() {
    getFields().put("inventoryAvailable", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> isFromCustomStorefront() {
    getFields().put("isFromCustomStorefront", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> isFromOnlineStore() {
    getFields().put("isFromOnlineStore", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> isFromShopApp() {
    getFields().put("isFromShopApp", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> isFromShopPay() {
    getFields().put("isFromShopPay", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> isMostSignificantAbandonment() {
    getFields().put("isMostSignificantAbandonment", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> lastBrowseAbandonmentDate() {
    getFields().put("lastBrowseAbandonmentDate", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> lastCartAbandonmentDate() {
    getFields().put("lastCartAbandonmentDate", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> lastCheckoutAbandonmentDate() {
    getFields().put("lastCheckoutAbandonmentDate", null);
    return this;
  }

  public AbandonmentFragmentProjection<PARENT, ROOT> visitStartedAt() {
    getFields().put("visitStartedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Abandonment {");
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
