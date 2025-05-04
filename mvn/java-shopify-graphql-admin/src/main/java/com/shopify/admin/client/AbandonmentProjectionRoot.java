package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class AbandonmentProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentProjectionRoot() {
    super(null, null, java.util.Optional.of("Abandonment"));
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> abandonedCheckoutPayload(
      ) {
    AbandonedCheckoutProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new AbandonedCheckoutProjection<>(this, this);    
    getFields().put("abandonedCheckoutPayload", projection);
    return projection;
  }

  public AbandonmentAbandonmentTypeProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> abandonmentType(
      ) {
    AbandonmentAbandonmentTypeProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new AbandonmentAbandonmentTypeProjection<>(this, this);    
    getFields().put("abandonmentType", projection);
    return projection;
  }

  public AppProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public CustomerProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public AbandonmentEmailStateProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> emailState(
      ) {
    AbandonmentEmailStateProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new AbandonmentEmailStateProjection<>(this, this);    
    getFields().put("emailState", projection);
    return projection;
  }

  public AbandonmentAbandonmentTypeProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> mostRecentStep(
      ) {
    AbandonmentAbandonmentTypeProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new AbandonmentAbandonmentTypeProjection<>(this, this);    
    getFields().put("mostRecentStep", projection);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> productsAddedToCart(
      ) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
    getFields().put("productsAddedToCart", projection);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> productsAddedToCart(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
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

  public CustomerVisitProductInfoConnectionProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> productsViewed(
      ) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
    getFields().put("productsViewed", projection);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> productsViewed(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentProjectionRoot<PARENT, ROOT>, AbandonmentProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
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

  public AbandonmentProjectionRoot<PARENT, ROOT> cartUrl() {
    getFields().put("cartUrl", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> customerHasNoDraftOrderSinceAbandonment() {
    getFields().put("customerHasNoDraftOrderSinceAbandonment", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> customerHasNoOrderSinceAbandonment() {
    getFields().put("customerHasNoOrderSinceAbandonment", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> daysSinceLastAbandonmentEmail() {
    getFields().put("daysSinceLastAbandonmentEmail", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> emailSentAt() {
    getFields().put("emailSentAt", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> hoursSinceLastAbandonedCheckout() {
    getFields().put("hoursSinceLastAbandonedCheckout", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> inventoryAvailable() {
    getFields().put("inventoryAvailable", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> isFromCustomStorefront() {
    getFields().put("isFromCustomStorefront", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> isFromOnlineStore() {
    getFields().put("isFromOnlineStore", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> isFromShopApp() {
    getFields().put("isFromShopApp", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> isFromShopPay() {
    getFields().put("isFromShopPay", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> isMostSignificantAbandonment() {
    getFields().put("isMostSignificantAbandonment", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> lastBrowseAbandonmentDate() {
    getFields().put("lastBrowseAbandonmentDate", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> lastCartAbandonmentDate() {
    getFields().put("lastCartAbandonmentDate", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> lastCheckoutAbandonmentDate() {
    getFields().put("lastCheckoutAbandonmentDate", null);
    return this;
  }

  public AbandonmentProjectionRoot<PARENT, ROOT> visitStartedAt() {
    getFields().put("visitStartedAt", null);
    return this;
  }
}
