package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class AbandonmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Abandonment"));
  }

  public AbandonmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> abandonedCheckoutPayload(
      ) {
     AbandonedCheckoutProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutProjection<>(this, getRoot());
     getFields().put("abandonedCheckoutPayload", projection);
     return projection;
  }

  public AbandonmentAbandonmentTypeProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> abandonmentType(
      ) {
     AbandonmentAbandonmentTypeProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentAbandonmentTypeProjection<>(this, getRoot());
     getFields().put("abandonmentType", projection);
     return projection;
  }

  public AppProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public CustomerProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public AbandonmentEmailStateProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> emailState() {
     AbandonmentEmailStateProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentEmailStateProjection<>(this, getRoot());
     getFields().put("emailState", projection);
     return projection;
  }

  public AbandonmentAbandonmentTypeProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> mostRecentStep(
      ) {
     AbandonmentAbandonmentTypeProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentAbandonmentTypeProjection<>(this, getRoot());
     getFields().put("mostRecentStep", projection);
     return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> productsAddedToCart(
      ) {
     CustomerVisitProductInfoConnectionProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoConnectionProjection<>(this, getRoot());
     getFields().put("productsAddedToCart", projection);
     return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> productsAddedToCart(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoConnectionProjection<>(this, getRoot());    
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

  public CustomerVisitProductInfoConnectionProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> productsViewed(
      ) {
     CustomerVisitProductInfoConnectionProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoConnectionProjection<>(this, getRoot());
     getFields().put("productsViewed", projection);
     return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> productsViewed(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoConnectionProjection<>(this, getRoot());    
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

  public AbandonmentProjection<PARENT, ROOT> cartUrl() {
    getFields().put("cartUrl", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> customerHasNoDraftOrderSinceAbandonment() {
    getFields().put("customerHasNoDraftOrderSinceAbandonment", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> customerHasNoOrderSinceAbandonment() {
    getFields().put("customerHasNoOrderSinceAbandonment", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> daysSinceLastAbandonmentEmail() {
    getFields().put("daysSinceLastAbandonmentEmail", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> emailSentAt() {
    getFields().put("emailSentAt", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> hoursSinceLastAbandonedCheckout() {
    getFields().put("hoursSinceLastAbandonedCheckout", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> inventoryAvailable() {
    getFields().put("inventoryAvailable", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> isFromCustomStorefront() {
    getFields().put("isFromCustomStorefront", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> isFromOnlineStore() {
    getFields().put("isFromOnlineStore", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> isFromShopApp() {
    getFields().put("isFromShopApp", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> isFromShopPay() {
    getFields().put("isFromShopPay", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> isMostSignificantAbandonment() {
    getFields().put("isMostSignificantAbandonment", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> lastBrowseAbandonmentDate() {
    getFields().put("lastBrowseAbandonmentDate", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> lastCartAbandonmentDate() {
    getFields().put("lastCartAbandonmentDate", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> lastCheckoutAbandonmentDate() {
    getFields().put("lastCheckoutAbandonmentDate", null);
    return this;
  }

  public AbandonmentProjection<PARENT, ROOT> visitStartedAt() {
    getFields().put("visitStartedAt", null);
    return this;
  }
}
