package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CompanyContactRoleAssignmentSortKeys;
import com.shopify.admin.types.DraftOrderSortKeys;
import com.shopify.admin.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CompanyContactFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CompanyContactFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyContact"));
  }

  public CompanyContactFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> company() {
     CompanyProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());
     getFields().put("company", projection);
     return projection;
  }

  public CustomerProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> draftOrders(
      ) {
     DraftOrderConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());
     getFields().put("draftOrders", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey, String query) {
    DraftOrderConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());    
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

  public OrderConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey) {
    OrderConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
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

  public CompanyContactRoleAssignmentConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> roleAssignments(
      ) {
     CompanyContactRoleAssignmentConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleAssignmentConnectionProjection<>(this, getRoot());
     getFields().put("roleAssignments", projection);
     return projection;
  }

  public CompanyContactRoleAssignmentConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> roleAssignments(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyContactRoleAssignmentSortKeys sortKey, String query) {
    CompanyContactRoleAssignmentConnectionProjection<CompanyContactFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleAssignmentConnectionProjection<>(this, getRoot());    
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

  public CompanyContactFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyContactFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyContactFragmentProjection<PARENT, ROOT> isMainContact() {
    getFields().put("isMainContact", null);
    return this;
  }

  public CompanyContactFragmentProjection<PARENT, ROOT> lifetimeDuration() {
    getFields().put("lifetimeDuration", null);
    return this;
  }

  public CompanyContactFragmentProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public CompanyContactFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CompanyContactFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CompanyContact {");
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
