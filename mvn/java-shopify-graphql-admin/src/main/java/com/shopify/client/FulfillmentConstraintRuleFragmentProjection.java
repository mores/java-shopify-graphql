package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class FulfillmentConstraintRuleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FulfillmentConstraintRuleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentConstraintRule"));
  }

  public FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodTypeProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> deliveryMethodTypes(
      ) {
     DeliveryMethodTypeProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodTypeProjection<>(this, getRoot());
     getFields().put("deliveryMethodTypes", projection);
     return projection;
  }

  public ShopifyFunctionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> function(
      ) {
     ShopifyFunctionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionProjection<>(this, getRoot());
     getFields().put("function", projection);
     return projection;
  }

  public MetafieldProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      ) {
     MetafieldProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public PrivateMetafieldProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> privateMetafield(
      ) {
     PrivateMetafieldProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("privateMetafield", projection);
     return projection;
  }

  public PrivateMetafieldProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> privateMetafields(
      ) {
     PrivateMetafieldConnectionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());
     getFields().put("privateMetafields", projection);
     return projection;
  }

  public PrivateMetafieldConnectionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public FulfillmentConstraintRuleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on FulfillmentConstraintRule {");
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
