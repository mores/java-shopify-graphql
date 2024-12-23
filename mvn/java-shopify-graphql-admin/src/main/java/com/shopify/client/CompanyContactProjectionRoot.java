package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CompanyContactRoleAssignmentSortKeys;
import com.shopify.types.DraftOrderSortKeys;
import com.shopify.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CompanyContactProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContact"));
  }

  public CompanyContactProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> company(
      ) {
    CompanyProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> projection = new CompanyProjection<>(this, this);    
    getFields().put("company", projection);
    return projection;
  }

  public CustomerProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public DraftOrderConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> draftOrders(
      ) {
    DraftOrderConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> projection = new DraftOrderConnectionProjection<>(this, this);    
    getFields().put("draftOrders", projection);
    return projection;
  }

  public DraftOrderConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey, String query) {
    DraftOrderConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> projection = new DraftOrderConnectionProjection<>(this, this);    
    getFields().put("draftOrders", projection);
    getInputArguments().computeIfAbsent("draftOrders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("draftOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("draftOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("draftOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("draftOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("draftOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("draftOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("draftOrders").add(queryArg);
    return projection;
  }

  public OrderConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> orders(
      ) {
    OrderConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    return projection;
  }

  public OrderConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey) {
    OrderConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("orders").add(sortKeyArg);
    return projection;
  }

  public CompanyContactRoleAssignmentConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> roleAssignments(
      ) {
    CompanyContactRoleAssignmentConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleAssignmentConnectionProjection<>(this, this);    
    getFields().put("roleAssignments", projection);
    return projection;
  }

  public CompanyContactRoleAssignmentConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> roleAssignments(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyContactRoleAssignmentSortKeys sortKey, String query) {
    CompanyContactRoleAssignmentConnectionProjection<CompanyContactProjectionRoot<PARENT, ROOT>, CompanyContactProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleAssignmentConnectionProjection<>(this, this);    
    getFields().put("roleAssignments", projection);
    getInputArguments().computeIfAbsent("roleAssignments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("roleAssignments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("roleAssignments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("roleAssignments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("roleAssignments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("roleAssignments").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("roleAssignments").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("roleAssignments").add(queryArg);
    return projection;
  }

  public CompanyContactProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyContactProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyContactProjectionRoot<PARENT, ROOT> isMainContact() {
    getFields().put("isMainContact", null);
    return this;
  }

  public CompanyContactProjectionRoot<PARENT, ROOT> lifetimeDuration() {
    getFields().put("lifetimeDuration", null);
    return this;
  }

  public CompanyContactProjectionRoot<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public CompanyContactProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CompanyContactProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
