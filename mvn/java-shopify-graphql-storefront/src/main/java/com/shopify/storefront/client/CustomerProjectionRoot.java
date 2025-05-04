package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import com.shopify.storefront.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CustomerProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerProjectionRoot() {
    super(null, null, java.util.Optional.of("Customer"));
  }

  public CustomerProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> addresses(
      ) {
    MailingAddressConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MailingAddressConnectionProjection<>(this, this);    
    getFields().put("addresses", projection);
    return projection;
  }

  public MailingAddressConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> addresses(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MailingAddressConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MailingAddressConnectionProjection<>(this, this);    
    getFields().put("addresses", projection);
    getInputArguments().computeIfAbsent("addresses", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("addresses").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("addresses").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("addresses").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("addresses").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("addresses").add(reverseArg);
    return projection;
  }

  public MailingAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> defaultAddress(
      ) {
    MailingAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("defaultAddress", projection);
    return projection;
  }

  public MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public OrderConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> orders(
      ) {
    OrderConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    return projection;
  }

  public OrderConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey, String query) {
    OrderConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
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
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("orders").add(queryArg);
    return projection;
  }

  public CustomerProjectionRoot<PARENT, ROOT> acceptsMarketing() {
    getFields().put("acceptsMarketing", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> numberOfOrders() {
    getFields().put("numberOfOrders", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
