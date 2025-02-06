package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CustomerSegmentMemberProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSegmentMemberProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSegmentMember"));
  }

  public CustomerSegmentMemberProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> amountSpent() {
     MoneyV2Projection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountSpent", projection);
     return projection;
  }

  public MailingAddressProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> defaultAddress(
      ) {
     MailingAddressProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("defaultAddress", projection);
     return projection;
  }

  public CustomerEmailAddressProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> defaultEmailAddress(
      ) {
     CustomerEmailAddressProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailAddressProjection<>(this, getRoot());
     getFields().put("defaultEmailAddress", projection);
     return projection;
  }

  public CustomerPhoneNumberProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> defaultPhoneNumber(
      ) {
     CustomerPhoneNumberProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> projection = new CustomerPhoneNumberProjection<>(this, getRoot());
     getFields().put("defaultPhoneNumber", projection);
     return projection;
  }

  public CustomerMergeableProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> mergeable(
      ) {
     CustomerMergeableProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeableProjection<>(this, getRoot());
     getFields().put("mergeable", projection);
     return projection;
  }

  public MetafieldProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CustomerSegmentMemberProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public CustomerSegmentMemberProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public CustomerSegmentMemberProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CustomerSegmentMemberProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerSegmentMemberProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CustomerSegmentMemberProjection<PARENT, ROOT> lastOrderId() {
    getFields().put("lastOrderId", null);
    return this;
  }

  public CustomerSegmentMemberProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CustomerSegmentMemberProjection<PARENT, ROOT> numberOfOrders() {
    getFields().put("numberOfOrders", null);
    return this;
  }
}
