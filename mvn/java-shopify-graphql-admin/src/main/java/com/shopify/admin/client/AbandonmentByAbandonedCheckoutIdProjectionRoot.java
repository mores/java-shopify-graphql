package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentByAbandonedCheckoutIdProjectionRoot() {
    super(null, null, java.util.Optional.of("Abandonment"));
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> abandonedCheckoutPayload(
      ) {
    AbandonedCheckoutProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new AbandonedCheckoutProjection<>(this, this);    
    getFields().put("abandonedCheckoutPayload", projection);
    return projection;
  }

  public AbandonmentAbandonmentTypeProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> abandonmentType(
      ) {
    AbandonmentAbandonmentTypeProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new AbandonmentAbandonmentTypeProjection<>(this, this);    
    getFields().put("abandonmentType", projection);
    return projection;
  }

  public AppProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public CustomerProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public AbandonmentEmailStateProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> emailState(
      ) {
    AbandonmentEmailStateProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new AbandonmentEmailStateProjection<>(this, this);    
    getFields().put("emailState", projection);
    return projection;
  }

  public AbandonmentAbandonmentTypeProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> mostRecentStep(
      ) {
    AbandonmentAbandonmentTypeProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new AbandonmentAbandonmentTypeProjection<>(this, this);    
    getFields().put("mostRecentStep", projection);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> productsAddedToCart(
      ) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
    getFields().put("productsAddedToCart", projection);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> productsAddedToCart(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
    getFields().put("productsAddedToCart", projection);
    getInputArguments().computeIfAbsent("productsAddedToCart", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productsAddedToCart").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productsAddedToCart").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productsAddedToCart").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productsAddedToCart").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productsAddedToCart").add(reverseArg);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> productsAddedToCartWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
    getFields().put("productsAddedToCart", projection);
    getInputArguments().computeIfAbsent("productsAddedToCart", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productsAddedToCart").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productsAddedToCart").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productsAddedToCart").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productsAddedToCart").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productsAddedToCart").add(reverseArg);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> productsViewed(
      ) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
    getFields().put("productsViewed", projection);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> productsViewed(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
    getFields().put("productsViewed", projection);
    getInputArguments().computeIfAbsent("productsViewed", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productsViewed").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productsViewed").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productsViewed").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productsViewed").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productsViewed").add(reverseArg);
    return projection;
  }

  public CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> productsViewedWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CustomerVisitProductInfoConnectionProjection<AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>, AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT>> projection = new CustomerVisitProductInfoConnectionProjection<>(this, this);    
    getFields().put("productsViewed", projection);
    getInputArguments().computeIfAbsent("productsViewed", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productsViewed").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productsViewed").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productsViewed").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productsViewed").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productsViewed").add(reverseArg);
    return projection;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> cartUrl() {
    getFields().put("cartUrl", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> customerHasNoDraftOrderSinceAbandonment(
      ) {
    getFields().put("customerHasNoDraftOrderSinceAbandonment", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> customerHasNoOrderSinceAbandonment(
      ) {
    getFields().put("customerHasNoOrderSinceAbandonment", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> daysSinceLastAbandonmentEmail(
      ) {
    getFields().put("daysSinceLastAbandonmentEmail", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> emailSentAt() {
    getFields().put("emailSentAt", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> hoursSinceLastAbandonedCheckout(
      ) {
    getFields().put("hoursSinceLastAbandonedCheckout", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> inventoryAvailable() {
    getFields().put("inventoryAvailable", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> isFromCustomStorefront() {
    getFields().put("isFromCustomStorefront", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> isFromOnlineStore() {
    getFields().put("isFromOnlineStore", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> isFromShopApp() {
    getFields().put("isFromShopApp", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> isFromShopPay() {
    getFields().put("isFromShopPay", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> isMostSignificantAbandonment(
      ) {
    getFields().put("isMostSignificantAbandonment", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> lastBrowseAbandonmentDate() {
    getFields().put("lastBrowseAbandonmentDate", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> lastCartAbandonmentDate() {
    getFields().put("lastCartAbandonmentDate", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> lastCheckoutAbandonmentDate(
      ) {
    getFields().put("lastCheckoutAbandonmentDate", null);
    return this;
  }

  public AbandonmentByAbandonedCheckoutIdProjectionRoot<PARENT, ROOT> visitStartedAt() {
    getFields().put("visitStartedAt", null);
    return this;
  }
}
