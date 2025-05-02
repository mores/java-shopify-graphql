package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.HasMetafieldsIdentifier;
import com.shopify.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CustomerFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Customer"));
  }

  public CustomerFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> addresses(
      ) {
     MailingAddressConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressConnectionProjection<>(this, getRoot());
     getFields().put("addresses", projection);
     return projection;
  }

  public MailingAddressConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> addresses(
      String after, String before, Integer first, Integer last, Boolean reverse) {
    MailingAddressConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressConnectionProjection<>(this, getRoot());    
    getFields().put("addresses", projection);
    getInputArguments().computeIfAbsent("addresses", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("addresses").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("addresses").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("addresses").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("addresses").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("addresses").add(reverseArg);
    return projection;
  }

  public MailingAddressProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> defaultAddress() {
     MailingAddressProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("defaultAddress", projection);
     return projection;
  }

  public MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafield(String key,
      String namespace) {
    MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public OrderConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> orders(
      String after, String before, Integer first, Integer last, String query, Boolean reverse,
      OrderSortKeys sortKey) {
    OrderConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orders").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orders").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orders").add(lastArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("orders").add(queryArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("orders").add(sortKeyArg);
    return projection;
  }

  public CustomerFragmentProjection<PARENT, ROOT> acceptsMarketing() {
    getFields().put("acceptsMarketing", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> numberOfOrders() {
    getFields().put("numberOfOrders", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Customer {");
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
